

package com.mycompany.poofinal;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.ArrayList;

/**
 *
 * @author empanada25
 */
public class SIGa {
   private String archivoProductos;
    private String archivoVentas;
    
    /**
     * Verifica como esta el inventario
     */
    public void verificarInventario() {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoProductos))) {
            String linea;
            boolean encontrado = false;
            System.out.println("Verificando inventario...");
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(", ");
                String nombreProducto = partes[0].split(": ")[1];
                int stock = Integer.parseInt(partes[1].split(": ")[1]);

                if (stock < 38) {
                    System.out.println("Advertencia: El producto " + nombreProducto + " tiene bajo stock (" + stock + " unidades).");
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("Todos los productos tienen suficiente stock.");
            }
        } catch (IOException e) {
            System.out.println("Error al verificar el inventario: " + e.getMessage());
        }
    }
    /**
     * Genera el reporte de ventas
     */
    
    public void generarReporteVentas() {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoVentas));
             BufferedWriter writer = new BufferedWriter(new FileWriter("reporte_ventas.txt"))) {

            String linea;
            double totalVentas = 0;
            writer.write("Reporte de Ventas:\n");
            writer.write("--------------------\n");

            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(", ");
                String nombreProducto = partes[0].split(": ")[1];
                int cantidadVendida = Integer.parseInt(partes[1].split(": ")[1]);
                double precio = Double.parseDouble(partes[2].split(": ")[1]);
                double total = cantidadVendida * precio;

                writer.write("Producto: " + nombreProducto + ", Cantidad Vendida: " + cantidadVendida + ", Total: $" + total + "\n");
                totalVentas += total;
            }

            writer.write("--------------------\n");
            writer.write("Total de Ventas: $" + totalVentas + "\n");
            System.out.println("Reporte de ventas generado exitosamente (reporte_ventas.txt).");

        } catch (IOException e) {
            System.out.println("Error al generar el reporte de ventas: " + e.getMessage());
        }
    }
    
    public void notificarAdministrador(String mensaje) {
        System.out.println("Notificación al Administrador: " + mensaje);
    } 
}
