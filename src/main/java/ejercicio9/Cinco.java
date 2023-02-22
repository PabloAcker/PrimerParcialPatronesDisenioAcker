package ejercicio9;

public class Cinco extends SintaxisRomanos{
    @Override
    public void interpreter(Context context) {
        if (context.getInput().startsWith("5")) {
            context.setOutput(context.getOutput() + "V ");
            context.setInput(context.getInput().substring(1));
        }
    }
}
