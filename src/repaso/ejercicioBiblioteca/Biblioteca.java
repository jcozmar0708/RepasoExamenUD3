package repaso.ejercicioBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        libros = new ArrayList<Libro>();
    }

    public void listarLibros(){
        for (Libro l : libros) {
            System.out.println(l);
        }
    }

    public void aniadirLibro(Libro libro){
        if (!libros.contains(libro)) {
            libros.add(libro);
        }
    }

    public Libro buscarLibro(String isbn){
        Libro l = new Libro(isbn);
        if (libros.contains(l)) {
            return libros.get(libros.indexOf(l));
        }
        return null;
    }

    public boolean reservarLibro(String isbn){
        Libro l = buscarLibro(isbn);
        if (l != null && !l.isReservado()) {
            l.setReservado(true);
            return true;
        }
        return false;
    }

    public boolean devolverLibro(String isbn){
        Libro l = buscarLibro(isbn);
        if (l != null && l.isReservado()) {
            l.setReservado(false);
            return true;
        }
        return false;
    }

    public void eliminarLibro(Libro libro){
        libros.remove(libro);
    }
}
