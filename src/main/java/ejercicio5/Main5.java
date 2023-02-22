package ejercicio5;

public class Main5 {
    public static void main(String[] args) {

        Restaurante restaurante = new Restaurante();
        PlatoBife bife = new PlatoBife();
        PlatoLomito lomito = new PlatoLomito();
        PlatoTira tira = new PlatoTira();

        restaurante.setTipoPlato(bife);
        restaurante.buildPlato();
        Plato plato1 = restaurante.getPlato();
        System.out.println("---------------------------------------");
        plato1.showPlato();

        restaurante.setTipoPlato(lomito);
        restaurante.buildPlato();
        Plato plato2 = restaurante.getPlato();
        System.out.println("---------------------------------------");
        plato2.showPlato();

        restaurante.setTipoPlato(tira);
        restaurante.buildPlato();
        Plato plato3 = restaurante.getPlato();
        System.out.println("---------------------------------------");
        plato3.showPlato();
    }
}
