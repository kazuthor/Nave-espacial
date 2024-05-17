
/**
 * Write a description of class Astronauta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Astronauta {
    private String nombre;
    private TipoEspecialidad tipoEspecialidad;

    
    public Astronauta(String nombre, TipoEspecialidad tipoEspecialidad) {
        this.nombre = nombre;
        this.tipoEspecialidad = tipoEspecialidad;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoEspecialidad getTipoEspecialidad() {
        return tipoEspecialidad;
    }

    public void setTipoEspecialidad(TipoEspecialidad tipoEspecialidad) {
        this.tipoEspecialidad = tipoEspecialidad;
    }

    
}