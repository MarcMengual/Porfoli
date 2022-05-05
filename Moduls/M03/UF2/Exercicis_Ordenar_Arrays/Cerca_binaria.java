/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicis_Ordenar_Arrays;

import java.util.Arrays;

public class Cerca_binaria {

    public static void main(String[] args) {
        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (double) (Math.random() * (1 - 2)) + 2;
            array[i] = Math.round(array[i] * 100.0) / 100.0;
            System.out.println(array[i]);

        }

        for (int i = 0; i < array.length; i++) {
            if (((array[i]) % 2) == 0) {
                System.out.println("Enter : " + array[i]);
                break;
            }

        }
        Arrays.sort(array);
        int i = array.length;
        int meitat = i / 2;
        double numero = array[meitat];

        binary(i, meitat, numero, array);
    }

    public static void binary(int i, int meitat, double numero, double array[]) {

        numero = Math.round(numero * 100) / 100;
        if (array[i / 2] % 2 == 0) {
            System.out.println("El numero enter es: " + array[i / 2]);
        } else if (array[meitat] > numero + 1) {
            meitat = meitat / 2 + meitat;
            meitat = Math.round(meitat * 100) / 100;

        } else if (array[meitat] < numero + 1) {
        }
    }
}
