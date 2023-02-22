package ejercicio8;

public class PrestamoNegocios {
    public void prestamo(int monto){
        CuentaDeBanco.getInstance().prestar(monto);
    }
}
