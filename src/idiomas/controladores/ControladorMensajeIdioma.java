package idiomas.controladores;

import idiomas.vistas.VentanaAIdioma;
import idiomas.vistas.VentanaMensajeIdioma;

public class ControladorMensajeIdioma {
    private VentanaMensajeIdioma ventana;
    
    public ControladorMensajeIdioma(VentanaAIdioma padre, boolean modal, String mensaje) {
        this.ventana = new VentanaMensajeIdioma(padre, modal, this);
        this.ventana.setMensaje(mensaje);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.setVisible(true);
    }
}
