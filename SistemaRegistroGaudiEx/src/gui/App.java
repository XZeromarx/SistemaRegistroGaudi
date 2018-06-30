/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Autor;
import model.Data;
import model.Sala;

/**
 *
 * @author XZeromarxPC
 */
public class App extends javax.swing.JFrame {

    Data d;

    public App() throws ClassNotFoundException, SQLException {
        d = new Data();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGBusqueda = new javax.swing.ButtonGroup();
        vtnPrincipal = new javax.swing.JFrame();
        tabPrincipal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombrePintura = new javax.swing.JTextField();
        spAnioCreacion = new javax.swing.JSpinner();
        cmbGenero = new javax.swing.JComboBox<>();
        cmbTecnica = new javax.swing.JComboBox<>();
        txtTamanio = new javax.swing.JTextField();
        cmbUbicacion = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbEncargado = new javax.swing.JComboBox<>();
        cmbAutores = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInformacion = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtBuscarNombre = new javax.swing.JTextField();
        txtBuscarID = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        rdNombre = new javax.swing.JRadioButton();
        rdId = new javax.swing.JRadioButton();
        btnMostrarTodo = new javax.swing.JButton();
        pnllogin = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();

        vtnPrincipal.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabPrincipal.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Autor:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Técnica:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Género:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Año de creación:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nombre de pintura:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Tamaño (Ancho x alto):");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Ubicación:");

