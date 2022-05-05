package M03_UF2P2;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arrayPaisos = demanaPaisos(in, pideEntero(in, "Totals països"));
        mostraPaisos(arrayPaisos);
        System.out.println("Buscar pais:");
        int posicio = cercaBinaria(arrayPaisos, demanaPais(in));
        if (posicio >= 0) {
            System.out.println("Posició " + posicio);
        } else {
            System.out.println("No trobat");
        }

    }

    static int cercaBinaria(String[] array, String valor) {
        int indexEsquerra = 0;
        int indexDreta = array.length;
        int index;
        boolean trobat = false;
        int posicio = -1;
        while (indexEsquerra <= indexDreta && !trobat) {
            index = (indexEsquerra + indexDreta) / 2;
            if (array[index].equals(valor)) {
                posicio = index;
                trobat = true;
            } else if (valor.compareToIgnoreCase(array[index]) > 0) {
                indexEsquerra = index + 1;
            } else {
                indexDreta = index - 1;
            }
        }
        return posicio;
    }

    public static void mostraPaisos(String[] arrayPaisos) {
        for (int i = 0; i < arrayPaisos.length; i++) {
            System.out.println("["+i+"]"+arrayPaisos[i]);
        }
    }

    public static int pideEntero(Scanner in, String mensaje) {
        int n = 0;
        boolean correcte = false;

        do {
            System.out.print("Introdueix un nombre enter (" + mensaje + "): ");
            if (!in.hasNextInt()) {
                System.out.println("No es un enter");
            } else {
                correcte = true;
                n = in.nextInt();
            }
            in.nextLine();
        } while (!correcte);
        return n;
    }

    static String demanaPais(Scanner in) {
        return in.nextLine();
    }

    static String[] demanaPaisos(Scanner in, int totalPaisos) {
        String pais;
        String[] arrayPaisos = new String[totalPaisos];
        for (int i = 0; i < totalPaisos; i++) {
            pais = demanaPais(in);
            arrayPaisos[i] = pais;
        }
        return ordenaPaisos(arrayPaisos);
    }

    static String[] ordenaPaisos(String[] arrayPaisos) {
        String aux;
        for (int i = 0; i < arrayPaisos.length; i++) {
            for (int j = 0; j < arrayPaisos.length - 1 - i; j++) {
                if (arrayPaisos[j].compareToIgnoreCase(arrayPaisos[j + 1]) > 0) {
                    aux = arrayPaisos[j];
                    arrayPaisos[j] = arrayPaisos[j + 1];
                    arrayPaisos[j + 1] = aux;
                }
            }
        }
        return arrayPaisos;
    }

}
