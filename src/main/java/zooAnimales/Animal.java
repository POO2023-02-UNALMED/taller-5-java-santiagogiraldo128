package zooAnimales;
import gestion.Zona;

import java.util.ArrayList;

public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal() {
        this(null,0,null,null);
    }
    public Animal (String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = null;
        totalAnimales++;
    }
    public String  movimiento() {
        return "desplazarse";
    }
    public static String totalPorTipo () {
        int cantmamifero=Mamifero.getListado().size();
        int cantave=Ave.getListado().size();;
        int cantreptil=Reptil.getListado().size();;
        int cantpez=Pez.getListado().size();;
        int cantanfibio=Anfibio.getListado().size();;

        return "Mamiferos: "+cantmamifero+"\n"+
                "Aves: "+cantave+"\n"+
                "Reptiles: "+cantreptil+"\n" +
                "Peces: " +cantpez+"\n"+
                "Anfibios: "+cantanfibio;
    }
    @Override
    public String toString() {
        if (getZona()!=null) {
            return "Mi nombre es "+ getNombre()+", tengo una edad de " +getEdad()+ ", habito en "+getHabitat()+" y mi genero es "+getGenero()+", la zona en la que me ubico es "+getZona().getNombre()+", en el "+getZona().getZoo().getNombre();
        }
        else {
            return "Mi nombre es "+ getNombre()+", tengo una edad de " +getEdad()+ ", habito en "+getHabitat()+" y mi genero es "+getGenero();
        }
    }

    public int getTotalAnimales() {
        return totalAnimales;
    }

    public void setTotalAnimales(int totalAnimales) {
        this.totalAnimales = totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

}
