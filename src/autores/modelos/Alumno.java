package autores.modelos;

import java.util.Objects;

public class Alumno extends Autor {
    private String cx;

    public Alumno(int dni, String apellidos, String nombres, String clave, String cx) {
        super(dni, apellidos, nombres, clave);
        this.cx = cx;
    }
    
    public String verCx() {
        return cx;
    }

    public void asignarCx(String cx) {
        this.cx = cx;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)){
   
            if(obj instanceof Alumno){

                return Objects.equals(this.cx, ((Alumno)obj).verCx());
            }
            else
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.cx);
        return hash;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("CX: " + this.verCx() + "\n");
    }

    @Override
    public int compareTo(Autor arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
