package Biblioteca.models;



public class Libro {
    private String nombre;
    private String[] id;

    public Libro(String nombre, String[]id){
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getId() {
        return id;
    }

    public void setId(String[] id) {
        this.id = id;
    }
}
