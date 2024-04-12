/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1.gitv2;

import java.util.Scanner;

/**
 *
 * @author Gerard
 */
public class Practica1Gitv2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double res = 0;
        int operacion;
        String decision;
        boolean comprobar = false;

        do {

            String numero1;
            do {
                System.out.println("\n Introdueix el primer numero. ");
                numero1 = sc.nextLine();
            } while (!numero1.matches("[+-]?[\\d]*[.]?[\\d]+"));
            double nume1 = Double.parseDouble(numero1);
            double n1 = new Double(numero1);

            do {
                System.out.println("\nOperaciones disponibles:\n"+
            "1. Sumar (+)\n"+
            "2. Restar (-)\n"+
            "3. Multiplicar (x)\n"+
            "4. Dividir (/)\n"+
            "5. Elevar el primer número al segundo número (*)\n"+
            "6. Calcular el residuo (%)\n");
                operacion = sc.nextInt();
                if (operacion>0 && operacion<7) {
                    comprobar = true;
                } else {
                    comprobar = false;
                }
            } while (comprobar != true);

            String numero2;
            do {
                System.out.println("\n Introdueix el segon numero.");
                numero2 = sc.nextLine();
            } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
            double nume2 = Double.parseDouble(numero2);
            double n2 = new Double(numero2);

            do {
                comprobar = true;
                switch (operacion) {
                    case 1:
                        res = n2 + n2;
                        break;
                    case 2:
                        res = n1 - n2;
                        break;
                    case 3:
                        res = n1 * n2;
                        break;
                    case 4:
                        while (n2 == 0) {
                            do {
                                System.err.println(" Al denominador hi ha un zero \n"
                                        + "per a  evitar errors coloca un altre valor.");
                                numero2 = sc.nextLine();
                            } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                            nume2 = Double.parseDouble(numero2);
                            n2 = new Double(numero2);
                        }
                        res = n1 / n2;
                        break;
                    case 5:
                        res = Math.pow(n1, n1);
                        break;
                    case 6:
                        while (n2 == 0) {
                            do {
                                System.err.println(" Al denominador hi ha un zero \n"
                                        + "per a  evitar errors coloca un altre valor.");
                                numero2 = sc.nextLine();
                            } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                            nume2 = Double.parseDouble(numero2);
                            n2 = new Double(numero2);
                        }
                        res = n1 % n2;
                        break;
                }
            } while (comprobar != true);

            System.out.println("(" + numero1 + ") " + operacion + " (" + numero2 + ")" + " = " + res);
            System.out.println("\n Vols continuar operant? \n");
            System.out.println(" [s/n]");
            do {
                comprobar = true;
                decision = sc.nextLine();

                switch (decision) {
                    case "s":
                    case "S":
                    case "n":
                    case "N":
                        break;
                    default:
                        System.err.println("\n Error, posa un valor vàlid. \n");
                        comprobar = false;
                }
            } while (comprobar != true);
        } while (decision.equals("s") || decision.equals("S"));
    }
    
}
