package controllers;

import java.util.List;
import java.util.Map;

import models.Empleado;

public interface EmpleadoDAO {
    /**
     * Agrega un empleado al sistema.
     * @param empleado El empleado a agregar.
     */
    public void agregarEmpleado(Empleado empleado);

    /**
     * Elimina un empleado del sistema por su ID.
     * @param id El ID del empleado a eliminar.
     */
    public void eliminarEmpleado(int id);
    
    /**
     * Lista todos los empleados en el sistema.
     * @return Un mapa de empleados con su ID como clave.
     */
    public void listarEmpleados();

}
