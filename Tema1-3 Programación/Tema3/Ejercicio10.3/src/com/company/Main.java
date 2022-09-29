package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mb;

        System.out.println("Dime el numero de Mb:");
        mb = sc.nextDouble();
        System.out.println(mb + " Mb son " + (mb * 1024) + "Kb");
    }
}
