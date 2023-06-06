package interfaces;

import java.util.List;
import idiomas.modelos.Idioma;

public interface IGestorIdiomas {
    public String nuevoIdioma (String nombre);
    public Idioma verIdioma (String nombre);
    public String borrarIdioma(Idioma idioma);
    public List<Idioma> buscarIdiomas(String nombre);
    public List<Idioma> verIdiomas();
    public boolean existeEsteIdioma(Idioma idioma);
}
