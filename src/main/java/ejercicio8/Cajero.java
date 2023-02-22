package ejercicio8;

public class Cajero {
    private PrestamoCreditos prestamoCreditos = new PrestamoCreditos();
    private PrestamoFinanciamiento prestamoFinanciamiento = new PrestamoFinanciamiento();
    private PrestamoNegocios prestamoNegocios = new PrestamoNegocios();
    private PrestamoVivienda prestamoVivienda = new PrestamoVivienda();

    public PrestamoCreditos getPrestamoCreditos() {
        return prestamoCreditos;
    }

    public void setPrestamoCreditos(PrestamoCreditos prestamoCreditos) {
        this.prestamoCreditos = prestamoCreditos;
    }

    public PrestamoFinanciamiento getPrestamoFinanciamiento() {
        return prestamoFinanciamiento;
    }

    public void setPrestamoFinanciamiento(PrestamoFinanciamiento prestamoFinanciamiento) {
        this.prestamoFinanciamiento = prestamoFinanciamiento;
    }

    public PrestamoNegocios getPrestamoNegocios() {
        return prestamoNegocios;
    }

    public void setPrestamoNegocios(PrestamoNegocios prestamoNegocios) {
        this.prestamoNegocios = prestamoNegocios;
    }

    public PrestamoVivienda getPrestamoVivienda() {
        return prestamoVivienda;
    }

    public void setPrestamoVivienda(PrestamoVivienda prestamoVivienda) {
        this.prestamoVivienda = prestamoVivienda;
    }
}
