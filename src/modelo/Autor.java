/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *

 * @author USER-LENOVO
 */
public class Autor extends Persona {
     private String biografia;
     private String nacionalidad;
    public Autor() {
    }

    public Autor(String biografia) {
        this.biografia = biografia;
    }

    public Autor(String biografia, String nacionalidad) {
        this.biografia = biografia;
        this.nacionalidad = nacionalidad;
    }

    public Autor(String biografia, String nacionalidad, String nombre, String identificacion) {
        super(nombre, identificacion);
        this.biografia = biografia;
        this.nacionalidad = nacionalidad;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
   
}