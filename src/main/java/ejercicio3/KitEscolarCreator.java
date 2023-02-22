package ejercicio3;

public class KitEscolarCreator extends CreatorKit{
    @Override
    public KitEscolar create() {
        KitEscolar kit = new KitEscolar();

        Mochila mochila = new Mochila();
        mochila.setTamano("S");
        mochila.setNumeroBolsillos(1);
        kit.setMochila(mochila);

        Deportivo deportivo = new Deportivo();
        deportivo.setTalla("S");
        deportivo.setColor("Blanco");
        deportivo.setNumeroPrendas(2);
        kit.setDeportivo(deportivo);

        Cuaderno cuaderno = new Cuaderno();
        cuaderno.setTipo("Tapa dura");
        cuaderno.setNumeroHojas(150);
        kit.setCuaderno(cuaderno);
        return kit;
    }
}
