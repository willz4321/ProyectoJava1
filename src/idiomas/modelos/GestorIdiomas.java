package idiomas.modelos;

import java.util.ArrayList;
import interfaces.IGestorIdiomas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import publicaciones.modelos.GestorPublicaciones;
import tipos.modelos.Tipo;

public class GestorIdiomas implements IGestorIdiomas{
    private List<Idioma> idiomas = new ArrayList<> ();
    public static final String EXITO = "El nuevo 'Idioma' fue creado con éxito";
    public static final String REPETIDO = "ERROR. El nuevo 'Idioma' ya fue creado";
    public static final String INVALIDO = "ERROR. El nombre ingresado es inválido";
    public static final String INSTANCIADO = "ERROR. Un objeto de esta clase ya ha sido creado";
    public static final String BORRADO_EXITO = "Se ha borrado con éxito el tipo seleccionado";
    public static final String BORRADO_INEXISTENTE = "No se encuentra el tipo seleccionado";
    public static final String EXISTE_PUB = "ERROR. Existe una publicación asociada a ese tipo";
    public static final String NOMBRE_ARCHIVO = "Idiomas.txt";
    private static final char SEPARADOR = '\t';
    private static final String ESCRITURA_OK = "Se ha escrito el archivo exitosamente";
    private static final String ESCRITURA_ERROR = "No se ha podido escribir el archivo";
    private static final String CREACION_ERROR = "No se ha podido crear el archivo";
    private static final String OK = "Se ha escrito el archivo exitosamente";
    private static final String LECTURA_OK = "Se ha leído el archivo exitosamente";
    private static final String LECTURA_ERROR = "No se ha podido leer el archivo";
    
    private static GestorIdiomas instancia;
    
    public static GestorIdiomas crear () {
        if (instancia == null){
            instancia = new GestorIdiomas();
        }
//        else{
//            System.out.println(INSTANCIADO);
//        }
        return instancia;
    }
    

    public String nuevoIdioma(String nombre) {
        if ((nombre != null) && (!nombre.isBlank())){
            Idioma i = new Idioma(nombre);
            if (!this.idiomas.contains(i)){
               this.idiomas.add(i);
               Collections.sort(idiomas);
               String resultado = this.escribirArchivo();
               return (resultado.equals(ESCRITURA_OK) ? OK : resultado);
            }
            else {
                return REPETIDO;
            }
        }
        else {
            return INVALIDO;
        }
    }

    public List<Idioma> verIdiomas() {
        Collections.sort(idiomas);
        return idiomas;
    }

    
    public Idioma verIdioma(String nombre) {
        for (Idioma i : idiomas){
            if (i.verNombre() == nombre){
                return i;
            }
        }
        return null;
    }

    @Override
    public String borrarIdioma(Idioma idioma) {
        GestorPublicaciones gp1 = GestorPublicaciones.crear();
        if (idiomas.contains(idioma)){
            if(gp1.hayPublicacionesConEsteIdioma(idioma)){
                return EXISTE_PUB;
            }
            idiomas.remove(idioma);
            String resultado = this.escribirArchivo();
            return (resultado.equals(ESCRITURA_OK) ? OK : resultado);
        }
        return BORRADO_INEXISTENTE;
    }

    @Override
    public List<Idioma> buscarIdiomas(String nombre) {
        List<Idioma> busquedaIdiomas = new ArrayList<>();
        for (Idioma i : idiomas){
            if (i.verNombre().contains(nombre)){
                busquedaIdiomas.add(i);
            }
        }
        Collections.sort(busquedaIdiomas);
        return busquedaIdiomas;
    }

    @Override
    public boolean existeEsteIdioma(Idioma idioma) {
        if(idiomas.contains(idioma)){
            return true;
        }
        return false;
    }
    
    private File obtenerArchivo() { 
        File file = new File(NOMBRE_ARCHIVO);
        try {
            if (!file.exists())
                file.createNewFile();
            return file;
        }
        catch(IOException e) {
            return null;
        }        
    }
    
    public String escribirArchivo() {
        File file = this.obtenerArchivo();
        if (file != null) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {     
                for(Idioma i : this.idiomas) {
                    String cadena = i.verNombre();
                    bw.write(cadena); 
                    bw.newLine();
                }            
                return ESCRITURA_OK;
            } 
            catch (IOException ioe) {
                return ESCRITURA_ERROR;            
            }
        }
        else
            return CREACION_ERROR;        
    }
    
    public String leerArchivo() {
        File file = this.obtenerArchivo();
        if (file != null) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String cadena;
                while((cadena = br.readLine()) != null) {
                    String[] vectorIdiomas = cadena.split(Character.toString(SEPARADOR));
                    String nombre = vectorIdiomas[0];
//                    Idioma i = new Idioma(nombre);
                    this.nuevoIdioma(nombre);
                }
                return LECTURA_OK;
            }
            catch(NullPointerException | IOException ioe) {
                return LECTURA_ERROR;
            }            
        }
        else
            return CREACION_ERROR;        
    }    
}
