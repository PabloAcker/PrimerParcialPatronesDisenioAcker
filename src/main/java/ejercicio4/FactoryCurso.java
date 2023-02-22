package ejercicio4;

public class FactoryCurso {
    public static Curso make(String type){
        Curso curso;
        switch (type.toLowerCase()){
            case "matematicas":
                curso = new Matematicas();
                break;
            case "historia":
                curso = new Historia();
                break;
            case "lenguaje":
                curso = new Lenguaje();
                break;
            case "ingles":
                curso = new Ingles();
                break;
            default:
                curso = new Matematicas();
                break;
        }
        return curso;
    }
}
