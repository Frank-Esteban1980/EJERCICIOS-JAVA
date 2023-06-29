/*
 OBJETOS ESTUDIANTES, que indiquen sus nombres, apellidos, edad, estatura y peso.
indicar sus datos generales como personas
Indicar la ciudad donde vive
Con esto calcular su IMC y verlo en pantalla
Como estudiantes indicar sus objetivos que estudian, que van a estudiar y en que queiren trabajar
Sacar por pantalla sus objetivos

Incluirlos dentro de un array de 3 estudiantes

 */
package HERENCIA.PersonaHerenciaPolimorfismo;

/**
 *
 * @author FRANK
 */
public class EstudianteMain {

   
    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante ("Frank", "Escudero", 13);
        System.out.println(estudiante1.datosPersona());
        System.out.println("Vive en "+estudiante1.dimeCiudad("Madrid"));
        
        
        
        estudiante1.setEstudios_actuales("Bachillerato");
        estudiante1.setEstudios_futuros("Ingeniería Informática");
        estudiante1.setTrabajo_futuro("Programador");
        
        System.out.println(estudiante1.toString());
        
        System.out.println("---Datos IMC---");
        
        int peso= estudiante1.diEstatura(70);
        int estatura=estudiante1.diPeso(170); 
        System.out.println("Tu IMC es: "+estudiante1.calculaIMC(peso, estatura));
        
    }
    
}
