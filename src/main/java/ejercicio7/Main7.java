package ejercicio7;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
public class Main7 {
    public static void main(String[] args) {
        Empresa4 empresa4 = new Empresa4("Luis Camacho");
        List<Empleado> empleadosProfix = List.of(new Empleado("Laguna","74021742"), new Empleado("Aramayo", "10740111"), new Empleado("Ayala", "742017401"));
        empresa4.setEmpleados(empleadosProfix);

        Empresa3 empresa3 = new Empresa3("Angel Catacora");
        Empleado[] empleadosMedusa = { new Empleado("Ruiz", "23758065"), new Empleado("Alonzo", "463901463") };
        empresa3.setEmpleado(empleadosMedusa);

        Empresa1 empresa1 = new Empresa1("Ernesto Rojas");
        Vector<Empleado> empleadosAres = new Vector<>();
        empleadosAres.add(new Empleado("Mollinedo", "3147890"));
        empleadosAres.add(new Empleado("Alfaro", "6713064"));
        empresa1.setEmpleados(empleadosAres);

        Empresa2 empresa2 = new Empresa2("Luis Anibal");
        Stack<Empleado> empleadosDradler = new Stack<>();
        empleadosDradler.push(new Empleado("Cerrucho", "164901"));
        empleadosDradler.push(new Empleado("Ferrufino", "17849111"));
        empresa2.setEmpleados(empleadosDradler);

        HashMap<String, Empleado> listaFinal = new HashMap<>();
        Iterator iterator = empresa4.createIterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            listaFinal.put(empleado.getCi(), empleado);
        }

        iterator = empresa3.createIterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            listaFinal.put(empleado.getCi(), empleado);
        }

        iterator = empresa1.createIterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            listaFinal.put(empleado.getCi(), empleado);
        }

        iterator = empresa2.createIterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            listaFinal.put(empleado.getCi(), empleado);
        }

        listaFinal.get("742017401").showInfo();
        listaFinal.get("17849111").showInfo();
        listaFinal.get("23758065").showInfo();
        listaFinal.get("6713064").showInfo();
    }
}
