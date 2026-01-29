/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritura05;

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

            for (int i = 0; i < 4; i++) {

                System.out.println("Ingrese su nombre");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese su cedula");
                String cedula = entrada.nextLine();
                System.out.println("Ingrese su marca de vehículo");
                String marca = entrada.nextLine();
                System.out.println("Ingrese su placa");
                String inicial1 = placa.toLowerCase();

                cadenaFinal = String.format("%s%s %s %s\n", cadenaFinal,
                        nombre, cedula, marca, placa);

                String inicialPlaca = inicial1.substring(0, 1);

                if (inicialPlaca.equals("L")) {

                    Placas.loja(cadenaFinal);

                } else {

                    if (inicialPlaca.equals("P")) {

                        Placas.Pichincha(cadenaFinal);

                    } else {

                        if (inicialPlaca.equals("G")) {

                            Placas.Guayas(cadenaFinal);
                        } else {

                            Placas.Otros(cadenaFinal);
                        }

                        Placas.(cadenaFinal, placa);
                        cadenaFinal = "";

                    }

                }

            }
        
        }
    }
}

