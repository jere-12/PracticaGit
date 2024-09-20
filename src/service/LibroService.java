package service;

import model.Libro;

import java.util.List;

public class LibroService {

public Boolean buscarLibro(Libro libroBuscado, List<Libro>libros){
    Boolean encontrado = null;
    for(Libro l: libros){
        if (libros.contains(libroBuscado)) {
            encontrado = Boolean.TRUE;
        }
        else {
            encontrado = Boolean.FALSE;
        }
    }
    return encontrado;
}

    public void buscarLibro(String titulo, List<Libro> libros) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Libro encontrado: " + libro);
                return;
            }
        }
        System.out.println("Libro no encontrado: " + titulo);
    }

    public void actualizarPrecio(List<Libro> libros, Libro libro, Double precioActualizado) {
        for (Libro l : libros) {
            if (l.equals(libro)) {
                libro.setPrecio(precioActualizado);
                System.out.println("precio actualizado");
            }
        }
    }

    public Double calcularPrecios(List<Libro> libros){
        Double contador = 0.00;
        for(Libro l: libros){
            contador = contador + l.getPrecio();
        }
        return contador;
    }

    // crear un método que muestre el libro del precio menor y el libro del precio mayor
    public void mayorMenor(List<Libro> libros) {
        Libro libroMayor = libros.get(0);
        Libro libroMenor = libros.get(0);
        for (Libro l : libros) {
            if (l.getPrecio() > libroMayor.getPrecio()) {
                libroMayor = l;
            }
            if (l.getPrecio() < libroMenor.getPrecio()) {
                libroMenor = l;
            }
        }
        System.out.println("Libro con mayor precio: " + libroMayor);
        System.out.println("Libro con menor precio: " + libroMenor);
    }
}

