/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaluableuf2;

import java.util.Scanner;

public class Ex1Calculadora {

    public static void main(String[] args) {
        Scanner ln = new Scanner(System.in);

        int num1 = 0, num2, resultat = 0;
        String peticio, numer1, sortir = "si";
        boolean bucle = true, bucle2 = true;

        while (bucle) {
            while (bucle2) {
                sortir = "no";
                numer1 = ln.next();
   
                numer1.trim();
                if ((numer1.equals("s")) || (numer1.equals("S"))) {
                    sortir = "si";
                    break;
                } else {
                    char[] cadena_div = numer1.toCharArray();
                    String n = "";
                    for (int i = 0; i < cadena_div.length; i++) {
                        if (Character.isDigit(cadena_div[i])) {
                            n += cadena_div[i];
                        }
                    }
                    if (n.length() == 0) {
                        System.out.println("No has introduit un nombre");

                    } else {
                        num1 = Integer.parseInt(n);
                        bucle2 = false;
                    }
                }
            }

            if(sortir.equals("si")){
                break;
            }
            
            num2 = ln.nextInt();
            
            peticio = ln.next();

            if (peticio.equals("+")) {
                resultat = suma(num1, num2);

            } else if (peticio.equals("-")) {
                resultat = resta(num1, num2);

            } else if ((peticio.equals("x")) || (peticio.equals("*"))) {
                resultat = multiplicacio(num1, num2);

            } else if (peticio.equals("/")) {
                resultat = divisio(num1, num2);
            } else {
                System.out.println("Error");
            }
            
            if (resultat != 0){
            System.out.println(num1+" "+peticio+" "+num2+" = "+resultat);
            }
            
            bucle2 = true;
        }
    }

    public static int suma(int num1, int num2) {
        int suma = 0;

        suma = num1 + num2;
        return suma;
    }

    public static int resta(int num1, int num2) {
        int resta = 0;

        resta = num1 - num2;
        return resta;
    }

    public static int multiplicacio(int num1, int num2) {
        int multi = 0;

        multi = num1 * num2;
        return multi;
    }

    public static int divisio(int num1, int num2) {
        int div;

        if (num2 == 0) {
            System.out.println("No es pot dividir per 0.");
            div = 0;
        } else {
            div = num1 / num2;
        }
        return div;
    }
}
       