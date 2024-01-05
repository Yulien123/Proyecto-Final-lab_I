/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewsFrames;

import accessData.CompraData;
import accessData.DetalleCData;
import accessData.ProductoData;
import accessData.ProveedorData;
import entity.Compra;
import entity.DetalleCompra;
import entity.Producto;
import entity.Proveedor;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class DetalleDeCompra extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;

    public DetalleDeCompra() {
        initComponents();
        this.setTitle("Realizar una Compra");
        modelo = new DefaultTableModel();

        armarCabeceraTabla();
//        cargarTabla();
        cargarProveedores();
        cargarProductos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbEliminarD = new javax.swing.JButton();
        jlPrecioFinal = new javax.swing.JLabel();
        jLProducto = new javax.swing.JLabel();
        jcbProductos = new javax.swing.JComboBox<>();
        jbComprar = new javax.swing.JButton();
        jLCantidad = new javax.swing.JLabel();
        jlTitulo2 = new javax.swing.JLabel();
        jlTitulo1 = new javax.swing.JLabel();
        jsCantidad = new javax.swing.JSpinner();
        jLProveedor = new javax.swing.JLabel();
        jcbProveedores = new javax.swing.JComboBox<>();
        jFecha = new javax.swing.JLabel();
        jdcFecha = new com.toedter.calendar.JDateChooser();

        jButton1.setText("jButton1");

        jPasswordField1.setText("jPasswordField1");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setMinimumSize(new java.awt.Dimension(22, 22));
        setPreferredSize(new java.awt.Dimension(1010, 530));

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cantidad", "Precio C", "Compra", "Producto", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jtTabla);
        if (jtTabla.getColumnModel().getColumnCount() > 0) {
            jtTabla.getColumnModel().getColumn(0).setHeaderValue("ID");
            jtTabla.getColumnModel().getColumn(1).setHeaderValue("Cantidad");
            jtTabla.getColumnModel().getColumn(2).setHeaderValue("Precio C");
            jtTabla.getColumnModel().getColumn(3).setHeaderValue("Compra");
            jtTabla.getColumnModel().getColumn(4).setHeaderValue("Producto");
            jtTabla.getColumnModel().getColumn(5).setHeaderValue("Estado");
        }

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbEliminarD.setText("Eliminar Compra");
        jbEliminarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarDActionPerformed(evt);
            }
        });

        jlPrecioFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlPrecioFinal.setText("Total: $ ");

        jLProducto.setText("Producto:");

        jcbProductos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbProductosItemStateChanged(evt);
            }
        });

        jbComprar.setText("Comprar");
        jbComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbComprarActionPerformed(evt);
            }
        });

        jLCantidad.setText("Cantidad:");

        jlTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        jlTitulo2.setText("DETALLE DE COMPRAS REGISTRADAS");

        jlTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jlTitulo1.setText("GENERAR CÓDIGO DE  COMPRA");

        jsCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsCantidadStateChanged(evt);
            }
        });

        jLProveedor.setText("Proveedor:");

        jFecha.setText("Fecha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jlTitulo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlTitulo2)
                        .addGap(273, 273, 273))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbSalir)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLProducto)
                                                .addComponent(jLCantidad))
                                            .addGap(50, 50, 50)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jcbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLProveedor)
                                                .addComponent(jFecha))
                                            .addGap(45, 45, 45)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jcbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jbComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jbEliminarD)
                                            .addGap(26, 26, 26)
                                            .addComponent(jbActualizar)))
                                    .addComponent(jlPrecioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jlTitulo2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlTitulo1)
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLProveedor)
                                    .addComponent(jcbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFecha))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLCantidad)
                                    .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLProducto))
                                .addGap(36, 36, 36)
                                .addComponent(jlPrecioFinal)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jbActualizar)
                                            .addComponent(jbEliminarD)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jbComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbSalir)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    //Comentado
    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
