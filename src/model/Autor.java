package model;

import java.util.Date;
import java.util.Objects;

public class Autor {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;

    public Autor (String nombre, String apellido, String fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Autor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Autor autor)) return false;
        return Objects.equals(nombre, autor.nombre) && Objects.equals(apellido, autor.apellido) && Objects.equals(fechaNacimiento, autor.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, fechaNacimiento);
    }

    @Override
    public String toString() {
        return  nombre + " " +apellido;
    }
}
