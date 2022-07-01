package Biblioteca;



import Biblioteca.models.Biblioteca;
import Biblioteca.models.Libro;

import java.util.Scanner;

public class Main {
    static Biblioteca libros[];
    static Libro libro[];
    public static void main(String[] args) {
        libros = new Biblioteca[5];
        libro = new Libro[5];
        int opcion;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("   Menu  ");
            System.out.println("1. Registrar Libro");
            System.out.println("2. Ordenar");
            System.out.println("3. Vizualizar Libros");
            System.out.println("4. Buscar Libro");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    registrarLibro();
                    break;
                    case 2:
                        ordenarDatos();
                        break;
                case 3:
                    visualizarLibro();
                    break;
                case 4:
                    buscarLibro();
                    break;
            }
        } while (opcion != 4);
    }

    public static void registrarLibro() {
        Scanner entrada = new Scanner(System.in);
        int id;
        String nombre;
        String categoria;
        for (int i = 0; i < 5; i++) {
            System.out.println("Añadir Libro" + (i + 1));
            System.out.println("Ingrese el nombre: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la categoria: ");
            categoria = entrada.nextLine();
            id = (int) (Math.random() * 8998) + 100 + 1;
            Biblioteca biblioteca = new Biblioteca(nombre, categoria, id);
            libros[i] = biblioteca;
        }
    }

    public static void buscarLibro() {
        String nombre;
        int id;
        boolean bandera = true;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Libro: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el id: ");
        id = entrada.nextInt();
        for (int i=0; i<5; i++){
            if (nombre.equals(libros[i].getNombre()) && id == libros[i].getId()){
                System.out.println("Libro encontrado");
                System.out.println("Informacion");
                System.out.println("Nombre: " + libros[i].getNombre());
                System.out.println("Id: " + libros[i].getId());
                System.out.println("Categoria: " + libros[i].getCategoria());
                bandera = false;
            }
        }
        if (bandera){
            System.out.println("Libro no encontrado");
        }
    }

    public static void visualizarLibro() {

    }

    public static void ordenarDatos() {

    }


}

