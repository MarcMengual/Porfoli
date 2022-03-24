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
public class Bloac4Ex {
    public static void main(String[] args) {
               Scanner ln = new Scanner(System.in);
    
    double hores, horesPagades = 0, paga = 30, salari = 0;
    String horari;
    
    System.out.println(" Quantes hores semanals treballes?");
    hores = ln.nextDouble();
    
    while(true){
    
    System.out.println("Quin horari tens? (Mati : M, Tarda : T, Nit : N)");
    horari = ln.nextLine();
    horari = ln.nextLine();

    
    if (horari.equals("M")){
     
        horesPagades = paga * hores;
       
        break;
        
    } else if (horari.equals("T")){
        
        paga = (((paga / 100) * 1.22)+ paga);
        
        horesPagades = paga * hores;
        
        break;
        
    } else if (horari.equals("N")){
        
        paga = (((paga / 100) * 1.5)+ paga);
        
        horesPagades = paga * hores;
        
        break;
        
    }else {
        
        System.out.println("Dades Introduides Incorrectes");
        
    }
    }
    
    if (horesPagades < 700){
        
        salari = horesPagades;
        
        salari = ((salari / 100) * 8);
        
        salari = horesPagades - salari;
        
        System.out.println("Tens un salari de "+ horesPagades+" sense taxes, amb taxes el teu salari es de "+ salari);
        
    }else if ((horesPagades >= 700) && (horesPagades <= 1100)){
        
        salari = horesPagades;
        
        salari = ((salari / 100) * 10);
        
        salari = horesPagades - salari;
        
        System.out.println("Tens un salari de "+ horesPagades+" sense taxes, amb taxes el teu salari es de "+ salari);

    } else if (horesPagades > 1100){
        
        salari = horesPagades;
        
        salari = ((salari / 100) * 12);
        
        salari = horesPagades - salari;

        System.out.println("Tens un salari de "+ horesPagades+" sense taxes, amb taxes el teu salari es de "+ salari);
        
    }
    
}
}
