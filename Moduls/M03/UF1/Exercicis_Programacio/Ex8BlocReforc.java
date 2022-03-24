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
public class Ex8BlocReforc {
    public static void main(String[] args) {
    
        ex2();
        
        
        
        
        
        
        
        
        
        
        
    }
    
    public static void ex3() {
        
        
    }
    
    public static void ex2(){
        Scanner ln = new Scanner(System.in);
        
        int e, num = 0; 
        
        for (e = 10; e >= 0 ; e--){
            System.out.print(e);
        }
        System.out.println("");
        for (e = 9; e >= 0 ; e--){
            System.out.print(e);
        }
        System.out.println("");
        for (e = 8; e >= 0 ; e--){
        System.out.print(e);
        }
        System.out.println("");
        for (e = 7; e >= 0 ; e--){
            System.out.print(e);
        }        
        System.out.println("");
        for (e = 6; e >= 0 ; e--){
            System.out.print(e);
        }        
        System.out.println("");        
    }
    
    public static void ex1(){
        Scanner ln = new Scanner(System.in);
               
               int i, suma = 0, n;
               
               System.out.println("Introdueix un numero: ");
               n = ln.nextInt();
               for (i = 1;i < n; i++){
                   if (n % i == 0){
                       suma = suma + i;
                   }
               }
               if (suma == n){
                   System.out.println("Numero Perfecte");
               } else {
                   System.out.println("No es Perfecte");
               }
    }
}

