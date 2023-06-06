package interfaces;

import java.util.List;
import lugares.modelos.Lugar;

public interface IGestorLugares {
    public String nuevoLugar(String nombre);
    public Lugar verLugar(String nombre);
    public String borrarLugar(Lugar lugar);
    public List<Lugar> buscarLugares(String nombre);
    public List<Lugar> verLugares();
    public boolean existeEsteLugar(Lugar lugar);
}
