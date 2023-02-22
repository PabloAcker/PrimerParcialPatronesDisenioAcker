package ejercicio8;

public class PrestamoFinanciamiento {
    public void prestamo(int monto){
        CuentaDeBanco.getInstance().prestar(monto);
    }
}
