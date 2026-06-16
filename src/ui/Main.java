package ui;

import data.GestorDatos;
import model.LugarTuristico;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        // Carga la lista desde el archivo ubicado en resources.
        ArrayList<LugarTuristico> lugarTurismo = gestor.cargarLugarTuristico("src/resources/lugaresTuristicos.txt");

        System.out.println("|| Lista de Lugares Turisticos ||");

        for (LugarTuristico lugar: lugarTurismo) {
            System.out.println(lugar.toString());

        }

        System.out.println("\n || Filtrado: Tours de Destinos con Guia Turistico || ");
        for (LugarTuristico lugar: lugarTurismo) {

            if (lugar.isIncluyeGuia()){
                System.out.println(lugar.getNombre());


            }


        }



    }
}
