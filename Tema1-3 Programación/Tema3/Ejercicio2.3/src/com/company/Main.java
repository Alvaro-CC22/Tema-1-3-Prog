package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double euros;

        System.out.println("Dime la cantidad de €");
        euros = sc.nextDouble();
        System.out.println(euros + "€ son " + (euros * 166.38) + " pesetas");
    }
}
