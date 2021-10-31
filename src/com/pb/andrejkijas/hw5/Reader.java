package com.pb.andrejkijas.hw5;

public class Reader {
    private String readerFIO;      //- ФИО
    private int readerNumTick;     //- номер читательского билета
    private String readerFacult;   //- факультет
    private String readerDatBirth;   //- дата рождения
    private String readerNumPhone; //- телефон

    //"Энциклопедия", "Гусев К. В.", 2010
    public Reader(){
        this.readerFIO = "Петров В. В.";
        this.readerNumTick = 124578;
        this.readerFacult = "Экономист";
        this.readerDatBirth = "04-04-1985";
        this.readerNumPhone = "+380501234567";
    }
}