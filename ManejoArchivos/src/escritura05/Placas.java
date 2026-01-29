/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritura05;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Formatter;

/**
 *
 * @author Usuario
 */
public class Placas {
    
     public static void loja (String valor) {
        try {
            FileOutputStream fos = new FileOutputStream("data/PlacasLoja.txt", true); 
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);
            
            salida.format("%s", valor);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);

        }

    } 
    
} 


