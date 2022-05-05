/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicis_m03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author mengu
 */
public class Ex3 {
    public static void main(String[] args) {

        Scanner ln = new Scanner(System.in);
        int numero = ln.nextInt();
        
        ArrayList<String> array2 = new ArrayList<String>();

        String[] paisos = new String[numero + 1];

        for (int i = 0; i < paisos.length; i++) {
            paisos[i] = ln.nextLine();
        }

        array2 = sort(paisos);

        array2.forEach(System.out::println);
    }

    public static ArrayList<String> sort(String paisos[]) {

        ArrayList<String> array2 = new ArrayList<String>();
        
        for(int i = 0;i < paisos.length;i++){
        array2.add(paisos[i]);    
        }
        
        Collections.sort(array2);
        return array2;
    }
}


