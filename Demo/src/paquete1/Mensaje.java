/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paquete1;

import paquete4.Palabra;
<<<<<<< HEAD
import paquete3.Informacion;
=======
>>>>>>> ea933f2751545eb0d231e5e40edba0af6a2d0d93

/**
 *
 * @author reroes
 */
public class Mensaje {

    public static void main(String[] args) {

    }

    public static String obtenerMensaje() {
<<<<<<< HEAD
        return String.format("%s, una ciudad llena de arte y naturaleza con %d"
                , Palabra.obtenerPalabra()
                , Informacion.obtenerHabitantes());
=======
        return String.format("%s, una ciudad llena de arte y naturaleza",
                Palabra.obtenerPalabra());
>>>>>>> ea933f2751545eb0d231e5e40edba0af6a2d0d93
    }
}
