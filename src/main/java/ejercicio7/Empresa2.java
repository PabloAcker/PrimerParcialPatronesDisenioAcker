package ejercicio7;

import java.util.Stack;

public class Empresa2 implements IAggregate{
    private Stack<Empleado> empleados;
    private String gerente;

    public Stack<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Stack<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Empresa2(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public Iterator createIterator() {
        Iterator iterator = new Empresa2Iterator(empleados);
        return iterator;
    }
}
