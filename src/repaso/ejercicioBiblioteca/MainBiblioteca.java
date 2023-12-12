package repaso.ejercicioBiblioteca;

import java.util.Scanner;

public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Municiapal");
        iniciarMenu(biblioteca);
    }

    private static void iniciarMenu(Biblioteca biblioteca){
        Scanner sc = new Scanner(System.in);
        int eleccion;
        do {
            System.out.print("Menu:\n" +
                    "1. Listar Libros\n" +
                    "2. Buscar Libro\n" +
                    "3. Reservar Libro\n" +
                    "4. Devolver Libro\n" +
                    "5. Añadir Libro\n" +
                    "6. Eliminar Libro\n" +
                    "7. Salir\n");
            eleccion = sc.nextInt();
            if (eleccion != 7) {
                switch (eleccion) {
                    case 1:
                        listarLibros(biblioteca);
                        break;
                    case 2:
                        buscarLibros(biblioteca);
                        break;
                    case 3:
                        reservarLibro(biblioteca);
                        break;
                    case 4:
                        devolverLibro(biblioteca);
                        break;
                    case 5:
                        aniadirLibro(biblioteca);
                        break;
                    case 6:
                        eliminarLibro(biblioteca);
                        break;
                }
            }
        } while (eleccion != 7);
    }

    private static void listarLibros(Biblioteca biblioteca){
        biblioteca.listarLibros();
    }

    private static void buscarLibros(Biblioteca biblioteca){
        Scanner sc = new Scanner(System.in);
        String isbn;

        System.out.println("Introduce el ISBN");
        isbn = sc.nextLine();
        if (biblioteca.buscarLibro(isbn) != null) {
            System.out.println(biblioteca.buscarLibro(isbn));
        } else {
            System.out.println("No se ha podido encontrar el libro");
        }
    }

    private static void reservarLibro(Biblioteca biblioteca){
        Scanner sc = new Scanner(System.in);
        String isbn;

        System.out.println("Introduce el ISBN");
        isbn = sc.nextLine();
        if (biblioteca.reservarLibro(isbn)) {
            System.out.println("Libro reservado con éxito");
        } else {
            System.out.println("No se ha podido reservar");
        }
    }

    private static void devolverLibro(Biblioteca biblioteca){
        Scanner sc = new Scanner(System.in);
        String isbn;

        System.out.println("Introduce el ISBN");
        isbn = sc.nextLine();
        if (biblioteca.devolverLibro(isbn)) {
            System.out.println("Libro devuelto con éxito");
        } else {
            System.out.println("No se ha podido devolver");
        }
    }

    private static void aniadirLibro(Biblioteca biblioteca){
        Scanner sc = new Scanner(System.in);
        String isbn;
        String titulo;
        Autor autor = new Autor();

        System.out.println("Introduce el ISBN");
        isbn = sc.nextLine();

        System.out.println("Introduce el título");
        titulo = sc.nextLine();

        System.out.println("Introduce el autor");
        autor.setNombre(sc.nextLine());

        Libro l = new Libro(isbn,titulo,autor);
        biblioteca.aniadirLibro(l);
    }

    private static void eliminarLibro(Biblioteca biblioteca){
        Scanner sc = new Scanner(System.in);
        String isbn;

        System.out.println("Introduce el ISBN");
        isbn = sc.nextLine();

        Libro l = new Libro(isbn);
        biblioteca.eliminarLibro(l);
    }
}
