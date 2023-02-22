package ejercicio7;

public class Empresa3Iterator implements Iterator{
    private Empleado empleados[];
    private int position = 0;

    public Empresa3Iterator(Empleado[] empleados) {
        this.empleados = empleados;
    }

    @Override
    public boolean hasNext() {
        boolean itHasNext = this.empleados.length != 0 && position < this.empleados.length;
        return itHasNext;
    }

    @Override
    public Empleado next() {
        Empleado empleado = this.empleados[position++];
        return empleado;
    }
}
