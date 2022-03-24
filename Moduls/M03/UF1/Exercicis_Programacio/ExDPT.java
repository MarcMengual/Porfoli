/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javauf1;

import java.util.Scanner;

/**
 *
 * @author mengu
 */
public class ExDPT {

    public static void main(String[] args) {
        Scanner ln = new Scanner(System.in);

        float distancia, velMax = 80, seg, resultat, km, porcen, resPorc;

        System.out.println("Cuanta distancia hi ha entre cameres(En Metres)?: ");
        distancia = ln.nextFloat();
        System.out.println("Cuants segons ha tardat el cotxe en pasar d'una camera a un altre?: ");
        seg = ln.nextFloat();

        km = distancia * (1 / 1000);
        resultat = distancia * seg / velMax;
        porcen = velMax / 100 * 20;

        resPorc = porcen + velMax;

        if (resultat > velMax) {
            if (resultat <= resPorc) {
                System.out.println("Multa");
            } else if (resultat > resPorc) {
                System.out.println("Punts");
            }
        } else {
            System.out.println("Ok");
        }
        
    }
}
