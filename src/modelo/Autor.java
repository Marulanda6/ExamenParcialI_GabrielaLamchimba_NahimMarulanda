/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER-LENOVO
 */
public class Autor extends Persona1 {
     private String biografia;

    public Autor() {
    }

    public Autor(String biografia) {
        this.biografia = biografia;
    }
 
    public Autor(String nombre, String identificacion, String biografia) {
        super(nombre, identificacion);
        this.biografia = biografia;
   
}

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
    
    
    
    
    
    
}
