/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.event.ActionEvent;

public interface IControladorPrincipal {
    public static final String CONFIRMACION = "¿Desea terminar la sesión?";
    public static final String TITULO = "Repositorios";
    
    public void btnAutoresClic(ActionEvent evt);
    
    public void btnSalirClic(ActionEvent evt);
    
    public void btnIdiomasClic(ActionEvent evt);
}