        spAnioCreacion.setModel(new javax.swing.SpinnerNumberModel(0, 0, 2018, 1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel11.setText("Porfavor separar ancho y alto con una X, si no lo hace");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Encargado:");

        jLabel9.setText("se le agregará el mismo valor al otro lado de la X");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(114, 114, 114)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spAnioCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombrePintura, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cmbEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbTecnica, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(121, 121, 121))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(394, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbTecnica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(txtNombrePintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(spAnioCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cmbEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabPrincipal.addTab("Registro de Obras de Arte", jPanel1);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tblInformacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblInformacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Autor", "Técnica", "Género", "Año de creación", "Nombre pintura", "Tamaño", "Ubicación", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInformacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tblInformacionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tblInformacion);
        if (tblInformacion.getColumnModel().getColumnCount() > 0) {
            tblInformacion.getColumnModel().getColumn(0).setResizable(false);
            tblInformacion.getColumnModel().getColumn(1).setResizable(false);
            tblInformacion.getColumnModel().getColumn(2).setResizable(false);
            tblInformacion.getColumnModel().getColumn(3).setResizable(false);
            tblInformacion.getColumnModel().getColumn(4).setResizable(false);
            tblInformacion.getColumnModel().getColumn(5).setResizable(false);
            tblInformacion.getColumnModel().getColumn(6).setResizable(false);
            tblInformacion.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Buscar Obra de arte", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Por Nombre:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Por ID:");

        txtBuscarNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarNombreMouseClicked(evt);
            }
        });

        txtBuscarID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarIDMouseClicked(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("   \n\n   SI DESEA ELIMINAR UN REGISTRO DE\n   UNA OBRA DE ARTE, SELECCIONELA\n   Y A CONTINUACION PRESIONE LA\n   TECLA SUPRIMIR.\n");
        jTextArea1.setBorder(null);
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea1);

        btnGBusqueda.add(rdNombre);
        rdNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNombreActionPerformed(evt);
            }
        });

        btnGBusqueda.add(rdId);
        rdId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdIdActionPerformed(evt);
            }
        });

        btnMostrarTodo.setText("Mostrar Todo");
        btnMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBuscarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(txtBuscarID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdNombre)
                            .addComponent(rdId)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostrarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdId))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrarTodo))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabPrincipal.addTab("Consultas de Obras de Arte", jPanel3);

        javax.swing.GroupLayout vtnPrincipalLayout = new javax.swing.GroupLayout(vtnPrincipal.getContentPane());
        vtnPrincipal.getContentPane().setLayout(vtnPrincipalLayout);
        vtnPrincipalLayout.setHorizontalGroup(
            vtnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 879, Short.MAX_VALUE)
            .addGroup(vtnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(vtnPrincipalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tabPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        vtnPrincipalLayout.setVerticalGroup(
            vtnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(vtnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(vtnPrincipalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tabPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnllogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel10.setText("Usuario:");

        jLabel12.setText("Clave:");

        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlloginLayout = new javax.swing.GroupLayout(pnllogin);
        pnllogin.setLayout(pnlloginLayout);
        pnlloginLayout.setHorizontalGroup(
            pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlloginLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addGroup(pnlloginLayout.createSequentialGroup()
                        .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser)
                            .addComponent(txtPass))))
                .addContainerGap())
        );
        pnlloginLayout.setVerticalGroup(
            pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlloginLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnIngresar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnllogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnllogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        try {
            registrarObraDeArte(cmbAutores.getSelectedItem().toString(),
                    txtNombrePintura.getText(),
                    cmbTecnica.getSelectedItem().toString(),
                    cmbGenero.getSelectedItem().toString(),
                    Integer.parseInt(spAnioCreacion.getValue().toString()),
                    txtTamanio.getText(),
                    cmbUbicacion.getSelectedItem().toString());
            cmbAutores.setSelectedIndex(0);
            cmbEncargado.setSelectedIndex(0);
            cmbGenero.setSelectedIndex(0);
            cmbTecnica.setSelectedIndex(0);
            cmbUbicacion.setSelectedIndex(0);
            txtNombrePintura.setText("");
            spAnioCreacion.setValue(0);
            txtTamanio.setText("");

            JOptionPane.showMessageDialog(null, "Obra registrada exitosamente");
            cargarDatosEnTabla();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void tblInformacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblInformacionKeyTyped

        if (evt.getKeyChar() == java.awt.event.KeyEvent.VK_DELETE) {

            int fila = tblInformacion.getSelectedRow();

            String id = (String) tblInformacion.getValueAt(fila, 7);
            try {
                if (JOptionPane.showConfirmDialog(null, "desea realmente eliminar el registro seleccionado?") == JOptionPane.YES_OPTION) {
                    d.eliminarObra(id);
                    cargarDatosEnTabla();
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }

            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            evt.consume();
        }


    }//GEN-LAST:event_tblInformacionKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        limpiarTabla();
        DefaultTableModel tabDatos = (DefaultTableModel) tblInformacion.getModel();
        tblInformacion.setModel(tabDatos);

        try {
            if (rdId.isSelected()) {
                if (!("".equalsIgnoreCase(txtBuscarID.getText().trim()))) {
                    List<String[]> listaBusqueda = d.getResultadosBusquedaId(txtBuscarID.getText());
                    for (String[] busqueda : listaBusqueda) {
                        tabDatos.addRow(new Object[8]);
                        tabDatos.setValueAt(busqueda[0], tabDatos.getRowCount() - 1, 0);
                        tabDatos.setValueAt(busqueda[1], tabDatos.getRowCount() - 1, 1);
                        tabDatos.setValueAt(busqueda[2], tabDatos.getRowCount() - 1, 2);
                        tabDatos.setValueAt(busqueda[3], tabDatos.getRowCount() - 1, 3);
                        tabDatos.setValueAt(busqueda[4], tabDatos.getRowCount() - 1, 4);
                        tabDatos.setValueAt(busqueda[5], tabDatos.getRowCount() - 1, 5);
                        tabDatos.setValueAt(busqueda[6], tabDatos.getRowCount() - 1, 6);
                        tabDatos.setValueAt(busqueda[7], tabDatos.getRowCount() - 1, 7);
                    }
                }
            } else if (rdNombre.isSelected()) {
                if (!("".equalsIgnoreCase(txtBuscarNombre.getText().trim()))) {
                    List<String[]> listaBusqueda = d.getResultadosBusquedaNombre(txtBuscarNombre.getText());
                    for (String[] busqueda : listaBusqueda) {
                        tabDatos.addRow(new Object[8]);
                        tabDatos.setValueAt(busqueda[0], tabDatos.getRowCount() - 1, 0);
                        tabDatos.setValueAt(busqueda[1], tabDatos.getRowCount() - 1, 1);
                        tabDatos.setValueAt(busqueda[2], tabDatos.getRowCount() - 1, 2);
                        tabDatos.setValueAt(busqueda[3], tabDatos.getRowCount() - 1, 3);
                        tabDatos.setValueAt(busqueda[4], tabDatos.getRowCount() - 1, 4);
                        tabDatos.setValueAt(busqueda[5], tabDatos.getRowCount() - 1, 5);
                        tabDatos.setValueAt(busqueda[6], tabDatos.getRowCount() - 1, 6);
                        tabDatos.setValueAt(busqueda[7], tabDatos.getRowCount() - 1, 7);
                    }
                }

            }

        } catch (SQLException sQLException) {
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarNombreMouseClicked
        txtBuscarID.setText("");
        txtBuscarID.setEnabled(false);
        txtBuscarNombre.setEnabled(true);
        txtBuscarNombre.requestFocus();
        rdNombre.setSelected(true);
        rdId.setSelected(false);
    }//GEN-LAST:event_txtBuscarNombreMouseClicked

    private void txtBuscarIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarIDMouseClicked
        txtBuscarNombre.setText("");
        txtBuscarNombre.setEnabled(false);
        txtBuscarID.setEnabled(true);
        txtBuscarID.requestFocus();
        rdNombre.setSelected(false);
        rdId.setSelected(true);
    }//GEN-LAST:event_txtBuscarIDMouseClicked

    private void rdIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdIdActionPerformed
        txtBuscarNombre.setText("");
        txtBuscarNombre.setEnabled(false);
        txtBuscarID.setEnabled(true);
        txtBuscarID.requestFocus();
        rdNombre.setSelected(false);
        rdId.setSelected(true);
    }//GEN-LAST:event_rdIdActionPerformed

    private void rdNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNombreActionPerformed
        txtBuscarID.setText("");
        txtBuscarID.setEnabled(false);
        txtBuscarNombre.setEnabled(true);
        txtBuscarNombre.requestFocus();
        rdNombre.setSelected(true);
        rdId.setSelected(false);

    }//GEN-LAST:event_rdNombreActionPerformed

    private void btnMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodoActionPerformed

        limpiarTabla();
        try {
            cargarDatosEnTabla();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtBuscarID.setText("");
        txtBuscarID.setText("");
        txtBuscarID.setEnabled(false);
        txtBuscarNombre.setEnabled(true);
        txtBuscarNombre.requestFocus();
        rdNombre.setSelected(true);
        rdId.setSelected(false);
    }//GEN-LAST:event_btnMostrarTodoActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        String pass = new String(txtPass.getPassword());
        String user = txtUser.getText();
        try {
            boolean correcto = d.comprobarUsuario(user, pass);
            System.out.println(correcto);
            if (correcto) {
                vtnPrincipal.setBounds(0, 0, 920, 613);
                vtnPrincipal.setLocationRelativeTo(null);
                vtnPrincipal.setVisible(true);
                vtnPrincipal.setResizable(false);
                cargarDatosEnTabla();
                leerAutores();
                leerEncargados();
                leerSalas();
                leerTecnicas();
                leerGeneros();
                setLocationRelativeTo(null);
                setTitle("Sistema de Registro GAUDI");
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Intente nuevamente");
            }
        } catch (Exception e) {
        }


    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped

        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            btnIngresar.doClick();
        }

    }//GEN-LAST:event_txtPassKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new App().setVisible(true);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.ButtonGroup btnGBusqueda;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnMostrarTodo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbAutores;
    private javax.swing.JComboBox<String> cmbEncargado;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JComboBox<String> cmbTecnica;
    private javax.swing.JComboBox<String> cmbUbicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel pnllogin;
    private javax.swing.JRadioButton rdId;
    private javax.swing.JRadioButton rdNombre;
    private javax.swing.JSpinner spAnioCreacion;
    private javax.swing.JTabbedPane tabPrincipal;
    private javax.swing.JTable tblInformacion;
    private javax.swing.JTextField txtBuscarID;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextField txtNombrePintura;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtTamanio;
    private javax.swing.JTextField txtUser;
    private javax.swing.JFrame vtnPrincipal;
    // End of variables declaration//GEN-END:variables

    private void registrarObraDeArte(String autor,
            String nomPintura,
            String tecnica,
            String genero,
            int anio,
            String tamanio,
            String sala) throws SQLException, ClassNotFoundException {
        d = new Data();
        d.registrarObra(nomPintura, tamanio, anio, tecnica, genero, sala, autor);

    }

    private void cargarDatosEnTabla() throws SQLException {

        limpiarTabla();

        DefaultTableModel tabDatos = (DefaultTableModel) tblInformacion.getModel();
        tblInformacion.setModel(tabDatos);

        List<String[]> listaObrasYsalas;

        listaObrasYsalas = d.getObrasYSalas();

        for (String[] obrasYsalas : listaObrasYsalas) {
            tabDatos.addRow(new Object[8]);
            tabDatos.setValueAt(obrasYsalas[0], tabDatos.getRowCount() - 1, 0);
            tabDatos.setValueAt(obrasYsalas[1], tabDatos.getRowCount() - 1, 1);
            tabDatos.setValueAt(obrasYsalas[2], tabDatos.getRowCount() - 1, 2);
            tabDatos.setValueAt(obrasYsalas[3], tabDatos.getRowCount() - 1, 3);
            tabDatos.setValueAt(obrasYsalas[4], tabDatos.getRowCount() - 1, 4);
            tabDatos.setValueAt(obrasYsalas[5], tabDatos.getRowCount() - 1, 5);
            tabDatos.setValueAt(obrasYsalas[6], tabDatos.getRowCount() - 1, 6);
            tabDatos.setValueAt(obrasYsalas[7], tabDatos.getRowCount() - 1, 7);
        }

    }

    private void leerAutores() throws SQLException {
        cmbAutores.removeAllItems();

        List<Autor> listaNombresAutores;
        listaNombresAutores = d.getNombreAutores();
        for (Autor nombre : listaNombresAutores) {
            cmbAutores.addItem(nombre.getNombre());
        }

    }

    private void leerEncargados() throws SQLException {
        cmbEncargado.removeAllItems();

        List<String[]> listaEncargados;

        listaEncargados = d.getNombresEncargados();
        for (String[] encargado : listaEncargados) {
            cmbEncargado.addItem(encargado[0]);
        }

    }

    private void leerSalas() throws SQLException {
        cmbUbicacion.removeAllItems();

        List<Sala> listaSalas = d.getNombreSalas();
        for (Sala sala : listaSalas) {
            cmbUbicacion.addItem(sala.getNombreSala());
        }

    }

    private void leerTecnicas() throws SQLException {
        cmbTecnica.removeAllItems();

        List<String[]> listaTecnicas = d.getNombreTecnicas();
        for (String[] tecnica : listaTecnicas) {
            cmbTecnica.addItem(tecnica[0]);
        }
    }

    private void leerGeneros() throws SQLException {
        cmbGenero.removeAllItems();

        List<String[]> listaGeneros = d.getNombresGeneros();
        for (String[] genero : listaGeneros) {
            cmbGenero.addItem(genero[0]);
        }
    }

    private void limpiarTabla() {

        DefaultTableModel tbl = (DefaultTableModel) tblInformacion.getModel();
        int a = tbl.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tbl.removeRow(tbl.getRowCount() - 1);
        }

    }

}
