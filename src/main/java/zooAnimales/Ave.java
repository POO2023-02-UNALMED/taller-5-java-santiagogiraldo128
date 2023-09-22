package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
    private static ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;
    public Ave () {
        this(null,0,null,null,null);
    }

    public Ave (String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        Ave.listado.add(this);
    }

    public static int cantidadAves() {
        return Ave.listado.size();
    }
    public String movimiento() {
        return "volar";
    }
    public static Ave crearHalcon (String nombre, int edad, String genero) {
        Ave ave = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
        Ave.halcones++;
        return ave;
    }
    public static Ave crearAguila (String nombre, int edad, String genero) {
        Ave ave = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
        Ave.aguilas++;
        return ave;
    }

    public static ArrayList<Ave> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
}

