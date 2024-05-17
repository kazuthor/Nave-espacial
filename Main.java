import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Main {
    public static void main(String[] args) {
        
        Fecha fechaInicio = new Fecha(1, 1, 2024);
        Fecha fechaFinalizacion = new Fecha(31, 12, 2024);
        NaveEspacial nave = new NaveEspacial("Nave1", "Nave tripulada", 3);
        Mision mision = new Mision("Mision1", fechaInicio, fechaFinalizacion, nave);
        Astronauta astronauta1 = new Astronauta("Juan", TipoEspecialidad.PILOTO);
        Astronauta astronauta2 = new Astronauta("Maria", TipoEspecialidad.CIENTIFICO);

        
        if (mision.validarMision(astronauta1)) {
            mision.addAstronauta(astronauta1);
            System.out.println("Astronauta " + astronauta1.getNombre() + " agregado a la misión.");
        }
        if (mision.validarMision(astronauta2)) {
            mision.addAstronauta(astronauta2);
            System.out.println("Astronauta " + astronauta2.getNombre() + " agregado a la misión.");
        }

        
        System.out.println("Información de la misión:");
        System.out.println("Nombre: " + mision.getNombre());
        System.out.println("Fecha de inicio: " + mision.getFechaInicio());
        System.out.println("Fecha de finalización: " + mision.getFechaFinalizacion());
        System.out.println("Nave espacial asignada: " + mision.getNaveEspacial().getNombre());
        System.out.println("Astronautas asignados a la misión:");
        for (Astronauta astronauta : mision.getAstronautas()) {
            System.out.println("- " + astronauta.getNombre() + " (" + astronauta.getTipoEspecialidad() + ")");
        }
    }
}
