package principal.controladores;

import java.awt.event.ActionEvent;
import principal.vistas.VentanaSalir;
import interfaces.IControladorSalir;
import principal.vistas.VentanaPrincipal;

public class ControladorSalir implements IControladorSalir{

    private VentanaSalir ventana;
    
    public ControladorSalir(VentanaPrincipal padre, boolean modal) {
        this.ventana = new VentanaSalir(padre, modal, this);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.setVisible(true);
    }
    
    @Override
    public void btnConfirmarSalirClic(ActionEvent evt) {
        System.exit(0);
    }

    @Override
    public void btnCancelarSalirClic(ActionEvent evt) {
        this.ventana.setVisible(false);
        this.ventana.dispose();
    }
}
