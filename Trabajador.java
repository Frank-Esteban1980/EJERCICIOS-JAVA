/*
Al trabajador se le pedirá datos  de su puesto salario, si es jefe tendrá incentivo, tendrá un cálculo de subida de sueldo
*/
package HERENCIA.PersonaHerenciaPolimorfismo;

/**
 *
 * @author FRANK
 */
public class Trabajador extends Persona{
    
    //Atributos heredados de Persona
    //Atributos propios de Trabajador
    private String puesto;
    private int salario;
    private int nuevoSalario;
    private int incentivoJefe;
    private int antiguedad;
    //Constructor que hereda con parámetros de PERSONA
    
    public Trabajador(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
    }

    //Get para capturar puesto
    public String diPuesto() {
        return puesto;
    }

    public int diSalario() {
        return salario;
    }

    public int diAntiguedad(){
        return antiguedad;
    }

    public int diIncentivoJefe() {
        
        return incentivoJefe;
        
    }
    //SET para guardar en la variable el contenido a imprimir
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setNuevoSalario(int nuevoSalario) {
        this.nuevoSalario = nuevoSalario;
    }

    public void setIncentivoJefe(int incentivoJefe) {
        this.incentivoJefe = incentivoJefe;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    
    
    
    
    public void subirSalario(double porcentaje){
        int aumento = (int) ((salario*porcentaje)/100);
         nuevoSalario = (salario+aumento);
    }
    public int diNuevoSalario() {
        return nuevoSalario;
    }

    @Override
    public String toString() {
        return "Trabajador puesto: " + puesto + "\tsalario: "+ "\nAntiguedad=" + antiguedad + salario + "\nNuevo Salario: " + nuevoSalario  ;
    }
    
    
   
}
