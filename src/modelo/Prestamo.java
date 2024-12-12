/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author kirlok6
 */
public class Prestamo {
    private Libro libro;
    private boolean disponible;

    // Constructor
    public Prestamo(Libro libro, boolean disponible) {
        this.libro = libro;
        this.disponible = disponible;
    }

    // Método para verificar disponibilidad
    public boolean disponibilidad() {
        return disponible;
    }

    // Getters y Setters
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
