package palabrasclaves.modelos;

import interfaces.IGestorPalabrasClaves;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import publicaciones.modelos.GestorPublicaciones;

public class GestorPalabrasClaves implements IGestorPalabrasClaves{
    private List<PalabraClave> palabrasClaves = new ArrayList<>();
    public static final String EXITO = "La nueva 'Palabra Clave' fue creado con éxito";
    public static final String REPETIDO = "ERROR. La nueva 'Palabra Clave' ya fue creado";
    public static final String INVALIDO = "ERROR. El nombre ingresado es inválido";
    public static final String INSTANCIADO = "ERROR. Un objeto de esta clase ya ha sido creado";
    public static final String BORRADO_EXITO = "Se ha borrado con éxito el tipo seleccionado";
    public static final String BORRADO_INEXISTENTE = "No se encuentra el tipo seleccionado";
    public static final String EXISTE_PUB = "ERROR. Existe una publicación asociada a ese tipo";
      
    private static GestorPalabrasClaves instancia;
    
    public static GestorPalabrasClaves crear(){
        if (instancia == null){
            instancia = new GestorPalabrasClaves();
        }
//        else {
//            System.out.println(INSTANCIADO);            
//        }
        return instancia;
    }

    @Override
    public String borrarPalabraClave(PalabraClave palabraClave) {
        GestorPublicaciones gp1 = GestorPublicaciones.crear();
        if (palabrasClaves.contains(palabraClave)){
            if(gp1.hayPublicacionesConEstaPalabraClave(palabraClave)){
                return EXISTE_PUB;
            }
            palabrasClaves.remove(palabraClave);
            return BORRADO_EXITO;
        }
        return BORRADO_INEXISTENTE;
    }

    @Override
    public List<PalabraClave> buscarPalabrasClaves(String nombre) {
        List<PalabraClave> busquedaPalabrasClaves = new ArrayList<>();
        for (PalabraClave pc : palabrasClaves){
            if (pc.verNombre().contains(nombre)){
                busquedaPalabrasClaves.add(pc);
            }
        }
        Collections.sort(busquedaPalabrasClaves);
        return busquedaPalabrasClaves;
    }

    @Override
    public boolean existeEstaPalabraClave(PalabraClave palabraClave) {
        if(palabrasClaves.contains(palabraClave)){
            return true;
        }
        return false;
    }

    @Override
    public String nuevaPalabraClave(String nombre) {
        if ((nombre != null) && (!nombre.isBlank())){
            PalabraClave pc = new PalabraClave(nombre);
            if (!this.palabrasClaves.contains(pc)){
               this.palabrasClaves.add(pc);
               return EXITO;
            }
            else {
                return REPETIDO;
            }
        }
        else {
            return INVALIDO;
        }
    }

    @Override
    public List<PalabraClave> verPalabrasClaves() {
        Collections.sort(palabrasClaves);
        return palabrasClaves;
    }

    @Override
    public PalabraClave verPalabraClave(String nombre) {
        for (PalabraClave pc : palabrasClaves){
            if (pc.verNombre() == nombre){
                return pc;
            }
        }
        return null;
    }
    
    
}
