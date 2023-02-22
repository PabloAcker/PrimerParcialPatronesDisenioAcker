package ejercicio10;

public class Main10 {
    public static void main(String[] args) {
        Vehiculo vh1 = new Vehiculo("5016CIA","Camioneta","Hyundai");
        Vehiculo vh2 = new Vehiculo("9134FLA","Vagoneta","KIA");
        Vehiculo vh3 = new Vehiculo("9017PHS","Micro","Mercedez");
        Vehiculo vh4 = new Vehiculo("110DSA","Minibus","Ferrari");
        Vehiculo vh5 = new Vehiculo("1023PJF","Tractor","Twingo");
        Vehiculo vh6 = new Vehiculo("4179LDH","Moto","BMW");

        System.out.println("--------------------------------");
        vh1.registro();
        vh1.pagar();

        vh2.registro();
        vh2.pagar();

        vh3.registro();
        vh3.pagar();

        vh4.registro();
        vh4.pagar();

        vh5.registro();
        vh5.pagar();

        vh6.registro();
        vh6.pagar();
    }
}
