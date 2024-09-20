import model.Autor;
import model.Libro;
import service.LibroService;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Autor autor1 = new Autor("Gabriel", "García Márquez", "06/03/1927");
        Autor autor2 = new Autor("Julio", "Cortázar", "26/08/1914");
        Autor autor3 = new Autor("Isabel", "Allende", "02/08/1942");
        Autor autor4 = new Autor("Mario", "Vargas Llosa", "28/03/1936");
        Autor autor5 = new Autor("Jorge", "Luis Borges", "24/08/1899");
        Autor autor6 = new Autor("Gabriela", "Mistral", "07/04/1889");

        Libro libro1 = new Libro("Cien años de soledad", autor1, 15.99, "30/06/1967");
        Libro libro2 = new Libro("Rayuela", autor2, 12.50, "28/03/1963");
        Libro libro3 = new Libro("La casa de los espíritus", autor3, 18.00, "08/10/1982");
        Libro libro4 = new Libro("La ciudad y los perros", autor4, 14.50, "01/01/1963");
        Libro libro5 = new Libro("Ficciones", autor5, 10.75, "1944");
        Libro libro6 = new Libro("Desolación", autor6, 16.00, "1922");

        List<Libro> biblioteca = new ArrayList<>();

        biblioteca.add(libro1);
        biblioteca.add(libro2);
        biblioteca.add(libro3);
        biblioteca.add(libro4);

        for (Libro l: biblioteca){
            System.out.println(l);
    }

    LibroService biblioteService = new LibroService();

        biblioteService.buscarLibro("La ciudad y los perros", biblioteca);

        biblioteService.actualizarPrecio(biblioteca, libro2, 20.00);

        System.out.println(libro2);

        Double contador = biblioteService.calcularPrecios(biblioteca);

        System.out.println(contador);
    }
}