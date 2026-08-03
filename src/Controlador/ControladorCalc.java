/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import VistaCalculadora.FrmCalculadora;
import java.util.Set;
import modelo.calculadora;
import modelo.InvalidValueException;
import modelo.DivisionZeroException;

/**
 *
 * @author Aaron
 */
public class ControladorCalc {
    private double value;
    private double resultado;
    private String operacion;
     private FrmCalculadora vista;
    private calculadora modelo;

    public ControladorCalc(FrmCalculadora vista) {
        this.vista = vista;
        this.modelo = new calculadora();
    }
    public void calcular(double valor,String operador) throws InvalidValueException, DivisionZeroException{
        modelo.setValor(valor);
        switch(modelo.getOperacion()){
            case "+" -> {
                modelo.sumar();
                
            }
            case"-" -> {
                modelo.restar();
            }
            case "*" -> {
                modelo.multiplicar();
            }
            case "/" -> {
                try{
                modelo.dividir();
                }catch(ArithmeticException e){
                    modelo.reiniciar();
                    vista.mostrarResultado("No se puede dividir entre 0");
                }
            }
            default -> {
                modelo.setOperacion(operador);
                vista.mostarResultado(String.valueOf(modelo.getResultado()));
                        }
}
    }
    public void acPresionado() {
    modelo.reiniciar();
    vista.setTextoPantalla("0");
}
}