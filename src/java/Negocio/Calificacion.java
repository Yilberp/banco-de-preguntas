/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * 
 */
public class Calificacion {
    
    private boolean valores[];

    public Calificacion() {
    }

    public boolean[] getValores() {
        return valores;
    }

    public void setValores(boolean[] valores) {
        this.valores = valores;
    }

    @Override
    public String toString() {
        
      String msg="";
      for(int i=0;i<this.valores.length;i++)
            msg+="\n <p> Pregunta "+(i+1)+":"+this.valores[i];
      
      return msg;
      
        
    }
    
    
 public String getCalificacion()
 {
    
    
     int con=this.notasAprobadas();
     
     
     String msg=con<((this.valores.length/2)+1)?"Reprobó":"Aprobó";
     msg+=",Su Calificación fue: "+ con+"/"+this.valores.length;
     return msg;
     
     
     
 }    
 
 private int notasAprobadas()
 {
     int con=0;
     for(boolean valor:this.valores)
         con+=valor?1:0;
   return con;
 }
 
   
/*
 Se debe formatear los datos:
 ['Task', 'Hours per Day'],
          ['Work',     11],
          ['Eat',      2],
          ['Commute',  2],
          ['Watch TV', 2],
          ['Sleep',    7]
 */
 
public String getDatosGoogle()
{
   String cadenaGoogle="['Descripción', 'Valor'],";
   cadenaGoogle+="['Aprobada',"+this.notasAprobadas()+"],";
   cadenaGoogle+="['Reprobadas',"+(this.valores.length-this.notasAprobadas())+"]";
   
   return cadenaGoogle;
}
 
    
}
