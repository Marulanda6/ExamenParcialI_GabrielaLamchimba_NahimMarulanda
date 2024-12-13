/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author kirlok6
 */

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // Crear un nuevo JFrame
        JFrame frame = new JFrame("Gestión de Libros");
        
        // Establecer el tamaño del JFrame
        frame.setSize(1013, 602); 
        
        // Crear una instancia del panel GestionLibros 
        GestionLibrosGUI gestionLibrosPanel = new GestionLibrosGUI();
        
        // Agregar el panel al JFrame
        frame.add(gestionLibrosPanel);
        
        // Configurar la operación por defecto al cerrar
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Hacer visible el JFrame
        frame.setVisible(true);
    }
}
