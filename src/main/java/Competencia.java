/*  Ejercicio 4: Construir un programa para una competencia de atletismo, 
    el programa debe gestionar una serie de atletas caracterizados por su número de atleta, nombre y tiempo de carrera, 
    al final el programa debe mostrar los datos del atleta ganador de la carrera.
 */
import java.util.Scanner;

public class Competencia {

    //Atributos
    private int noAtleta;
    private String nombre;
    private int tiempoCarrera;
    private static int cant;

    //Constructor Vacio
    public Competencia() {
    }

    //Constructor
    public Competencia(int noAtleta, String nombre, int tiempoCarrera) {
        this.noAtleta = noAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    public int getNoAtleta() {
        return noAtleta;
    }

    public void setNoAtleta(int noAtleta) {
        this.noAtleta = noAtleta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    
    public String MasRapido() {
        return "\nCompetencia:\n" + "No. Atleta: " + noAtleta + ", Nombre: " + nombre + ", Tiempo en Carrera " + tiempoCarrera +"\n";
    }

   
    
    
    
    
    
    
    
    
}
