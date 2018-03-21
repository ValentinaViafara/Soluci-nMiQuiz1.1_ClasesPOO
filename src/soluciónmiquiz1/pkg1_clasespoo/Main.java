
package soluciónmiquiz1.pkg1_clasespoo;

import java.util.*;

public class Main {
    public static void main(String []args){
        Universo miUniverso= new Universo();
        
        
       //Persona1
        Persona[] padresPersona1= new Persona[2];
        Persona padre1= new Persona("Rodrigo Vargaz", "masculino");
        Persona madre1= new Persona("Camila Vargaz", "femenino");
        padresPersona1[0]= padre1;
        padresPersona1[1]=madre1;
        
        ArrayList<Persona> hijosPersona1= new ArrayList();
        Persona hijo1_1= new Persona("MariaPaula", "femenino");
        Persona hijo1_2=new Persona("Camila", "femenino");
        hijosPersona1.add(hijo1_1);
        hijosPersona1.add(hijo1_2);
        
        Persona persona1= new Persona("Daniela Vargaz Vargaz", "femenino", padresPersona1, hijosPersona1);
       
        
        
     //Persona2
      Persona[] padresPersona2= new Persona[2];
      Persona madre2= new Persona("Vianca Barragan", "femenino");
      padresPersona2[0]=madre2;
      
      
      ArrayList<Persona> hijosPersona2= new ArrayList();
      Persona hijo2_1= new Persona("David", "masculino");
      Persona hijo2_2= new Persona("Nicolas", "masculino");
      Persona hijo2_3= new Persona("Dario", "masculino");
      
      hijosPersona2.add(hijo2_1);
      hijosPersona2.add(hijo2_2);
      hijosPersona2.add(hijo2_3);
      
      Persona persona2=new Persona("Alvaro Barragan", "masculino",padresPersona2, hijosPersona2);
     
              
      

     //Persona3 
      Persona[] padresPersona3= new Persona[2];
      Persona padre3=padre1;
      Persona madre3= new Persona("Andrea Ariaz", "femenino");
      padresPersona3[0]=madre3;
      padresPersona3[1]=padre3;
      
      
      ArrayList<Persona> hijosPersona3= new ArrayList();
      Persona hijo3_1= new Persona("Cameron", "femenino");
      Persona hijo3_2= new Persona("Rafael", "masculino");
      Persona hijo3_3= new Persona("Dario", "masculino");
      
      hijosPersona3.add(hijo3_1);
      hijosPersona3.add(hijo3_2);
      hijosPersona3.add(hijo3_3);
      
      Persona persona3=new Persona("Graciela Vargaz Ariaz", "femenino",padresPersona3, hijosPersona3);
  
              
      
      
     //Persona4
      Persona[] padresPersona4= new Persona[2];
      Persona padre4=new Persona("Carlos Rubio", "masculino");
      Persona madre4= new Persona("Patricia Esteban", "femenino");
      padresPersona4[1]=madre4;
      padresPersona4[0]=padre4;
      
      
      ArrayList<Persona> hijosPersona4= new ArrayList();
      Persona hijo4_1= new Persona("Felipe", "masculino");
      Persona hijo4_2= new Persona("Isabela", "femenino");
      
      hijosPersona4.add(hijo4_1);
      hijosPersona4.add(hijo4_2);
      
      
      Persona persona4=new Persona("Hector Rubio Esteban", "masculino",padresPersona4, hijosPersona4);

      
      
      
     //Persona5
      Persona[] padresPersona5= new Persona[2];
      Persona padre5= new Persona("Armando Agudelo", "masculino");
      padresPersona5[0]=padre5;

      
      
      ArrayList<Persona> hijosPersona5= new ArrayList();
      Persona hijo5_1= new Persona("Fabian", "masculino");
      Persona hijo5_2= new Persona("Rafaela", "femenino");
      
      hijosPersona5.add(hijo5_1);
      hijosPersona5.add(hijo5_2);
      
      Persona persona5=new Persona("Roberto Agudelo", "masculino",padresPersona5, hijosPersona5);
   
        
              
      
      //información del universo
      
       miUniverso.añadirPersona(persona1);
        miUniverso.añadirPersona(persona2);
         miUniverso.añadirPersona(persona3);
          miUniverso.añadirPersona(persona4);
           miUniverso.añadirPersona(persona5);
           
           
      miUniverso.listarPersonas();
      
        System.out.println("\n"+"\n"+"\n"+"\n"+ "Cantidad de personas en miUniverso que tienen como hijas mujeres son: "+miUniverso.cantidadPersonasCoMujeresHijas());
    }
}
