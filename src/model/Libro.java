package model;

import java.util.Date;
import java.util.Objects;

public class Libro {
    private String titulo;
    private Autor autor;
    private Double precio;
    private String fechaPublicacion;

    public Libro(String titulo, Autor autor, Double precio, String fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.fechaPublicacion = fechaPublicacion;
    }

    public Libro(){}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String toString() {
        return "| Titulo: '" + titulo + '\'' +
                ", Autor: " + autor +
                ", Precio: " + precio +
                ", FechaPublicacion: '" + fechaPublicacion + '\'' +
                '|';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro libro)) return false;
        return Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor);
    }
}
