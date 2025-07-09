package controllers;

import java.util.TreeMap;

import models.Empleado;

public class EmpleadoControllerTree {
    private java.util.TreeMap<Integer, Empleado> empleados;
    
    // Aquí puedes implementar métodos específicos para manejar empleados usando un TreeMap
    // Por ejemplo, agregar, eliminar y listar empleados ordenados por ID o nombre.

    public EmpleadoControllerTree() {
        // Inicializar el TreeMap de empleados
        System.out.println("EmpleadoControllerTree Class Initialized");
        this.empleados = new TreeMap();
    }
    // Método para agregar un empleado
    public void agregarEmpleado(Empleado empleado) {
        // Lógica para agregar un empleado al TreeMap
        // Esto podría implicar usar el método put del TreeMap
        // Asegúrate de manejar el caso en que el empleado ya exista
        if (empleados.containsKey(empleado.getId())) {
            System.out.println("Empleado con ID " + empleado.getId() + " ya existe.");
        } else {
            System.out.println("Empleado agregado: " + empleado);
        }
        // Aquí podrías agregar lógica para manejar duplicados o errores
        // Por ejemplo, podrías verificar si el ID del empleado ya existe en el TreeMap
        // y, si es así, lanzar una excepción o imprimir un mensaje de error.
        empleados.put(empleado.getId(), empleado);
    }
    // Método para eliminar un empleado por ID
    public void eliminarEmpleado(int id) {
        if (empleados.containsKey(id)) {
            empleados.remove(id);
            System.out.println("Empleado con ID " + id + " eliminado.");
        } else {
            System.out.println("Empleado con ID " + id + " no encontrado.");
        }
    }

    // Método para listar todos los empleados
    public void listarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados en la lista.");
        } else {
            System.out.println("Empleados:");
            for (Empleado empleado : empleados.values()) {
                System.out.println(empleado);
            }
        }
    }
    
}
