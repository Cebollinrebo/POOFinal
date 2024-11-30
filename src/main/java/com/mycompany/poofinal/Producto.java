
package com.mycompany.poofinal;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;

/**
 *
 * @author empanada25
 */
public class Producto {
    String nombre;
    int unidades;
    String categoria;
    double precio;
    

    public Producto() {
    }

    public Producto(String nombre, int unidades, String categoria, double precio) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
     /**
     * Verifica si el stock de los productos es menor de 38
     * @return 
     */
    public static ArrayList<String> verificarStockDeTodo(String archivoProductos) {
        ArrayList<String> productosBajoStock = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("productos.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
              
                String[] partes = linea.split(", ");
                String nombreProducto = partes[0].split(": ")[1];
                int stock = Integer.parseInt(partes[1].split(": ")[1]);

          
                if (stock < 38) {
                    productosBajoStock.add(nombreProducto);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return productosBajoStock; 
    }
}