//        borrarFilaTabla();
//        List<DetalleCompra> listaDetalleCompra = detalleData.listarDetalleCompras();
//        for (DetalleCompra detalleCompra : listaDetalleCompra) {
//            modelo.addRow(new Object[]{detalleCompra.getIdDetalle(), detalleCompra.getCantidad(), detalleCompra.getPrecioCosto(), detalleCompra.getCompra().getIdCompra(),detalleCompra.getProducto().getNombreProducto(), detalleCompra.getProducto().getPrecioActual()});
//        }
//    refreshTable();
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbEliminarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarDActionPerformed
//        if (jtfIdCompra.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Debe ingresar un código de compra para eliminar");
//            return;
//        }
//
//        try {
//            int idCompra = Integer.parseInt(jtfIdCompra.getText());
//            Compra compraEliminar = compraData.buscarCompraPorId(idCompra);
//
//            if (compraEliminar != null) {
//                compraData.eliminarCompra(compraEliminar);
//                JOptionPane.showMessageDialog(this, "Compra eliminada correctamente");
//
//                limpiarCampos();
//                jbEliminarD.setEnabled(false);
//            } else {
//                JOptionPane.showMessageDialog(this, "No se encontró la Compra");
//            }
//        } catch (NumberFormatException ex) {
//            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido para el ID de compra");
//        }

    }//GEN-LAST:event_jbEliminarDActionPerformed

    private void jbComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbComprarActionPerformed

        try {

            // Obtener cantidad
            int cantidad = (int) jsCantidad.getValue();
            if (cantidad <= 0) {
                JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor a 0");
                return;
            }

            //Obtener proveedor
            Proveedor proveedor = new Proveedor();
            ProveedorData provdata = new ProveedorData();
            for (Proveedor buscar : provdata.listarProveedor()) {
                if (buscar.getRazonSocial().equals(jcbProveedores.getSelectedItem().toString())) {
                    proveedor = buscar;
                    break;
                }
            }

            // Obtener Fechas
            Date fechaDate = new Date(jdcFecha.getDate().getTime());
            Instant fechasInstant = fechaDate.toInstant();
            LocalDate fecha = fechasInstant.atZone(ZoneId.systemDefault()).toLocalDate();

            // Obtener Compra
            Compra compra = new Compra();
            compra.setProveedor(proveedor);
            compra.setFecha(fecha);
            CompraData comData = new CompraData();
            comData.guardarCompra(compra);
            //Se obtiene compra con Id        
            Compra compraFinal = comData.buscarUltimaCompra();

            // Obtener Producto
            Producto prod = new Producto();
            ProductoData prodata = new ProductoData();
            for (Producto busca : prodata.listarProductos()) {
                if (busca.getNombreProducto().equals(jcbProductos.getSelectedItem().toString())) {
                    prod = busca;
                    break;
                }
            }

            //Precio Final
            double precioTotal = prod.getPrecioActual() * cantidad;

            // Generar DetalleCompra
            DetalleCData detComData = new DetalleCData();
            DetalleCompra detCom = new DetalleCompra();
            detCom.setCantidad(cantidad);
            detCom.setCompra(compraFinal);
            detCom.setProducto(prod);
            detCom.setPrecioCosto(precioTotal);
            detComData.guardarDetalleCompra(detCom);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al ingresar los datos");
            return;
        }
        limpiarCampos();
    }//GEN-LAST:event_jbComprarActionPerformed

    private void jsCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsCantidadStateChanged
        actualizarLabel();
    }//GEN-LAST:event_jsCantidadStateChanged

    private void jcbProductosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbProductosItemStateChanged
        actualizarLabel();
    }//GEN-LAST:event_jcbProductosItemStateChanged

    private void cargarProveedores() {
        ProveedorData listaP = new ProveedorData();
        for (Proveedor item : listaP.listarProveedor()) {
            jcbProveedores.addItem(item);
        }
    }

    private void cargarProductos() {
        ProductoData listaProd = new ProductoData();
        for (Producto item : listaProd.listarProductos()) {
            jcbProductos.addItem(item);
        }
    }

    private void armarCabeceraTabla() {
        // ArrayList<Object> filaCabecera = new ArrayList<>();
        modelo.addColumn("Id");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio C");
        modelo.addColumn("Compra");
        modelo.addColumn("Poducto");
        jtTabla.setModel(modelo);
    }

    private void cargarTabla() {
//        borrarFilaTabla();
//        for (DetalleCompra it : listaD) {
//            modelo.addRow(new Object[]{it.getIdDetalle(), it.getCantidad(),
//                it.getPrecioCosto(), it.getCompra().getIdCompra(), it.getProducto()});
//        }
    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void limpiarCampos() {
        jcbProveedores.setSelectedIndex(-1);
        jdcFecha.setDate(null);
        jsCantidad.setValue(0);
        jcbProductos.setSelectedIndex(-1);
    }

    private boolean validarCamposVacios() {
        boolean flag = false;

        String campo1 = jcbProveedores.getSelectedItem().toString();
        String campo2 = jdcFecha.getDateFormatString();
        if (campo1.isEmpty() && campo2.isEmpty()) {
            flag = true;
        }
        return flag;
    }

    public void refreshTable() {
        jtTabla.repaint();
    }

    public void actualizarLabel() {

        int cantidad = (int) jsCantidad.getValue();

        // Obtener Producto
        Producto prod = new Producto();
        ProductoData prodata = new ProductoData();
        for (Producto busca : prodata.listarProductos()) {
            if (busca.getNombreProducto().equals(jcbProductos.getSelectedItem().toString())) {
                prod = busca;
                break;
            }
        }

        //Precio Final
        double precioTotal = prod.getPrecioActual() * cantidad;
        jlPrecioFinal.setText("Totaaaaal: $ " + precioTotal);
    }

    //
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jFecha;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLCantidad;
    private javax.swing.JLabel jLProducto;
    private javax.swing.JLabel jLProveedor;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbComprar;
    private javax.swing.JButton jbEliminarD;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Producto> jcbProductos;
    private javax.swing.JComboBox<Proveedor> jcbProveedores;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JLabel jlPrecioFinal;
    private javax.swing.JLabel jlTitulo1;
    private javax.swing.JLabel jlTitulo2;
    private javax.swing.JSpinner jsCantidad;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
}
