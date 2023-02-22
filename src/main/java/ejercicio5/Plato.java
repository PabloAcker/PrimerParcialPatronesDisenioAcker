package ejercicio5;

public class Plato {
    private String tipoCarne;
    private String saborRefresco;
    private String guarniciones;

    public String getTipoCarne() {
        return tipoCarne;
    }

    public Plato setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
        return this;
    }

    public String getSaborRefresco() {
        return saborRefresco;
    }

    public Plato setSaborRefresco(String saborRefresco) {
        this.saborRefresco = saborRefresco;
        return this;
    }

    public String getGuarniciones() {
        return guarniciones;
    }

    public Plato setGuarniciones(String guarniciones) {
        this.guarniciones = guarniciones;
        return this;
    }
    public void showPlato(){
        System.out.println("La comida tiene las siguientes caracteristicas>>>>>");
        System.out.println("Tipo de carne: " + getTipoCarne());
        System.out.println("Sabor del refresco: " + getSaborRefresco());
        System.out.println("Guarniciones: " + getGuarniciones());
    }
}
