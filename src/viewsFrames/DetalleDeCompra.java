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
import java.util.Date;
import java.time.LocalDate;
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

    private ArrayList<Compra> listaC;
    private ArrayList<DetalleCompra> listaD;
    private ArrayList<Proveedor> listaP;
    private ArrayList<Producto> listaProd;
    private CompraData compraData;
    private DetalleCData detalleData;
    private ProveedorData provData;
    private ProductoData prodData;
    private DefaultTableModel modelo;
    private Compra nuevaCompra;
    private Proveedor nuevoProv;
    private Producto nuevoProd;
    private DetalleCompra nuevoDet;

    public DetalleDeCompra() {
        initComponents();
        this.setTitle("Realizar una Compra");
        compraData = new CompraData();
        detalleData = new DetalleCData();
        provData = new ProveedorData();
        prodData = new ProductoData();
        modelo = new DefaultTableModel();
        listaC = (ArrayList<Compra>) compraData.listarCompras();
        listaP = (ArrayList<Proveedor>) provData.listarProveedor();
        listaD = (ArrayList<DetalleCompra>) detalleData.listarDetalleCompras();
        listaProd = (ArrayList<Producto>) prodData.listarProductos();
        nuevaCompra = null;
        nuevoProv = null;
        nuevoProd = null;
        nuevoDet = null;

        enableRealizar(false);
        jtfIdCompra.setEnabled(true);
        jbBuscarC.setEnabled(true);
        jbModificarC.setVisible(false);

        armarCabeceraTabla();
        cargarTabla();
        cargarProveedores();

        cargarProductos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jbBuscarC = new javax.swing.JButton();
        jbModificarC = new javax.swing.JButton();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jcbProveedores = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfIdCompra = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        jbGuardarC = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jbEliminarD = new javax.swing.JButton();
        jlPrecio = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jcbProductos = new javax.swing.JComboBox<>();
        jbComprar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jsCantidad = new javax.swing.JSpinner();
        jlIdCompra = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jlProveedor = new javax.swing.JLabel();
        jbTotal = new javax.swing.JButton();

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

        jDesktopPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbBuscarC.setText("Buscar");
        jbBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarCActionPerformed(evt);
            }
        });

        jbModificarC.setText("Modificar");
        jbModificarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarCActionPerformed(evt);
            }
        });

        jdcFecha.setEnabled(false);

        jcbProveedores.setEnabled(false);
        jcbProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProveedoresActionPerformed(evt);
            }
        });

        jLabel4.setText("Proveedor:");

        jLabel3.setText("Buscar por código");

        jbNuevo.setForeground(new java.awt.Color(60, 63, 65));
        jbNuevo.setText("Nueva Compra");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardarC.setText("Generar");
        jbGuardarC.setEnabled(false);
        jbGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarCActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha:");

        jDesktopPane1.setLayer(jbBuscarC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbModificarC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jdcFecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcbProveedores, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfIdCompra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbGuardarC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jbGuardarC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbModificarC))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jtfIdCompra)
                                            .addComponent(jdcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jbBuscarC))))
                            .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(15, 15, 15)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarC)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardarC)
                    .addComponent(jbModificarC))
                .addContainerGap())
        );

        jbEliminarD.setText("Eliminar Compra");
        jbEliminarD.setEnabled(false);
        jbEliminarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarDActionPerformed(evt);
            }
        });

        jlPrecio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlPrecio.setText("Total: $ ");

        jLabel10.setText("Producto:");

        jcbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProductosActionPerformed(evt);
            }
        });
        jcbProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcbProductosKeyReleased(evt);
            }
        });

        jbComprar.setText("Comprar");
        jbComprar.setEnabled(false);
        jbComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbComprarActionPerformed(evt);
            }
        });

        jLabel8.setText("Cantidad:");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DETALLE DE COMPRAS REGISTRADAS");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GENERAR CÓDIGO DE  COMPRA");

        jsCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jsCantidadKeyReleased(evt);
            }
        });

        jlIdCompra.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jlIdCompra.setForeground(new java.awt.Color(255, 255, 255));
        jlIdCompra.setText("N° Compra: ");

        jlFecha.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jlFecha.setForeground(new java.awt.Color(255, 255, 255));
        jlFecha.setText("Fecha: ");

        jlProveedor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jlProveedor.setForeground(new java.awt.Color(255, 255, 255));
        jlProveedor.setText("Proveedor: ");

        jbTotal.setText("Calcular Precio");
        jbTotal.setEnabled(false);
        jbTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlFecha)
                                .addGap(18, 18, 18)
                                .addComponent(jlProveedor)
                                .addGap(18, 18, 18)
                                .addComponent(jlIdCompra))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbComprar)
                                .addGap(43, 43, 43)
                                .addComponent(jbEliminarD)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbSalir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbActualizar)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbTotal)
                        .addGap(18, 18, 18)
                        .addComponent(jlPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlIdCompra)
                            .addComponent(jlFecha)
                            .addComponent(jlProveedor))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbTotal)
                    .addComponent(jlPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminarD)
                    .addComponent(jbSalir))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        borrarFilaTabla();
        List<DetalleCompra> listaDetalleCompra = detalleData.listarDetalleCompras();
        for (DetalleCompra detalleCompra : listaDetalleCompra) {
            modelo.addRow(new Object[]{detalleCompra.getIdDetalle(), detalleCompra.getCantidad(), detalleCompra.getPrecioCosto(), detalleCompra.getCompra().getIdCompra(),detalleCompra.getProducto().getNombreProducto(), detalleCompra.getProducto().getPrecioActual()});
        }
    refreshTable();
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbEliminarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarDActionPerformed
        if (jtfIdCompra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código de compra para eliminar");
            return;
        }

        try {
            int idCompra = Integer.parseInt(jtfIdCompra.getText());
            Compra compraEliminar = compraData.buscarCompraPorId(idCompra);

            if (compraEliminar != null) {
                compraData.eliminarCompra(compraEliminar);
                JOptionPane.showMessageDialog(this, "Compra eliminada correctamente");

                limpiarCampos();
                jbEliminarD.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró la Compra");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido para el ID de compra");
        }

    }//GEN-LAST:event_jbEliminarDActionPerformed

    private void jbModificarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarCActionPerformed
        if (jtfIdCompra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID de compra");
            return;
        }

        try {
            int idCompra = Integer.parseInt(jtfIdCompra.getText());
            Compra compra = compraData.buscarCompraPorId(idCompra);

            if (compra != null) {
                jdcFecha.setDate(Date.from(compra.getFecha().atStartOfDay(ZoneId.systemDefault()).toInstant()));

                for (int i = 0; i < jcbProveedores.getItemCount(); i++) {
                    if (jcbProveedores.getItemAt(i).getIdProveedor() == compra.getProveedor().getIdProveedor()) {
                        jcbProveedores.setSelectedIndex(i);
                        break;
                    }
                }
                enableNuevo(true);

            } else {
                JOptionPane.showMessageDialog(this, "Compra no encontrada");
                jdcFecha.setDate(null);
                jcbProveedores.setSelectedIndex(-1);

                enableNuevo(false);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para el ID de compra");
        }
    }//GEN-LAST:event_jbModificarCActionPerformed

    private void jbBuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarCActionPerformed
        if (jtfIdCompra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código de compra para modificar");
            return;
        } else {
            try {
                int id = Integer.parseInt(jtfIdCompra.getText());
                nuevaCompra = compraData.buscarCompraPorId(id);

                if (nuevaCompra != null) {
                    if (nuevaCompra.getIdCompra() == id) {
                        jbModificarC.setVisible(true);
                        jbEliminarD.setEnabled(true); 
                        enableNuevo(true);
                        jbGuardarC.setEnabled(false);
                        for (int i = 0; i == jcbProveedores.getItemCount(); i++) {
                            if (jcbProveedores.getItemAt(i).getRazonSocial() == nuevaCompra.getProveedor().getRazonSocial()) {
                                jcbProveedores.setSelectedIndex(i);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "No se encontró la Compra");
                        jbEliminarD.setEnabled(false); 
                    }
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Debe ingresar un número");
                jbEliminarD.setEnabled(false);
            }
        }

    }//GEN-LAST:event_jbBuscarCActionPerformed

    private void jcbProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbProveedoresActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        Object[] options = {"Si", "No"};
        if (validarCamposVacios() == false) {
            int confirm = JOptionPane.showOptionDialog(null, "¿Desea realizar una Compra? ", "",//contenido de la ventana,icon,msg,title
                    JOptionPane.YES_NO_CANCEL_OPTION, //3 botones si,otro,cancel
                    JOptionPane.QUESTION_MESSAGE,//tipo de icono
                    null, //null para icono por defecto
                    options,//objeto para las opciones
                    options[0]);//seleccion predeterminada
            if (confirm == 0) {
                limpiarCampos();
                enableNuevo(true);
                jtfIdCompra.setEnabled(false);
                jbBuscarC.setEnabled(false);
            }
        } else {
            limpiarCampos();
            enableNuevo(true);
            jtfIdCompra.setEnabled(false);
            jbBuscarC.setEnabled(false);
        }
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarCActionPerformed
        //GUARDAR COMPRA
        int id = 0;
        LocalDate fechaCompra;
        Date fecha;
        String prov;
        try {
            prov = jcbProveedores.getSelectedItem().toString();
            fecha = jdcFecha.getDate();
            fechaCompra = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (prov.isEmpty() || fecha.toString().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No debe haber campos vacíos");
                return;
            }

            for (Proveedor it : listaP) { //busca el proveedor en lista de prov y extrae el ID
                if (it.getRazonSocial().equals(prov)) {
                    System.out.println("Encontrado");
                    id = it.getIdProveedor();
                }
            }

            nuevoProv = provData.buscarProveedorPorId(id);

            if (nuevaCompra == null) {
                nuevaCompra = new Compra(nuevoProv, fechaCompra);
                compraData.guardarCompra(nuevaCompra);
            } else {
                nuevaCompra.setProveedor(nuevoProv);
                nuevaCompra.setFecha(fechaCompra);
                compraData.modificarCompra(nuevaCompra);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al ingresar los datos");
            return;
        }
        limpiarCampos();
        enableNuevo(false);
        //REALIZAR COMPRA
        enableRealizar(true);

        String fechaS = fechaCompra.toString();
        jlFecha.setText("Fecha: " + fechaS);
        jlProveedor.setText("Proveedor: " + prov);
        jlIdCompra.setText("N° Compra: " + id);

        jbComprar.setEnabled(true);
        jbTotal.setEnabled(true);
    }//GEN-LAST:event_jbGuardarCActionPerformed

    private void jcbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProductosActionPerformed

    }//GEN-LAST:event_jcbProductosActionPerformed

    private void jbComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbComprarActionPerformed
        nuevoProd = new Producto();
        double precioC;

        if (jsCantidad.equals(0)) {
            JOptionPane.showMessageDialog(this, "No debe haber campos vacíos");
            return;
        } else {
            try {
                int cant = Integer.parseInt(jsCantidad.getValue().toString());
                String nombre = jcbProductos.getSelectedItem().toString();
                for (Producto it : listaProd) {
                    if (it.getNombreProducto().equals(nombre)) {
                        nuevoProd.setIdProdcuto(it.getIdProdcuto());
                        nuevoProd.setNombreProducto(it.getNombreProducto());
                        nuevoProd.setDescripcion(it.getDescripcion());
                        nuevoProd.setPrecioActual(it.getPrecioActual());
                        nuevoProd.setStock(it.getStock());
                        nuevoProd.setEstado(it.isEstado());
                    }
                }
                precioC = nuevoProd.getPrecioActual();

                //int cantidad, double precioCosto, Compra compra, Producto producto
                nuevoDet = new DetalleCompra(cant, precioC, nuevaCompra, nuevoProd);
                detalleData.guardarDetalleCompra(nuevoDet);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error al ingresar los datos");
                return;
            }
            enableRealizar(false);
            jbComprar.setEnabled(false);
            enableNuevo(true);
            limpiarCampos();
        }
    }//GEN-LAST:event_jbComprarActionPerformed

    private void jsCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jsCantidadKeyReleased

    }//GEN-LAST:event_jsCantidadKeyReleased

    private void jbTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTotalActionPerformed

        if (!jsCantidad.getValue().equals(0) && jcbProductos.getSelectedIndex() > -1) {
            double precio = 0;
            for (Producto it : listaProd) {
                if (it.getNombreProducto().equals(jcbProductos.getSelectedItem().toString())) {
                    precio = it.getPrecioActual();
                    System.out.println(precio);
                }
            }
            int cant = Integer.parseInt(jsCantidad.getValue().toString());
            double total = precio * cant;
            System.out.println(total);
            jlPrecio.setText("Total: $ " + String.valueOf(total));
        }

    }//GEN-LAST:event_jbTotalActionPerformed

    private void jcbProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbProductosKeyReleased

    }//GEN-LAST:event_jcbProductosKeyReleased

    private void cargarProveedores() {
        for (Proveedor item : listaP) {
            jcbProveedores.addItem(item);
        }
    }

    private void cargarProductos() {
        for (Producto item : listaProd) {
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
        borrarFilaTabla();
        for (DetalleCompra it : listaD) {
            modelo.addRow(new Object[]{it.getIdDetalle(), it.getCantidad(),
                it.getPrecioCosto(), it.getCompra().getIdCompra(), it.getProducto()});
        }
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
        jtfIdCompra.setText("");
        jsCantidad.setValue(0);
        jcbProductos.setSelectedIndex(-1);
        // prodEncontrado = null;
        jlFecha.setText("Fecha: ");
        jlProveedor.setText("Proveedor: ");
        jlIdCompra.setText("Id Compra: ");
    }

    private void enableNuevo(boolean flag) {
        jcbProveedores.setEnabled(flag);
        jdcFecha.setEnabled(flag);
        //jbActualizar.setEnabled(flag);
        jbGuardarC.setEnabled(flag);
        jtfIdCompra.setEnabled(flag);
    }

    private void enableRealizar(boolean flag) {

        jsCantidad.setEnabled(flag);
        jcbProductos.setEnabled(flag);
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

    //
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBuscarC;
    private javax.swing.JButton jbComprar;
    private javax.swing.JButton jbEliminarD;
    private javax.swing.JButton jbGuardarC;
    private javax.swing.JButton jbModificarC;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbTotal;
    private javax.swing.JComboBox<Producto> jcbProductos;
    private javax.swing.JComboBox<Proveedor> jcbProveedores;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlIdCompra;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JLabel jlProveedor;
    private javax.swing.JSpinner jsCantidad;
    private javax.swing.JTable jtTabla;
    private javax.swing.JTextField jtfIdCompra;
    // End of variables declaration//GEN-END:variables
}
