/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Respuesta {
    
    private int valor;
    private boolean esAcertado;

    public Respuesta() {
    }

    public Respuesta(int valor, boolean esAcertado) {
        this.valor = valor;
        this.esAcertado = esAcertado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean isEsAcertado() {
        return esAcertado;
    }

    public void setEsAcertado(boolean esAcertado) {
        this.esAcertado = esAcertado;
    }
    
    
    
}
