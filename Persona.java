/*
Crear una clase con los datos personales de personas.
conseguir su peso y altura y calcular su IMC
*/
package HERENCIA.PersonaHerenciaPolimorfismo;

/**
 *
 * @author FRANK
 */
public class Persona {
    
    //Atributos
    private String nombre;
    private String apellidos;
    private int edad;
    
    private String ciudad;
    private int estatura;
    private int peso;
    
    //Constructor con parámetros
    public Persona (String nombre,String apellidos, int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
                
    }
    
    
    //GET más datos
    public String dimeCiudad(String ciudad){
        return ciudad;
    }
    public int diEstatura(int estatura){
        return estatura;
    }
    public int diPeso(int peso){
        return peso;
    }

    
        
    
    
    
    //SET calcula IMC
    public double calculaIMC(int peso, int estatura){
        return ((peso/(Math.pow(estatura, 2)))*10000);
        
    }
    
    public String datosPersona(){
        return "Nombre: "+nombre+"\t Apellidos: "+apellidos+"\t Edad: "+edad+" años.";
    }

     
    
    
}
