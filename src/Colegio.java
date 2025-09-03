
import Entidades.Alumno;
import Entidades.Materia;
import java.util.HashSet;




public class Colegio {
    
    
    
    public static HashSet<Alumno> alumnos =new HashSet<>();
    public static HashSet<Materia> materia =new HashSet<>();
    
   
    public static void main(String[] args) {
    
   
    
    
      Materia web= new Materia(001, "Web 2", 2);
      Materia matematica= new Materia(002, "Matematica", 1);
      Materia laboratorio= new Materia(003, "Laboratorio 1", 1);
      
      
      
     alumnos.add(new Alumno (1001, "Lòpez", "Martin"));
     alumnos.add(new Alumno (1002, "Martínez", "Brenda"));
    
      
     
      /*
      alumno1.agregarMateria(web);
      alumno1.agregarMateria(matematica);
      alumno1.agregarMateria(laboratorio);
      
      alumno2.agregarMateria(web);
      alumno2.agregarMateria(matematica);
      alumno2.agregarMateria(laboratorio);
      alumno2.agregarMateria(laboratorio);
      
      alumno1.cantidadMaterias();
      alumno2.cantidadMaterias();
      */
      
    
      
      
      
    
    
}
}