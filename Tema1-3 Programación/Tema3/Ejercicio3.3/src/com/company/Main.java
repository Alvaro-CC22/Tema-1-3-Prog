package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pesetas;

        System.out.println("Dime el numero de pesetas");
        pesetas = sc.nextDouble();
        System.out.println(pesetas + " pesetas son " + (pesetas / 166.38) + "€");
    }
}
