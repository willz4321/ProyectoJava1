/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

/**
 *
 * @author rodrigo
 */
public enum Rol {
    ADMINISTRADOR,
    COLABORADOR;
    
    public static Rol getADMINISTRADOR() {    
        return ADMINISTRADOR;
    }

    public static Rol getCOLABORADOR() {
        return COLABORADOR;
    }
}
