/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritura05;

import escritura04.CrearArchivoTexto;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
    String cadenaFinal = "";
    String placa = "";
    boolean bandera = true;

    while (bandera) {

        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su cedula");
        String cedula = entrada.nextLine();
        System.out.println("Ingrese su marca de vehículo");
        String marca = entrada.nextLine();
        System.out.println("Ingrese su placa");
        placa = entrada.nextLine();
        
        String placaMayuscula = placa.toUpperCase();
        String inicialPlaca = placaMayuscula.substring(0, 1);

      
        cadenaFinal = String.format("%s | %s | %s | %s\n",
                nombre, cedula, marca, placaMayuscula);

        
        if (inicialPlaca.equals("L")) {
            Placas.Loja(cadenaFinal);
        } else {
            if (inicialPlaca.equals("P")) {
                Placas.Pichincha(cadenaFinal);
            } else {
                if (inicialPlaca.equals("G")) {
                    Placas.Guayas(cadenaFinal);
                } else {
                    Placas.Otros(cadenaFinal);
                }
            }
        } 

        System.out.println("Si desea continuar ingrese 'si', para salir ingrese 'no'");
        String opcion = entrada.nextLine(); 
        
        if (opcion.equalsIgnoreCase("no")) {
            bandera = false;
        }
        
    } 
}
}

    






