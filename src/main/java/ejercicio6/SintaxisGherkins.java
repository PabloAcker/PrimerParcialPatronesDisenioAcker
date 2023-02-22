package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class SintaxisGherkins {

    private List<Gherkins> sintax = new ArrayList<>();
    private Contexto contexto;

    public SintaxisGherkins (String input){
        contexto = new Contexto(input.replace(" ", ""));
        for (String msg : input.split(" ")){
            switch (msg) {
                case "Como" -> sintax.add(new SintaxisGiven());
                case "Quiero" -> sintax.add(new SintaxisWhen());
                case "Para" -> sintax.add(new SintaxisThen());
                default -> sintax.add(new SintaxisCualquierPalabra(msg));
            }
        }
    }
    public String outputMessage(){
        for (Gherkins sintaxis : sintax){
            sintaxis.interpreter(contexto);
        }
        return contexto.output;
    }
}
