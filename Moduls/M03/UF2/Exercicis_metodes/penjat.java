/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicis_no_obligatoris;

import java.util.Scanner;

public class penjat {

    public static void main(String[] args) {
        Scanner ln = new Scanner(System.in);

        String paraula = "", paraulaSecreta = "", lletres = "", resposta, errorJugadorString = "";
        int contador = 0, errorsJugador = 0;
        boolean joc = true;
        
        String[] paraules = {"patata", "teclat", "aigua"};
        String agafarRes[] = new String[3];

        //ELECCIO DE PARAULA
        paraula = eleccioParaula(paraules, paraula, contador);

        //TRANSFORMAR PARAULA EN SECRETA
        paraulaSecreta = transformarParaulaSecreta(paraula, paraulaSecreta);
        
        while(joc){
        //MENU
        mostraPenjat(errorsJugador);

        System.out.println("Lletres Utilitzades:  " + lletres);
        System.out.println(paraulaSecreta);
        System.out.println(errorsJugador);
        System.out.println("Introdueix una lletra: ");
        resposta = ln.nextLine();
        
       agafarRes = validacioResposta(resposta, lletres, errorsJugador, paraula, paraulaSecreta);
       lletres = agafarRes[1];
       errorJugadorString = agafarRes[2];
       paraulaSecreta = agafarRes[0];
       
       System.out.println(paraulaSecreta);
       
       errorsJugador = Integer.parseInt(errorJugadorString);
       
       if(errorsJugador == 7){
           System.out.println("Has perdut!");
           break;
       }else if(paraulaSecreta.equals(paraula)){
           System.out.println("Has guanyat!");
           break;
       }
        }
    }

    public static String[] validacioResposta(String resposta, String lletres, int errorsJugador, String paraula, String paraulaSecreta) {

        boolean valid = true, valid2 = false;
        String paraulaSecreta2 = "", errorsJugadorAString = "";
        int correcte = 1;

        //Validar resposta per poder compararla        
         if (resposta.length() == 1) {
                for (int n = 0; n < lletres.length(); n++) {
                    char lletresSeparades = lletres.charAt(n);
                    String lletresSeparadesTransformades = Character.toString(lletresSeparades);
                    if (resposta.equals(lletresSeparades)) {
                        System.out.println("La lletra es repetida");
                        valid = false;
                        break;
                    }
            }
        } else {
            System.out.println("la resposta te que ser una lletra!");
            valid = false;
        }

        //Comprovar que la resposta sigui correcte o incorrecte
        if (valid == true) {
            for (int n = 0; n < paraula.length(); n++) {
                char paraulaPerLletresChar = paraula.charAt(n);
                String paraulaPerLletres = Character.toString(paraulaPerLletresChar);

                
                if (resposta.equals(paraulaPerLletres)) {
                    if (correcte == 1) {
                        System.out.println("Has adivinat la lletra " + resposta + "!");
                        lletres = lletres + resposta;
                        correcte--;
                        valid2 = true;
                    }
                    for (int o = 0; n < paraulaSecreta.length(); o++) {
                        char lletraSecretaChar = paraulaSecreta.charAt(o);
                        paraulaSecreta = paraulaSecreta + lletraSecretaChar;

                        if (o == n) {
                            paraulaSecreta2 = paraulaSecreta2 + resposta;
                            
                        } else {
                            paraulaSecreta2 = paraulaSecreta2 + lletraSecretaChar;

                        }

                    }
                }

            }
            if(valid2 == false){
            errorsJugador++;
            System.out.println("No has adivinat la lletra!");
            lletres = lletres + resposta;
        }
        }
        
       
        errorsJugadorAString = errorsJugadorAString+errorsJugador;
        
        String [] arrayReturn = new String[3];
            
        arrayReturn[0] = paraulaSecreta2;
        arrayReturn[1] = lletres;
        arrayReturn[2] = errorsJugadorAString;
        return arrayReturn;
    }


public static String transformarParaulaSecreta(String paraula, String paraulaSecreta){
          for(int i = 0;i < paraula.length(); i++){
            paraulaSecreta = paraulaSecreta + "*";
          }
          return paraulaSecreta;
      }
      
      public static String eleccioParaula(String[] paraules, String paraula, int contador){
        contador = (int)(Math.random() * (paraules.length - 0)) + 0;
        paraula = paraules[contador];
      
        return paraula;
      }
 
      
      public static void mostraPenjat(int errorJugador){
          switch (errorJugador) {
              case 0:
                  System.out.println("  ________");
                  System.out.println("  |       ");
                  System.out.println("  |       ");
                  System.out.println("  |       ");
                  System.out.println("  |       ");
                  System.out.println("  |       ");
                  System.out.println(" _|_____");
                  System.out.println("|       |");
                  System.out.println("---------");
                  break;
              case 1:
                  System.out.println("  ________");
                  System.out.println("  |     | ");
                  System.out.println("  |       ");
                  System.out.println("  |       ");
                  System.out.println("  |       ");
                  System.out.println("  |       ");
                  System.out.println(" _|_____");
                  System.out.println("|       |");
                  System.out.println("---------");
                  break;
              case 2:
                  System.out.println("  ________");
                  System.out.println("  |     |");
                  System.out.println("  |     0");
                  System.out.println("  |       ");
                  System.out.println("  |       ");
                  System.out.println("  |       ");
                  System.out.println(" _|_____");
                  System.out.println("|       |");
                  System.out.println("---------");
                  break;
              case 3:
                  System.out.println("  ________");
                  System.out.println("  |     |");
                  System.out.println("  |     0");
                  System.out.println("  |     |");
                  System.out.println("  |     |");
                  System.out.println("  |       ");
                  System.out.println(" _|_____");
                  System.out.println("|       |");
                  System.out.println("---------");
                  break;
              case 4:
                  System.out.println("  ________");
                  System.out.println("  |     | ");
                  System.out.println("  |     0 ");
                  System.out.println("  |     |)");
                  System.out.println("  |     |");
                  System.out.println("  |       ");
                  System.out.println(" _|_____");
                  System.out.println("|       |");
                  System.out.println("---------");
                  break;
              case 5:
                  System.out.println("  ________");
                  System.out.println("  |     |");
                  System.out.println("  |     0");
                  System.out.println("  |    (|)");
                  System.out.println("  |     |");
                  System.out.println("  |       ");
                  System.out.println(" _|_____");
                  System.out.println("|       |");
                  System.out.println("---------");
                  break;
              case 6:
                  System.out.println("  ________");
                  System.out.println("  |     |");
                  System.out.println("  |     0");
                  System.out.println("  |    (|)");
                  System.out.println("  |     |");
                  System.out.println("  |      ) ");
                  System.out.println(" _|_____");
                  System.out.println("|       |");
                  System.out.println("---------");
                  break;
              case 7:
                  System.out.println("  ________");
                  System.out.println("  |     |");
                  System.out.println("  |     0");
                  System.out.println("  |    (|)");
                  System.out.println("  |     |");
                  System.out.println("  |    ( ) ");
                  System.out.println(" _|_____");
                  System.out.println("|       |");
                  System.out.println("---------");
                  break;
              default:
                  break;
          }
      }
}
