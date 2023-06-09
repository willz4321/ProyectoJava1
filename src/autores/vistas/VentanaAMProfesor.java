package autores.vistas;

import autores.modelos.Cargo;
import autores.modelos.ModeloComboCargos;
import autores.modelos.Profesor;
import interfaces.IControladorAMProfesor;
import java.util.ArrayList;
import javax.swing.JDialog;

public class VentanaAMProfesor extends JDialog {
    ArrayList<Profesor> profesores = new ArrayList<>();
    
    private IControladorAMProfesor controlador;
    /**
     * Creates new form VentanaSalir
     */
    public VentanaAMProfesor(VentanaAMAutores padre, boolean modal, IControladorAMProfesor controlador) {
        super(padre, modal);
        initComponents();
        this.controlador = controlador;
        this.comboBoxCargoProfesor.setModel(new ModeloComboCargos());
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtApellidosProfesor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombresProfesor = new javax.swing.JTextField();
        btnGuardarNuevoProfesor = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDNIProfesor = new javax.swing.JTextField();
        txtClaveProfesor = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        comboBoxCargoProfesor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtRepetirClaveProfesor = new javax.swing.JPasswordField();
        btnCancelarNuevoProfesor = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Profesores");
        setResizable(false);

        jLabel1.setText("Apellidos:");

        txtApellidosProfesor.setToolTipText("Apellidos del profesor");
        txtApellidosProfesor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosPresionarTecla(evt);
            }
        });

        jLabel2.setText("Nombres:");

        txtNombresProfesor.setToolTipText("Nombres del profesor");
        txtNombresProfesor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresPresionarTecla(evt);
            }
        });

        btnGuardarNuevoProfesor.setMnemonic('G');
        btnGuardarNuevoProfesor.setText("Guardar");
        btnGuardarNuevoProfesor.setToolTipText("");
        btnGuardarNuevoProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNuevoProfesorClic(evt);
            }
        });

        jLabel3.setText("Cargo:");

        jLabel4.setText("Documento:");

        txtDNIProfesor.setToolTipText("Documento del profesor");
        txtDNIProfesor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDocumentoPresionarTecla(evt);
            }
        });

        txtClaveProfesor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClavePresionarTecla(evt);
            }
        });

        jLabel6.setText("Clave:");

        comboBoxCargoProfesor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Titular", "Asociado", "Adjunto", "JTP", "ADG" }));

        jLabel7.setText("Repetir clave:");

        txtRepetirClaveProfesor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRepetirPresionarTecla(evt);
            }
        });

        btnCancelarNuevoProfesor.setText("Cancelar");
        btnCancelarNuevoProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarNuevoProfesorClic(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRepetirClaveProfesor)
                            .addComponent(txtNombresProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(txtDNIProfesor)
                            .addComponent(txtApellidosProfesor)
                            .addComponent(txtClaveProfesor)
                            .addComponent(comboBoxCargoProfesor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardarNuevoProfesor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarNuevoProfesor)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNIProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidosProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombresProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboBoxCargoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClaveProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRepetirClaveProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarNuevoProfesor)
                    .addComponent(btnCancelarNuevoProfesor)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarNuevoProfesorClic(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNuevoProfesorClic
        this.controlador.btnGuardarClic(evt);
    }//GEN-LAST:event_btnGuardarNuevoProfesorClic

    private void btnCancelarNuevoProfesorClic(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarNuevoProfesorClic
        this.controlador.btnCancelarClic(evt);
    }//GEN-LAST:event_btnCancelarNuevoProfesorClic

    private void txtDocumentoPresionarTecla(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoPresionarTecla
        this.controlador.txtDocumentoPresionarTecla(evt);
    }//GEN-LAST:event_txtDocumentoPresionarTecla

    private void txtApellidosPresionarTecla(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosPresionarTecla
        this.controlador.txtApellidosPresionarTecla(evt);
    }//GEN-LAST:event_txtApellidosPresionarTecla

    private void txtNombresPresionarTecla(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresPresionarTecla
        this.controlador.txtNombresPresionarTecla(evt);
    }//GEN-LAST:event_txtNombresPresionarTecla

    private void txtClavePresionarTecla(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClavePresionarTecla
        this.controlador.passClavePresionarTecla(evt);
    }//GEN-LAST:event_txtClavePresionarTecla

    private void txtRepetirPresionarTecla(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRepetirPresionarTecla
        this.controlador.passRepetirClavePresionarTecla(evt);
    }//GEN-LAST:event_txtRepetirPresionarTecla

    public int getDni(){
        Integer dni = Integer.parseInt(this.txtDNIProfesor.getText().trim());
        return dni;
    }
    
    public String getApellidos(){
        String apellidos = this.txtApellidosProfesor.getText().trim();
        return apellidos;
    }
    
    public String getNombres(){
        String nombres = this.txtNombresProfesor.getText().trim();
        return nombres;
    }
    
    public Cargo getCargo(){
        Cargo cargo = Cargo.toCargo(this.comboBoxCargoProfesor.getSelectedItem().toString().toUpperCase());
        return cargo;
    }
    
    public String getClave(){
        String clave = new String(this.txtClaveProfesor.getPassword());
        return clave;
    }
    
    public String getClaveRepetida() {
        String claveRepetida = new String(this.txtRepetirClaveProfesor.getPassword());
        return claveRepetida;
    }
    
    public void dniEnabled(boolean enabled){
        this.txtDNIProfesor.setEnabled(enabled);
    }
    
    /*SET*/
    
    public void setDni(String dni){
        this.txtDNIProfesor.setText(dni);
    }
    
    public void setApellidos(String apellidos){
        this.txtApellidosProfesor.setText(apellidos);
    }
    
    public void setNombres(String nombres){
        this.txtNombresProfesor.setText(nombres);
    }
    
    public void setCargo(Cargo cargo){
        this.comboBoxCargoProfesor.setSelectedItem(cargo);
    }
    
    public void setClave(String clave){
        this.txtClaveProfesor.setText(clave);
    }
    
    public void setClaveRepetida(String clave) {
        this.txtRepetirClaveProfesor.setText(clave);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarNuevoProfesor;
    private javax.swing.JButton btnGuardarNuevoProfesor;
    private javax.swing.JComboBox<String> comboBoxCargoProfesor;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtApellidosProfesor;
    private javax.swing.JPasswordField txtClaveProfesor;
    private javax.swing.JTextField txtDNIProfesor;
    private javax.swing.JTextField txtNombresProfesor;
    private javax.swing.JPasswordField txtRepetirClaveProfesor;
    // End of variables declaration//GEN-END:variables
}
