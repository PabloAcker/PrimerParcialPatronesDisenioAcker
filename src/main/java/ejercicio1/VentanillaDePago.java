package ejercicio1;

public class VentanillaDePago {
    private int monto;
    private static VentanillaDePago instance = null;

    public VentanillaDePago() {
        monto = 0;
        System.out.println("Monto inicial: "+monto);
    }

    private synchronized static void multiThreadManage(){
        if (instance == null){
            instance = new VentanillaDePago();
        }
    }
    public static VentanillaDePago getInstance(){
        if (instance == null){
            multiThreadManage();
        }
        return instance;
    }
    public synchronized void registro(String codigo){
        System.out.println("Registro exitoso con el código: "+codigo);
    }
    public synchronized void pagar(int dinero){
        monto = monto+dinero;
        System.out.println("Pago realizado con el monto de: "+dinero);
    }
    public void montoActual() {
        System.out.println("El monto actual es de: "+monto);
    }
}
