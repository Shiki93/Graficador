/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.*;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author oto_z
 */
public class Principal extends javax.swing.JFrame {

    public ArrayList<Paciente> pacientes = new ArrayList<>();
    public Logica logica = new Logica();

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.cbx_ref.setEnabled(false);
        this.lbl_Error.setVisible(false);
        this.lbl_acepto.setVisible(false);
        this.pnl_Paciente.setVisible(false);
        this.pnl_Sexo.setVisible(false);
        this.pnl_edad.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_paciente = new javax.swing.JButton();
        lay_Workbench = new javax.swing.JLayeredPane();
        pnl_edad = new javax.swing.JPanel();
        pnl_Paciente = new javax.swing.JPanel();
        txt_nombre = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        cbx_sexo = new javax.swing.JComboBox<>();
        cbx_res = new javax.swing.JComboBox<>();
        chk_Nuevo = new javax.swing.JCheckBox();
        cbx_ref = new javax.swing.JComboBox<>();
        chk_Poli = new javax.swing.JCheckBox();
        chk_abandono = new javax.swing.JCheckBox();
        chk_vp = new javax.swing.JCheckBox();
        chk_Alta = new javax.swing.JCheckBox();
        chk_epoc = new javax.swing.JCheckBox();
        chk_Cardio = new javax.swing.JCheckBox();
        chk_Osteo = new javax.swing.JCheckBox();
        chk_dm = new javax.swing.JCheckBox();
        chk_irc = new javax.swing.JCheckBox();
        chk_park = new javax.swing.JCheckBox();
        chk_hta = new javax.swing.JCheckBox();
        cgk_demen = new javax.swing.JCheckBox();
        chk_inmv = new javax.swing.JCheckBox();
        chk_avc = new javax.swing.JCheckBox();
        chk_cancer = new javax.swing.JCheckBox();
        chk_otros = new javax.swing.JCheckBox();
        btn_conf = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        bnt_consult = new javax.swing.JButton();
        lbl_acepto = new javax.swing.JLabel();
        lbl_Error = new javax.swing.JLabel();
        pnl_Sexo = new javax.swing.JPanel();
        btn_Salir = new javax.swing.JButton();
        btn_grafSex = new javax.swing.JButton();
        btn_grafEdad = new javax.swing.JButton();
        btn_grafRes = new javax.swing.JButton();
        btn_grafAltas = new javax.swing.JButton();
        btn_nuevos = new javax.swing.JButton();
        btn_grafEnf = new javax.swing.JButton();
        lbl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_paciente.setBackground(new java.awt.Color(0, 0, 0));
        btn_paciente.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        btn_paciente.setForeground(new java.awt.Color(255, 255, 255));
        btn_paciente.setText("Paciente");
        btn_paciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pacienteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        lay_Workbench.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pnl_edad.setOpaque(false);

