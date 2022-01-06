package com.pb.andrejkijas.hw14;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

/**
 *
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
 *
 **/

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