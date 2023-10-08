//Miguel Ernesto Jasso Flores Metaphorse Tech Skill 2: Git
package org.metaphorse.view;

import java.util.Scanner;

/**
 *
 * @author Miguel Ernesto Jasso Flores
 */
public class Calculadora {

 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Ingrese el valor del primer numero: ");
        float num1 = scanner.nextFloat();
        
        System.out.println("Ingrese el valor del segundo numero: ");
        float num2 = scanner.nextFloat();
                
        float total;
        
        total = num1 + num2;
        System.out.println("El resultado de la suma es: " + total);
        total = num1 - num2;
        System.out.println("El resultado de la resta es: " + total);
        total = num1 * num2;
        System.out.println("El resultado de multiplicación es: " + total);
        total = num1 / num2;
        System.out.println("El resultado de la division es: " + total);
        
        
    }
    
}
