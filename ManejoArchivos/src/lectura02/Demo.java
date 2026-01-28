/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura02;

/**
 *
 * @author Usuario
 */
public class Demo {
    public static void main(String args[]) {
        String variableA = "100.2";
        String variableB = "200.2";
        
        double variableC = Double.parseDouble(variableA); 
        //Double.parseDouble convierte cadena en double
        double variableD = Double.parseDouble(variableB);
        double x = variableC + variableD;
        
        System.out.printf("%.2f", x);
    }
    
}
