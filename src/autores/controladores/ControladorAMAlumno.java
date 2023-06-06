package autores.controladores;

import autores.modelos.Alumno;
import autores.modelos.Autor;
import autores.modelos.GestorAutores;
import autores.vistas.VentanaAMAlumno;
import autores.vistas.VentanaAMAutores;
import interfaces.IControladorAMAlumno;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class ControladorAMAlumno implements IControladorAMAlumno{

    private VentanaAMAlumno ventana;
    private GestorAutores ga = GestorAutores.crear();
    private boolean crear;
    private Autor autorAux;
    
    public ControladorAMAlumno(String title, boolean dniEnabled, boolean crear, VentanaAMAutores padre, boolean modal) {
        this.crear = crear;
        this.ventana = new VentanaAMAlumno(padre, modal, this);
        this.ventana.setTitle(title);
        this.ventana.dniEnabled(dniEnabled);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.setVisible(true);
    }
    
    public ControladorAMAlumno(String title, boolean dniEnabled, boolean crear, Autor autor, VentanaAMAutores padre, boolean modal){
        this.crear = crear;
        this.ventana = new VentanaAMAlumno(padre, modal, this);
        this.ventana.setTitle(title);
        this.ventana.dniEnabled(dniEnabled);
        this.ventana.setDni(String.valueOf(autor.verDni()));
        this.ventana.setApellidos(autor.verApellidos());
        this.ventana.setNombres(autor.verNombres());
        Alumno aux = (Alumno)autor;
        this.ventana.setCX(aux.verCx());
        this.ventana.setClave(autor.verClave());
        this.ventana.setClaveRepetida(autor.verClave());
        this.autorAux = autor;
        this.ventana.setLocationRelativeTo(null);
        this.ventana.setVisible(true);
    }
    
    @Override
    public void btnGuardarClic(ActionEvent evt) {
        String mensaje;
        if(crear == true){
            mensaje = this.ga.nuevoAutor(this.ventana.getDni(), this.ventana.getApellidos(), this.ventana.getNombres(), this.ventana.getCX(), this.ventana.getClave(), this.ventana.getClaveRepetida());
            if(mensaje.equals("El nuevo Autor fue creado con éxito")){
                this.ventana.setVisible(false);
                this.ventana.dispose();
            }
        }
        else {
            mensaje = this.ga.modificarAutor(autorAux, this.ventana.getApellidos(), this.ventana.getNombres(), this.ventana.getCX(), this.ventana.getClave(), this.ventana.getClaveRepetida());
            if(mensaje.equals("El 'Autor' fue modificado")){
                this.ventana.setVisible(false);
                this.ventana.dispose();
            }
        }
        ControladorMensajeAutor cont = new ControladorMensajeAutor(this.ventana, true, mensaje);
    }

    @Override
    public void btnCancelarClic(ActionEvent evt) {
        this.ventana.setVisible(false);
        this.ventana.dispose();    
    }

    @Override
    public void txtApellidosPresionarTecla(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isLetter(c)) {
            switch(c) {
                case KeyEvent.VK_ENTER:
                    this.btnGuardarClic(null);
                case KeyEvent.VK_BACK_SPACE:
                case KeyEvent.VK_SPACE:
                case KeyEvent.VK_DELETE:
                    break;
                default:                    
                    evt.consume();
                    break;
            }
        }
    }

    @Override
    public void txtNombresPresionarTecla(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isLetter(c)) {
            switch(c) {                              
                case KeyEvent.VK_ENTER:
                    this.btnGuardarClic(null);
                case KeyEvent.VK_BACK_SPACE:
                case KeyEvent.VK_SPACE:
                case KeyEvent.VK_DELETE:
                    break;
                default:
                    evt.consume();
                    break;
            }
        }
    }

    @Override
    public void txtDocumentoPresionarTecla(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            switch(c) {
                case KeyEvent.VK_ENTER:
                    this.btnGuardarClic(null);                
                case KeyEvent.VK_BACK_SPACE:
                case KeyEvent.VK_DELETE:
                    break;
                default:
                    evt.consume();
                    break;
            }
        }
    }

    @Override
    public void passClavePresionarTecla(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isAlphabetic(c) & !Character.isDigit(c)) {
            switch(c) {
                case KeyEvent.VK_ENTER:
                    this.btnGuardarClic(null);                
                case KeyEvent.VK_BACK_SPACE:
                case KeyEvent.VK_DELETE:
                    break;
                default:
                    evt.consume();
                    break;
            }
        }  
    }

    @Override
    public void passRepetirClavePresionarTecla(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isAlphabetic(c) & !Character.isDigit(c)) {
            switch(c) {
                case KeyEvent.VK_ENTER:
                    this.btnGuardarClic(null);
                case KeyEvent.VK_BACK_SPACE:
                case KeyEvent.VK_DELETE:
                    break;
                default:
                    evt.consume();
                    break;
            }
        }  
    }

    @Override
    public void txtCXPresionarTecla(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            switch(c) {
                case KeyEvent.VK_ENTER:
                    this.btnGuardarClic(null);
                case KeyEvent.VK_BACK_SPACE:
                case KeyEvent.VK_DELETE:
                    break;
                default:
                    evt.consume();
                    break;
            }
        }
    }
}
