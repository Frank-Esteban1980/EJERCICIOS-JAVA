/*
 Juego EUROMILLON de un listado de 50 números elegimos 5 que coincidirán con los 5 aleatorios
que son los ganadores.*/
package udemymayo23;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author FRANK
 */
public class ArrayEuromillon {

    public static void main(String[] args) {

        //Creamos una array con los números 5 afortunados en el sortedo
        int euromillonganador[] = new int[5];
        for (int i = 0; i < euromillonganador.length; i++) {
            euromillonganador[i] = (int) (Math.random() * 50);
        }

        //Prueba de que los números ganadores están siendo generados
        for (int i = 0; i < euromillonganador.length; i++) {
            System.out.println("Numero ganador: "+euromillonganador[i]);
        }
        //El usuario compra su boleto y elige 5 números, su boleto es un array de 5 números
       //Creamos el array y luego el usuario los va rellenando conforme se recorre el array
        System.out.println("** Mi boleto: **");
        int miBoleto[] = new int[5];

        for (int j = 0; j < miBoleto.length; j++) {
            
            miBoleto[j] = Integer.parseInt(JOptionPane.showInputDialog("Dime tus 5 números de la suerte:"));
        }
        //El usuario tiene sus 5 números y muestra en pantalla
        for (int suerte : miBoleto) {
            System.out.println("Mis Números: " + suerte);
        }

        //Recorremos los números ganadores y los del boleto, los comparamos y si son iguales ganamos.
        for (int i = 0; i < euromillonganador.length; i++) {

            for (int j = 0; j < miBoleto.length; j++) {

            }
        }
        //comparamos los dos arrays con el metodo Arrays.equals(array1, array2)
        if (Arrays.equals(euromillonganador, miBoleto)) {
            System.out.println("Eres el ganador!!");
        } else {
            System.out.println("Vuelve a intentarlo. ");
        } 
        
    }
}             
