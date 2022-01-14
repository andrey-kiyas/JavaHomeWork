package com.pb.andrejkijas.hw15;

import javax.swing.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

/**
 * Создать пакет hw14.
 * Многопоточный echo сервер.
 *
 * Сервер должен ожидать подключения клиента и отвечать на все входящие сообщения тем же текстом, который прислал
 * клиент и добавить в начало сообщения текущую дату и время. Сервер должен поддерживать одновременно подключение
 * нескольких клиентов.
 *
 * По желанию*
 * Сервер должен ожидать подключения многих клиентов и при получении входящего сообщения - высылать полученный текст
 * всем подключенным клиентам (т.е. например клиент 1 отправил текст “A”, клиент 2 отправил текст “Б”, тогда сервер
 * каждое из этих сообщений отправит этим двум клиентам, и каждый клиент увидит как свое сообщение, так и сообщения
 * остальных клиентов).
 **/

class ServerWork extends Thread {

    // Объявляем рабочие переменные
    private Socket socket;
    private BufferedReader in;
    private BufferedWriter out;

    // Обмен сообщениями сервер-клиент
    public ServerWork(Socket socket) throws IOException {
        this.socket = socket;
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        start();
    }
    @Override
    public void run() {
        String message;
        try {
            message = in.readLine();
            //ServerForm app = new ServerForm();
            //app.setVisible(true);
            try {
                out.write(message + "\n");
                out.flush();
            } catch (IOException ignored) {}
            try {
                while (true) {
                    JFrame frame = new JFrame("ServerForm");
                    message = in.readLine();
                    if(message.equals("end")) {
                        this.shutDown();
                        break;
                    }
                    System.out.println("ЭХО " + message);
                    for (ServerWork sw : Server.connectList) {
                        sw.send(message);
                    }
                }
            } catch (NullPointerException ignored) {}
        } catch (IOException e) {
            this.shutDown();
        }
    }

    // Отправка сообщений
    private void send(String msg) {
        try {
            out.write(msg + "\n");
            out.flush();
        } catch (IOException ignored) {}
    }

    // Закрытие сервера
    private void shutDown() {
        try {
            if(!socket.isClosed()) {
                socket.close();
                in.close();
                out.close();
                for (ServerWork sw : Server.connectList) {
                    if(sw.equals(this)) sw.interrupt();
                    Server.connectList.remove(this);
                }
            }
        } catch (IOException ignored) {}
    }
}

class Server {

    public static int port = 3333;
    public static LinkedList<ServerWork> connectList = new LinkedList<>();

    // Серверная часть (старт)
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(port);
        System.out.println("ЭХО-сервер запущен");
        try {
            while (true) {
                Socket socket = server.accept();
                try {
                    connectList.add(new ServerWork(socket));
                } catch (IOException e) {
                    socket.close();
                }
            }
        } finally {
            server.close();
        }
    }
}