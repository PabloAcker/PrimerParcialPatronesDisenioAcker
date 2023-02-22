package ejercicio1;

public class Estudiante {
    private String nombre;
    private String ci;

    public Estudiante(String nombre, String ci) {
        this.nombre = nombre;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
    public void registrarse(){
        VentanillaDePago.getInstance().registro(ci);
        System.out.println("Gracias por el pago señor/a "+getNombre());
    }
    public void pagoColegiatura(int dinero){
        VentanillaDePago.getInstance().pagar(dinero);
    }
}
