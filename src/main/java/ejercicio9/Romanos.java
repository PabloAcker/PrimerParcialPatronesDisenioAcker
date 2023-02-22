package ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Romanos {
    private List<SintaxisRomanos> grammar = new ArrayList<>();
    private Context context;

    public Romanos(String input) {
        context = new Context(input.replace(" ", ""));
        for (String snumber : input.split(" ")) {
            int number = Integer.parseInt(snumber);
            if (number < 5) {
                grammar.add(new UnoToCuatro());
            } else if (number == 5) {
                    grammar.add(new Cinco());
            } else if (number < 10) {
                grammar.add(new SeisToNueve());
            } else {
                grammar.add(new Diez());
            }
        }
    }

    public String getOutput() {
        for (SintaxisRomanos expression : grammar) {
            expression.interpreter(context);
        }
        return context.getOutput();
    }

}
