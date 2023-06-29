/*
 OBJETOS TRABAJADORES, que indiquen sus nombres, apellidos, edad, estatura y peso.
indicar sus datos generales como personas
Indicar la puesto salario, antiguedad
Subirle el salario un 5% y mostrar nuevo salario

Con esto calcular su IMC y verlo en pantalla


Incluirlos dentro de un array de 3 trabajadores*/
package HERENCIA.PersonaHerenciaPolimorfismo;

import java.util.Scanner;

/**
 *
 * @author FRANK
 */
public class TrabajadorMain {

    
    public static void main(String[] args) {
        
        Trabajador juan = new Trabajador("Frank", "Escudero",43);
        //Datos heredados
        System.out.println(juan.datosPersona());
        
        //Datos de clase Trabajador
        juan.setPuesto("Administrativo");
        juan.setSalario(25000);
        juan.setAntiguedad(5);
        juan.subirSalario(5);
        int nuevoSalario=juan.diNuevoSalario();
        juan.setNuevoSalario(nuevoSalario);
        
        System.out.println(juan.toString());
        
        //Datos de clase persona IMC
        System.out.println("----Datos IMC ----");
        Scanner sc = new Scanner (System.in);
        System.out.println("Di tu estatura en centímetros: ");
        int estatura = sc.nextInt();
        juan.diEstatura(estatura);
        System.out.println("Di tu peso en kg");
        int peso = sc.nextInt();
        juan.diPeso(peso);
        
        System.out.println("Tu IMC es: "+juan.calculaIMC(peso, estatura));
        
        
       
        
        
    }
    
}
