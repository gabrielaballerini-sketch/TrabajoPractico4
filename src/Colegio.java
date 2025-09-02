
import trabajopractico4.Alumno;
import trabajopractico4.Materia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Capotes
 */
public class Colegio {
    
    public static void main(String[] args) {
    
    
    
    
    Materia web= new Materia(001, "Web 2", 2);
      Materia matematica= new Materia(002, "Matematica", 1);
      Materia laboratorio= new Materia(003, "Laboratorio 1", 1);
      
      Alumno alumno1= new Alumno (1001, "Lòpez", "Martin");
      Alumno alumno2= new Alumno (1002, "Martínez", "Brenda");
      
      alumno1.agregarMateria(web);
      alumno1.agregarMateria(matematica);
      alumno1.agregarMateria(laboratorio);
      
      alumno2.agregarMateria(web);
      alumno2.agregarMateria(matematica);
      alumno2.agregarMateria(laboratorio);
      alumno2.agregarMateria(laboratorio);
      
      alumno1.cantidadMaterias();
      alumno2.cantidadMaterias();
    
    
}
}