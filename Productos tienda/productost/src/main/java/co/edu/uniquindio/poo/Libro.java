package co.edu.uniquindio.poo;

public class Libro extends ProductoBase {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro(String nombre, String codigo, double precio, Estado estado, String titulo, String autor, int numeroPaginas) {
        super(nombre, codigo, precio, estado);
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String mostrarDescripcionDetallada() {
        return "Libro: " + titulo + " por " + autor + " (" + numeroPaginas + " páginas)";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}