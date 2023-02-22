package ejercicio8;

public class PrestamoCreditos {
    public void prestamo(int monto){
        CuentaDeBanco.getInstance().prestar(monto);
    }
}
