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

    public void actualizarPrecio(List<Libro> libros, Libro libro, Double precioActualizado){
        for(Libro l: libros){
            if(l.equals(libro)){
        libro.setPrecio(precioActualizado);
                System.out.println("precio actualizado");
            }
    }

      public void calcularPrecioTotal(List<Libro> libros, Double contador){
}

}

