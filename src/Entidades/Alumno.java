
package Entidades;

import java.util.HashSet;


public class Alumno {
    
    
   
    
    private int legajo;
    private String apellido;
    private String nombre;
    
    private HashSet <Materia> materias= new HashSet();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  apellido + " " +  nombre  + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }
    
    
    
    public void agregarMateria(Materia mat){
        if(materias.add(mat)){
            System.out.println("Materia "+ mat.getNombre()+ " agregada correctamente");
        } else {
            System.out.println("En la materia "+ mat.getNombre()+ " ya esta inscripto/a");
        }
        
    }
    
    public void cantidadMaterias(){
        System.out.println("La cantidad de materias en las que esta inscripto/a es: " + materias.size());
            
    }
    
}
    
    
