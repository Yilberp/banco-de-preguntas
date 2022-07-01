/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Modelo.Pregunta;
import Modelo.Respuesta;
import java.util.ArrayList;

public class Examen {
    
    private ArrayList<Pregunta> preguntas=new ArrayList();

    public Examen() {
    }
    
    
    public Examen(int cant) {
        if(cant<=0)
            throw new RuntimeException("Valor de preguntas no permitido");
        
     while(cant-->0)
        {
         Pregunta nueva=new Pregunta();
         nueva.crearAleatorio();
         this.preguntas.add(nueva);
        }  
    }
    

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
    
    
    
    //Crear los componentes del formulario
    
    public String getSelectPreguntas()
    {
        if(this.preguntas.isEmpty())
            throw new RuntimeException("No hay preguntas registradas");
        
         String msg="";
        
        for(Pregunta p:this.preguntas)
        {
        msg+="\n<p>"+p.getEnunciado();
        msg+="\n <select name='valores'> \n";
            for(Respuesta r:p.getRespuestas())
            {
                /*
                    Cuanto es 1+1 ?: 
                    <select name='valores'>
                        <option value="false"> 3</option>
                        <option value="false"> 34</option>
                        <option value="true"> 2</option>
                        <option value="false"> 0</option>
                    </select>
                */
                msg+="\n <option value='"+r.isEsAcertado()+"'>"+r.getValor()+"</option>";
            }
         msg+="\n</select>";
         msg+="</p>";
        
        }
        
        return msg;
    
    }
    
}
