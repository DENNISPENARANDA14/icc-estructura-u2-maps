import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoControllerHash;
import controllers.EmpleadoControllerTree;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Dennis Alejandro Penaranda Tello"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();
        EmpleadoControllerHash empleadoContollerHash = new EmpleadoControllerHash();
        EmpleadoControllerTree empleadoContollerTree = new EmpleadoControllerTree();
        
        System.out.println("----Ejemplo de uso de HashMap y TreeMap con empleados----");
        Empleado emp1 = new Empleado(4, "Pedro", "Dev");
        Empleado emp2 = new Empleado(2, "Pedro", "Dev");
        Empleado emp3 = new Empleado(5, "Juan", "Dev");
        Empleado emp4 = new Empleado(3, "Maria", "Dev");
        Empleado emp5 = new Empleado(1, "Juan", "Dev");

        // Agregar empleados al controlador de HashMap y TreeMap
        System.out.println("Agregando empleados al controlador de HashMap y TreeMap:");

        empleadoContollerHash.agregarEmpleado(emp1);
        empleadoContollerHash.agregarEmpleado(emp2);
        empleadoContollerHash.agregarEmpleado(emp3);
        empleadoContollerHash.agregarEmpleado(emp4);
        empleadoContollerHash.agregarEmpleado(emp5);
        System.out.println("treeMap");
        empleadoContollerTree.agregarEmpleado(emp1);
        empleadoContollerTree.agregarEmpleado(emp2);
        empleadoContollerTree.agregarEmpleado(emp3);
        empleadoContollerTree.agregarEmpleado(emp4);    
        empleadoContollerTree.agregarEmpleado(emp5);

        empleadoContollerHash.listarEmpleados();
        empleadoContollerHash.eliminarEmpleado(2);
        empleadoContollerHash.listarEmpleados();

        empleadoContollerTree.listarEmpleados();
        empleadoContollerTree.eliminarEmpleado(3);
        empleadoContollerTree.listarEmpleados();
        
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        System.out.println("Ejemplo de uso de HashMap, LinkedHashMap y TreeMap");
        System.out.println("----HashMap----"); 
        mapa.runHashMap();
        System.out.println("----LinkedHashMap----"); 
        mapa.runLinkedHashMap();
        System.out.println("----TreeMap----"); 
        mapa.runTreeMap();
        System.out.println("----HashMapObj----"); 
        mapa.runHashMapObj();
        System.out.println("----TreeMapObj----"); 
        mapa.runTreeMapObj();
        //mapa.runTreeMapObj2();
        //mapa.runTreeMapObj3();

    }

    private static void runEmpleadoExample() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
