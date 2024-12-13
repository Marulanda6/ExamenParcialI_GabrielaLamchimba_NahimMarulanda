/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
<<<<<<< HEAD
 * @author USER-LENOVO
 */
public class Autor extends Persona {
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
=======
 *  @author USER-LENOVO
 */
public class Autor extends Persona {
    private String biografia;
    private String nacionalidad;

    public Autor(String nombre, String apellido, String biografia, String nacionalidad) {
        super(nombre, apellido);
        this.biografia = biografia;
        this.nacionalidad = nacionalidad;
    }
>>>>>>> Marulanda2_branch

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
<<<<<<< HEAD
    
    
    
    
    
    
}
=======

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return getNombre() + " " + getApellido();
    }
}
>>>>>>> Marulanda2_branch
