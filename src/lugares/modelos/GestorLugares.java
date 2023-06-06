package lugares.modelos;

import java.util.ArrayList;
import interfaces.IGestorLugares;
import java.util.Collections;
import java.util.List;
import publicaciones.modelos.GestorPublicaciones;

public class GestorLugares implements IGestorLugares{
     private List<Lugar> lugares = new ArrayList<> ();
    public static final String EXITO = "El nuevo 'Lugar' fue creado con éxito";
    public static final String REPETIDO = "ERROR. El nuevo 'Lugar' ya fue creado";
    public static final String INVALIDO = "ERROR. El nombre ingresado es inválido";
    public static final String INSTANCIADO = "ERROR. Un objeto de esta clase ya ha sido creado";
    public static final String BORRADO_EXITO = "Se ha borrado con éxito el tipo seleccionado";
    public static final String BORRADO_INEXISTENTE = "No se encuentra el tipo seleccionado";
    public static final String EXISTE_PUB = "ERROR. Existe una publicación asociada a ese tipo";
    
    private static GestorLugares instancia;
    
    public static GestorLugares crear () {
        if (instancia == null){
            instancia = new GestorLugares();
        }
//        else{
//            System.out.println(INSTANCIADO);
//        }
        return instancia;
    }
    

    public String nuevoLugar(String nombre) {
        if ((nombre != null) && (!nombre.isBlank())){
            Lugar l = new Lugar(nombre);
            if (!this.lugares.contains(l)){
               this.lugares.add(l);
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

 
    public List<Lugar> verLugares() {
        Collections.sort(lugares);
        return lugares;
    }


    public Lugar verLugar(String nombre) {
        for (Lugar l : lugares){
            if (l.verNombre() == nombre){
                return l;
            }
        }
        return null;
    }

    @Override
    public String borrarLugar(Lugar lugar) {
        GestorPublicaciones gp1 = GestorPublicaciones.crear();
        if (lugares.contains(lugar)){
            if(gp1.hayPublicacionesConEsteLugar(lugar)){
                return EXISTE_PUB;
            }
            lugares.remove(lugar);
            return BORRADO_EXITO;
        }
        return BORRADO_INEXISTENTE;
    }

    @Override
    public List<Lugar> buscarLugares(String nombre) {
        List<Lugar> busquedaLugares = new ArrayList<>();
        for (Lugar l : lugares){
            if (l.verNombre().contains(nombre)){
                busquedaLugares.add(l);
            }
        }
        Collections.sort(busquedaLugares);
        return busquedaLugares;
    }

    @Override
    public boolean existeEsteLugar(Lugar lugar) {
        if(lugares.contains(lugar)){
            return true;
        }
        return false;
    }
    
}
