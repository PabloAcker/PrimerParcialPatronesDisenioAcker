package ejercicio6;

public class Main6 {
    public static void main(String[] args) {
        String sentence = "Como administrador Quiero generar un reporte diario Para evaluar las ganancias";

        SintaxisGherkins cambio = new SintaxisGherkins(sentence);
        String oracionGherkins = cambio.outputMessage();
        System.out.println("Sintaxis Gherkins: " + oracionGherkins);
    }
}
