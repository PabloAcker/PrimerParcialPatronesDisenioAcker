package ejercicio4;

public class Lenguaje extends Curso{
    @Override
    public void inscribirse(Estudiante estudiante) {
        System.out.println("------------------------------------------------");
        System.out.println(estudiante.getNombre() + " con CI: " + estudiante.getCi() + " ah sido inscrito correctamente a la clase de Lenguaje.");
    }
}
