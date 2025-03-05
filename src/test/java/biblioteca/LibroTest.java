package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class LibroTest {
    Libro libro;
    @BeforeEach
    void setUp() {
        libro = new Libro("El Ultimo Catón", "Matilde Assensi", 2001);
    }

    @Test
    void TestConstructor() {
        assertEquals("El Ultimo Catón", libro.getTitulo());
        assertEquals("Matilde Assensi", libro.getAutor());
        assertEquals(2001, libro.getAnioPublicacion());
    }
    @Test
    void TestNullTitulo() {
        assertThrows(NullPointerException.class, () -> {
            libro = new Libro(null, "Matilde Assensi", 2001);
            }
        );
    }
    @Test
    void TestNullAutor() {
        assertThrows(NullPointerException.class, () -> {
            libro = new Libro("El Ultimo Catón", null,2001 );
        });
    }

    @Test
    void TestAllNull() {
        assertThrows(NullPointerException.class, () -> {
            libro = new Libro(null, null,0 );
        });
    }

}