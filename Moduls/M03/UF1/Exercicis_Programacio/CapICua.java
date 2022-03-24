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
public class CapICua {
    
      public static void main(String[] args) {
               Scanner ln = new Scanner(System.in);
               
               String paraula, frase, fraseInvertida = "";
               
               System.out.println("Introdueix una paraula: ");
               paraula = ln.nextLine();
               
               paraula = paraula.replace(" ", "");
               paraula = paraula.replace(",", "");
               paraula = paraula.replace(".", "");
               
               frase = paraula;
               
               for(int i = paraula.length()-1;0 <= i;i--){
                    fraseInvertida = fraseInvertida + paraula.charAt(i);

               }
               
               if(fraseInvertida.equals(frase)){
                   System.out.println("La frase es palidronim");
               }else{
                   System.out.println("La frase no es palidronim");
               }
                   
               }
               
    
}
        
