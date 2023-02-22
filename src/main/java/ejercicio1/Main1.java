package ejercicio1;

public class Main1 {
    public static void main(String[] args) {

        System.out.println("----------------------------------");

        Cajero cajero = new Cajero("236657");
        cajero.registrarse();

        System.out.println("Estudiante 1>>>>>>>>>>>>>");
        Estudiante est1 = new Estudiante("Ema", "67293849");
        est1.registrarse();
        est1.pagoColegiatura(18000);
        VentanillaDePago.getInstance().montoActual();

        System.out.println("Estudiante 2>>>>>>>>>>>>>");
        Estudiante est2 = new Estudiante("Julio", "7985701");
        est2.registrarse();
        est2.pagoColegiatura(17000);
        VentanillaDePago.getInstance().montoActual();

        System.out.println("Estudiante 3>>>>>>>>>>>>>");
        Estudiante est3 = new Estudiante("Ana", "7403150");
        est3.registrarse();
        est3.pagoColegiatura(10);
        VentanillaDePago.getInstance().montoActual();

        System.out.println("Estudiante 4>>>>>>>>>>>>>");
        Estudiante est4 = new Estudiante("Eddy", "097250371");
        est4.registrarse();
        est4.pagoColegiatura(100);
        VentanillaDePago.getInstance().montoActual();

        System.out.println("Estudiante 5>>>>>>>>>>>>>");
        Estudiante est5 = new Estudiante("Lagu", "017430");
        est5.registrarse();
        est5.pagoColegiatura(1000);
        VentanillaDePago.getInstance().montoActual();
    }
}
