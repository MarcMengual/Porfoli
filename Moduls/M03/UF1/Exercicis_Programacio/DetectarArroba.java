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
public class DetectarArroba {
          public static void main(String[] args) {
               Scanner ln = new Scanner(System.in);
               
               String frase;
               
               System.out.println("Introdueix una frase: ");
               frase = ln.nextLine();
               
               for(int i = 0; i > frase.length();i++){
                   if (frase.charAt(i) == '@'){
                       System.out.println("Te @ en la frase");
                   }else{
                       System.out.println("No te @ en la frase");
                   }
}
}
}