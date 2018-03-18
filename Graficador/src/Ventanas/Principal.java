/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author oto_z
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_agregarPac = new javax.swing.JButton();
        btn_agregarEnf = new javax.swing.JButton();
        btn_agregarTrat = new javax.swing.JButton();
        btn_GrafEnf = new javax.swing.JButton();
        lay_Workbench = new javax.swing.JLayeredPane();
        pnl_Paciente = new javax.swing.JPanel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Cedula = new javax.swing.JTextField();
        btn_GrafPac = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        btn_GrafGeo = new javax.swing.JButton();
        lbl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_agregarPac.setBackground(new java.awt.Color(0, 0, 0));
        btn_agregarPac.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        btn_agregarPac.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregarPac.setText("Agregar Paciente");
        btn_agregarPac.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btn_agregarPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        btn_agregarEnf.setBackground(new java.awt.Color(0, 0, 0));
        btn_agregarEnf.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        btn_agregarEnf.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregarEnf.setText("Agregar Enfermedad");
        btn_agregarEnf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btn_agregarEnf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 170, 30));

        btn_agregarTrat.setBackground(new java.awt.Color(0, 0, 0));
        btn_agregarTrat.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        btn_agregarTrat.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregarTrat.setText("Agregar Tratamiento");
        btn_agregarTrat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btn_agregarTrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 170, 30));

        btn_GrafEnf.setBackground(new java.awt.Color(0, 0, 0));
        btn_GrafEnf.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        btn_GrafEnf.setForeground(new java.awt.Color(255, 255, 255));
        btn_GrafEnf.setText("Graficar Enfermedad");
        btn_GrafEnf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btn_GrafEnf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 170, 30));

        lay_Workbench.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pnl_Paciente.setOpaque(false);
        pnl_Paciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Nombre.setBackground(new java.awt.Color(0, 0, 0));
        txt_Nombre.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_Nombre.setText("Nombre");
        txt_Nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_NombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_NombreFocusLost(evt);
            }
        });
        pnl_Paciente.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 290, -1));

        txt_Cedula.setBackground(new java.awt.Color(0, 0, 0));
        txt_Cedula.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_Cedula.setForeground(new java.awt.Color(255, 255, 255));
        txt_Cedula.setText("Cedula: ");
        txt_Cedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_CedulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_CedulaFocusLost(evt);
            }
        });
        pnl_Paciente.add(txt_Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 290, -1));

        lay_Workbench.setLayer(pnl_Paciente, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lay_WorkbenchLayout = new javax.swing.GroupLayout(lay_Workbench);
        lay_Workbench.setLayout(lay_WorkbenchLayout);
        lay_WorkbenchLayout.setHorizontalGroup(
            lay_WorkbenchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay_WorkbenchLayout.createSequentialGroup()
                .addComponent(pnl_Paciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        lay_WorkbenchLayout.setVerticalGroup(
            lay_WorkbenchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Paciente, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );

        getContentPane().add(lay_Workbench, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 850, 620));

        btn_GrafPac.setBackground(new java.awt.Color(0, 0, 0));
        btn_GrafPac.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        btn_GrafPac.setForeground(new java.awt.Color(255, 255, 255));
        btn_GrafPac.setText("Graficar Paciente");
        btn_GrafPac.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btn_GrafPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 170, 30));

        btn_Salir.setBackground(new java.awt.Color(0, 0, 0));
        btn_Salir.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        btn_Salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 170, 30));

        btn_GrafGeo.setBackground(new java.awt.Color(0, 0, 0));
        btn_GrafGeo.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        btn_GrafGeo.setForeground(new java.awt.Color(255, 255, 255));
        btn_GrafGeo.setText("Graficar Geografia");
        btn_GrafGeo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btn_GrafGeo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 170, 30));

        lbl_Fondo.setBackground(new java.awt.Color(0, 0, 0));
        lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void txt_NombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreFocusGained
        txt_Nombre.setText("");
    }//GEN-LAST:event_txt_NombreFocusGained

    private void txt_NombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreFocusLost
        if("".equals(txt_Nombre.getText()) || " ".equals(txt_Nombre.getText())){
            txt_Nombre.setText("Nombre: ");
        }
    }//GEN-LAST:event_txt_NombreFocusLost

    private void txt_CedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_CedulaFocusGained
        txt_Cedula.setText("");
    }//GEN-LAST:event_txt_CedulaFocusGained

    private void txt_CedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_CedulaFocusLost
        if("".equals(txt_Cedula.getText()) || " ".equals(txt_Cedula.getText())){
            txt_Cedula.setText("Cedula: ");
        }
    }//GEN-LAST:event_txt_CedulaFocusLost

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
    private javax.swing.JButton btn_GrafEnf;
    private javax.swing.JButton btn_GrafGeo;
    private javax.swing.JButton btn_GrafPac;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_agregarEnf;
    private javax.swing.JButton btn_agregarPac;
    private javax.swing.JButton btn_agregarTrat;
    private javax.swing.JLayeredPane lay_Workbench;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JPanel pnl_Paciente;
    private javax.swing.JTextField txt_Cedula;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}
