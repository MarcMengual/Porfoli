/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicis_Ordenar_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mengu
 */
public class ordenacio {

    public static void main(String[] args) {
        Scanner ln = new Scanner(System.in);

        int numElements = 0;

        System.out.println("Introdueix els numero d'elements");
        numElements = ln.nextInt();

        int[] array = new int[numElements];

        array = generaVector(numElements);
        ordenaSeleccio(array);
        ordenaBombolla(array);
        ordenaSort(array);
    }

    public static int[] generaVector(int numElements) {
        int[] array = new int[numElements];
        int cont = numElements;

        for (int i = 0; i < array.length; i++) {
            array[i] = cont;
            cont--;
            System.out.print(array[i] + "|");
        }
        
        System.out.println("");

        return array;
    }

    public static void ordenaSeleccio(int[] array) {
        int minim = 0;
        int posicio = 0;

        for (int e = 0; e < array.length; e++) {
            minim = array[e];
            for (int i = e; i < array.length; i++) {
                if (minim > array[i]) {
                    minim = array[i];
                    posicio = i;
                }
            }
            for (int i = 0;i < array.length;i++) {
                if (array[posicio] <= array[i]){
                    array[posicio] = array[i];
                    array[i] = minim;
                    break;
                }
            }
            
            System.out.print(array[e]+"|");
            
        }
        System.out.println(" : Metode Seleccio");

    }
    
    public static void ordenaBombolla(int [] array){
        int guardar;
        
        for(int i = 0;i < array.length - 1;i++){
            for(int e = 0;e < array.length - i - 1;e++){
                if (array[e + 1] < array[e]){
                    guardar = array[e + 1];
                    array[e + 1] = array[e];
                    array[e] = guardar;
                }
            }
            System.out.print(array[i]+"|");
            
        }
        System.out.println(": Metode Bombolla");

        
        
        
    }
    
    public static void ordenaSort(int [] array){
                
        ArrayList<Integer> array2 = new ArrayList();
        
        for(int i = 0;i < array.length;i++){
        array2.add(array[i]);    
        }
        
        
        
        Collections.sort(array2);
     
        System.out.println(array2+" : Metode Collections");
        
        Arrays.sort(array);
        
        for(int s = 0;s < array.length;s++){
            System.out.print(array[s]+"|");
        }
        System.out.println(" : Metode .Sort");
    }

}
