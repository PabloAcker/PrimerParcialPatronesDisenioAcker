package ejercicio7;

public class Empresa3 implements IAggregate{
    private Empleado empleados[];
    private String gerente;

    public Empleado[] getEmpleado() {
        return empleados;
    }

    public void setEmpleado(Empleado[] empleado) {
        this.empleados = empleado;
    }

    public Empresa3(String gerente) {
        this.gerente = gerente;
    }
    @Override
    public Iterator createIterator() {
        Iterator iterator = new Empresa3Iterator(empleados);
        return iterator;
    }
}
