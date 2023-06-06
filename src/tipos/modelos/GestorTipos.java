package tipos.modelos;

import interfaces.IGestorTipos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import publicaciones.modelos.GestorPublicaciones;

public class GestorTipos implements IGestorTipos{

    private List<Tipo> tipos = new ArrayList<> ();
    public static final String EXITO = "El nuevo 'Tipo' fue creado con éxito";
    public static final String REPETIDO = "ERROR. El nuevo 'Tipo' ya fue creado";
    public static final String INVALIDO = "ERROR. El nombre ingresado es inválido";
    public static final String INSTANCIADO = "ERROR. Un objeto de esta clase ya ha sido creado";
    public static final String BORRADO_EXITO = "Se ha borrado con éxito el tipo seleccionado";
    public static final String BORRADO_INEXISTENTE = "No se encuentra el tipo seleccionado";
    public static final String EXISTE_PUB = "ERROR. Existe una publicación asociada a ese tipo";
           
    private static GestorTipos instancia;
    
    public static GestorTipos crear () {
        if (instancia == null){
            instancia = new GestorTipos();
        }
//        else{
//            System.out.println(INSTANCIADO);
//        }
        return instancia;
    }
    
    @Override
    public String nuevoTipo(String nombre) {
        if ((nombre != null) && (!nombre.isBlank())){
            Tipo t = new Tipo(nombre);
            if (!this.tipos.contains(t)){
               this.tipos.add(t);
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
    public List<Tipo> verTipos() {
        Collections.sort(tipos);
        return tipos;
    }

    @Override
    public Tipo verTipo(String nombre) {
        for (Tipo t : tipos){
            if (t.verNombre() == nombre){
                return t;
            }
        }
        return null;
    }

    @Override
    public String borrarTipo(Tipo tipo) {
        GestorPublicaciones gp1 = GestorPublicaciones.crear();
        if (tipos.contains(tipo)){
            if(gp1.hayPublicacionesConEsteTipo(tipo)){
                return EXISTE_PUB;
            }
            tipos.remove(tipo);
            return BORRADO_EXITO;
        }
        return BORRADO_INEXISTENTE;
    }

    @Override
    public List<Tipo> buscarTipos(String nombre) {
        List<Tipo> busquedaTipos = new ArrayList<>();
        for (Tipo t : tipos){
            if (t.verNombre().contains(nombre)){
                busquedaTipos.add(t);
            }
        }
        Collections.sort(busquedaTipos);
        return busquedaTipos;
    }

    @Override
    public boolean existeEsteTipo(Tipo tipo) {
        if(tipos.contains(tipo)){
            return true;
        }
        return false;
    }
    
}
