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
public class Ex1 {

    public static void main(String[] args) {

        Scanner ln = new Scanner(System.in);
        int numero = ln.nextInt();

        String[] paisos = new String[numero + 1];

        for (int i = 0; i < paisos.length; i++) {
            paisos[i] = ln.nextLine();
        }

        paisos = bombolla(paisos);

        for (int i = 0; i < paisos.length; i++) {
            System.out.println(paisos[i]);
        }

    }

    public static String[] bombolla(String paisos[]) {
        String guardar;

        for (int i = 0; i < paisos.length; i++) {
            for (int e = 0; e < paisos.length - 1; e++) {
                if (paisos[e].compareTo(paisos[e + 1]) > 0) {
                    guardar = paisos[e];
                    paisos[e] = paisos[e + 1];
                    paisos[e + 1] = guardar;
                }
            }
        }
        return paisos;
    }
}
