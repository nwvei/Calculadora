/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author UTN
 */
public class DivisionZeroException extends Exception {
    
    public DivisionZeroException() {
        super("Error: no es posible dividir entre cero.");
    }
}
