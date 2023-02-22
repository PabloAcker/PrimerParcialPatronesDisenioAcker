package ejercicio9;

public class SeisToNueve extends SintaxisRomanos{
    @Override
    public void interpreter(Context context) {
        if (context.getInput().startsWith("6")) {
            context.setOutput(context.getOutput() + "VI ");
        } else if (context.getInput().startsWith("7")) {
            context.setOutput(context.getOutput() + "VII ");
        } else if (context.getInput().startsWith("8")) {
            context.setOutput(context.getOutput() + "VIII ");
        } else {
            context.setOutput(context.getOutput() + "IX ");
        }
        context.setInput(context.getInput().substring(1));
    }
}
