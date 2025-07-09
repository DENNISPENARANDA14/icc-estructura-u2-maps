import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Dennis Alejandro Penaranda Tello"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();
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
