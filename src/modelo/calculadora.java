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
    
    public calculadora(){
        reiniciar();
    }
    
    public void sumar()throws InvalidValueException{
        validarValor(valor);
        validarValor(resultado);
        resultado+= valor; 
    }
    
    public void restar()throws InvalidValueException{
        validarValor(valor);
        validarValor(resultado);
        resultado-= valor; 
    }
    
    public void multiplicar()throws InvalidValueException{
        validarValor(valor);
        validarValor(resultado);
        resultado*= valor; 
    }
    
    public void dividir() throws InvalidValueException, DivisionZeroException {
        validarValor(valor);
        validarValor(resultado);
        if (valor == 0) {
            throw new DivisionZeroException();
        }
        resultado /= valor;
    }
    
    public void reiniciar(){
        this.valor = 0;
        this.resultado = 0;
        this.operacion = "+";
    }    
    
    private void validarValor(double numero) throws InvalidValueException {
        if (Double.isNaN(numero)) {
            throw new InvalidValueException();
        }  
        if (Double.isInfinite(numero)) {
        throw new InvalidValueException();
        }
    }
   
}
