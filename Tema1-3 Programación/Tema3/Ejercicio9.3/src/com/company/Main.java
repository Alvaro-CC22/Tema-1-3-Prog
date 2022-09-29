package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, radio, resultado;

        System.out.println("Dime la altura del cono:");
        altura = sc.nextDouble();
        System.out.println("Dime el radio del cono:");
        radio = sc.nextDouble();
        resultado = ((double)1/3)*Math.PI*(radio*radio)*altura;
        System.out.println("El volumen del cono es: " + resultado);
    }
}
