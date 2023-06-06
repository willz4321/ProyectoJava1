package interfaces;

import java.util.List;
import palabrasclaves.modelos.PalabraClave;

public interface IGestorPalabrasClaves {
    public String nuevaPalabraClave (String nombre);
    public List<PalabraClave> verPalabrasClaves();
    public PalabraClave verPalabraClave (String nombre);
    public String borrarPalabraClave(PalabraClave palabraClave);
    public List<PalabraClave> buscarPalabrasClaves(String nombre);
    public boolean existeEstaPalabraClave(PalabraClave palabraClave);
}
