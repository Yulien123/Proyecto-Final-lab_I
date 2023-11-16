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
        
        enableRealizar(false);
        jtfIdCompra.setEnabled(true);
        jbBuscarC.setEnabled(true);
        jbModificarC.setVisible(false);

        armarCabeceraTabla();
        cargarTabla();
        cargarProveedores();
        cargarCompras();
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
        jbModificarD = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbActualizar = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jbEliminarC = new javax.swing.JButton();
        jbGuardarC = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbBuscarC = new javax.swing.JButton();
        jbModificarC = new javax.swing.JButton();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jcbProveedores = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfIdCompra = new javax.swing.JTextField();
        jbEliminarD = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfCantidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfPrecioCosto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jcbProductos = new javax.swing.JComboBox<>();
        jcbCompras = new javax.swing.JComboBox<>();
        jbComprar = new javax.swing.JButton();

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
        setPreferredSize(new java.awt.Dimension(522, 530));

        jScrollPane1.setViewportView(jtTabla);
        if (jtTabla.getColumnModel().getColumnCount() > 0) {
            jtTabla.getColumnModel().getColumn(0).setHeaderValue("ID");
            jtTabla.getColumnModel().getColumn(1).setHeaderValue("Cantidad");
            jtTabla.getColumnModel().getColumn(2).setHeaderValue("Precio C");
            jtTabla.getColumnModel().getColumn(3).setHeaderValue("Compra");
            jtTabla.getColumnModel().getColumn(4).setHeaderValue("Producto");
            jtTabla.getColumnModel().getColumn(5).setHeaderValue("Estado");
        }

        jbModificarD.setText("Modificar");
        jbModificarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarDActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Detalles de compra registrados");

        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jDesktopPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbEliminarC.setText("Eliminar");
        jbEliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarCActionPerformed(evt);
            }
        });

        jbGuardarC.setText("Guardar");
        jbGuardarC.setEnabled(false);
        jbGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarCActionPerformed(evt);
            }
        });

        jbNuevo.setForeground(new java.awt.Color(60, 63, 65));
        jbNuevo.setText("Nueva Compra");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GENERAR CÓDIGO DE  COMPRA");

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

        jLabel6.setText("Fecha:");

        jcbProveedores.setEnabled(false);
        jcbProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProveedoresActionPerformed(evt);
            }
        });

        jLabel4.setText("Proveedor:");

        jLabel3.setText("Codigo de Compra:");

        jDesktopPane1.setLayer(jbEliminarC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbGuardarC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbBuscarC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbModificarC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jdcFecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcbProveedores, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfIdCompra, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jbNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardarC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jbEliminarC)
                        .addGap(77, 77, 77)
                        .addComponent(jbModificarC))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jbBuscarC)))
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(174, 174, 174))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jbBuscarC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(35, 35, 35)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbEliminarC)
                            .addComponent(jbGuardarC)
                            .addComponent(jbModificarC)
                            .addComponent(jbNuevo))
                        .addGap(17, 17, 17))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jtfIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jbEliminarD.setText("Eliminar");
        jbEliminarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarDActionPerformed(evt);
            }
        });

        jLabel7.setText("Compras:");

        jLabel8.setText("Cantidad:");

        jLabel9.setText("Precio costo:");

        jtfPrecioCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPrecioCostoActionPerformed(evt);
            }
        });

        jLabel10.setText("Poducto:");

        jcbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProductosActionPerformed(evt);
            }
        });

        jcbCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbComprasActionPerformed(evt);
            }
        });

        jbComprar.setText("Comprar");
        jbComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfCantidad)
                                            .addComponent(jtfPrecioCosto))
                                        .addGap(62, 62, 62))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel10))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(jcbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jcbCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(196, 196, 196))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbComprar)
                                .addGap(40, 40, 40)
                                .addComponent(jbModificarD)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(503, 503, 503)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jbEliminarD))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbActualizar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1)))
                                .addGap(18, 18, 18)
                                .addComponent(jbSalir)
                                .addGap(157, 157, 157))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcbCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtfPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jcbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificarD)
                    .addComponent(jbEliminarD)
                    .addComponent(jbSalir)
                    .addComponent(jbComprar))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jbActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbModificarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbModificarDActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        borrarFilaTabla();
        cargarTabla();
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbEliminarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEliminarDActionPerformed

    private void jbModificarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarCActionPerformed

        // Proveedor prov=null;
        if (jtfIdCompra.getText().isEmpty() || jdcFecha.getDateFormatString().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No pueden haber campos vacios");
            return;
        }

        try {
            int id = Integer.parseInt(jtfIdCompra.getText());
            String razon = jcbProveedores.getSelectedItem().toString();
            Date fecha = jdcFecha.getDate();
            LocalDate fechaCompra = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            for (Proveedor it : listaP) {
                if (it.getIdProveedor() == id) {
                    int idP = it.getIdProveedor();
                    nuevoProv = provData.buscarProveedorPorId(idP);
                }
            }

            nuevaCompra = new Compra(id, nuevoProv, fechaCompra, true);

            compraData.modificarCompra(nuevaCompra);
            limpiarCampos();
            jbModificarC.setEnabled(false);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número");
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
                        enableNuevo(true);
                        jbGuardarC.setEnabled(false);
                        jbEliminarC.setEnabled(false);
                        Proveedor prov = nuevaCompra.getProveedor();
                        jcbProveedores.setSelectedItem(prov);
                        
                        //mostrar en combobox el item que corresponda.
                    }else{
                        JOptionPane.showMessageDialog(this, "No se encontró la Compra");
                    }
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Debe ingresar un número");
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

        try {
            String prov = jcbProveedores.getSelectedItem().toString();
            Date fecha = jdcFecha.getDate();
            LocalDate fechaCompra = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

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
        jcbProductos.setSelectedItem(nuevaCompra);
        
    }//GEN-LAST:event_jbGuardarCActionPerformed

    private void jbEliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarCActionPerformed
        if (nuevaCompra != null) {
            compraData.eliminarCompra(nuevaCompra);
            nuevaCompra = null;
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "No hay un compra seleccionada.");
        }
    }//GEN-LAST:event_jbEliminarCActionPerformed

    private void jtfPrecioCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPrecioCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPrecioCostoActionPerformed

    private void jcbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbProductosActionPerformed

    private void jcbComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbComprasActionPerformed

    private void jbComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbComprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbComprarActionPerformed

    private void cargarProveedores() {
        for (Proveedor item : listaP) {
            jcbProveedores.addItem(item);
        }
    }

    private void cargarProductos() {
        for (Proveedor item : listaP) {
            jcbProveedores.addItem(item);
        }
    }

    private void cargarCompras() {
        for (Compra it : listaC) {
            jcbCompras.addItem(it);
        }
    }

    private void armarCabeceraTabla() {
        // ArrayList<Object> filaCabecera = new ArrayList<>();
        modelo.addColumn("Id");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio C");
        modelo.addColumn("Compra");
        modelo.addColumn("Poducto");
        modelo.addColumn("Estado");
        jtTabla.setModel(modelo);
    }

    private void cargarTabla() {
        borrarFilaTabla();
        for (DetalleCompra it : listaD) {
            modelo.addRow(new Object[]{it.getIdDetalle(), it.getCantidad(),
                it.getPrecioCosto(), it.getCompra().toString(), it.getProducto().getNombreProducto(), it.isEstado()});
        }
    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void limpiarCampos() {
        jcbProveedores.setSelectedIndex(0);
        jdcFecha.setDate(null);

        jtfIdCompra.setText("");
        // prodEncontrado = null;
    }

    private void enableNuevo(boolean flag) {
        jcbProveedores.setEnabled(flag);
        jdcFecha.setEnabled(flag);
        //jbActualizar.setEnabled(flag);
        jbEliminarC.setEnabled(flag);
        jbGuardarC.setEnabled(flag);
        jtfIdCompra.setEnabled(flag);
    }

    private void enableRealizar(boolean flag) {
        jcbCompras.setEnabled(flag);
        jtfCantidad.setEnabled(flag);
        jtfPrecioCosto.setEnabled(flag);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBuscarC;
    private javax.swing.JButton jbComprar;
    private javax.swing.JButton jbEliminarC;
    private javax.swing.JButton jbEliminarD;
    private javax.swing.JButton jbGuardarC;
    private javax.swing.JButton jbModificarC;
    private javax.swing.JButton jbModificarD;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Compra> jcbCompras;
    private javax.swing.JComboBox<Producto> jcbProductos;
    private javax.swing.JComboBox<Proveedor> jcbProveedores;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JTable jtTabla;
    private javax.swing.JTextField jtfCantidad;
    private javax.swing.JTextField jtfIdCompra;
    private javax.swing.JTextField jtfPrecioCosto;
    // End of variables declaration//GEN-END:variables
}
