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
public class AnyBisiesto {
        public static void main(String[] args) {
               Scanner ln = new Scanner(System.in);
               
        int any;
        
        System.out.print("Introdueix un any: ");
        any = ln.nextInt();
    
    if ((any % 4 == 0) && ((any % 100 != 0) || (any % 400 == 0))){
	System.out.println("El any es bisiesto");
    }
    else{
	System.out.println("El any no es bisiesto");
    }
    }
}
