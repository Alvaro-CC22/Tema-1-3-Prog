package com.company;

public class Main {

    public static void main(String[] args) {
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_RESET = "\u001B[0m";
        System.out.println( ANSI_GREEN + "Lunes   |    Martes    |   Miércoeles    |    Jueves    |    Viernes" + ANSI_RESET);
        System.out.println(" BDA    |     EDS      |      PRG        |     EDS      |      BDA ");
        System.out.println(" BDA    |     EDS      |      PRG        |     PRG      |      BDA ");
        System.out.println(" ING    |     PRG      |      PRG        |     PRG      |      SIN ");
        System.out.println(" FOL    |     PRG      |      ING        |     PRG      |      SIN ");
        System.out.println(" FOL    |     LMS      |      SIN        |     SIN      |      LMS ");
        System.out.println(" FOL    |     LMS      |      SIN        |     SIN      |      LMS ");
    }
}
