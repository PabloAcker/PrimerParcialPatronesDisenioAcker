package ejercicio8;

public class PrestamoVivienda {
    public void prestamo(int monto){
        CuentaDeBanco.getInstance().prestar(monto);
    }
}