        javax.swing.GroupLayout pnl_edadLayout = new javax.swing.GroupLayout(pnl_edad);
        pnl_edad.setLayout(pnl_edadLayout);
        pnl_edadLayout.setHorizontalGroup(
            pnl_edadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 846, Short.MAX_VALUE)
        );
        pnl_edadLayout.setVerticalGroup(
            pnl_edadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );

        pnl_Paciente.setOpaque(false);
        pnl_Paciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_nombre.setBackground(new java.awt.Color(0, 0, 0));
        txt_nombre.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombre.setText("Nombre: ");
        txt_nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_nombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nombreFocusLost(evt);
            }
        });
        pnl_Paciente.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, -1));

        txt_cedula.setBackground(new java.awt.Color(0, 0, 0));
        txt_cedula.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(255, 255, 255));
        txt_cedula.setText("Cedula: ");
        txt_cedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_cedulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cedulaFocusLost(evt);
            }
        });
        pnl_Paciente.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, -1));

        txt_edad.setBackground(new java.awt.Color(0, 0, 0));
        txt_edad.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_edad.setForeground(new java.awt.Color(255, 255, 255));
        txt_edad.setText("Edad");
        txt_edad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_edadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_edadFocusLost(evt);
            }
        });
        pnl_Paciente.add(txt_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 250, -1));

        cbx_sexo.setBackground(new java.awt.Color(0, 0, 0));
        cbx_sexo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cbx_sexo.setForeground(new java.awt.Color(255, 255, 255));
        cbx_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sexo", "Masculino", "Femenino" }));
        pnl_Paciente.add(cbx_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 250, -1));

        cbx_res.setBackground(new java.awt.Color(0, 0, 0));
        cbx_res.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cbx_res.setForeground(new java.awt.Color(255, 255, 255));
        cbx_res.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Residencia", "Nicoya", "Santa Cruz", "Nandayure", "Hojancha", "Jicaral" }));
        cbx_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_resActionPerformed(evt);
            }
        });
        pnl_Paciente.add(cbx_res, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 250, -1));

        chk_Nuevo.setBackground(new java.awt.Color(0, 0, 0));
        chk_Nuevo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        chk_Nuevo.setForeground(new java.awt.Color(255, 255, 255));
        chk_Nuevo.setText("Nuevo");
        chk_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_NuevoActionPerformed(evt);
            }
        });
        pnl_Paciente.add(chk_Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 100, -1));

        cbx_ref.setBackground(new java.awt.Color(0, 0, 0));
        cbx_ref.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cbx_ref.setForeground(new java.awt.Color(255, 255, 255));
        cbx_ref.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Referencia", "Interna", "Externa" }));
        pnl_Paciente.add(cbx_ref, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 250, -1));

        chk_Poli.setBackground(new java.awt.Color(0, 0, 0));
        chk_Poli.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        chk_Poli.setForeground(new java.awt.Color(255, 255, 255));
        chk_Poli.setText("Polifarmacia");
        pnl_Paciente.add(chk_Poli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        chk_abandono.setBackground(new java.awt.Color(0, 0, 0));
        chk_abandono.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        chk_abandono.setForeground(new java.awt.Color(255, 255, 255));
        chk_abandono.setText("Abandono");
        pnl_Paciente.add(chk_abandono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 120, -1));

        chk_vp.setBackground(new java.awt.Color(0, 0, 0));
        chk_vp.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        chk_vp.setForeground(new java.awt.Color(255, 255, 255));
        chk_vp.setText("V.P.");
        chk_vp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_vpActionPerformed(evt);
            }
        });
        pnl_Paciente.add(chk_vp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        chk_Alta.setBackground(new java.awt.Color(0, 0, 0));
        chk_Alta.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        chk_Alta.setForeground(new java.awt.Color(255, 255, 255));
        chk_Alta.setText("Alta");
        chk_Alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_AltaActionPerformed(evt);
            }
        });
        pnl_Paciente.add(chk_Alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        chk_epoc.setBackground(new java.awt.Color(0, 0, 0));
        chk_epoc.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        chk_epoc.setForeground(new java.awt.Color(255, 255, 255));
        chk_epoc.setText("E.P.O.C.");
        chk_epoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_epocActionPerformed(evt);
            }
        });
        pnl_Paciente.add(chk_epoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, -1));

        chk_Cardio.setBackground(new java.awt.Color(0, 0, 0));
        chk_Cardio.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        chk_Cardio.setForeground(new java.awt.Color(255, 255, 255));
        chk_Cardio.setText("Cardiopatia");
        pnl_Paciente.add(chk_Cardio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 120, -1));

        chk_Osteo.setBackground(new java.awt.Color(0, 0, 0));
        chk_Osteo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        chk_Osteo.setForeground(new java.awt.Color(255, 255, 255));
        chk_Osteo.setText("Osteoposoris");
        pnl_Paciente.add(chk_Osteo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        chk_dm.setBackground(new java.awt.Color(0, 0, 0));
        chk_dm.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        chk_dm.setForeground(new java.awt.Color(255, 255, 255));
        chk_dm.setText("D.M.");
        pnl_Paciente.add(chk_dm, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        chk_irc.setBackground(new java.awt.Color(0, 0, 0));
        chk_irc.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        chk_irc.setForeground(new java.awt.Color(255, 255, 255));
        chk_irc.setText("I.R.C.");
        pnl_Paciente.add(chk_irc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        chk_park.setBackground(new java.awt.Color(0, 0, 0));
        chk_park.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        chk_park.setForeground(new java.awt.Color(255, 255, 255));
        chk_park.setText("Parkinson");
        chk_park.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_parkActionPerformed(evt);
            }
        });
        pnl_Paciente.add(chk_park, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 120, -1));

        chk_hta.setBackground(new java.awt.Color(0, 0, 0));
        chk_hta.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        chk_hta.setForeground(new java.awt.Color(255, 255, 255));
        chk_hta.setText("H.T.A.");
        pnl_Paciente.add(chk_hta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        cgk_demen.setBackground(new java.awt.Color(0, 0, 0));
        cgk_demen.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cgk_demen.setForeground(new java.awt.Color(255, 255, 255));
        cgk_demen.setText("Demencia");
        pnl_Paciente.add(cgk_demen, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        chk_inmv.setBackground(new java.awt.Color(0, 0, 0));
        chk_inmv.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        chk_inmv.setForeground(new java.awt.Color(255, 255, 255));
        chk_inmv.setText("Inmovil");
        pnl_Paciente.add(chk_inmv, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        chk_avc.setBackground(new java.awt.Color(0, 0, 0));
        chk_avc.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        chk_avc.setForeground(new java.awt.Color(255, 255, 255));
        chk_avc.setText("A.V.C.");
        pnl_Paciente.add(chk_avc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        chk_cancer.setBackground(new java.awt.Color(0, 0, 0));
        chk_cancer.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        chk_cancer.setForeground(new java.awt.Color(255, 255, 255));
        chk_cancer.setText("Cancer");
        pnl_Paciente.add(chk_cancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        chk_otros.setBackground(new java.awt.Color(0, 0, 0));
        chk_otros.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        chk_otros.setForeground(new java.awt.Color(255, 255, 255));
        chk_otros.setText("Otros");
        chk_otros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_otrosActionPerformed(evt);
            }
        });
        pnl_Paciente.add(chk_otros, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        btn_conf.setBackground(new java.awt.Color(0, 0, 0));
        btn_conf.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btn_conf.setForeground(new java.awt.Color(255, 255, 255));
        btn_conf.setText("Confirmar");
        btn_conf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confActionPerformed(evt);
            }
        });
        pnl_Paciente.add(btn_conf, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 200, -1));

        btn_borrar.setBackground(new java.awt.Color(0, 0, 0));
        btn_borrar.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btn_borrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_borrar.setText("Borrar");
        pnl_Paciente.add(btn_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 200, -1));

        bnt_consult.setBackground(new java.awt.Color(0, 0, 0));
        bnt_consult.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        bnt_consult.setForeground(new java.awt.Color(255, 255, 255));
        bnt_consult.setText("Consultar");
        pnl_Paciente.add(bnt_consult, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 200, -1));

        lbl_acepto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Acepto.png"))); // NOI18N
        pnl_Paciente.add(lbl_acepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 230, 230));

        lbl_Error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Error.png"))); // NOI18N
        pnl_Paciente.add(lbl_Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        pnl_Sexo.setOpaque(false);

        javax.swing.GroupLayout pnl_SexoLayout = new javax.swing.GroupLayout(pnl_Sexo);
        pnl_Sexo.setLayout(pnl_SexoLayout);
        pnl_SexoLayout.setHorizontalGroup(
            pnl_SexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 846, Short.MAX_VALUE)
        );
        pnl_SexoLayout.setVerticalGroup(
            pnl_SexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );

        lay_Workbench.setLayer(pnl_edad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lay_Workbench.setLayer(pnl_Paciente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lay_Workbench.setLayer(pnl_Sexo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lay_WorkbenchLayout = new javax.swing.GroupLayout(lay_Workbench);
        lay_Workbench.setLayout(lay_WorkbenchLayout);
        lay_WorkbenchLayout.setHorizontalGroup(
            lay_WorkbenchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Paciente, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
            .addGroup(lay_WorkbenchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_Sexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(lay_WorkbenchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay_WorkbenchLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnl_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        lay_WorkbenchLayout.setVerticalGroup(
            lay_WorkbenchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Paciente, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
            .addGroup(lay_WorkbenchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_Sexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(lay_WorkbenchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay_WorkbenchLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnl_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(lay_Workbench, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 850, 620));

        btn_Salir.setBackground(new java.awt.Color(0, 0, 0));
        btn_Salir.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        btn_Salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 170, 30));

        btn_grafSex.setBackground(new java.awt.Color(0, 0, 0));
        btn_grafSex.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        btn_grafSex.setForeground(new java.awt.Color(255, 255, 255));
        btn_grafSex.setText("Graficar Sexo");
        btn_grafSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grafSexActionPerformed(evt);
            }
        });
        getContentPane().add(btn_grafSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 170, 30));

        btn_grafEdad.setBackground(new java.awt.Color(0, 0, 0));
        btn_grafEdad.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        btn_grafEdad.setForeground(new java.awt.Color(255, 255, 255));
        btn_grafEdad.setText("Graficar Edad");
        btn_grafEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grafEdadActionPerformed(evt);
            }
        });
        getContentPane().add(btn_grafEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 170, 30));

        btn_grafRes.setBackground(new java.awt.Color(0, 0, 0));
        btn_grafRes.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        btn_grafRes.setForeground(new java.awt.Color(255, 255, 255));
        btn_grafRes.setText("Graficar Residencia");
        btn_grafRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grafResActionPerformed(evt);
            }
        });
        getContentPane().add(btn_grafRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 170, 30));

        btn_grafAltas.setBackground(new java.awt.Color(0, 0, 0));
        btn_grafAltas.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        btn_grafAltas.setForeground(new java.awt.Color(255, 255, 255));
        btn_grafAltas.setText("Graficar Altas");
        getContentPane().add(btn_grafAltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 170, 30));

        btn_nuevos.setBackground(new java.awt.Color(0, 0, 0));
        btn_nuevos.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        btn_nuevos.setForeground(new java.awt.Color(255, 255, 255));
        btn_nuevos.setText("Graficar Nuevos");
        getContentPane().add(btn_nuevos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 170, 30));

        btn_grafEnf.setBackground(new java.awt.Color(0, 0, 0));
        btn_grafEnf.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btn_grafEnf.setForeground(new java.awt.Color(255, 255, 255));
        btn_grafEnf.setText("Graficar Enfermedad");
        getContentPane().add(btn_grafEnf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 170, 30));

        lbl_Fondo.setBackground(new java.awt.Color(0, 0, 0));
        lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void chk_vpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_vpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_vpActionPerformed

    private void chk_AltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_AltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_AltaActionPerformed

    private void chk_epocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_epocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_epocActionPerformed

    private void cbx_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_resActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_resActionPerformed

    private void chk_parkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_parkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_parkActionPerformed

    private void chk_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_NuevoActionPerformed
        if(this.chk_Nuevo.isSelected()){
            this.cbx_ref.setEnabled(true);
        }
    }//GEN-LAST:event_chk_NuevoActionPerformed

    private void txt_nombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nombreFocusGained
        this.txt_nombre.setText("");
    }//GEN-LAST:event_txt_nombreFocusGained

    private void txt_nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nombreFocusLost
        if("".equals(this.txt_nombre.getText()) || " ".equals(this.txt_nombre.getText())){
            this.txt_nombre.setText("Nombre: ");
        }
    }//GEN-LAST:event_txt_nombreFocusLost

    private void txt_edadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_edadFocusGained
        this.txt_edad.setText("");
    }//GEN-LAST:event_txt_edadFocusGained

    private void txt_edadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_edadFocusLost
        if("".equals(this.txt_edad.getText()) || " ".equals(this.txt_edad.getText())){
            this.txt_edad.setText("Edad: ");
        }
    }//GEN-LAST:event_txt_edadFocusLost

    private void txt_cedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cedulaFocusGained
        this.txt_cedula.setText("");
    }//GEN-LAST:event_txt_cedulaFocusGained

    private void txt_cedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cedulaFocusLost
        if("".equals(this.txt_cedula.getText()) || " ".equals(this.txt_cedula.getText())){
            this.txt_cedula.setText("Edad: ");
        }
    }//GEN-LAST:event_txt_cedulaFocusLost

    private void btn_confActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_confActionPerformed

    private void btn_grafSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grafSexActionPerformed
        this.pnl_Sexo.setVisible(true);
        this.pnl_Paciente.setVisible(false);
        this.pnl_edad.setVisible(false);
        
        this.lay_Workbench.setLayer(pnl_Sexo, 0, 0);
        
        ChartPanel panel;
        JFreeChart chart = null;
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Hombres", logica.contarSexo("Masculino"));
        data.setValue("Mujeres", logica.contarSexo("Femenino"));
        
        chart = ChartFactory.createPieChart3D("Distribucion por generos", data, true, true, true);
        
        panel = new ChartPanel(chart);
        panel.setBounds(0, 0, 846, 616);
        
        pnl_Sexo.add(panel);
        pnl_Sexo.repaint();
    }//GEN-LAST:event_btn_grafSexActionPerformed

    private void btn_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pacienteActionPerformed
        this.pnl_Paciente.setVisible(true);
        this.pnl_Sexo.setVisible(false);
        this.pnl_edad.setVisible(false);
        
        this.lay_Workbench.setLayer(pnl_Paciente, 0, 0);
    }//GEN-LAST:event_btn_pacienteActionPerformed

    private void btn_grafResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grafResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_grafResActionPerformed

    private void chk_otrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_otrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_otrosActionPerformed

    private void btn_grafEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grafEdadActionPerformed
        this.pnl_edad.setVisible(true);
        this.lay_Workbench.setLayer(pnl_edad, 0, 0);
        
        ChartPanel panel;
        JFreeChart chart = null;
        
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("De 65 a 70", logica.contarEdad(65, 70));
        data.setValue("De 71 a 80", logica.contarEdad(71, 80));
        data.setValue("De 81 a 90", logica.contarEdad(81, 90));
        data.setValue("De 91 a 100", logica.contarEdad(91, 100));
        data.setValue("Más de 100", logica.contarEdad(101, 5000));
        
        chart = ChartFactory.createPieChart3D("Distribucion por Edad", data, true, true, true);
        
        panel = new ChartPanel(chart);
        panel.setBounds(0, 0, 846, 616);
        
        this.pnl_edad.add(panel);
        this.pnl_edad.repaint();
    }//GEN-LAST:event_btn_grafEdadActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_consult;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_conf;
    private javax.swing.JButton btn_grafAltas;
    private javax.swing.JButton btn_grafEdad;
    private javax.swing.JButton btn_grafEnf;
    private javax.swing.JButton btn_grafRes;
    private javax.swing.JButton btn_grafSex;
    private javax.swing.JButton btn_nuevos;
    private javax.swing.JButton btn_paciente;
    private javax.swing.JComboBox<String> cbx_ref;
    private javax.swing.JComboBox<String> cbx_res;
    private javax.swing.JComboBox<String> cbx_sexo;
    private javax.swing.JCheckBox cgk_demen;
    private javax.swing.JCheckBox chk_Alta;
    private javax.swing.JCheckBox chk_Cardio;
    private javax.swing.JCheckBox chk_Nuevo;
    private javax.swing.JCheckBox chk_Osteo;
    private javax.swing.JCheckBox chk_Poli;
    private javax.swing.JCheckBox chk_abandono;
    private javax.swing.JCheckBox chk_avc;
    private javax.swing.JCheckBox chk_cancer;
    private javax.swing.JCheckBox chk_dm;
    private javax.swing.JCheckBox chk_epoc;
    private javax.swing.JCheckBox chk_hta;
    private javax.swing.JCheckBox chk_inmv;
    private javax.swing.JCheckBox chk_irc;
    private javax.swing.JCheckBox chk_otros;
    private javax.swing.JCheckBox chk_park;
    private javax.swing.JCheckBox chk_vp;
    private javax.swing.JLayeredPane lay_Workbench;
    private javax.swing.JLabel lbl_Error;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JLabel lbl_acepto;
    private javax.swing.JPanel pnl_Paciente;
    private javax.swing.JPanel pnl_Sexo;
    private javax.swing.JPanel pnl_edad;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
