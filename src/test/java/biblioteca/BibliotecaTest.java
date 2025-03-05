package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Libro libro;
    Biblioteca biblioteca = new Biblioteca();

    @BeforeEach
    void setUp() {
         libro = new Libro("The Art of Computer Programming", "Donald Knuth", 1968);
    }

    @Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(this.libro));
    }

    @Test
    void eliminarLibro() {

        biblioteca.agregarLibro(this.libro);
        assertTrue(biblioteca.eliminarLibro(this.libro));


    }

    @Test
    void getLibros() {
    }

    @Test
    void encuentraLibroPorTitulo() {

    }

    @Test
    void encuentaLibroPorAutor() {


    }

    @Test
    void encuentraLibrosPorAutor() {

        biblioteca.agregarLibro(this.libro);

        //no esta vaciá
        assertNotNull(biblioteca.getLibros());

        //solo tiene un libro:
        assertEquals(1, biblioteca.getLibros().size());

        //contiene el libro recien añadido
        assertTrue(biblioteca.getLibros().contains(this.libro));
    }





}
