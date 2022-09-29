package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kb;

        System.out.println("Dime el numero de Kb:");
        kb = sc.nextDouble();
        System.out.println(kb + " Mb son " + (kb / 1024) + "Kb");
    }
}
