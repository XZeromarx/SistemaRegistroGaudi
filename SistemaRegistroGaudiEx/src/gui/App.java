/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Autor;
import model.Encargado;
import model.Ficha;
import model.Pintura;
import model.Sala;

/**
 *
 * @author XZeromarxPC
 */
public class App extends javax.swing.JFrame {

    Autor autor1;
    Autor autor2;
    Autor autor3;
    Encargado encargado1;
    Encargado encargado2;
    Encargado encargado3;
    Ficha ficha1;
    Ficha ficha2;
    Ficha ficha3;
    Ficha ficha4;
    Ficha ficha5;
    Pintura pintura1;
    Pintura pintura2;
    Pintura pintura3;
    Pintura pintura4;
    Pintura pintura5;
    Sala sala1;
    Sala sala2;
    Sala sala3;

    List<Autor> listaAutores;
    List<Encargado> listaEncargados;
    List<Ficha> listaFichas;
    List<Sala> listaSalas;

    public App() {
        initComponents();
        listaAutores = new ArrayList<>();
        listaEncargados = new ArrayList<>();
        listaSalas = new ArrayList<>();
        registroInicial();
        cargarDatos();
        leerAutores();
        leerEncargados();
        leerSalas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vtnCrearAutor = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCrearNombreAutor = new javax.swing.JTextField();
        txtCrearApellidoAutor = new javax.swing.JTextField();
        txtCrearRutAutor = new javax.swing.JTextField();
        txtCrearNacionalidadAutor = new javax.swing.JTextField();
        btnSalirCrearAutor = new javax.swing.JButton();
        btnCrearAutor = new javax.swing.JButton();
        vtnRegistroEncargado = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtNombreRegistroEncargado = new javax.swing.JTextField();
        txtRutRegistroEncargado = new javax.swing.JTextField();
        txtProfRegistroEncargado = new javax.swing.JTextField();
        txtAnioRegistroEncargado = new javax.swing.JTextField();
        btnRegistrarEncargado = new javax.swing.JButton();
        btnSalirRegistroEncargado = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        vtnRegistroUbicacion = new javax.swing.JFrame();
        jPanel8 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtNombreRegistroSala = new javax.swing.JTextField();
        cmbEncargadosRegistroSala = new javax.swing.JComboBox<>();
        rdCierreSi = new javax.swing.JRadioButton();
        rdCierreNo = new javax.swing.JRadioButton();
        rdIncendioSi = new javax.swing.JRadioButton();
        rdIncendioNo = new javax.swing.JRadioButton();
        spCantidadLamparas = new javax.swing.JSpinner();
        spTemperatura = new javax.swing.JSpinner();
        btnRegistrarSala = new javax.swing.JButton();
        btnSalirRegistroSala = new javax.swing.JButton();
        btnGroupCierreC = new javax.swing.ButtonGroup();
        btnGroupAlarmaC = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
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
        btnLimpiarFormulario = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cmbEncargado = new javax.swing.JComboBox<>();
        btnAgregarAutor = new javax.swing.JButton();
        btnAgregarEncargado = new javax.swing.JButton();
        cmbAutores = new javax.swing.JComboBox<>();
        btnAgregarUbicacion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInformacion = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtBuscarNombre = new javax.swing.JTextField();
        txtBuscarID = new javax.swing.JTextField();
        txtBuscarAnio = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Crear Autor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel9.setText("Nombre:");

        jLabel10.setText("Rut:");

        jLabel12.setText("Apellido:");

        jLabel16.setText("Nacionalidad:");

        btnSalirCrearAutor.setText("Salir");
        btnSalirCrearAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirCrearAutorActionPerformed(evt);
            }
        });

        btnCrearAutor.setText("Crear Autor");
        btnCrearAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCrearNombreAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(txtCrearApellidoAutor)
                            .addComponent(txtCrearRutAutor)
                            .addComponent(txtCrearNacionalidadAutor)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCrearAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalirCrearAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCrearNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCrearApellidoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCrearRutAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtCrearNacionalidadAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalirCrearAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout vtnCrearAutorLayout = new javax.swing.GroupLayout(vtnCrearAutor.getContentPane());
        vtnCrearAutor.getContentPane().setLayout(vtnCrearAutorLayout);
        vtnCrearAutorLayout.setHorizontalGroup(
            vtnCrearAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        vtnCrearAutorLayout.setVerticalGroup(
            vtnCrearAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registro de Encargados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

        jLabel17.setText("Nombre:");

        jLabel18.setText("Rut:");

        jLabel19.setText("Profesión:");

        jLabel20.setText("Año de Ingreso:");

        btnRegistrarEncargado.setText("Registrar");
        btnRegistrarEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEncargadoActionPerformed(evt);
            }
        });

        btnSalirRegistroEncargado.setText("Salir");
        btnSalirRegistroEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirRegistroEncargadoActionPerformed(evt);
            }
        });

        jLabel21.setText("solo números*");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtProfRegistroEncargado, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                .addComponent(txtAnioRegistroEncargado)
                                .addComponent(txtRutRegistroEncargado))
                            .addComponent(txtNombreRegistroEncargado)))
                    .addComponent(btnRegistrarEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalirRegistroEncargado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 74, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtNombreRegistroEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtRutRegistroEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtProfRegistroEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtAnioRegistroEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalirRegistroEncargado, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btnRegistrarEncargado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout vtnRegistroEncargadoLayout = new javax.swing.GroupLayout(vtnRegistroEncargado.getContentPane());
        vtnRegistroEncargado.getContentPane().setLayout(vtnRegistroEncargadoLayout);
        vtnRegistroEncargadoLayout.setHorizontalGroup(
            vtnRegistroEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vtnRegistroEncargadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        vtnRegistroEncargadoLayout.setVerticalGroup(
            vtnRegistroEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vtnRegistroEncargadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registro Salas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

        jLabel22.setText("Nombre:");

        jLabel23.setText("Cantidad de lamparas:");

        jLabel24.setText("Temperatura:");

        jLabel25.setText("Cierre Centralizado:");

        jLabel26.setText("Alarma Contra Incendios:");

        jLabel27.setText("Encargado:");

        btnGroupCierreC.add(rdCierreSi);
        rdCierreSi.setText("Si");

        btnGroupCierreC.add(rdCierreNo);
        rdCierreNo.setText("No");

        btnGroupAlarmaC.add(rdIncendioSi);
        rdIncendioSi.setText("Si");

        btnGroupAlarmaC.add(rdIncendioNo);
        rdIncendioNo.setText("No");

        btnRegistrarSala.setText("Registrar");

        btnSalirRegistroSala.setText("Salir");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(spCantidadLamparas, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(txtNombreRegistroSala)
                            .addComponent(spTemperatura))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(rdCierreSi)
                                .addGap(18, 18, 18)
                                .addComponent(rdCierreNo))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(rdIncendioSi)
                                .addGap(18, 18, 18)
                                .addComponent(rdIncendioNo))
                            .addComponent(cmbEncargadosRegistroSala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnRegistrarSala, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalirRegistroSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreRegistroSala, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdCierreSi)
                    .addComponent(rdCierreNo)
                    .addComponent(jLabel25)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(spCantidadLamparas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdIncendioSi)
                    .addComponent(rdIncendioNo)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(spTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(cmbEncargadosRegistroSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrarSala, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnSalirRegistroSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout vtnRegistroUbicacionLayout = new javax.swing.GroupLayout(vtnRegistroUbicacion.getContentPane());
        vtnRegistroUbicacion.getContentPane().setLayout(vtnRegistroUbicacionLayout);
        vtnRegistroUbicacionLayout.setHorizontalGroup(
            vtnRegistroUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vtnRegistroUbicacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        vtnRegistroUbicacionLayout.setVerticalGroup(
            vtnRegistroUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vtnRegistroUbicacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N

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

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Retrato", "Desnudo", "Naturaleza Muerta", "Pintura Paisajista", "Pintura Historica" }));

        cmbTecnica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acuarela", "Óleo", "Fresco", "Temple", "Puntillismo" }));

        btnRegistrar.setText("Registrar");

        jLabel11.setText("Porfavor separar ancho y alto con una X");

        btnLimpiarFormulario.setText("Limpiar Formulario");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Encargado:");

        btnAgregarAutor.setText("+");
        btnAgregarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAutorActionPerformed(evt);
            }
        });

        btnAgregarEncargado.setText("+");
        btnAgregarEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEncargadoActionPerformed(evt);
            }
        });

        btnAgregarUbicacion.setText("+");
        btnAgregarUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUbicacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimpiarFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTamanio))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 41, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spAnioCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(26, 26, 26)
                                        .addComponent(cmbAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombrePintura, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)))
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbTecnica, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbEncargado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregarEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(73, 73, 73))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbTecnica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(btnAgregarUbicacion)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnAgregarAutor))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNombrePintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spAnioCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cmbEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarEncargado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnLimpiarFormulario)
                .addContainerGap())
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

        jTabbedPane1.addTab("Registro de Obras de Arte", jPanel1);

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

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Por año:");

        btnBuscar.setText("Buscar");

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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(txtBuscarID)
                    .addComponent(txtBuscarAnio))
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtBuscarAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
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
                    .addComponent(jScrollPane1))
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

        jTabbedPane1.addTab("Consultas de Obras de Arte", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAutorActionPerformed
        vtnCrearAutor.setBounds(0, 0, 700, 310);
        vtnCrearAutor.setLocationRelativeTo(null);
        vtnCrearAutor.setVisible(true);

    }//GEN-LAST:event_btnAgregarAutorActionPerformed

    private void btnCrearAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAutorActionPerformed

        if (txtCrearNombreAutor.getText().trim().equalsIgnoreCase("")
                || txtCrearApellidoAutor.getText().trim().equalsIgnoreCase("")
                || txtCrearRutAutor.getText().trim().equalsIgnoreCase("")
                || txtCrearNacionalidadAutor.getText().trim().equalsIgnoreCase("")) {
            JOptionPane.showConfirmDialog(null, "Rellene todos los campos porfavor");
        } else {
            Autor autor = new Autor(txtCrearNombreAutor.getText(), txtCrearApellidoAutor.getText(), txtCrearRutAutor.getText(), txtCrearNacionalidadAutor.getText());
            listaAutores.add(autor);
            leerAutores();
            txtCrearNombreAutor.setText("");
            txtCrearApellidoAutor.setText("");
            txtCrearRutAutor.setText("");
            txtCrearNacionalidadAutor.setText("");
            JOptionPane.showMessageDialog(null, "Autor registrado con exito");

        }
    }//GEN-LAST:event_btnCrearAutorActionPerformed

    private void btnSalirCrearAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirCrearAutorActionPerformed

        vtnCrearAutor.setVisible(false);
        txtCrearNombreAutor.setText("");
        txtCrearApellidoAutor.setText("");
        txtCrearRutAutor.setText("");
        txtCrearNacionalidadAutor.setText("");
    }//GEN-LAST:event_btnSalirCrearAutorActionPerformed

    private void btnAgregarEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEncargadoActionPerformed

        vtnRegistroEncargado.setBounds(0, 0, 620, 320);
        vtnRegistroEncargado.setLocationRelativeTo(null);
        vtnRegistroEncargado.setVisible(true);

    }//GEN-LAST:event_btnAgregarEncargadoActionPerformed

    private void btnSalirRegistroEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirRegistroEncargadoActionPerformed

        vtnRegistroEncargado.setVisible(false);
        txtNombreRegistroEncargado.setText("");
        txtRutRegistroEncargado.setText("");
        txtProfRegistroEncargado.setText("");
        txtAnioRegistroEncargado.setText("");

    }//GEN-LAST:event_btnSalirRegistroEncargadoActionPerformed

    private void btnRegistrarEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEncargadoActionPerformed

        String nombre = txtNombreRegistroEncargado.getText();
        String rut = txtRutRegistroEncargado.getText();
        String prof = txtProfRegistroEncargado.getText();
        String anio = txtAnioRegistroEncargado.getText();

        if (!(nombre.trim().equalsIgnoreCase("")
                || rut.trim().equalsIgnoreCase("")
                || prof.trim().equalsIgnoreCase("")
                || anio.trim().equalsIgnoreCase(""))) {

            Encargado encargado = null;
            try {
                encargado = new Encargado(nombre, rut, prof, Integer.parseInt(anio));
                listaEncargados.add(encargado);
                leerEncargados();
                txtNombreRegistroEncargado.setText("");
                txtRutRegistroEncargado.setText("");
                txtProfRegistroEncargado.setText("");
                txtAnioRegistroEncargado.setText("");
            } catch (NumberFormatException numberFormatException) {
                JOptionPane.showMessageDialog(null, "No ingrese letras en el campo Año de ingreso");
            }

        }

    }//GEN-LAST:event_btnRegistrarEncargadoActionPerformed

    private void btnAgregarUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUbicacionActionPerformed

        for (Encargado encargado : listaEncargados) {
            cmbEncargadosRegistroSala.addItem(encargado.getNombre());
        }
        vtnRegistroUbicacion.setBounds(0, 0, 655, 275);
        vtnRegistroUbicacion.setLocationRelativeTo(null);
        vtnRegistroUbicacion.setVisible(true);

    }//GEN-LAST:event_btnAgregarUbicacionActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAutor;
    private javax.swing.JButton btnAgregarEncargado;
    private javax.swing.JButton btnAgregarUbicacion;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearAutor;
    private javax.swing.ButtonGroup btnGroupAlarmaC;
    private javax.swing.ButtonGroup btnGroupCierreC;
    private javax.swing.JButton btnLimpiarFormulario;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarEncargado;
    private javax.swing.JButton btnRegistrarSala;
    private javax.swing.JButton btnSalirCrearAutor;
    private javax.swing.JButton btnSalirRegistroEncargado;
    private javax.swing.JButton btnSalirRegistroSala;
    private javax.swing.JComboBox<String> cmbAutores;
    private javax.swing.JComboBox<String> cmbEncargado;
    private javax.swing.JComboBox<String> cmbEncargadosRegistroSala;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JComboBox<String> cmbTecnica;
    private javax.swing.JComboBox<String> cmbUbicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton rdCierreNo;
    private javax.swing.JRadioButton rdCierreSi;
    private javax.swing.JRadioButton rdIncendioNo;
    private javax.swing.JRadioButton rdIncendioSi;
    private javax.swing.JSpinner spAnioCreacion;
    private javax.swing.JSpinner spCantidadLamparas;
    private javax.swing.JSpinner spTemperatura;
    private javax.swing.JTable tblInformacion;
    private javax.swing.JTextField txtAnioRegistroEncargado;
    private javax.swing.JTextField txtBuscarAnio;
    private javax.swing.JTextField txtBuscarID;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextField txtCrearApellidoAutor;
    private javax.swing.JTextField txtCrearNacionalidadAutor;
    private javax.swing.JTextField txtCrearNombreAutor;
    private javax.swing.JTextField txtCrearRutAutor;
    private javax.swing.JTextField txtNombrePintura;
    private javax.swing.JTextField txtNombreRegistroEncargado;
    private javax.swing.JTextField txtNombreRegistroSala;
    private javax.swing.JTextField txtProfRegistroEncargado;
    private javax.swing.JTextField txtRutRegistroEncargado;
    private javax.swing.JTextField txtTamanio;
    private javax.swing.JFrame vtnCrearAutor;
    private javax.swing.JFrame vtnRegistroEncargado;
    private javax.swing.JFrame vtnRegistroUbicacion;
    // End of variables declaration//GEN-END:variables

    private void registroInicial() {

        autor1 = new Autor("NomAutor1", "Apellido1", "11-1", "nac1");
        autor2 = new Autor("NomAutor2", "Apellido2", "22-2", "nac2");
        autor3 = new Autor("NomAutor3", "Apellido3", "33-3", "nac3");

        listaAutores.add(autor1);
        listaAutores.add(autor2);
        listaAutores.add(autor3);

        encargado1 = new Encargado("nomEncargado1", "44-4", "prof1", 2016);
        encargado2 = new Encargado("nomEncargado2", "55-5", "prof2", 2017);
        encargado3 = new Encargado("nomEncargado3", "66-6", "prof3", 2018);

        listaEncargados.add(encargado1);
        listaEncargados.add(encargado2);
        listaEncargados.add(encargado3);

        sala1 = new Sala("nomSala1", 1, 1, true, true, encargado1);
        sala1.setIdentificador();
        sala2 = new Sala("nomSala2", 2, 2, false, false, encargado2);
        sala2.setIdentificador();
        sala3 = new Sala("nomSala3", 3, 3, true, false, encargado3);
        sala3.setIdentificador();

        listaSalas.add(sala1);
        listaSalas.add(sala2);
        listaSalas.add(sala3);

        pintura1 = new Pintura(autor1, "Acuarela", "Retrato", 2001, "nomPintura1", "12X12", sala1);
        pintura2 = new Pintura(autor2, "Óleo", "Desnudo", 2002, "nomPintura2", "13X13", sala2);
        pintura3 = new Pintura(autor3, "Fresco", "Naturaleza Muerta", 2003, "nomPintura3", "14X14", sala1);
        pintura4 = new Pintura(autor3, "Temple", "Pintura Paisajista", 2004, "nomPintura4", "15X15", sala3);
        pintura5 = new Pintura(autor1, "Puntillismo", "Pintura Histórica", 2005, "nomPintura5", "16X16", sala2);

        ficha1 = new Ficha(sala1, pintura1);
        ficha2 = new Ficha(sala2, pintura2);
        ficha3 = new Ficha(sala3, pintura3);
        ficha4 = new Ficha(sala2, pintura4);
        ficha5 = new Ficha(sala1, pintura5);

        listaFichas = new ArrayList<>();
        listaFichas.add(ficha1);
        listaFichas.add(ficha2);
        listaFichas.add(ficha3);
        listaFichas.add(ficha4);
        listaFichas.add(ficha5);

    }

    private void registrarObraDeArte(String autor,
            String encargado,
            String nomPintura,
            String tecnica,
            String genero,
            String ubicacion,
            String tamanio) {

        for (Ficha ficha : listaFichas) {
            Sala s;
            Autor a;
            Pintura p;

            s = ficha.getSala();
            p = ficha.getPintura();
            a = p.getAutor();

        }

    }

    private void cargarDatos() {

        DefaultTableModel tabDatos = (DefaultTableModel) tblInformacion.getModel();
        tblInformacion.setModel(tabDatos);
        for (Ficha listaFicha : listaFichas) {
            tabDatos.addRow(new Object[8]);
            Sala s;
            Autor a;
            Pintura p;

            s = listaFicha.getSala();
            p = listaFicha.getPintura();
            a = p.getAutor();

            tabDatos.setValueAt(a.getNombre(), tabDatos.getRowCount() - 1, 0);
            tabDatos.setValueAt(p.getTecnica(), tabDatos.getRowCount() - 1, 1);
            tabDatos.setValueAt(p.getGenero(), tabDatos.getRowCount() - 1, 2);
            tabDatos.setValueAt(p.getAnioCreacion(), tabDatos.getRowCount() - 1, 3);
            tabDatos.setValueAt(p.getNombrePintura(), tabDatos.getRowCount() - 1, 4);
            tabDatos.setValueAt(p.getTamanio(), tabDatos.getRowCount() - 1, 5);
            tabDatos.setValueAt(s.getNombreSala(), tabDatos.getRowCount() - 1, 6);
            tabDatos.setValueAt(s.getIdentificador(), tabDatos.getRowCount() - 1, 7);

        }

    }

    private void leerAutores() {
        cmbAutores.removeAllItems();
        for (Autor autor : listaAutores) {
            cmbAutores.addItem(autor.getNombre());
        }

    }

    private void leerEncargados() {
        cmbEncargado.removeAllItems();
        for (Encargado encargado : listaEncargados) {
            cmbEncargado.addItem(encargado.getNombre());
        }

    }

    private void leerSalas() {
        cmbUbicacion.removeAllItems();
        for (Sala sala : listaSalas) {
            cmbUbicacion.addItem(sala.getNombreSala());
        }

    }

}
