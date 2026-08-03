/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author UTN
 */
public class calculadora {
        private double valor;
    private double resultado;
    private String operacion;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    
    public Calculadora(){
        reiniciar();
    }
    
    public void sumar(){
        resultado+= valor; 
    }
    
    public void rstar(){
        resultado-= valor; 
    }
    
    public void multiplicar(){
        resultado*= valor; 
    }
    
    public void dividir(){
        resultado/= valor; 
    }
    
    public void reiniciar(){
                this.valor = 0;
        this.resultado = 0;
        this.operacion = "+";
    }    
   
}
