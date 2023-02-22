package ejercicio7;

import java.util.Vector;

public class Empresa1 implements IAggregate{
    private Vector<Empleado> empleados = new Vector<>();
    private String gerente;

    public Vector<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Vector<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Empresa1(String gerente) {
        this.gerente = gerente;
    }
    @Override
    public Iterator createIterator() {
        Iterator iterator = new Empresa1Iterator(empleados);
        return iterator;
    }
}
