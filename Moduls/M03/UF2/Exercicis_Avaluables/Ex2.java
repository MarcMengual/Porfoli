package avaluableuf2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner ln = new Scanner(System.in);

        int base = 0;
        double area = 0.00, perimetre = 0.00, costat = 0.00;
        String forma = "";
        double[] resultado = new double[2];
        boolean bucle1 = true, bucle2 = true;

        while (bucle1) {
            bucle2 = true;
            while (bucle2) {
                System.out.println("introdueix quina figura vols: (quadrat, rectagle,triangle isosceles, cercle)(s per sortir)");
                forma = ln.nextLine();

                forma.toLowerCase();

                if ((forma.equals("quadrat")) || (forma.equals("q"))) {
                    resultado = quadrat(costat, perimetre, area);
                    bucle2 = false;
                } else if ((forma.equals("rectangle")) || (forma.equals("r"))) {
                    resultado = rectangle(base, costat, perimetre, area);
                    bucle2 = false;
                } else if (forma.equals("triangle") || (forma.equals("triangle isossceles")) || (forma.equals("t"))) {
                    resultado = triangle(base, costat, perimetre, area);
                    bucle2 = false;
                } else if ((forma.equals("cercle")) || (forma.equals("c"))) {
                    resultado = cercle(costat, perimetre, area);
                    bucle2 = false;

                } else if (forma.equals("s")) {
                    System.out.println("Sortint....");
                    break;
                } else {
                    System.out.println("No es una forma");
    
                }
            }
            
            if(forma.equals("s")){
                break;
            }

            System.out.print(String.format("El perimetre del " + forma + " es %.2f", resultado[0]));
            System.out.println(String.format(" i el area del " + forma + " es %.2f", resultado[1]));
        }
    }

    public static double[] quadrat(double costat, double perimetre, double area) {
        Scanner ln = new Scanner(System.in);

        System.out.println("Introdueix la mesura d'un costat");
        costat = ln.nextDouble();

        perimetre = costat * 4;
        area = costat * 4;

        double[] retorn = new double[2];
        retorn[0] = perimetre;
        retorn[1] = area;
        return retorn;
    }

    public static double[] rectangle(double base, double costat, double perimetre, double area) {
        Scanner ln = new Scanner(System.in);

        System.out.println("Introdueix la base");
        base = ln.nextDouble();
        System.out.println("Introdueix el costat");
        costat = ln.nextDouble();

        perimetre = (costat * 2) + (base * 2);
        area = base * costat;

        double[] retorn = new double[2];
        retorn[0] = perimetre;
        retorn[1] = area;
        return retorn;
    }

    public static double[] triangle(double base, double costat, double perimetre, double area) {
        Scanner ln = new Scanner(System.in);
        System.out.println("Introdueix la base");
        base = ln.nextDouble();
        System.out.println("Introdueix l'altura");
        costat = ln.nextDouble();

        perimetre = (costat * 2) + base;
        area = base * costat / 2;

        double[] retorn = new double[2];
        retorn[0] = perimetre;
        retorn[1] = area;
        return retorn;
    }

    public static double[] cercle(double costat, double perimetre, double area) {
        Scanner ln = new Scanner(System.in);
        System.out.println(" Introdueix el radi");
        costat = ln.nextDouble();

        perimetre = 2 * Math.PI * costat;
        area = Math.PI * (costat * 2);

        double[] retorn = new double[2];
        retorn[0] = perimetre;
        retorn[1] = area;
        return retorn;
    }

}
