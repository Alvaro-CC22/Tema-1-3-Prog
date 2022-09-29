package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double baseImponible;
        String tipoIVA, codProm;

        System.out.println("Dime la cantidad la base imponible: ");
        baseImponible = sc.nextDouble();

        System.out.println("Dime el tipo de IVA (general, reducido o superreducido): ");
        tipoIVA = sc.next();

        System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        codProm = sc.next();

        int tipoIVANumerico = 0;

        switch(tipoIVA) {
            case "general":
                tipoIVANumerico = 21;
                break;
            case "reducido":
                tipoIVANumerico = 10;
                break;
            case "superreducido":
                tipoIVANumerico = 4;
                break;
            default:
                System.out.println("El tipo de IVA no es válido.");
        }

        double iva = baseImponible * tipoIVANumerico / 100;
        double precioSinDesc = baseImponible + iva;
        double desc = 0;

        switch(codProm) {
            case "nopro":
                break;
            case "mitad":
                desc = precioSinDesc / 2;
                break;
            case "meno5":
                desc = 5;
                break;
            case "5porc":
                desc = precioSinDesc * 0.05;
                break;
            default:
                System.out.println("El código promocional no es válido.");
        }

        double total = precioSinDesc - desc;

        System.out.println("Base imponible: " + baseImponible + "€");
        System.out.println("IVA: " + tipoIVANumerico + "%" + " " + iva + "€");
        System.out.println("Precio con IVA: " + precioSinDesc+ "€");
        System.out.println("Cód. promo.: " + codProm + " " + "-"  + desc + "€");
        System.out.println("TOTAL: " + total + "€");
    }
}
