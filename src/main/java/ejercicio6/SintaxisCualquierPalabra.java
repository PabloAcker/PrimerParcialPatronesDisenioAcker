package ejercicio6;

public class SintaxisCualquierPalabra extends Gherkins{
    private String palabra;
    public SintaxisCualquierPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public void interpreter(Contexto contexto) {
        contexto.output = contexto.output + palabra + " ";
        contexto.input = contexto.input.substring(palabra.length());
    }
}
