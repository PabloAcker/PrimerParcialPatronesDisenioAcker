package ejercicio3;

public class Libros {
    private String tipo;
    private String autor;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void showLibros(){
        System.out.println("Tipo de libro: " + getTipo());
        System.out.println("Autor del libro: " + getAutor());
    }
}
