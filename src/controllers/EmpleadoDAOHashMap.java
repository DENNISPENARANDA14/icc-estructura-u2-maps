package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO {
    // Utilizamos un HashMap para almacenar los empleados
    private Map<Integer, Empleado> empleados;
    public EmpleadoDAOHashMap() {
        // Inicializamos el HashMap
        empleados = new HashMap<>();
        // Constructor vacío, se puede inicializar el HashMap aquí si es necesario
    }

    // Implementación de los métodos de la interfaz EmpleadoDAO
    // Aquí se utilizará un HashMap para almacenar los empleados

    @Override
    public void agregarEmpleado(Empleado empleado) {
        //Lógica para agregar un empleado al HashMap
        //Esto podría implicar usar el método put del HashMap
        //empleados.put(empleado.getId(), empleado);
       
        //Asegúrate de manejar el caso en que el empleado ya exista
        if (empleados.containsKey(empleado.getId())) {
             System.out.println("Empleado con ID " + empleado.getId() + " ya existe.");
         } else {
             empleados.put(empleado.getId(), empleado);
             System.out.println("Empleado agregado: " + empleado);
        }
        empleados.put(empleado.getId(), empleado);  
    }

    @Override
    public void eliminarEmpleado(int id) {
        // Lógica para eliminar un empleado del HashMap por su ID
        // Esto podría implicar usar el método remove del HashMap
        // empleados.remove(id);
        // Asegúrate de manejar el caso en que el empleado no exista
        // if (!empleados.containsKey(id)) {
        //     System.out.println("Empleado con ID " + id + " no encontrado.");
        // }
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
        // Lógica para listar todos los empleados en el HashMap
        // Esto podría implicar iterar sobre las entradas del HashMap y mostrar los empleados
        for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Empleado: " + entry.getValue());
        }
    }
}
