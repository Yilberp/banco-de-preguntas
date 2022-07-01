/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Pregunta {
    
    private String enunciado;
    private Respuesta []respuestas=new Respuesta[4];

    public Pregunta() {
    }

    public Pregunta(String enunciado) {
        this.enunciado = enunciado;
    }

    
    
    
    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Respuesta[] getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(Respuesta[] respuestas) {
        this.respuestas = respuestas;
    }
    
    
    public void crearAleatorio()
    {
    int n1=this.aleatorio(1, 100);
    int n2=this.aleatorio(1, 100);
    int suma=n1+n2;
    this.enunciado="¿Cuánto es:"+n1+"+"+n2+"?";
    int posVerdad=this.aleatorio(0, 3);
    //Crear las respuestas:
    for(int i=0;i<this.respuestas.length;i++)
    {
        Respuesta x;
        //Controla la posición de la rta acertada
        if(posVerdad==i)
            x=new Respuesta(suma, true);
        else
            x=new Respuesta(this.aleatorio(1, suma-1), false);
        
        this.respuestas[i]=x;
        
    }
    
    
    }
    
    
    
    public int aleatorio(int n, int m)
    {
        return (int)(Math.floor(Math.random()*(n-m+1)+m));
    }

}
