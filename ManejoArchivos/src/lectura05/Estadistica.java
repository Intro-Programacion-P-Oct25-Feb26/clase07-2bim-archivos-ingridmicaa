/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor...
 */
package lectura05;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Estadistica {

    public static void PromedioLeerDatos() {
        double promedio = 0;
        double suma = 0;
        int contador = 0;
        boolean bandera = true;

        try {
            Scanner entrada = new Scanner(new File("data/sucursales.txt"));

            while (entrada.hasNext()) {
                
                //El ciclo se repite línea por línea hasta que el archivo se termine.
                
                try {
                    String linea = entrada.nextLine();

                    if (bandera) {
                        
                        bandera = false;
                        throw new Exception("Primera Línea");
           //El boolean sirve para saber si estoy leyendo la primera línea.
//La primera línea no tiene números, entonces la ignoro con una excepción y sigo con las demás.”

                    }

                    List<String> lista = Arrays.asList(linea.split("\\|"));
                    ArrayList<String> linea_partes = new ArrayList<>(lista);

                    System.out.println(linea_partes.get(2));
                    String valor = linea_partes.get(2);

                    double empleados = Double.parseDouble(valor);

                    suma = suma + empleados;

                    contador = contador + 1;

                } catch (Exception e) {
                    
                    
                }
            }

            promedio = suma / contador;

            entrada.close();

        } catch (Exception e) {

            System.err.println("Error al leer del archivo.");
            System.exit(1);

        }
        System.out.printf("Promedio: %.2f\n", promedio);
    }
}
