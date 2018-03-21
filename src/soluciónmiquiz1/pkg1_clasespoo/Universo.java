
package soluciónmiquiz1.pkg1_clasespoo;

import java.util.*;
public class Universo {
    
    private ArrayList<Persona> personas;
    
    public Universo(){
        this.personas=new ArrayList();
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }
    
    public boolean añadirPersona(Persona persona){
        boolean proceso=false;
       if( personas.add(persona)){
           proceso= true;
       }
       return proceso;
    }
    
    public void listarPersonas(){
       if(!personas.isEmpty()){
           for (int i = 0; i < personas.size(); i++) {
               
               System.out.println((i+1)+". "+personas.get(i).toString());
               
           }
           
       }
        }
            
    
            
            public int cantidadPersonasCoMujeresHijas(){
                int contador=0;
              if(!personas.isEmpty()){
                  for(int i=0;i<personas.size();i++){
                      if(personas.get(i).TieneMujeresHijas()){
                         contador+=1;
                      }
                      
                  }
                  
              }
              return contador;
            }
    }
        
        
    

