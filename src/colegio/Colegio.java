package colegio;

import Entidades.Alumno;
import Entidades.Materia;
import java.util.HashSet;
import vistas.GestorAlumnos;




public class Colegio {

    public Colegio() {
    }
    
    
    
   
  
    
   
    public static void main(String[] args) {
    
   
    
    
      Materia web= new Materia(001, "Web 2", 2);
      Materia matematica= new Materia(002, "Matematica", 1);
      Materia laboratorio= new Materia(003, "Laboratorio 1", 1);
      
      
      
     Alumno alumno1= new Alumno (1001, "Lòpez", "Martin");
     Alumno alumno2= new Alumno (1002, "Martínez", "Brenda");
     
    
      GestorAlumnos.listaAlumnos.add(alumno2);
      GestorAlumnos.listaAlumnos.add(alumno1);
      GestorAlumnos.listaMateria.add(web);
      GestorAlumnos.listaMateria.add(matematica);
      GestorAlumnos.listaMateria.add(laboratorio);
    
       
     
      

      
      alumno1.cantidadMaterias();
      alumno2.cantidadMaterias();
      
        
      
     
}

    
}