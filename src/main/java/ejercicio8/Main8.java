package ejercicio8;

public class Main8 {
    public static void main(String[] args) {
        CuentaDeBanco.getInstance().aumentoDeSueldo(1000);

        System.out.println("---------------------------------------");

        Cajero cajero = new Cajero();
        cajero.getPrestamoCreditos().prestamo(20);
        cajero.getPrestamoNegocios().prestamo(200);

        System.out.println("---------------------------------------");
        Cajero cajero2 = new Cajero();
        cajero2.getPrestamoFinanciamiento().prestamo(40);
        cajero2.getPrestamoVivienda().prestamo(212);

        System.out.println("---------------------------------------");
        Cajero cajero3 = new Cajero();
        cajero3.getPrestamoNegocios().prestamo(4444);
        cajero3.getPrestamoCreditos().prestamo(14141);

        System.out.println("---------------------------------------");
        Cajero cajero4 = new Cajero();
        cajero4.getPrestamoVivienda().prestamo(1);

    }
}
