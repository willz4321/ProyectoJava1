package autores.controladores;

import autores.modelos.GestorAutores;
import autores.modelos.ModeloTablaAlumnos;
import autores.modelos.ModeloTablaProfesores;
import autores.vistas.VentanaAMAutores;
import interfaces.IControladorAutores;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import principal.vistas.VentanaPrincipal;

public class ControladorAutores implements IControladorAutores {
    private VentanaAMAutores ventana;
    private GestorAutores ga = GestorAutores.crear();
    
    public ControladorAutores(VentanaPrincipal padre, boolean modal) {
        this.ventana = new VentanaAMAutores(padre, modal, this);
        this.ventana.autoresCargados();
        this.ventana.setLocationRelativeTo(null);
        this.ventana.setVisible(true);
        this.actualizar();
    }
    
    @Override
    public void btnNuevoProfesorClic(ActionEvent evt) {
        ControladorAMProfesor controlador = new ControladorAMProfesor("Nuevo Profesor", true, true, this.ventana, true);
    }

    @Override
    public void btnNuevoAlumnoClic(ActionEvent evt) {
        ControladorAMAlumno controlador = new ControladorAMAlumno("Nuevo Alumno", true, true, this.ventana, true);
    }

    @Override
    public void btnModificarProfesorClic(ActionEvent evt) {
        ControladorAMProfesor controlador = new ControladorAMProfesor("Modificar Profesor", false, false, this.ventana.verProfesor(), this.ventana, true);
    }

    @Override
    public void btnModificarAlumnoClic(ActionEvent evt) {
        ControladorAMAlumno controlador = new ControladorAMAlumno("Modificar Alumno", false, false, this.ventana.verAlumno(), this.ventana, true);
    }

    @Override
    public void btnBorrarProfesorClic(ActionEvent evt) {
        ga.BorrarAutor(this.ventana.verDniProfesor());
        this.actualizar();
    }

    @Override
    public void btnBorrarAlumnoClic(ActionEvent evt) {
        ga.BorrarAutor(this.ventana.verDniAlumno());
        this.actualizar();
    }

    @Override
    public void btnVolverClic(ActionEvent evt) {
        this.ventana.setVisible(false);
        this.ventana.dispose();
    }

    @Override
    public void btnBuscarProfesorClic(ActionEvent evt) {
        ModeloTablaProfesores mtp = (ModeloTablaProfesores)this.ventana.getTablaProfesores().getModel();
        mtp.BuscarProfesores(this.ventana.getBusquedaProfesores());  
    }

    @Override
    public void btnBuscarAlumnoClic(ActionEvent evt) {
        ModeloTablaAlumnos mta = (ModeloTablaAlumnos)this.ventana.getTablaAlumnos().getModel();
        mta.BuscarAlumnos(this.ventana.getBusquedaAlumnos());
    }

    @Override
    public void ventanaObtenerFoco(WindowEvent evt) {
        this.actualizar();
    }

    @Override
    public void txtApellidosProfesorPresionarTecla(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isLetter(c)) {
            switch(c) {
                case KeyEvent.VK_ENTER:    
                   this.btnBuscarProfesorClic(null);
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
    public void txtApellidosAlumnoPresionarTecla(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isLetter(c)) {
            switch(c) {
                case KeyEvent.VK_ENTER:     
                    this.btnBuscarAlumnoClic(null);
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
    
    public void actualizar(){
        ModeloTablaProfesores mtp = (ModeloTablaProfesores)this.ventana.getTablaProfesores().getModel();
        mtp.actualizar();
        ModeloTablaAlumnos mta = (ModeloTablaAlumnos)this.ventana.getTablaAlumnos().getModel();
        mta.actualizar();
        this.ventana.autoresCargados();
    }
}
