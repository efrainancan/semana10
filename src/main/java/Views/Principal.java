package Views;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eancan
 */
import models.Cliente;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public Principal() {
        Cliente cliente1= new Cliente("","Seleccione cliente",false);
        Cliente cliente2= new Cliente("76255645-2","Cliente1",true);
        Cliente cliente3= new Cliente("76255221-3","Cliente2",true);
        Cliente cliente4= new Cliente("76255643-6","Cliente3",true);
        
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        
        initComponents();
        
        /*for(clienteObj obj:clientes){
            
        }*/
        lstClientes.setModel(new DefaultComboBoxModel<>(new String []{}));
        
        for(int i=0; i<clientes.size();i++){
            System.out.println(clientes.get(i).getNombre()+" indice: "+ i);
            
            lstClientes.addItem(clientes.get(i).getNombre());
        }
       // lstClientes.setEnabled(rootPaneCheckingEnabled);
        /*
        lstClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] 
        { "Seleccione cliente", "Cliente 1", "Cliente 2" }));*/
        
        
        lstAutomoviles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] 
        { "Seleccione vehículo","Vehículo 1", "Vehículo 2" }));
        
        tblCuotasAPagar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
               
            },
            new String [] {
                "Número", "Valor", "¿Pagado?"
            }
        ));
        panelPrincipal.addTab("Menú principal", panelMenuPrincipal);       
        panelPrincipal.addTab("Ingreso cliente", panelMenuClientes);
        panelPrincipal.addTab("Pago de cuotas", panelMenuPagoCuotas);

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jMenu3 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        panelPrincipal = new javax.swing.JTabbedPane();
        panelMenuPrincipal = new javax.swing.JPanel();
        txtPrecioPorDia = new javax.swing.JTextField();
        lblCantidadCuotas = new javax.swing.JLabel();
        txtCantidadCuotas = new javax.swing.JTextField();
        btnGuardarArriendoYMostrarCuotas = new javax.swing.JButton();
        scrlTablaCuotasAPagar = new javax.swing.JScrollPane();
        tblCuotasAPagar = new javax.swing.JTable();
        btnPagarPrimeraCuota = new javax.swing.JButton();
        txtMontoAPagar = new javax.swing.JTextField();
        lstClientes = new javax.swing.JComboBox<>();
        lblTituloPanel1 = new javax.swing.JLabel();
        lstAutomoviles = new javax.swing.JComboBox<>();
        lblFechaArriendo = new javax.swing.JLabel();
        txtFechaArriendo = new javax.swing.JTextField();
        lblDias = new javax.swing.JLabel();
        lblPrecioPorDia = new javax.swing.JLabel();
        lblMontoAPagar = new javax.swing.JLabel();
        txtDias = new javax.swing.JTextField();
        panelMenuClientes = new javax.swing.JPanel();
        lbl_P2_Clientes = new javax.swing.JLabel();
        lbl_P2_Cedula = new javax.swing.JLabel();
        lbl_P2_Nombre = new javax.swing.JLabel();
        txt_P2_Cedula = new javax.swing.JTextField();
        txt_P2_Nombre = new javax.swing.JTextField();
        lbl_P2_vigente = new javax.swing.JLabel();
        btn_P2_vigente = new javax.swing.JToggleButton();
        panelMenuPagoCuotas = new javax.swing.JPanel();
        btn_P3_mostrarPagosArriendo = new javax.swing.JButton();
        lbl_P3_seleccioneArriendo = new javax.swing.JLabel();
        lst_P3_seleccioneCliente = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        btn_P3_RealizarPago = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu3.setText("jMenu3");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCantidadCuotas.setText("Cantidad de cuotas");

        btnGuardarArriendoYMostrarCuotas.setText("Guardar arriendo y mostrar cuotas >>");

        tblCuotasAPagar.setModel(new javax.swing.table.DefaultTableModel(
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
        scrlTablaCuotasAPagar.setViewportView(tblCuotasAPagar);

        btnPagarPrimeraCuota.setLabel("Pagar Primera Cuota");
        btnPagarPrimeraCuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarPrimeraCuotaActionPerformed(evt);
            }
        });

        txtMontoAPagar.setToolTipText("");

        lstClientes.setToolTipText("");
        lstClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstClientesActionPerformed(evt);
            }
        });

        lblTituloPanel1.setText("ARRIENDO CON CUOTAS");
        lblTituloPanel1.setMaximumSize(new java.awt.Dimension(122, 16));
        lblTituloPanel1.setMinimumSize(new java.awt.Dimension(122, 16));
        lblTituloPanel1.setPreferredSize(new java.awt.Dimension(122, 16));

        lstAutomoviles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstAutomovilesActionPerformed(evt);
            }
        });

        lblFechaArriendo.setText("Fecha de arriendo");

        txtFechaArriendo.setToolTipText("");

        lblDias.setText("Días");

        lblPrecioPorDia.setText("Precio por día");

        lblMontoAPagar.setText("Monto a pagar");

        javax.swing.GroupLayout panelMenuPrincipalLayout = new javax.swing.GroupLayout(panelMenuPrincipal);
        panelMenuPrincipal.setLayout(panelMenuPrincipalLayout);
        panelMenuPrincipalLayout.setHorizontalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTituloPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                                .addComponent(lstClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(lstAutomoviles, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                        .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDias)
                            .addComponent(lblFechaArriendo)
                            .addComponent(lblPrecioPorDia)
                            .addComponent(lblMontoAPagar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDias, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaArriendo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioPorDia)
                            .addComponent(txtMontoAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                                .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                                        .addComponent(lblCantidadCuotas)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCantidadCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnGuardarArriendoYMostrarCuotas))
                                .addGap(18, 18, 18)
                                .addComponent(scrlTablaCuotasAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPagarPrimeraCuota))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        panelMenuPrincipalLayout.setVerticalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                .addComponent(lblTituloPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lstClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lstAutomoviles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                        .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaArriendo)
                            .addComponent(txtFechaArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCantidadCuotas)
                            .addComponent(txtCantidadCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDias)
                            .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarArriendoYMostrarCuotas))
                        .addGap(34, 34, 34)
                        .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecioPorDia)
                            .addComponent(txtPrecioPorDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMontoAPagar)
                            .addComponent(txtMontoAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                        .addComponent(scrlTablaCuotasAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPagarPrimeraCuota)))
                .addGap(0, 83, Short.MAX_VALUE))
        );

        lblTituloPanel1.getAccessibleContext().setAccessibleDescription("");

        panelPrincipal.addTab("tab1", panelMenuPrincipal);

        lbl_P2_Clientes.setText("CLIENTES");

        lbl_P2_Cedula.setText("Cédula:");

        lbl_P2_Nombre.setText("Nombre:");

        txt_P2_Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_P2_CedulaActionPerformed(evt);
            }
        });

        lbl_P2_vigente.setText("¿Vigente?:");

        btn_P2_vigente.setText("Si");

        javax.swing.GroupLayout panelMenuClientesLayout = new javax.swing.GroupLayout(panelMenuClientes);
        panelMenuClientes.setLayout(panelMenuClientesLayout);
        panelMenuClientesLayout.setHorizontalGroup(
            panelMenuClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuClientesLayout.createSequentialGroup()
                .addGroup(panelMenuClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuClientesLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelMenuClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_P2_Nombre)
                            .addComponent(lbl_P2_Cedula)
                            .addComponent(lbl_P2_Clientes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelMenuClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_P2_Cedula, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(txt_P2_Nombre)))
                    .addGroup(panelMenuClientesLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(lbl_P2_vigente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_P2_vigente)))
                .addContainerGap(553, Short.MAX_VALUE))
        );
        panelMenuClientesLayout.setVerticalGroup(
            panelMenuClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_P2_Clientes)
                .addGap(31, 31, 31)
                .addGroup(panelMenuClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_P2_Cedula)
                    .addComponent(txt_P2_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMenuClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_P2_Nombre)
                    .addComponent(txt_P2_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelMenuClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_P2_vigente)
                    .addComponent(btn_P2_vigente))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        panelPrincipal.addTab("tab2", panelMenuClientes);

        btn_P3_mostrarPagosArriendo.setText("Mostrar pagos arriendo seleccionado >>>");
        btn_P3_mostrarPagosArriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_P3_mostrarPagosArriendoActionPerformed(evt);
            }
        });

        lbl_P3_seleccioneArriendo.setText("Seleccione arriendo:");

        lst_P3_seleccioneCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        btn_P3_RealizarPago.setText("Realizar Pago");

        jLabel12.setText("PAGOS");

        javax.swing.GroupLayout panelMenuPagoCuotasLayout = new javax.swing.GroupLayout(panelMenuPagoCuotas);
        panelMenuPagoCuotas.setLayout(panelMenuPagoCuotasLayout);
        panelMenuPagoCuotasLayout.setHorizontalGroup(
            panelMenuPagoCuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuPagoCuotasLayout.createSequentialGroup()
                .addGroup(panelMenuPagoCuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMenuPagoCuotasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_P3_RealizarPago))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMenuPagoCuotasLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(lst_P3_seleccioneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMenuPagoCuotasLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panelMenuPagoCuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMenuPagoCuotasLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btn_P3_mostrarPagosArriendo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMenuPagoCuotasLayout.createSequentialGroup()
                                .addComponent(lbl_P3_seleccioneArriendo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(98, 98, 98)))))
                .addGap(68, 68, 68))
        );
        panelMenuPagoCuotasLayout.setVerticalGroup(
            panelMenuPagoCuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuPagoCuotasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lst_P3_seleccioneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(panelMenuPagoCuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_P3_seleccioneArriendo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(panelMenuPagoCuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuPagoCuotasLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btn_P3_mostrarPagosArriendo))
                    .addGroup(panelMenuPagoCuotasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMenuPagoCuotasLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panelMenuPagoCuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuPagoCuotasLayout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addGap(100, 100, 100)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_P3_RealizarPago)
                .addGap(6, 6, 6))
        );

        panelPrincipal.addTab("tab3", panelMenuPagoCuotas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal)
                .addGap(35, 35, 35))
        );

        panelPrincipal.getAccessibleContext().setAccessibleName("Menú principal");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstClientesActionPerformed
        // TODO add yodsfur handling code here:
        
        System.out.println(lstClientes.getSelectedItem());
        System.out.println(lstClientes.getSelectedIndex());
    }//GEN-LAST:event_lstClientesActionPerformed

    private void lstAutomovilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstAutomovilesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lstAutomovilesActionPerformed

    private void btnPagarPrimeraCuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarPrimeraCuotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPagarPrimeraCuotaActionPerformed

    private void txt_P2_CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_P2_CedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_P2_CedulaActionPerformed

    private void btn_P3_mostrarPagosArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_P3_mostrarPagosArriendoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_P3_mostrarPagosArriendoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarArriendoYMostrarCuotas;
    private javax.swing.JButton btnPagarPrimeraCuota;
    private javax.swing.JToggleButton btn_P2_vigente;
    private javax.swing.JButton btn_P3_RealizarPago;
    private javax.swing.JButton btn_P3_mostrarPagosArriendo;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblCantidadCuotas;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblFechaArriendo;
    private javax.swing.JLabel lblMontoAPagar;
    private javax.swing.JLabel lblPrecioPorDia;
    private javax.swing.JLabel lblTituloPanel1;
    private javax.swing.JLabel lbl_P2_Cedula;
    private javax.swing.JLabel lbl_P2_Clientes;
    private javax.swing.JLabel lbl_P2_Nombre;
    private javax.swing.JLabel lbl_P2_vigente;
    private javax.swing.JLabel lbl_P3_seleccioneArriendo;
    private javax.swing.JComboBox<String> lstAutomoviles;
    private javax.swing.JComboBox<String> lstClientes;
    private javax.swing.JComboBox<String> lst_P3_seleccioneCliente;
    private javax.swing.JPanel panelMenuClientes;
    private javax.swing.JPanel panelMenuPagoCuotas;
    private javax.swing.JPanel panelMenuPrincipal;
    private javax.swing.JTabbedPane panelPrincipal;
    private javax.swing.JScrollPane scrlTablaCuotasAPagar;
    private javax.swing.JTable tblCuotasAPagar;
    private javax.swing.JTextField txtCantidadCuotas;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtFechaArriendo;
    private javax.swing.JTextField txtMontoAPagar;
    private javax.swing.JTextField txtPrecioPorDia;
    private javax.swing.JTextField txt_P2_Cedula;
    private javax.swing.JTextField txt_P2_Nombre;
    // End of variables declaration//GEN-END:variables
}
