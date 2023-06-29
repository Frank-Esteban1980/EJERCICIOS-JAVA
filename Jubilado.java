/*
 CLASE JUBILADO tendra atributos de jubilado, pension, actividades que realiza y un resumen*/
package HERENCIA.PersonaHerenciaPolimorfismo;

/**
 *
 * @author FRANK
 */
public class Jubilado extends Persona{
    //Atributos nombres apellidos edad heredados de Persona
    //Atributos propios
    
    private int pension;
    private String actividad_fisica;
    private String actividad_mental;
    
    //Constructor heredado llamando a padre PERSONA con su superclase
    public Jubilado(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
    }

    
    
    public int diPension(int pension){
        return pension;
    }
    
    public String diActividadFisica(String actividad_fisica){
        return actividad_fisica;
    }
    public String diActividadMental(String actividad_mental){
        return actividad_mental;
    }

    public void setPension(int pension) {
        this.pension = pension;
    }

    public void setActividad_fisica(String actividad_fisica) {
        this.actividad_fisica = actividad_fisica;
    }

    public void setActividad_mental(String actividad_mental) {
        this.actividad_mental = actividad_mental;
    }

    

    
    public String datosJubilado(String actividad_fisica,String actividada_mental, int pension) {
        return "Pensión: " + pension+" €" + "\tActividad Física: " + actividad_fisica + "\tActividad_mental:" + actividad_mental;
    }
    
    
}
