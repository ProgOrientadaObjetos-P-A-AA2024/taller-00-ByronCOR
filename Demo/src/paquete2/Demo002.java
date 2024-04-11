/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
import java.util.Scanner;
import paquete1.Mensaje;

public class Demo002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = entrada.nextInt();

        if (num > 1 && num < 5) {
            System.out.println(Mensaje.obtenerMensaje());

        } else {            
            System.out.println(Mensaje.obtenerMensaje().toUpperCase());
        }

        /* esta imprimiendo en pantalla lo que retorna el metodo obtenerMensaje
        dentro de la clase Mensaje que se encuetra en el paquete 1*/
        // usar printf;

    }

}
