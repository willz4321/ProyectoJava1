package publicaciones.modelos;

import autores.modelos.Autor;
import static grupos.modelos.GestorGrupos.BORRADO_EXITO;
import static grupos.modelos.GestorGrupos.BORRADO_INEXISTENTE;
import static grupos.modelos.GestorGrupos.EXISTE_PUB;
import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import interfaces.IGestorPublicaciones;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;


public class GestorPublicaciones implements IGestorPublicaciones {
    private List<Publicacion> publicaciones = new ArrayList<> ();
    public static final String EXITO = "La nueva 'Publicacion' fue creada con éxito";
    public static final String REPETIDO = "ERROR. La nueva 'Publicacion' ya fue creada";
    public static final String INVALIDO = "ERROR. El nombre ingresado es inválido";
    public static final String INSTANCIADO = "ERROR. Un objeto de esta clase ya ha sido creado";
    public static final String MODIFICADO = "La 'Publicacion' fue modificada";
    public static final String INEXISTENTE = "ERROR. La 'Publicacion' no existe";
    private static GestorPublicaciones instancia;
    
    public static GestorPublicaciones crear () {
        if (instancia == null){
            instancia = new GestorPublicaciones();
        }
//        else{
//            System.out.println(INSTANCIADO);
//        }
        return instancia;
    }
    
    @Override
    public String nuevaPublicacion(String titulo, MiembroEnGrupo miembroEnGrupo, LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar, List<PalabraClave> palabrasClaves, String enlace, String resumen){
            if((titulo != null) && (miembroEnGrupo != null) && (fechaPublicacion != null) && (tipo != null)&& (lugar != null)&& (palabrasClaves != null)&& (enlace != null)&& (resumen != null) && (!titulo.isBlank()) && (!fechaPublicacion.toString().isBlank()) && (!palabrasClaves.toString().isBlank())&& (!miembroEnGrupo.verGrupo().toString().isBlank())&& (!enlace.isBlank())&& (!resumen.isBlank())){

            
               Publicacion p = new Publicacion(titulo, miembroEnGrupo, fechaPublicacion, tipo, idioma, lugar, palabrasClaves, enlace, resumen);
               if(!this.publicaciones.contains(p)){
                   this.publicaciones.add(p);
                   return EXITO;
               }
               else{
                   return REPETIDO;
               }
            }
        
        return INVALIDO;
       }

   @Override
    public String modificarPublicacion(Publicacion publicacion, MiembroEnGrupo miembroEnGrupo,LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar, List<PalabraClave> palabrasClaves, String enlace, String resumen){
        if(instancia.existeEstaPublicacion(publicacion)){
            for (Publicacion p : publicaciones) {
                if(p.equals(publicacion)){
                    p.asignarMiembroEnGrupo(miembroEnGrupo);
                    p.asignarFechaPublicacion(fechaPublicacion);
                    p.asignarTipo(tipo);
                    p.asignarIdioma(idioma);
                    p.asignarLugar(lugar);
                    p.asignarPalabrasClaves(palabrasClaves);
                    p.asignarEnlace(enlace);
                    p.asignarResumen(resumen);
                    return MODIFICADO;
                }
            }
        }
        return INEXISTENTE;
    }
 
 @Override
 public boolean hayPublicacionesConEstaPalabraClave(PalabraClave palabraClave){
         for(Publicacion p  : publicaciones){
             for(PalabraClave pc: p.verPalabrasClaves()){
                if(pc == palabraClave ){
                        return true;
                }
        
              }
        }
         return false;
 }
 

    @Override
    public boolean hayPublicacionesConEsteLugar(Lugar lugar) {
        for(Publicacion p  : publicaciones){
            if(p.verLugar() == lugar){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hayPublicacionesConEsteIdioma(Idioma idioma) {
           for(Publicacion p  : publicaciones){
            if(p.verIdioma() == idioma){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hayPublicacionesConEsteTipo(Tipo tipo) {
            for(Publicacion p  : publicaciones){
            if(p.verTipo() == tipo){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hayPublicacionesConEsteAutor(Autor autor) {
           for(Publicacion p  : publicaciones){
            if(p.verMiembroEnGrupo().verAutor() == autor){
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Publicacion> verPublicaciones() {
        Collections.sort(publicaciones);
        return publicaciones;
    }

    @Override
    public Publicacion verPublicacion(String titulo) {
        for(Publicacion p : publicaciones){
            if(p.verTitulo() == titulo){
                return p;
            }
        }
        return null;
    }

 

    @Override
    public boolean existeEstaPublicacion(Publicacion publicacion) {
        for(Publicacion p : publicaciones){
            if(p.equals(publicacion)){
                return true;
            }
        }
        return false;
    }

//    @Override
//    public String nuevaPublicacion(String titulo, MiembroEnGrupo miembroEnGrupo, LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar, List<PalabraClave> palabrasClaves, String enlace, String resumen) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public String modificarPublicacion(Publicacion publicacion, MiembroEnGrupo miembroEnGrupo, LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar, List<PalabraClave> palabrasClaves, String enlace, String resumen) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public String borrarPublicacion(Publicacion publicacion) {
        if (publicaciones.contains(publicacion)){
            if(existeEstaPublicacion(publicacion)){
                return EXISTE_PUB;
            }
            publicaciones.remove(publicacion);
            return BORRADO_EXITO;
        }
        return BORRADO_INEXISTENTE;
    }

    @Override
    public List<Publicacion> buscarPublicaciones(String titulo) {
           List<Publicacion> busquedaPublicaciones = new ArrayList<>();
        for (Publicacion p : publicaciones){
            if (p.verTitulo().contains(titulo)){
                busquedaPublicaciones.add(p);
            }
        }
        Collections.sort(busquedaPublicaciones);
        return busquedaPublicaciones;
    }
    
    
}