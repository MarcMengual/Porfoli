/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicis_no_obligatoris;

import java.util.Scanner;

/**
 *
 * @author mengu
 */
public class MostrarTaulesMultiplicar {

    public static void main(String[] args) {
        Scanner ln = new Scanner(System.in);

        System.out.print("Quantes taules de multiplicar vols veure? ");
        int taules = ln.nextInt();

        generarTaula(taules);

    }

    public static void generarTaula(int taules) {
        
        for (int o = 0; o < taules;) {
            System.out.println("");
            for (int i = 0; i < 10; i++) {
                System.out.println("");
                for (int q = 0; q < 4; q++) {
                    if (o+q < taules) {
                        System.out.print((o+q+1) + " * " + (i + 1) + " = " + (o+q+1) * (i + 1) + " \t");
                    }

                }

            }
            o = o+4;
        }
    }
}
