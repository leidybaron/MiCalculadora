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
       miCalculadora=new Calculadora1(); //Construir el objeto
       
       Scanner miEscaner;
       miEscaner=new Scanner(System.in);
       
       int entrada;
       
       entrada=miEscaner.nextInt();
       miCalculadora.setX(entrada);
       
       entrada=miEscaner.nextInt();
       miCalculadora.setY(entrada);
       
       miCalculadora.sumar();
       miCalculadora.
       
       
       
       
       
       
       
        CalculadoraTrigonometrica miTrigo=new CalculadoraTrigonometrica();
   }
    
}
