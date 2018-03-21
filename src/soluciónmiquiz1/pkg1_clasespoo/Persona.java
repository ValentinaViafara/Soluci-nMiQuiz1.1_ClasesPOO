
package soluciónmiquiz1.pkg1_clasespoo;

import java.util.*;
import java.util.ArrayList;
public class Persona {
    
    private String nombre;
    private String genero;
    private Persona[] padres= new Persona[2];
    private ArrayList<Persona> hijos;
    
    public Persona(){
        this.hijos=new ArrayList();
    }
    
    
    public Persona(String nombre, String genero, Persona[] padres, ArrayList<Persona> hijos){
        this.nombre=nombre;
        this.genero=genero;
        this.padres= padres;
        this.hijos=hijos;
    }
    
    public Persona(String nombre, String genero){
        this.nombre=nombre;
        this.genero=genero;
        this.padres= padres;
        this.hijos=hijos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public Persona[] getPadres() {
        return padres;
    }

    public ArrayList hijos() {
        return hijos;
    }
 
    
    @Override
    public String toString(){
        String datosprincipales;
        datosprincipales="Nombre: "+nombre+".  Genero: "+genero;
        datosprincipales+="\n"+"   ";
        
         if(padres[1]!=null && padres[0]!=null){
           datosprincipales+="Padres: "+padres[0].getNombre()+ ", genero "+ padres[0].getGenero()+" y "+padres[1].getNombre()+", genero "+ padres[1].getGenero()+".";
        }else if(padres[0]!=null){
           datosprincipales+="Padres: "+padres[0].getNombre()+ ", genero "+ padres[0].getGenero()+".";
       }else{
           
       }
         
               datosprincipales+="\n"+"   ";
        if(!hijos.isEmpty()){
        datosprincipales+="Hijos: "; 
          if(hijos.size()>1){
            for (int i = 0; i < hijos.size()-1; i++) {
                datosprincipales+=hijos.get(i).getNombre()+", genero "+hijos.get(i).getGenero()+"; ";      
            }
         datosprincipales+=" y "+hijos.get(hijos.size()-1).getNombre()+",genero "+hijos.get(hijos.size()-1).getGenero()+".";
        }else{
              datosprincipales=hijos.get(1).getNombre()+",genero "+hijos.get(1).getGenero()+".";
          }
       
          
        }else{
            
        }   
        
        datosprincipales+="\n";
        datosprincipales+="\n";
        datosprincipales+="\n";
         
         
         
        return datosprincipales;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPadres(Persona[] padres) {
        this.padres = padres;
    }


    public boolean TieneMujeresHijas(){
        boolean comprobacion=false;
        if(!hijos.isEmpty()){
            for(int i=0; i<hijos.size();i++){
                if(hijos.get(i).getGenero()=="femenino" || hijos.get(i).getGenero()=="Femenino"){
                 comprobacion=true;
                 break;
                }
            }
        }
        return comprobacion;
    }
   
    
    
}
