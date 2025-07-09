package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }
    public void runHashMap(){
        Map<String,String> mapa =new HashMap();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");
        mapa.put("003", "PC");

        System.out.println(mapa);
        System.out.println(mapa.keySet());

        //muestra los valores del mapa
        for (String key : mapa.keySet()) {
            System.out.println(mapa.get(key));
        }

        System.out.println(mapa.get("001"));
        System.out.println(mapa.get("005"));

    }

    public void runLinkedHashMap(){
        Map<Integer, String> mapa = new LinkedHashMap();
        mapa.put(1111, "dennis");
        mapa.put(2222, "juan");
        mapa.put(3333, "maria");
        mapa.put(4444, "pedro");
        mapa.put(5555, "diana");

        System.out.println(mapa);
        System.out.println(mapa.keySet());
        System.out.println(mapa.values());
    }

    public void runTreeMap(){
        Map<Integer, String> items = new TreeMap();
        items.put(3, "carro");
        items.put(6, "bicicleta");
        items.put(1, "moto");

        System.out.println(items.values());
    }

    public void runHashMapObj(){
        Map<Empleado, Integer> empleados =new HashMap<>();

        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "Dev"), 2500);
        empleados.put(new Empleado(1, "Diego", "Dev"), 3000);

        System.out.println(empleados);
    }

    public void runTreeMapObj(){
        Map<Empleado, Integer> empleados = new TreeMap<>();

        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Diego", "Dev"), 1200);
        empleados.put(new Empleado(1, "Juan", "senior"), 3000);

        System.out.println(empleados);
    }


    public void runTreeMapObj2(){
        Map<Empleado, Integer> empleados = new TreeMap<>((e1, e2) -> e1.getName().compareTo(e2.getName()));

        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "Dev"), 2500);
        empleados.put(new Empleado(1, "Diego", "Dev"), 3000);

        System.out.println(empleados);
    }
    public void runTreeMapObj3(){
        Map<Empleado, Integer> empleados = new TreeMap<>((e1, e2) -> {
            int nameComparison = e1.getName().compareTo(e2.getName());
            if (nameComparison != 0) {
                return nameComparison;
            }
            return e1.getId() - e2.getId();
        });

        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "Dev"), 2500);
        empleados.put(new Empleado(1, "Diego", "Dev"), 3000);

        System.out.println(empleados);
    }
}