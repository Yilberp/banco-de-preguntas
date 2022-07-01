/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Negocio.Examen;

public class Facade {
    
    Examen myExamen;

    public Facade() {
    }

    public String crearExamen(int cant)
    {
        this.myExamen=new Examen(cant);
        return this.myExamen.getSelectPreguntas();
        
    }
    
    public Examen getMyExamen() {
        return myExamen;
    }

    public void setMyExamen(Examen myExamen) {
        this.myExamen = myExamen;
    }
    
    
    
    
    
}
