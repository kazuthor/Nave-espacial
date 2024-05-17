
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class NaveEspacial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class NaveEspacial {
    private String nombre;
    private String tipo;
    private int capacidad;
    private int tripulantes;

    
    public NaveEspacial(String nombre, String tipo, int capacidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.tripulantes = 0;
    }
    
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getTripulantes() {
        return tripulantes;
    }

    public void setTripulantes(int tripulantes) {
        this.tripulantes = tripulantes;
    }
    
    
    public boolean agregarTripulante() {
        if (tripulantes < capacidad) {
            tripulantes++;
            return true;
        } else {
            System.out.println("La capacidad máxima de la nave ha sido alcanzada.");
            return false;
        }
    }
}