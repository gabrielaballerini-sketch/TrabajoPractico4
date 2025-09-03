
import Entidades.Alumno;
import Entidades.Materia;
import java.util.HashSet;




public class Colegio {
    
    
    public static HashSet<Alumno> devuelveListaAlumnos(){
        
        HashSet <Alumno> lista = new HashSet();
    
        lista.add(new Alumno (1001, "Lòpez", "Martin"));
        lista.add(new Alumno (1002, "Martínez", "Brenda"));
        return lista;
    }
    public static void main(String[] args) {
    
   
    
    
    Materia web= new Materia(001, "Web 2", 2);
    
    
      Materia matematica= new Materia(002, "Matematica", 1);
      Materia laboratorio= new Materia(003, "Laboratorio 1", 1);
      
     
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