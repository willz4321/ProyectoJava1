package autores.controladores;

import autores.vistas.VentanaMensajeAutor;
import javax.swing.JDialog;

public class ControladorMensajeAutor {
    private VentanaMensajeAutor ventana;
    
    public ControladorMensajeAutor(JDialog padre, boolean modal, String mensaje) {
        this.ventana = new VentanaMensajeAutor(padre, modal, this);
        this.ventana.setMensaje(mensaje);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.setVisible(true);
    }
}
