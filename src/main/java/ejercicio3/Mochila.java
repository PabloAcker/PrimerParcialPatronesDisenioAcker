package ejercicio3;

public class Mochila {
    private int numeroBolsillos;
    private String tamano;

    public int getNumeroBolsillos() {
        return numeroBolsillos;
    }

    public void setNumeroBolsillos(int numeroBolsillos) {
        this.numeroBolsillos = numeroBolsillos;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    public void showMochila(){
        System.out.println("Número de bolsillos que tiene la mochila: " + getNumeroBolsillos());
        System.out.println("Tamaño de la mochila: " + getTamano());
    }
}
