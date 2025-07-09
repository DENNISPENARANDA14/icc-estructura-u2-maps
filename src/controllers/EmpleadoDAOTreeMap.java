package controllers;

import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {
    private TreeMap<Integer, Empleado> empleados;

    public EmpleadoDAOTreeMap() {
        this.empleados = new TreeMap<>();
        System.out.println("EmpleadoDAOTreeMap Class Initialized");
    }

    @Override
    public void agregarEmpleado(Empleado empleado) {
        // Implementación para agregar un empleado
        // Aquí podrías usar un TreeMap para almacenar los empleados
        // Por ejemplo, podrías usar el ID del empleado como clave y el objeto Empleado
        // como valor.
        // empleados.put(empleado.getId(), empleado);
        // System.out.println("Empleado agregado: " + empleado);
        // Asegúrate de manejar el caso en que el empleado ya exista    
        if (empleados.containsKey(empleado.getId())) {
            System.out.println("Empleado con ID " + empleado.getId() + " ya existe.");
        } else {
            empleados.put(empleado.getId(), empleado);
            System.out.println("Empleado agregado: " + empleado);
        }
        empleados.put(empleado.getId(), empleado);
        // Aquí podrías agregar lógica para manejar duplicados o errores
        // Por ejemplo, podrías verificar si el ID del empleado ya existe en el TreeMap
        // y, si es así, lanzar una excepción o imprimir un mensaje de error.
    }

    @Override
    public void eliminarEmpleado(int id) {
        // Implementación para eliminar un empleado por ID
        // Aquí podrías usar el método remove del TreeMap
        // Por ejemplo, podrías eliminar el empleado con el ID especificado.
        // empleados.remove(id);
        // System.out.println("Empleado con ID " + id + " eliminado.");
        // Asegúrate de manejar el caso en que el empleado no exista
        if (!empleados.containsKey(id)) {
            System.out.println("Empleado con ID " + id + " no encontrado.");
        } else {
            empleados.remove(id);
            System.out.println("Empleado con ID " + id + " eliminado.");
        }
        
    }

    @Override
    public void listarEmpleados() {
        // Implementación para listar empleados
        for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Empleado: " + entry.getValue());
        }
    }
    public TreeMap<Integer, Empleado> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(TreeMap<Integer, Empleado> empleados) {
        this.empleados = empleados;
    }
}
