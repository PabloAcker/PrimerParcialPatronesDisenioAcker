package ejercicio2;

public class Main2 {
    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        contrato.setSueldo(300);
        contrato.setCargarHoraria(200);
        contrato.setCursoEducacionSuperior(true);
        contrato.setAccesoPlataforma(true);
        contrato.setMarcadoBiometrico(true);
        contrato.setMarcadoHoraEntrada("08:00");
        contrato.setMarcadoHoraSalida("20:00");
        contrato.setNombre("Pedro");
        contrato.setApellido("Alvarez");

        Contrato c1 = contrato.clone();
        Contrato c2 = contrato.clone();
        Contrato c3 = contrato.clone();
        Contrato c4 = contrato.clone();
        Contrato c5 = contrato.clone();
        Contrato c6 = contrato.clone();
        Contrato c7 = contrato.clone();
        Contrato c8 = contrato.clone();
        Contrato c9 = contrato.clone();
        Contrato c10 = contrato.clone();
        Contrato c11 = contrato.clone();
        Contrato c12 = contrato.clone();
        Contrato c13 = contrato.clone();
        Contrato c14 = contrato.clone();
        Contrato c15 = contrato.clone();

        c1.setNombre("Jose");
        c1.setApellido("Saavedra");

        c2.setNombre("Tadeo");
        c2.setApellido("Pacheco");

        c3.setNombre("Mauricio");
        c3.setApellido("Laguna");

        c4.setNombre("Mauricio");
        c4.setApellido("Riveros");

        c5.setNombre("Nicolas");
        c5.setApellido("Urdininea");

        c6.setNombre("Ambar");
        c6.setApellido("Rojas");

        c7.setNombre("Ari");
        c7.setApellido("Garret");

        c8.setNombre("Victor");
        c8.setApellido("Lopez");

        c9.setNombre("Franz");
        c9.setApellido("Santander");

        c10.setNombre("Mishel");
        c10.setApellido("Espinoza");

        c11.setNombre("Mauro");
        c11.setApellido("Delboy");

        c12.setNombre("Ariel");
        c12.setApellido("Alvarez");

        c13.setNombre("Camila");
        c13.setApellido("Navia");

        c14.setNombre("Sebastian");
        c14.setApellido("Arduz");

        c15.setNombre("Cecilia");
        c15.setApellido("Espinoza");

        c1.showContrato();
        c2.showContrato();
        c3.showContrato();
        c4.showContrato();
        c5.showContrato();
        c6.showContrato();
        c7.showContrato();
        c8.showContrato();
        c9.showContrato();
        c10.showContrato();
        c11.showContrato();
        c12.showContrato();
        c13.showContrato();
        c14.showContrato();
        c15.showContrato();
    }
}
