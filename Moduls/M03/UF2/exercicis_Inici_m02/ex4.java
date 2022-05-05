package exercicis_m03;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author mengu
 */
public class ex4 {

    public static void main(String[] args) {

        Scanner ln = new Scanner(System.in);
        int numero = ln.nextInt();

        String[] paisos = new String[numero + 2];

        for (int i = 0; i < paisos.length - 1; i++) {
            paisos[i] = ln.nextLine();
        }

        paisos = seleccio(paisos, numero);

        String paisTrobar = ln.nextLine();
        int pos;
        pos = trobar(paisTrobar, paisos);
        
        System.out.println("Total passades: " +paisos[numero + 1]);

        if (pos == -1) {
            System.out.println("No trobat");
        } else {
            System.out.println("Trobat a la posició: " + pos);
        }
    }

    public static int trobar(String paisTrobar, String paisos[]) {
        int inici = 0;
        int fi = paisos.length - 1;
        int pos;
        while (inici <= fi) {
            pos = (inici + fi / 2);
            if (paisos[pos].equals(paisTrobar)) {
                return pos;
            } else if (paisos[pos].compareTo(paisTrobar)> 0) {
                inici = pos + 1;
            } else {
                fi = pos - 1;
            }
        }
        return -1;
    }

    public static String[] seleccio(String paisosM[], int numero) {
        String posicio = "";
        int pasades = 0;

        for (int i = 0; i < paisosM.length - 1; i++) {
            for (int j = i + 1; j < paisosM.length - 1; j++) {
                if (paisosM[i].compareTo(paisosM[j]) > 0) {

                    posicio = paisosM[i];
                    paisosM[i] = paisosM[j];
                    paisosM[j] = posicio;
                }
            }
            pasades++;
        }
        pasades = pasades - 4;
        paisosM[numero + 1] = "" + pasades;
        return paisosM;
    }
}
