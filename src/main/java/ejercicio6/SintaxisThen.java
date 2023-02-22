package ejercicio6;

public class SintaxisThen extends Gherkins{
    @Override
    public void interpreter(Contexto contexto) {
        if (contexto.input.startsWith("Para")){
            contexto.output= contexto.output + "Then ";
            contexto.input = contexto.input.substring(4);
        }
    }
}
