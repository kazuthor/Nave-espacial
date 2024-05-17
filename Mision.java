import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Mision here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Mision {
    private String nombre;
    private Fecha fechaInicio;
    private Fecha fechaFinalizacion;
    private List<Astronauta> astronautas;
    private List<Planeta> planetasExplorados;
    private NaveEspacial naveEspacial;

    public Mision(String nombre, Fecha fechaInicio, Fecha fechaFinalizacion, NaveEspacial naveEspacial) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.naveEspacial = naveEspacial;
        this.astronautas = new ArrayList<>();
        this.planetasExplorados = new ArrayList<>();
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public Fecha getFechaInicio() {
        return this.fechaInicio;
    }

    public Fecha getFechaFinalizacion() {
        return this.fechaFinalizacion;
    }

    public NaveEspacial getNaveEspacial() {
        return this.naveEspacial;
    }

    public List<Astronauta> getAstronautas() {
        return this.astronautas;
    }

    public void addAstronauta(Astronauta astronauta) {
        this.astronautas.add(astronauta);
    }

    public void addPlaneta(Planeta planeta) {
        this.planetasExplorados.add(planeta);
    }

    public boolean validarMision(Astronauta astronauta) {
        if (astronautas.size() < naveEspacial.getCapacidad()) {
            switch (astronauta.getTipoEspecialidad()) {
                case PILOTO:
                    return (cantidadMisionesAstronauta(astronauta) < 1 && planetasExplorados.size() < 1);
                case CIENTIFICO:
                    return (cantidadMisionesAstronauta(astronauta) < 2 && planetasExplorados.size() < 2);
                case INGENIERO:
                    return (cantidadMisionesAstronauta(astronauta) < 3 && planetasExplorados.size() < 3);
                default:
                    return false;
            }
        } else {
            return false; 
        }
    }

    public int cantidadMisionesAstronauta(Astronauta astronauta) {
        int cantidad = 0;
        for (Astronauta a : astronautas) {
            if (a.equals(astronauta)) {
                cantidad++;
            }
        }
        return cantidad;
    }
}