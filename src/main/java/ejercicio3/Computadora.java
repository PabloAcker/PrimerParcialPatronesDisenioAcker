package ejercicio3;

public class Computadora {
    private String marca;
    private String os;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
    public void showComputadora(){
        System.out.println("Marca de la computadora: " + getMarca());
        System.out.println("OS de la Computadora: " + getOs());
    }
}
