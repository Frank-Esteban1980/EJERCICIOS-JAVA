/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HERENCIA.PersonaHerenciaPolimorfismo;

/**
 *
 * @author FRANK
 */
public class Estudiante extends Persona {
    
    //Atributos estudiantes, los principales ya los hereda (nombre, apellidos, edad, peso, altura y cálculo de IMC)
    //Atributos propios
    
    private String estudios_actuales;
    private String estudios_futuros;
    private String trabajo_futuro;
    
    
    public Estudiante(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
    }
    
    public String diEstudioActual(){
        return estudios_actuales;
    }
    public String diEstudiosFuturos(){
        return estudios_futuros;
    }
    public String diTrabajoFuturo(){
        return trabajo_futuro;
    }

    
    public void setEstudios_actuales(String estudios_actuales) {
        this.estudios_actuales = estudios_actuales;
    }

    public void setEstudios_futuros(String estudios_futuros) {
        this.estudios_futuros = estudios_futuros;
    }

    public void setTrabajo_futuro(String trabajo_futuro) {
        this.trabajo_futuro = trabajo_futuro;
    }
    
    
    @Override
    public String toString() {
        return "Estudiante de: " + estudios_actuales + "\tQuiere Estudiar: " + estudios_futuros + "\tSu objetivo es trabajar como: " + trabajo_futuro;
    }
    
    
    
}
