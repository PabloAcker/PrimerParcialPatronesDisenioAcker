package ejercicio10;

public class CentroControl {
    private int monto;
    private static CentroControl instance = null;

    public CentroControl() {
        monto = 0;
        System.out.println("El monto inicial es: " + monto);
    }

    private synchronized static void multiThreadManage(){
        if (instance == null){
            instance = new CentroControl();
        }
    }
    public static CentroControl getInstance(){
        if (instance == null){
            multiThreadManage();
        }
        return instance;
    }
    public synchronized void registro(String placa){
        System.out.println("------------------------------------");
        System.out.println("Auto con la placa: " + placa + " registrado exitosamente.");
    }
    public synchronized void pago(){
        System.out.println("******************************************");
        monto = monto+2;
        System.out.println("Pago realizado correctamente, monto actual: " + monto);
    }
}
