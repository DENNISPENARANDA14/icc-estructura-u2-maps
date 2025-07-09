package controllers;

import java.util.Map;

import models.Empleado;

public class EmpleadoControllerHash {
    private Map<Integer, Empleado> empleados;
    
    public EmpleadoControllerHash() {
        System.out.println("EmpleadoControllerHash Class");
        // Inicializar el HashMap de empleados
        this.empleados = new java.util.HashMap<>();
    }

    // Aquí puedes agregar métodos específicos para manejar empleados con HashMap
    // Por ejemplo, agregar, eliminar, listar empleados, etc.

    // Ejemplo de método para agregar un empleado
    public void agregarEmpleado(Empleado empleado) {
        // Lógica para agregar un empleado al HashMap
        EmpleadoDAO empleadoDAO = new EmpleadoDAOHashMap();
        empleadoDAO.agregarEmpleado(empleado);
    }
    // Ejemplo de método para eliminar un empleado
    public void eliminarEmpleado(int id) {
        // Lógica para eliminar un empleado del HashMap por su ID
        System.out.println("Empleado con ID " + id + " eliminado.");
        EmpleadoDAO empleadoDAO = new EmpleadoDAOHashMap();                 
        empleadoDAO.eliminarEmpleado(id);
    }
    // Ejemplo de método para listar empleados
    public void listarEmpleados() {
        // Lógica para listar empleados
        System.out.println("Listando empleados hash:");
        EmpleadoDAO empleadoDAO = new EmpleadoDAOHashMap();
        empleadoDAO.listarEmpleados();

        // Aquí podrías iterar sobre el HashMap y mostrar los empleados
        for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
             System.out.println("ID: " + entry.getKey() + ", Empleado: " + entry.getValue());
        }

    }

    // Otros métodos como eliminarEmpleado, listarEmpleados, etc. pueden ser implementados aquí
    
}
