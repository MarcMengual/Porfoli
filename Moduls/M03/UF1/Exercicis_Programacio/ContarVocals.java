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
public class ContarVocals {
      public static void main(String[] args) {
               Scanner ln = new Scanner(System.in);
               
               String frase;
               
               int contA = 0,contE = 0,contI = 0,contO = 0, contU = 0;
               
               System.out.println("Introdueix una frase: ");
               frase = ln.nextLine();
               
               for(int i = 0; i > frase.length();i++){
                   if (frase.charAt(i) == 'a'){
                       contA++;
                   }else if (frase.charAt(i) == 'e'){
                       contE++;
                   }else if (frase.charAt(i) == 'i'){
                       contI++;
                   }else if (frase.charAt(i) == 'o'){
                       contO++;
                   }else if (frase.charAt(i) == 'u'){
                       contU++;
                   }
               } 
               
               System.out.println("Hi han "+ contA +" A,"+ contE+" E,"+ contI+" I,"+ contO +" O,"+ contU +" U");
                     
               
}
}