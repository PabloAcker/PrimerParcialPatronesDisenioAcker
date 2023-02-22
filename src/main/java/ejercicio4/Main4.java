package ejercicio4;

public class Main4 {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        e1.setNombre("Pablo");
        e1.setCi("6724142");

        String curso = "matematicas";
        FactoryCurso.make(curso).inscribirse(e1);

        Estudiante e2 = new Estudiante();
        e2.setNombre("Ema");
        e2.setCi("7401284");

        String curso2 ="ingles";
        FactoryCurso.make(curso2).inscribirse(e2);

        Estudiante e3 = new Estudiante();
        e3.setNombre("Rene");
        e3.setCi("9864194");

        String curso3 ="historia";
        FactoryCurso.make(curso3).inscribirse(e3);

        Estudiante e4 = new Estudiante();
        e4.setNombre("Tadeo");
        e4.setCi("0917240");

        String curso4 ="lenguaje";
        FactoryCurso.make(curso4).inscribirse(e4);

        Estudiante e5 = new Estudiante();
        e5.setNombre("Fabian");
        e5.setCi("9174014");

        String curso5 ="matematicas";
        FactoryCurso.make(curso5).inscribirse(e5);
    }
}
