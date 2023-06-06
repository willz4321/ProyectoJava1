/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import autores.modelos.GestorAutores;
import interfaces.IGestorGrupos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestorGrupos implements IGestorGrupos{
    private List<Grupo> grupos = new ArrayList<>();
    public static final String EXITO = "El nuevo 'Grupo' fue creado con éxito";
    public static final String REPETIDO = "ERROR. El nuevo 'Grupo' ya fue creado";
    public static final String INVALIDO = "ERROR. El nombre ingresado es inválido";
    public static final String INSTANCIADO = "ERROR. Un objeto de esta clase ya ha sido creado";
    public static final String MODIFICADO = "El 'Grupo' fue modificado";
    public static final String INEXISTENTE = "ERROR. El 'Grupo' no existe";
    public static final String BORRADO_EXITO = "Se ha borrado con éxito el tipo seleccionado";
    public static final String BORRADO_INEXISTENTE = "No se encuentra el tipo seleccionado";
    public static final String EXISTE_PUB = "ERROR. Existe una publicación asociada a ese tipo";
    
    private static GestorGrupos instancia;
    
    public static GestorGrupos crear() {
        if (instancia == null){
            instancia = new GestorGrupos();
        }
//        else {
//            System.out.println(INSTANCIADO);            
//        }
        return instancia;
    }

    @Override
    public String nuevoGrupo(String nombre, String descripcion) {
        if ((nombre != null) && (descripcion != null) && (!nombre.isBlank()) && (!descripcion.isBlank())){
            Grupo g = new Grupo (nombre, descripcion);
            if (!this.grupos.contains(g)){
                this.grupos.add(g);
                return EXITO;
            }
            else {
                return REPETIDO;
            }
        }
        return INVALIDO;
    }

    @Override
    public String modificarGrupo(Grupo grupo, String descripcion) {
        if(instancia.existeEsteGrupo(grupo)){
            for (Grupo g : grupos) {
                if(g.equals(grupo)){
                    g.asignarDescripcion(descripcion);
                    return MODIFICADO;
                }
            }
        }
        return INEXISTENTE;
    }

    @Override
    public String borrarGrupo(Grupo grupo) {
        GestorAutores ga1 = GestorAutores.crear();
        if (grupos.contains(grupo)){
            if(ga1.hayAutoresConEsteGrupo(grupo)){
                return EXISTE_PUB;
            }
            grupos.remove(grupo);
            return BORRADO_EXITO;
        }
        return BORRADO_INEXISTENTE;
    }

    @Override
    public List<Grupo> buscarGrupos(String nombre) {
        List<Grupo> busquedaGrupos = new ArrayList<>();
        for (Grupo g : grupos){
            if (g.verNombre().contains(nombre)){
                busquedaGrupos.add(g);
            }
        }
        Collections.sort(busquedaGrupos);
        return busquedaGrupos;
    }

    @Override
    public List<Grupo> verGrupos() {
        Collections.sort(grupos);
        return grupos;
    }

    @Override
    public Grupo verGrupo(String nombre) {
        for (Grupo g : grupos){
            if (g.verNombre() == nombre) {
                return g;
            }
        }
        return null;
    }

    @Override
    public boolean existeEsteGrupo(Grupo grupo) {
        if(grupos.contains(grupo)){
            return true;
        }
        return false;
    }
    
}
