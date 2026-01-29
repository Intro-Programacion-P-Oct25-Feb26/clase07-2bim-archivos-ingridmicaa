/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.



 */
package escritura04;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";
        String cedula = "";
        

            for (int i = 1; i < 3; i++) {

                System.out.println("Ingrese su cédula");
                cedula = entrada.nextLine();
                System.out.println("Ingrese su nombre");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese su correo");
                String correo = entrada.nextLine();
                

                cadenaFinal = String.format("%s%s %s %s\n", cadenaFinal,
                        cedula, nombre, correo);
                
                CrearArchivoTexto.agregarRegistros(cadenaFinal, cedula);
                cadenaFinal = "";

            }

        }

    }

