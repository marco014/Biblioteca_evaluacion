package Biblioteca.models;

public class Biblioteca {
    private String nombre;
    private String categoria;
    private int id;
    public Biblioteca(String nombre, String categoria, int id) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
