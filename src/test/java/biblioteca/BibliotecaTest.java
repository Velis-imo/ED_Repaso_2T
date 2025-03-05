package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



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
        assertTrue(biblioteca.agregarLibro(libro));
    }

    @Test
    void eliminarLibro() {

        biblioteca.agregarLibro(libro);
        assertTrue(biblioteca.eliminarLibro(libro));
    }

    @Test
    void getLibros() {


    }

    @Test
    void encuentraLibroPorTitulo() {
        biblioteca.agregarLibro(libro);
        biblioteca.encuentraLibroPorTitulo("The Art of Computer Programming");
        assertEquals(
                "The Art of Computer Programming", libro.getTitulo(),
                "El titulo del libro debe coincidir");

    }




    @Test
    void encuentaLibroPorAutor() {
        biblioteca.agregarLibro(libro);
        biblioteca.encuentraLibrosPorAutor("Donald Knuth");

        assertEquals(
                "Donald Knuth", libro.getAutor(), "El autor del libro debe coincidir");
    }

    @Test
    void encuentraLibrosPorAutor() {

        biblioteca.agregarLibro(libro);

        //no esta vaciá
        assertNotNull(biblioteca.getLibros());

        //solo tiene un libro:
        assertEquals(1, biblioteca.getLibros().size());

        //contiene el libro recien añadido
        assertTrue(biblioteca.getLibros().contains(libro));
    }





}
