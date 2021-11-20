package com.pb.andrejkijas.hw8;

import com.pb.andrejkijas.hw8.exception.WrongLoginException;
import com.pb.andrejkijas.hw8.exception.WrongPasswordException;

/**
 * Создать класс Auth, который содержит поля login и password и методы:
 *
 * - signUp (регистрация на сайте) принимающий login, password, и confirmPassword.
 * Проверяет параметр login, длинна должна быть от 5 до 20 символов. Login должен содержать только латинские буквы
 * и цифры. Если логин не соответствует требованиям нужно выбросить WrongLoginException.
 *
 * Проверяет параметр password, длина более 5, только латинские буквы и цифры и знак подчеркивания. Также password и
 * confirmPassword должны совпадать. Если password не соответствует требованиям нужно выбросить WrongPasswordException.
 * Если проверки все пройдены успешно записать в свои поля значение login и password. Так сохраняем пользователя :)
 *
 * - signIn (вход на сайт) принимающий login и password.
 * Проверяет что login и password соответствуют значениям из полей класса.
 * Если нет - выбрасывает исключение WrongLoginException.
 *
 * WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по
 * умолчанию, второй принимает сообщение и передает его в конструктор класса Exception.
 * **/

public class Auth {
    private String login;
    private String password;
    private static final String CHECK_LOGIN = "^[a-zA-Z][a-zA-Z0-9\\.]{5,20}$";
    private static final String CHECK_PASS = "^[a-zA-Z][a-zA-Z0-9-_\\.]{3,}$";

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!checkLogin(login)) {
            throw new WrongLoginException(login);
        }

        if (!checkPassword(password)) {
            throw new WrongPasswordException(password);
        }

        if (!checkPassEquals(password, confirmPassword)) {
            throw new WrongPasswordException(password);
        }

        this.login = login;
        this.password = password;
        System.out.println("--- Учетная запись успешно создана ---");
    }

    private static boolean checkLogin(String login) {
        return login.matches(CHECK_LOGIN);
    }

    private static boolean checkPassword(String password) {
        return password.matches(CHECK_PASS);
    }

    private static boolean checkPassEquals(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }

    public void signIn(String login, String password) throws WrongLoginException, WrongPasswordException {
        if (!checkSavedAndWPrintedLogin(login)) {
            throw new WrongLoginException(login);
        }

        if (!checkSavedAndWPrintedPass(password)) {
            throw new WrongPasswordException(password);
        }

        System.out.println("--- Успешная авторизация ---");
    }

    private boolean checkSavedAndWPrintedLogin(String printLogin) {
        return login.equals(printLogin);
    }

    private boolean checkSavedAndWPrintedPass(String printPass) {
        return password.equals(printPass);
    }
}