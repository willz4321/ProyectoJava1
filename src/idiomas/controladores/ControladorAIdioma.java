/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomas.controladores;

import idiomas.modelos.GestorIdiomas;
import idiomas.vistas.VentanaAIdioma;
import idiomas.vistas.VentanaIdiomas;
import interfaces.IControladorAIdioma;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class ControladorAIdioma implements IControladorAIdioma {
private GestorIdiomas gi = GestorIdiomas.crear();
private VentanaAIdioma ventana;

    public ControladorAIdioma (VentanaIdiomas padre, boolean modal) {
        this.ventana = new VentanaAIdioma(padre, modal, this);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.setVisible(true);
    }
    @Override
    public void btnGuardarClic(ActionEvent evt) {
        String mensaje;
        mensaje = this.gi.nuevoIdioma(this.ventana.getNombre());
        if(mensaje.equals("Se ha escrito el archivo exitosamente")){
            this.ventana.setVisible(false);
            this.ventana.dispose();
        }
        else {
            this.ventana.limpiar();
        }
        ControladorMensajeIdioma cont = new ControladorMensajeIdioma(this.ventana, true, mensaje);
    }

    @Override
    public void btnCancelarClic(ActionEvent evt) {
        this.ventana.setVisible(false);
        this.ventana.dispose();
    }

    @Override
    public void txtNombrePresionarTecla(KeyEvent evt) {
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
    
}
