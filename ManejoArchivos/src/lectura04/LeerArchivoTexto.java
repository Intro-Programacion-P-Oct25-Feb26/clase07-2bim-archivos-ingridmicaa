/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura04;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LeerArchivoTexto {

    public static void PromedioLeerDatosDos() {

       double promedio = 0; 
       double suma = 0;
       int contador = 0; 
        try 
        {
            Scanner entrada = new Scanner(new File("data/datosDos.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split("\\|"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);

                System.out.println(linea_partes.get(3));
                 String valor = linea_partes.get(3);
                 
                 double variableC = Double.parseDouble(valor);
                 suma= suma + variableC;
                 contador = contador + 1 ;
            }
            
                promedio = suma / contador;

            entrada.close();

        } catch (Exception e) {
            
            System.err.println("Error al leer del archivo.");
            System.exit(1);
            
        }
        System.out.printf("Promedio: %.2f", promedio);
    }
}

