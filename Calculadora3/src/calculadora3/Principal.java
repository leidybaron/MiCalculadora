/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora3;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Principal {

    public static void main(String[] args) {

        //crear un objeto de la Clase Calculadora
        Calculadora1 miCalculadora; //Definir el objeto
        miCalculadora = new Calculadora1(); //Construir el objeto

        Scanner miEscaner;
        miEscaner = new Scanner(System.in);

        int opcion;

        System.out.println("Ingrese el número de la operacion que desee realizar");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Coseno");

        opcion = (int) miEscaner.nextFloat();
        miCalculadora.set(opcion);

        switch (opcion) {
            case 1: {
                float entrada;

                System.out.println("Ingrese el primer número");

                entrada = miEscaner.nextFloat();
                miCalculadora.setX(entrada);
                
                System.out.println("Ingrese el segundo número");

                entrada = miEscaner.nextFloat();
                miCalculadora.setY(entrada);
                

                miCalculadora.sumar();
            }
            break;

            case 2: {
                miCalculadora.restar();
            }
            break;

            case 3: {
                miCalculadora.multiplicar();
            }
            break;

            default: {

            }
        }

        int entrada;

        entrada = miEscaner.nextInt();
        miCalculadora.setX(entrada);

        entrada = miEscaner.nextInt();
        miCalculadora.setY(entrada);

        Trigonometrica miTrigo = new Trigonometrica();
    }

}
