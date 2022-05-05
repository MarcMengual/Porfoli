/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicis_m03;

import java.util.Scanner;

/**
 *
 * @author mengu
 */
public class Ex2 {

    public static void main(String[] args) {

        Scanner ln = new Scanner(System.in);
        int numero = ln.nextInt();

        double[] temperatures = new double[numero + 1];

        for (int i = 0; i < temperatures.length - 1; i++) {
            temperatures[i] = ln.nextDouble();
        }

        temperatures = seleccio(temperatures, numero);

        for (int i = 0; i < temperatures.length - 1; i++) {
            System.out.print(temperatures[i] + " ");
        }
        System.out.println();
        System.out.println("Total passades: " + (int)temperatures[numero]);
    }

    public static double[] seleccio(double temperatures[], int numero) {
        double posicio = 0;
        int pasades = 0;
        
        for (int i = 0; i < temperatures.length - 1; i++) {
            for (int j = i + 1; j < temperatures.length - 1; j++) {
                if (temperatures[i] > temperatures[j]) {

                    posicio = temperatures[i];
                    temperatures[i] = temperatures[j];
                    temperatures[j] = posicio;
                }
            }
            pasades++;
        }

        temperatures[numero] = pasades;
        return temperatures;
    }
}
