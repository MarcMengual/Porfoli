/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaluableuf2;

import java.util.Scanner;

/**
 *
 * @author mengu
 */
public class Ex4 {

    public static void main(String[] args) {
        Scanner ln = new Scanner(System.in);

        int numNomb = 0, cont = 0;

        numNomb = ln.nextInt();

        int[] prim = new int[numNomb];
        int numero = 0;
        boolean esNumPri = false;

        for (int i = 0; i < prim.length; i++) {
            esNumPri = nombrePrimer(prim, numero);

            if (esNumPri == true) {
                cont++;
                prim[i] = numero;
                if (i+1 == prim.length) {
                    System.out.println(prim[i] + ".");
                } else if (cont < 10) {
                    System.out.print(prim[i] + ", ");
                } else if (cont == 10) {
                    System.out.println(prim[i] + ", ");
                    cont = 0;
                }
            } else {
                i--;
            }
            numero++;
        }

    }

    public static boolean nombrePrimer(int[] prim, int numero) {

        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {

            if (numero % x == 0) {
                return false;
            }
        }
        return true;
    }
}
