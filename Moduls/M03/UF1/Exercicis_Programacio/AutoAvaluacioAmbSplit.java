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
public class AutoAvaluacioAmbSplit {
    
    public static void main(String[] args) {
        Scanner ln = new Scanner(System.in);
 
        //Introduim una varible amb la cadena de text demanada
        
        String frase = "eva Evaristo Lucia Genoveva eva Luis";
        
        
        //Utilitzem el split per detectar els espais en blanc i separar la cadena
         String[] split = frase.split("");
        for (int i = 0; i < split.length; i++) {
            if (i == 0 || split[i - 1].equals(" ")) {
                split[i] = split[i].toUpperCase();
            }
        }
        System.out.println(String.join("", split));
        
}
}