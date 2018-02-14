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
        
        Trigonometrica miTrigo = new Trigonometrica();

        int opcion;
        float entrada;

        System.out.println("Ingrese el número de la operacion que desee realizar");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Coseno");

        opcion = miEscaner.nextInt();
        
        switch (opcion) {
            case 1: {
            
                System.out.println("Ingrese el primer número");

                entrada = miEscaner.nextFloat();
                miCalculadora.setX(entrada);
                
                System.out.println("Ingrese el segundo número");

                entrada = miEscaner.nextFloat();
                miCalculadora.setY(entrada);
                
                miCalculadora.sumar();
                
                System.out.println("El resultado de la suma es:"+miCalculadora.getR());
                
                
            }
            break;

            case 2: {
                
                System.out.println("Ingrese el primer número");

                entrada = miEscaner.nextFloat();
                miCalculadora.setX(entrada);
                
                System.out.println("Ingrese el segundo número");

                entrada = miEscaner.nextFloat();
                miCalculadora.setY(entrada);
                
                miCalculadora.restar();
                
                System.out.println("El resultado de la resta es:"+miCalculadora.getR());
            }
            break;

            case 3: {
                
                System.out.println("Ingrese el primer número");

                entrada = miEscaner.nextFloat();
                miCalculadora.setX(entrada);
                
                System.out.println("Ingrese el segundo número");

                entrada = miEscaner.nextFloat();
                miCalculadora.setY(entrada);
                
                miCalculadora.multiplicar();
                
                System.out.println("El resultado de la multiplicacion es:"+miCalculadora.getR());
            }
            break;
            
            case 4: {
                
                System.out.println("Ingrese el número");
                
                entrada = miEscaner.nextFloat();
                miCalculadora.setX(entrada);
                
                miTrigo.coseno();
                
                System.out.println("El resultado del coseno es:"+miCalculadora.getR());
                
                
            }
            break;

            default: {
                
                System.out.println("La opcion que ingreso no corresponde a ninguna operacion");

            }
        }
        
       
    }

}
