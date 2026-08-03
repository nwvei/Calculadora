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
    private String resultado;
    private String operacion;
     private FrmCalculadora vista;
    private calculadora modelo;

    public ControladorCalc(FrmCalculadora vista) {
        this.vista = vista;
        this.modelo = new calculadora();
    }
    public void calcular(double valor, String operador) throws InvalidValueException {
    modelo.setValor(valor);
    try {
        switch (modelo.getOperacion()) {
            case "+" -> modelo.sumar();
            case "-" -> modelo.restar();
            case "*" -> modelo.multiplicar();
            case "/" -> modelo.dividir();
        }
    } catch (DivisionZeroException e) {
        modelo.reiniciar();
        vista.mostarResultado("No se puede dividir entre 0");
        return;
    }
    modelo.setOperacion(operador);
    vista.mostarResultado(String.valueOf(modelo.getResultado()));
}
    public void acPresionado() {
    modelo.reiniciar();
    vista.setTextoPantalla("0");
}
}