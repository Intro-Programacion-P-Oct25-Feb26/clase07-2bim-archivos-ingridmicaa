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
    
    public static void Loja(String datos) {
        try {
            FileOutputStream fos = new FileOutputStream("data/PlacasLoja.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);

            salida.format("%s", datos);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo de Loja.");
            System.exit(1);

        }

    }

    public static void Pichincha(String datos) {
        try {
            FileOutputStream fos = new FileOutputStream("data/PlacasPichincha.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);

            salida.format("%s", datos);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo de Pichincha.");
            System.exit(1);

        }
    }

    public static void Guayas(String datos) {
        try {
            FileOutputStream fos = new FileOutputStream("data/PlacasGuayas.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);

            salida.format("%s", datos);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);

        }
    }

    public static void Otros(String datos) {
        try {
            FileOutputStream fos = new FileOutputStream("data/PlacasOtros.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);

            salida.format("%s", datos);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);

        }
    }
}



