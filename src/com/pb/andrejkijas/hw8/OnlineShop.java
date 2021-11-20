package com.pb.andrejkijas.hw8;

import com.pb.andrejkijas.hw8.exception.WrongLoginException;
import com.pb.andrejkijas.hw8.exception.WrongPasswordException;

import java.io.IOException;
import java.util.Scanner;

/**
 * Создать класс OnlineShop с методом main.
 * В main создать один объект класса Auth.
 * Предложить пользователю сперва зарегистрироваться (signUp) потом войти на сайт (signIn).
 * Обработать исключения методов signUp signIn с помощью блоков try-catch.
 **/

public class OnlineShop {
    private static Scanner scanner;
    private static boolean isAuthorized;

    public static void main(String[] args) throws IOException {
        Auth auth = new Auth();

        createNewUser(auth);
        if (isAuthorized) {
            loginIn(auth);
        }
        System.out.println("--------------------------------------------------");
    }

    private static void createNewUser(Auth auth) {

        System.out.println("\n---------------- Новая регистрация ---------------");
        System.out.println("Введите логин:");
        try {
            Scanner sc = new Scanner(System.in);
            String login = sc.nextLine();
            System.out.println("Ввод пароля:");
            String password = sc.nextLine();
            System.out.println("Подтверждение пароля:");
            String confirmPassword = sc.nextLine();

            auth.signUp(login, password, confirmPassword);
            scanner = sc;
        } catch (WrongLoginException e) {
            System.out.println("Неверный логин!");
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            System.out.println("Неверный пароль!");
            e.printStackTrace();
        }
        isAuthorized = true;
    }

    private static void loginIn(Auth auth) {

        System.out.println("\n------------------- Авторизация ------------------");
        System.out.println("Введите логин:");
        try (Scanner sc = scanner) {
            String printlogin = sc.nextLine();
            System.out.println("Input password:");
            String printPass = sc.nextLine();
            auth.signIn(printlogin, printPass);
        } catch (WrongLoginException e) {
            System.out.println("Не найден пользователь с таким логином");
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            System.out.println("Неверный пароль!");
            e.printStackTrace();
        }
    }
}
