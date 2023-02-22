package ejercicio8;


public class CuentaDeBanco {
    private int saldo;
    private static CuentaDeBanco instance = null;

    public CuentaDeBanco() {
        saldo = 0;
    }

    private synchronized static void multiThreadManage(){
        if (instance == null){
            instance = new CuentaDeBanco();
        }
    }
    public static CuentaDeBanco getInstance(){
        if (instance == null){
            multiThreadManage();
        }
        return instance;
    }
    public synchronized void prestar(int monto){
        if (monto <= saldo) {
            saldo = saldo - monto;
            System.out.println("Prestamo realizado exitosamente.");
        } else {
            System.out.println("ERROR Prestamo fallido.");
        }
    }
    public void aumentoDeSueldo(int dinero) {
        saldo = saldo+dinero;
        System.out.println("Se le sumo a su cuenta de banco el monto, quedando con un total de: "+saldo);
    }
}
