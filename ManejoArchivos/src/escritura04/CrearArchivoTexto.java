/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

cedula
nombre y correo 
repetitivo 
 */
package escritura04;

import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CrearArchivoTexto {
    
    public static void agregarRegistros(String cadena , String nombreArchivo ) {
        
        String ruta = String.format("data/%s.txt", nombreArchivo);
       
            try (Formatter salida = new Formatter(ruta) // remplaza
            ) {
                salida.format("%s", cadena);
            

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);

        }

    } 
    
} 

    
    

