package ejercicio3;

public class KitColegialCreator extends CreatorKit{
    @Override
    public KitColegial create() {
        KitColegial kit = new KitColegial();

        Mochila mochila = new Mochila();
        mochila.setTamano("M");
        mochila.setNumeroBolsillos(3);
        kit.setMochila(mochila);

        Libros libros = new Libros();
        libros.setTipo("Ciencia");
        libros.setAutor("Einstein");
        kit.setLibros(libros);

        Computadora computadora = new Computadora();
        computadora.setMarca("Lenovo");
        computadora.setOs("Linux");
        kit.setComputadora(computadora);
        return kit;
    }
}
