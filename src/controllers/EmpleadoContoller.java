package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoContoller {
    private EmpleadoDAO empleadoDAO;
    
    public EmpleadoContoller() {
        empleadoDAO = new EmpleadoDAOHashMap();
    }
    public void agregarEmpleado(Empleado empleado) {
        empleadoDAO.agregarEmpleado(empleado);
    }
    public void eliminarEmpleado(int id) {
        empleadoDAO.eliminarEmpleado(id);
    }
    public void listarEmpleados() {
        empleadoDAO.listarEmpleados();
    }
}
