/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico4;

import java.util.HashSet;

/**
 *
 * @author Capotes
 */
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
        return "Alumno{" + "legajo=" + legajo + ", apellido=" + apellido + ", nombre=" + nombre  + '}';
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
    
    
