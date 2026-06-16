package model;

// Clase 1: base.
public class LugarTuristico {
    private String nombre;
    private String ubicacion;
    private int precio;
    private boolean incluyeGuia;

    // Constructor vacío.
    public LugarTuristico() {
    }

    // Constructor con parámetros.
    public LugarTuristico(String nombre, String ubicacion, int precio, boolean incluyeGuia) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.incluyeGuia = incluyeGuia;
    }

    // Métodos get y set para todos los atributos.


    public String getNombre() {
        return nombre;
    }

    public LugarTuristico setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public LugarTuristico setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
        return this;
    }

    public int getPrecio() {
        return precio;
    }

    public LugarTuristico setPrecio(int precio) {
        this.precio = precio;
        return this;
    }

    public boolean isIncluyeGuia() {
        return incluyeGuia;
    }

    public LugarTuristico setIncluyeGuia(boolean incluyeGuia) {
        this.incluyeGuia = incluyeGuia;
        return this;
    }

    // Metodo toString.
    @Override
    public String toString() {
        return "LugarTuristico{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", precio=" + precio +
                ", incluyeGuia=" + incluyeGuia +
                '}';
    }
}
