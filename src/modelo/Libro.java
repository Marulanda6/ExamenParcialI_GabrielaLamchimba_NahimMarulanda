/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
/**
 *
 * @author kirlok6
 */
public class Libro implements Prestamo {
    private String titulo;
    private int codigo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String titulo, int codigo, int anioPublicacion, Autor autor) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public boolean disponibilidad() {
        return true; // Implementar lógica real de disponibilidad
    }

    @Override
    public String toString() {
        return titulo + " (" + anioPublicacion + ") - " + autor;
    }
}


