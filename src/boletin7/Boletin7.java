/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro l1 = new Libro("F", "Juan", 2, 2);
        l1.devolucion();
        l1.prestamo();

        System.out.println(l1.toString());

    }
    
}
