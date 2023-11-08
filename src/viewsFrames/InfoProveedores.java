
package viewsFrames;

import accessData.ProveedorData;
import entity.Proveedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class InfoProveedores extends javax.swing.JInternalFrame {
        
    private DefaultTableModel modelo;
    private List<Proveedor> listarP;
    private ProveedorData aData = new ProveedorData();

    public InfoProveedores() {
        initComponents();
        modelo = new DefaultTableModel();
        listarP = (List<Proveedor>) aData.listarProveedor();
        cargarProveedores();
        armarCabeceraTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProv = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jcbProveedor = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();

        jLabel1.setText("Informacion Proveedores");

        jLabel2.setText("Proveedor:");

        jTProv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTProv);

        btnModificar.setText("Modificar");

        btnEliminar.setText("Eliminar");

        jcbProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProveedorActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar)
                                .addGap(67, 67, 67)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalir)
                                .addGap(17, 17, 17))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(146, 146, 146)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jcbProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProveedorActionPerformed
         borrarFilaTabla();
        
        Proveedor selec = (Proveedor) jcbProveedor.getSelectedItem();
        int id = selec.getIdProveedor();
        List<Proveedor> aa = (List<Proveedor>) aData.buscarProveedorPorId(id);

        for (Proveedor i : aa) {
            modelo.addRow(new Object[]{i.getIdProveedor(), i.getRazonSocial(), i.getDomicilio(), i.getTelefono(), i.isEstado()});
        }
    }//GEN-LAST:event_jcbProveedorActionPerformed
   
    
    private void cargarProveedores() {
        for (Proveedor proveedor : listarP) {
            jcbProveedor.addItem(proveedor);
        }
    }

   private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("id Proveedor");
        filaCabecera.add("Razon Social");
        filaCabecera.add("Domicilio");
        filaCabecera.add("Telefono");
        filaCabecera.add("Estado");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jTProv.setModel(modelo);
    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProv;
    private javax.swing.JComboBox<String> jcbProveedor;
    // End of variables declaration//GEN-END:variables
}
