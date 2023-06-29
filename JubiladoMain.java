/*
 CREAR JUBILADO con nombres, apellidos, edad. Mostrar en pantalla 
Mostrar en pantalla su actividad física y mental y su pensión, primero preguntar con getter

preguntar su peso y altura para calcualar su IMC y luego imprimirla*/
package HERENCIA.PersonaHerenciaPolimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author FRANK
 */
public class JubiladoMain {

    public static void main(String[] args) {
        
        Jubilado Antonio = new Jubilado("Antonio","Rodríguez", 70);
           
            System.out.println(Antonio.datosPersona());
            
            String actividad_fisica = Antonio.diActividadFisica("Natación");
            String actividad_mental = Antonio.diActividadMental("Tocar violín.");
            int pension = Antonio.diPension(20000);
            
            System.out.println(Antonio.datosJubilado(actividad_fisica, actividad_mental, pension));
        
   System.out.println("---Datos de IMC ---");
    int peso = Integer.parseInt(JOptionPane.showInputDialog("Di tu peso en kg "));
    int estatura = Integer.parseInt(JOptionPane.showInputDialog("Di tu estatura en cm "));
        System.out.println("El IMC es: "+Antonio.calculaIMC(peso, estatura));
        
    
    }
    
}
