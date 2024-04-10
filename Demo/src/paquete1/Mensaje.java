/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paquete1;

import paquete4.Palabra;
import paquete3.Informacion;

/**
 *
 * @author reroes
 */
public class Mensaje {

    public static void main(String[] args) {

    }

    public static String obtenerMensaje() {
        return String.format("%s, una ciudad llena de arte y naturaleza con %d"
                , Palabra.obtenerPalabra()
                , Informacion.obtenerHabitantes());
    }
}
