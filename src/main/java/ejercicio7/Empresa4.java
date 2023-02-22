package ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Empresa4 implements IAggregate{
    private List<Empleado> empleados = new ArrayList<>();
    private String gerente;

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Empresa4(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public Iterator createIterator() {
        Iterator iterator = new Empresa4Iterator(empleados);
        return iterator;
    }
}
