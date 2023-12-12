package repaso.ejercicioBiblioteca;

public class Autor {
    private String nombre;

    public Autor() {
    }

    public Autor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.valueOf(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
