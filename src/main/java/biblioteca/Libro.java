package biblioteca;

// TODO: Documentar esta clase
/**
 * Clase que representa un libro con atributos básicos:
 * título, autor y año de publicación.
 *
 * @author Velis Krassenov
 * @version 05/03/2025

 */
public class Libro {

    // TODO: Documentar estos atributos
    /**
     * Atributo que representa el título del libro
     * Almacena el nombre del libro
     *
     */
    private String titulo;

    /**
     * Atributo que representa el autor del libro
     * Almacena el nombre del autor que lo ha escrito
     */
    private String autor;

    /**
     * Atributo que representa la fecha del libro
     * Almacena la fecha en que se ha publicadp el libro
     */
    private int anioPublicacion;


    // TODO: Documentar este método
    /**
     * Constructor de la clase Libro que crea una nueva instancia del libro.
     *
     * @param titulo Título del libro
     * @param autor  El autor del libro
     * @param anioPublicacion Fecha de publicación del libro
     *
     * @throws NullPointerException si el título o el autor son null.
     *
     * @version 05/03/2025
     *
     */
    // TODO: Testear este método
    public Libro(String titulo, String autor, int anioPublicacion) {
        if (titulo == null || autor == null || anioPublicacion == 0) {
            throw new NullPointerException("Constructor no puede ser nulo");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método

    /**
     * Obtiene el autor que ha escrito el libro
     * @return el nombre del autor
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método

    /**
     * Este metodo obtiene la fecha en que se ha escrito un libro
     * @return devuelve una fecha
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}