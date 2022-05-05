/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaluableuf2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author mengu
 */
public class Ex3 {

    public static void main(String[] args) {

        Scanner ln = new Scanner(System.in);

        int base = 0;
        double area = 0.00, perimetre = 0.00, costat = 0.00;
        String forma = "";
        double[] resultado = new double[2];
        boolean bucle1 = true, bucle2 = true;

        while (bucle1) {
            bucle2 = true;
            while (bucle2) {
                forma = ln.nextLine();

                forma.toLowerCase();

                if ((forma.equals("cilindre")) || (forma.equals("c"))) {
                    resultado = cilindre(costat, base, perimetre, area);
                    bucle2 = false;
                } else if ((forma.equals("hexadre")) || (forma.equals("h"))) {
                    resultado = hexadre(costat, perimetre, area);
                    bucle2 = false;
                } else if (forma.equals("tetraedre") || (forma.equals("t"))) {
                    resultado = tetraedre(base, perimetre, area);
                    bucle2 = false;
                } else if ((forma.equals("esfera")) || (forma.equals("e"))) {
                    resultado = esfera(costat, perimetre, area);
                    bucle2 = false;

                } else if (forma.equals("s")) {
                    System.out.println("Sortint....");
                    break;
                } else {
                    System.out.println("No es una forma");

                }
            }

            if (forma.equals("s")) {
                break;
            }

            System.out.println(String.format("Superficie: %.2f", resultado[0]));
            System.out.println(String.format("Volum: %.2f", resultado[1]));
        }
    }

    public static double[] cilindre(double alcada, double radi, double superficie, double volum) {
        Scanner ln = new Scanner(System.in);

        radi = ln.nextDouble();
        
        alcada = ln.nextDouble();

        System.out.println("==Cilindre==");
        
        superficie = 2 * Math.PI * radi;
        volum = 2 * Math.PI * radi;

        double[] retorn = new double[2];
        retorn[0] = superficie;
        retorn[1] = volum;
        return retorn;
    }

    public static double[] hexadre(double costat, double superficie, double volum) {
        Scanner ln = new Scanner(System.in);

        costat = ln.nextDouble();

        System.out.println("==Hexaedre==");
        
        superficie = 6*(costat*costat);
        volum = (costat*costat)*(costat*costat);

        double[] retorn = new double[2];
        retorn[0] = superficie;
        retorn[1] = volum;
        return retorn;
    }

    public static double[] tetraedre(double aresta, double superficie, double volum) {
        Scanner ln = new Scanner(System.in);
       
        aresta = ln.nextDouble();

        System.out.println("==Tetraedre==");
        
        superficie = (aresta * aresta) * Math.sqrt(3);
        volum = ((aresta * aresta) * (aresta * aresta)) * (Math.sqrt(2/12));

        double[] retorn = new double[2];
        retorn[0] = superficie;
        retorn[1] = volum;
        return retorn;
    }

    public static double[] esfera(double radi, double superficie, double volum) {
        Scanner ln = new Scanner(System.in);
  
        radi = ln.nextDouble();

        System.out.println("==Esfera==");
        
        superficie = 4 * Math.PI * (radi * radi);
        volum = 4/3 * Math.PI * radi;

        double[] retorn = new double[2];
        retorn[0] = superficie;
        retorn[1] = volum;
        return retorn;
    }

}


