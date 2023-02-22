package ejercicio6;

public class SintaxisWhen extends Gherkins{
    @Override
    public void interpreter(Contexto contexto) {
        if (contexto.input.startsWith("Quiero")){
            contexto.output= contexto.output + "When ";
            contexto.input = contexto.input.substring(6);
        }
    }
}
