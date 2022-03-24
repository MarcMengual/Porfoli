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
public class AutoAvaluacio {

    public static void main(String[] args) {
        Scanner ln = new Scanner(System.in);
        
        //Hi ha un problema a solucionar, introdueix al principi una E de mes i en Genoveva esborra les E;

        String cadena,dobleString,stringE = "", fraseCompleta = "";
        char unaE;
        
        cadena = "eva Evaristo Lucia Genoveva eva Luis";
               
        for(int i = 0; i < cadena.length();i++){
  
        if ((cadena.charAt(i) == 'e') && (i == 0)){
            unaE = cadena.charAt(i);
            stringE = unaE + "";
            stringE = stringE.toUpperCase();
            fraseCompleta = fraseCompleta + stringE;
        } else if ((cadena.charAt(i) == 'e') && (i != 0)){
            if (cadena.charAt(i - 1) == ' '){
                unaE = cadena.charAt(i);
                stringE = unaE + "";
                stringE = stringE.toUpperCase();
                fraseCompleta = fraseCompleta + stringE;
            }
        } else {
            fraseCompleta = fraseCompleta + cadena.charAt(i);
        }
        }

        System.out.println(fraseCompleta);

    }
}
