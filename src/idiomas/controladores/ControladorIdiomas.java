/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomas.controladores;

import interfaces.IControladorIdiomas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import idiomas.modelos.GestorIdiomas;
import idiomas.modelos.ModeloTablaIdiomas;
import idiomas.vistas.VentanaIdiomas;
import principal.vistas.VentanaPrincipal;

public class ControladorIdiomas implements IControladorIdiomas{
    private GestorIdiomas gi = GestorIdiomas.crear();
    private VentanaIdiomas ventana;
    
    
    public ControladorIdiomas (VentanaPrincipal padre, boolean modal) {
        this.ventana = new VentanaIdiomas(padre, modal, this);
        this.ventana.idiomasCargados();
        this.ventana.setLocationRelativeTo(null);
        this.ventana.setVisible(true);
        this.actualizar();
    }

    @Override
    public void btnNuevaClic(ActionEvent evt) {
        ControladorAIdioma controlador = new ControladorAIdioma(ventana, true);
        ventana.dispose();
    }

    @Override
    public void btnBorrarClic(ActionEvent evt) {
        gi.borrarIdioma(this.ventana.getIdioma());
        this.actualizar();
    }

    @Override
    public void btnVolverClic(ActionEvent evt) {
        this.ventana.setVisible(false);
        this.ventana.dispose();
    }

    @Override
    public void btnBuscarClic(ActionEvent evt) {
        ModeloTablaIdiomas mti = (ModeloTablaIdiomas)this.ventana.getTablaIdiomas().getModel();
        mti.BuscarIdiomas(this.ventana.getBusquedaIdiomas());
    }

    @Override
    public void ventanaObtenerFoco(WindowEvent evt) {
        gi.leerArchivo();
        gi.escribirArchivo();
        this.actualizar();
    }

    @Override
    public void txtIdiomaPresionarTecla(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isLetter(c)) {
            switch(c) {
                case KeyEvent.VK_ENTER:    
                   this.btnBuscarClic(null);
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
        ModeloTablaIdiomas mti = (ModeloTablaIdiomas)this.ventana.getTablaIdiomas().getModel();
        mti.actualizar();
        this.ventana.idiomasCargados();
    }
}
