package interfaces;

import java.util.List;
import tipos.modelos.Tipo;

public interface IGestorTipos {
    public String nuevoTipo (String nombre);
    public Tipo verTipo (String nombre);
    public String borrarTipo(Tipo tipo);
    public List<Tipo> buscarTipos(String nombre);
    public List<Tipo> verTipos();
    public boolean existeEsteTipo(Tipo tipo);
}
