package autores.modelos;

public class Profesor extends Autor{
    private Cargo cargo;

    public Profesor(int dni, String apellidos, String nombres, String clave, Cargo cargo) {
        super(dni, apellidos, nombres, clave);
        this.cargo = cargo;
    }
    
    public Cargo verCargo() {
        return cargo;
    }

    public void asignarCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Cargo: " + this.verCargo()+ "\n");
    }

    @Override
    public int compareTo(Autor arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
