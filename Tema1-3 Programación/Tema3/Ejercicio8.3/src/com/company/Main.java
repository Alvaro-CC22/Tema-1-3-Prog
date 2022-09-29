package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horasSemanales;

        System.out.println("Dime las horas semanales que has trabajado:");
        horasSemanales = sc.nextInt();
        System.out.println("Tu salario semanal es: " + (horasSemanales * 12) + "€");
    }
}
