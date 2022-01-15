package com.pb.andrejkijas.hw15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * Создать пакет hw14.
 * Многопоточный echo сервер.
 *
 * Клиент может подключиться к серверу и отправлять ему сообщение которые вводит пользователь, получать на него ответ
 * и отображать текст ответа пользователю. (т.е. после запуска программы пользователь может ввести строку сообщения).
 *
 * По желанию*
 * Сервер должен ожидать подключения многих клиентов и при получении входящего сообщения - высылать полученный текст
 * всем подключенным клиентам (т.е. например клиент 1 отправил текст “A”, клиент 2 отправил текст “Б”, тогда сервер
 * каждое из этих сообщений отправит этим двум клиентам, и каждый клиент увидит как свое сообщение, так и сообщения
 * остальных клиентов).
 *
 **/

class ClientWindowWork extends JFrame {

    // Объявляем рабочие переменные
    private Socket socket;
    private Scanner in; // ввод текста
    private PrintWriter out; // вывод текста
    private JTextField clientMess;
    private JTextField clientNameText;
    private JTextArea textArea;
    private Date dateTime;
    private String stringTime;
    private SimpleDateFormat time;
    private String clientName;  // имя клиента

    // Обмен сообщениями клиент-сервер
    public ClientWindowWork(String ipAddr, int port) {
        try {
            socket = new Socket(ipAddr, port);
            in = new Scanner(socket.getInputStream());
            out = new PrintWriter(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Визуализация клиентского окна
        setBounds(700, 200, 400, 350);
        setTitle("Окно клиентской части");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        textArea = new JTextArea("---- Для начала чата введите Ваше имя и нажмите \"Отправить\" ----\n");
        textArea.setEditable(false);
        JScrollPane jsp = new JScrollPane(textArea);
        add(jsp, BorderLayout.CENTER);
        JPanel bottomPanel = new JPanel(new BorderLayout());
        add(bottomPanel, BorderLayout.SOUTH);
        clientNameText = new JTextField("Введите имя: ");
        bottomPanel.add(clientNameText, BorderLayout.WEST);
        clientMess = new JTextField("Введите сообщение: ");
        bottomPanel.add(clientMess, BorderLayout.CENTER);
        JButton jbSendMessage = new JButton("Отправить");
        bottomPanel.add(jbSendMessage, BorderLayout.EAST);

        // Кнопка отправки сообщения
        jbSendMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!clientMess.getText().trim().isEmpty() && !clientNameText.getText().trim().isEmpty()) {
                    clientName = clientNameText.getText();
                    sendMsg();
                    clientMess.grabFocus();
                }
            }
        });

        // Очищаем поле для сообщения при фокусе на нем
        clientMess.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                clientMess.setText("");
            }
        });

        // Очищаем поле для имя при фокусе на нем
        clientNameText.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                clientNameText.setText("");
            }
        });

        // Поток работы с сервером
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        if (in.hasNext()) {
                            String inMes = in.nextLine();
                            textArea.append(inMes + "\n");
                        }
                    }
                } catch (Exception e) {
                }
            }
        }).start();

        // Корректное завершение подключения
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                try {
                    dateTime = new Date();
                    time = new SimpleDateFormat("HH:mm:ss");
                    stringTime = time.format(dateTime);
                    out.println("(" + stringTime + ") " + clientName + ":" + " [--- вышел из чата ---] ");
                    out.flush();
                    out.close();
                    in.close();
                    socket.close();
                } catch (IOException exc) {

                }
            }
        });
        // отображаем форму
        setVisible(true);
    }

    // отправка сообщения
    public void sendMsg() {
        dateTime = new Date();
        time = new SimpleDateFormat("HH:mm:ss");
        stringTime = time.format(dateTime);
        String messageStr = "(" + stringTime + ") " + clientNameText.getText() + ": " + clientMess.getText();
        out.println(messageStr);
        out.flush();
        clientMess.setText("");
    }
}

public class Client {

    public static String ipAddr = "localhost";
    public static int port = 3333;

    // Клиентская часть (старт)
    public static void main(String[] args) {
        new ClientWindowWork(ipAddr, port);
    }
}