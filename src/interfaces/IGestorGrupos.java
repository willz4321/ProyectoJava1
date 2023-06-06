package interfaces;

import grupos.modelos.Grupo;
import java.util.List;

public interface IGestorGrupos {
    public String nuevoGrupo (String nombre, String descripcion);
    public String modificarGrupo (Grupo grupo, String descripcion);
    public Grupo verGrupo (String nombre);
    public String borrarGrupo(Grupo grupo);
    public List<Grupo> buscarGrupos(String nombre);
    public List<Grupo> verGrupos();
    public boolean existeEsteGrupo(Grupo grupo);
}
