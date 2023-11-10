
package viewsFrames;

import accessData.ProveedorData;
import entity.Proveedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class InfoProveedores extends javax.swing.JInternalFrame {
        
    
    private List<Proveedor> listarP;
    ProveedorData aData = new ProveedorData();

    public InfoProveedores() {
        initComponents();
        listarP = aData.listarProveedor();
       cargarProveedores();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jcbProveedor = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
        jBuscar = new javax.swing.JButton();
        jAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTRazon = new javax.swing.JTextField();
        jTDomicilio = new javax.swing.JTextField();
        jTelefono = new javax.swing.JTextField();
        jEstado = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(570, 500));
        setMinimumSize(new java.awt.Dimension(570, 500));

        jLabel1.setText("Informacion Proveedores");

        jLabel2.setText("Proveedor:");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jAgregar.setText("Agregar");
        jAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarActionPerformed(evt);
            }
        });

        jLabel3.setText("Razon Social:");

        jLabel4.setText("Domicilio:");

        jLabel5.setText("Telefono:");

        jLabel6.setText("Estado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addGap(182, 182, 182))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jAgregar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addGap(62, 62, 62)
                        .addComponent(btnSalir)
                        .addGap(103, 103, 103))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jEstado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTDomicilio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTRazon, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbProveedor, javax.swing.GroupLayout.Alignment.LEADING, 0, 291, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jBuscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBuscar))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTRazon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(jLabel4))
                    .addComponent(jTDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir)
                    .addComponent(jAgregar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        ProveedorData ad = new ProveedorData();
        Proveedor prod = new Proveedor();
        
        prod.getIdProveedor();
          if (jTRazon.getText().isEmpty() || jTDomicilio.getText().isEmpty() || jTelefono.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No pueden haber campos vacios");
            return;
          }
        try {
            prod.setRazonSocial(jTRazon.getText());
            prod.setDomicilio(jTDomicilio.getText());
            prod.setTelefono(Integer.parseInt(jTelefono.getText()));
            prod.setIdProveedor(((Proveedor)jcbProveedor.getSelectedItem()).getIdProveedor());

            ad.modificarProveedor(prod);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número");
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        ProveedorData ad = new ProveedorData();
        Proveedor prod = new Proveedor();

        if (jcbProveedor.getSelectedItem() != null) {
            int id = ((Proveedor) jcbProveedor.getSelectedItem()).getIdProveedor();
            System.out.println(id);
            prod = ad.buscarProveedorPorId(id);

            jTRazon.setText(prod.getRazonSocial());
            jTDomicilio.setText(prod.getDomicilio());
            jTelefono.setText(String.valueOf(prod.getTelefono()));
        } else {
           JOptionPane.showMessageDialog(this, "Error al buscar.");
        }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
      if (jcbProveedor.getSelectedItem() != null) {
        try {
            int id = ((Proveedor) jcbProveedor.getSelectedItem()).getIdProveedor();

            ProveedorData ad = new ProveedorData();
            ad.eliminarProveedor(id);

            JOptionPane.showMessageDialog(this, "Proveedor eliminado con éxito");
            
            jTRazon.setText("");
            jTDomicilio.setText("");
            jTelefono.setText("");
            jEstado.setText("");
            
            listarP = aData.listarProveedor();
            cargarProveedores();

        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID válido para eliminar un proveedor");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Error al eliminar el proveedor.");
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarActionPerformed
        ProveedorData ad = new ProveedorData();
        Proveedor prod = new Proveedor();
        try {
            prod.setRazonSocial(jTRazon.getText());
            prod.setDomicilio(jTDomicilio.getText());
            prod.setTelefono(Integer.parseInt(jTelefono.getText()));
            
            for (Proveedor proveedor : ad.listarProveedor()) {
                if (proveedor.getRazonSocial().equals(prod.getRazonSocial())) {
                    JOptionPane.showMessageDialog(this, "El proveedor ya existe.");
                    return;
                }
            }
            if (jTRazon.getText().isEmpty() || jTDomicilio.getText().isEmpty() || jTelefono.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No pueden haber campos vacíos.");
            } else {
                ad.guardarProveedor(prod);
                listarP = ad.listarProveedor();
                cargarProveedores();
                jTRazon.setText("");
                jTDomicilio.setText("");
                jTelefono.setText("");
                jEstado.setText(""); 
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido en el campo teléfono.");
        }
    }//GEN-LAST:event_jAgregarActionPerformed

    private void cargarProveedores() {
        for (Proveedor item : listarP) {
            jcbProveedor.addItem(item);
        }
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jAgregar;
    private javax.swing.JButton jBuscar;
    private javax.swing.JTextField jEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTDomicilio;
    private javax.swing.JTextField jTRazon;
    private javax.swing.JTextField jTelefono;
    private javax.swing.JComboBox<Proveedor> jcbProveedor;
    // End of variables declaration//GEN-END:variables
}
