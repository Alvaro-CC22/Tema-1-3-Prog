package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, trimestre;

        System.out.println("Introduce la nota del primer examen");
        nota1 = sc.nextDouble();
        System.out.println("¿Que nota quieres sacar en el trimestre?");
        trimestre = sc.nextDouble();

        nota1 = nota1 * 0.4;
        nota2 = trimestre - nota1;
        nota2 = nota2 / 0.6;

        System.out.println("Necesitas un " + nota2 + " para sacar el " + trimestre + " que quieres.");
    }
}
