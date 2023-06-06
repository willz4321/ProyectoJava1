package autores.modelos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaProfesores extends AbstractTableModel {
    private ArrayList<String> nombreColumnas = new ArrayList<>();
    private List<Profesor> profesores = new ArrayList<>();
    private GestorAutores ga = GestorAutores.crear();
    private ArrayList<Profesor> auxProfesores = new ArrayList<>();
    public ModeloTablaProfesores() {
        nombreColumnas.add("DNI");
        nombreColumnas.add("Apellidos");
        nombreColumnas.add("Nombres");
        nombreColumnas.add("Cargo");
//        ga.nuevoAutor(12312, "duran", "bernardo", Cargo.ADG, "12345", "12345");
//        ga.nuevoAutor(123412, "guzmanx", "Rodsi", Cargo.ADG, "1234s5", "1234s5");
        this.profesores = ga.verProfesores();
        this.actualizar();
    }

    @Override
    public int getColumnCount() {
        return this.nombreColumnas.size();
    }

    @Override
    public int getRowCount() {
        return this.profesores.size();
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Profesor p = this.profesores.get(fila);
        switch(columna) {
            case 0: return p.verDni();
            case 1: return p.verApellidos();
            case 2: return p.verNombres();
            default: return p.verCargo();
        }
    }

    @Override
    public String getColumnName(int columna) {
        return this.nombreColumnas.get(columna);
    }
    
    public Autor verAutor(int fila) {
        return this.profesores.get(fila);
    }
    
    public void BuscarProfesores(String apellido){
        this.auxProfesores.clear();
        this.profesores = ga.verProfesores();
        if (apellido.isBlank()){
           // this.profesores.clear();
            this.profesores = ga.verProfesores();
            this.fireTableDataChanged();
        }
        else{
            for (Autor a : this.profesores ){
                if(a.verApellidos().contains(apellido)){
                    this.auxProfesores.add((Profesor)a);
                }
            }
            this.profesores = this.auxProfesores;
            this.fireTableDataChanged();
        }
    }
    
    public void actualizar() {
        GestorAutores ga = GestorAutores.crear();
        this.profesores = ga.verProfesores();
        this.fireTableDataChanged();
    }
}