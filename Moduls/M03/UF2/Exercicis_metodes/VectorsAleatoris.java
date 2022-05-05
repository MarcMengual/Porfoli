package Exercicis_no_obligatoris;

import java.util.Arrays;

public class VectorsAleatoris {
        public static void main(String[] args) {
            
            int[] vectorA = new int [10];
            vectorA = omplirVector(vectorA);
            System.out.println("VectorA: "+Arrays.toString(vectorA));
            
            int[] vectorB = new int [10];
            vectorB = omplirVector2(vectorB);
            System.out.println("VectorB: "+Arrays.toString(vectorB));
            
            int[] vectorC = new int [vectorA.length + vectorB.length];
            vectorC = omplirVector3(vectorC, vectorA, vectorB);
            
            System.out.println("VectorC: "+Arrays.toString(vectorC));
    }
            
        public static int[] omplirVector3(int [] vector, int [] vectorA, int [] vectorB){
            int a = 0, b = 0;
            
            for (int i = 0;i < vector.length;i++){
                if (i % 2 == 0){
                    vector[i] = vectorA[a];
                    a++;
                }else{
                    vector[i] = vectorB[b];
                    b++;
                }
            }
            
            return vector;
        }
        
        public static int[] omplirVector2(int [] vector){
            
            for(int i = 0; i < vector.length;i++){
                vector[i] = (int) (Math.random() * (999 - 100)) + 100;
            }
            
            return vector;
        }
        
        
        public static int[] omplirVector(int [] vector){
            
            for(int i = 0; i < vector.length;i++){
            vector[i] = (int)(Math.random() * (10 - 0)) + 0;
        }
            return vector;
        }
}


/*(int) (Math.random() * (max - min)) + min;*/