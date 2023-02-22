package ejercicio3;

public class Main3 {
    public static void main(String[] args) {
        KitEscolar kitE1 = new KitEscolarCreator().create();
        KitColegial kitC1 = new KitColegialCreator().create();

        kitE1.showKit();
        kitC1.showKit();
    }
}
