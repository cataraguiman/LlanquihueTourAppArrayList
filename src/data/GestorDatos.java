package data;

import model.LugarTuristico;
import java.io.File;
import java.util.ArrayList; // Se importa la clase ArrayList desde el paquete java.util.
import java.util.Scanner;

// Gestiona la lectura de archivos de texto y la carga de objetos Lugar Turistico en memoria.
public class GestorDatos {


    // Lee un archivo de texto con informacion de lugares turisticos
    // crea objetos LugarTuristico y los almacena en un ArrayList.
    public ArrayList<LugarTuristico> cargarLugarTuristico(String rutaArchivoLugares) {

        ArrayList<LugarTuristico> listaLugaresTuristicos = new ArrayList<>();


        try {

            // Abre el archivo para su lectura.
            File archivo = new File(rutaArchivoLugares);
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();

                // Separación lógica de los datos usando ";" como delimitador.
                String [] datos = linea.split( ";");
                if(datos.length == 4) {

                    try {
                        String nombre = datos[0];
                        String ubicacion = datos[1];
                        // Conversión de texto a entero.
                        int precio = Integer.parseInt(datos[2].trim());
                        boolean incluyeGuia = Boolean.parseBoolean(datos[3].trim());


                        // Se agrega a la listaLugaresTuristicos la linea que se leyó.
                        listaLugaresTuristicos.add(new LugarTuristico(nombre, ubicacion, precio, incluyeGuia));
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error: El precio no es un numero válido");
                        System.out.println(linea);
                    }
                }
            }
            // Cierra la lectura del archivo.
            lector.close();

        } catch (Exception e) {
            System.out.println("Error al cargar lugar turistico");
            e.printStackTrace();

        }
        // Lo que entrega el metodo.
        return listaLugaresTuristicos;
    }



}

