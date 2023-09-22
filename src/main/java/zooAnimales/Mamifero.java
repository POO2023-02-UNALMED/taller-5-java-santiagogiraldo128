package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
    private static ArrayList<Mamifero> listado = new ArrayList<>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero () {Mamifero.listado.add(this);}

    public Mamifero (String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        Mamifero.listado.add(this);
    }

    public static int cantidadMamiferos() {
        return Mamifero.listado.size();
    }
    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        Mamifero mamifero = new Mamifero(nombre, edad, "pradera", genero, true, 4);
        Mamifero.caballos++;
        return mamifero;
    }
    public static Mamifero crearLeon (String nombre, int edad, String genero) {
        Mamifero mamifero = new Mamifero(nombre, edad, "selva", genero, true, 4);
        Mamifero.leones++;
        return mamifero;
    }

    public static ArrayList<Mamifero> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Mamifero> listado) {
        Mamifero.listado = listado;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
