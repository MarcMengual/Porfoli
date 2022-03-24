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
public class EmpresaTreballadors {

    public static void main(String[] args) {
        Scanner ln = new Scanner(System.in);
        
        int pagaH, treballador, horesT = 0, suma = 0, Hcares = 0, recEx;
        
        System.out.println("Cuant pages l'hora? ");
        pagaH = ln.nextInt();
        
        System.out.println("Cuants treballadors hi han? ");
        treballador = ln.nextInt();
        
        for (int i = 1; i <= treballador;i++){
            System.out.println(" Treballador "+ i +" de "+ treballador);
            System.out.println(" Cuantes hores ha treballat aquesta setmana? ");
            horesT = ln.nextInt();
                
            Hcares = horesT - 40;
            recEx = (pagaH * 50) / 100;
            recEx = Hcares * recEx;
            Hcares = Hcares * pagaH;
            
            
        
        
        if (horesT >= 40){
            
            suma = pagaH * 40;
            suma = suma + Hcares;
            suma = suma + recEx;
            
        }else if (horesT <= 39){
            suma = pagaH * horesT;
        }
        
        System.out.println(" El treballador "+ i +" ha cobrat "+ suma);
                }
}       
}
