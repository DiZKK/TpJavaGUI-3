package trabajo.práctico.obligatorio.pkg3;

import javax.swing.JOptionPane;

public class AcountAccess extends javax.swing.JFrame {
    public AcountAccess() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jpTitleBackground = new javax.swing.JPanel();
        jlTitle = new javax.swing.JLabel();
        jpLoginBackground = new javax.swing.JPanel();
        jlUser = new javax.swing.JLabel();
        jlPass = new javax.swing.JLabel();
        Contraseña = new javax.swing.JPasswordField();
        Username = new javax.swing.JTextField();
        jbLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpTitleBackground.setBackground(new java.awt.Color(204, 204, 204));
        jpTitleBackground.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlTitle.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jlTitle.setForeground(new java.awt.Color(0, 0, 0));
        jlTitle.setText("Sign in");

        javax.swing.GroupLayout jpTitleBackgroundLayout = new javax.swing.GroupLayout(jpTitleBackground);
        jpTitleBackground.setLayout(jpTitleBackgroundLayout);
        jpTitleBackgroundLayout.setHorizontalGroup(
            jpTitleBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTitleBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpTitleBackgroundLayout.setVerticalGroup(
            jpTitleBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTitleBackgroundLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpLoginBackground.setBackground(new java.awt.Color(204, 204, 204));
        jpLoginBackground.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Sign in to your account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jpLoginBackground.setPreferredSize(new java.awt.Dimension(300, 220));

        jlUser.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jlUser.setForeground(new java.awt.Color(0, 0, 0));
        jlUser.setText("Username:");

        jlPass.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jlPass.setForeground(new java.awt.Color(0, 0, 0));
        jlPass.setText("Password:");

        Contraseña.setBackground(new java.awt.Color(0, 0, 0));
        Contraseña.setForeground(new java.awt.Color(204, 204, 204));
        Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaActionPerformed(evt);
            }
        });

        Username.setBackground(new java.awt.Color(0, 0, 0));
        Username.setForeground(new java.awt.Color(204, 204, 204));
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });

        jbLogin.setBackground(new java.awt.Color(0, 0, 0));
        jbLogin.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jbLogin.setForeground(new java.awt.Color(204, 204, 204));
        jbLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabajo/práctico/obligatorio/pkg3/6372974_account_avatar_log in_login_register_icon.png"))); // NOI18N
        jbLogin.setText("Login");
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpLoginBackgroundLayout = new javax.swing.GroupLayout(jpLoginBackground);
        jpLoginBackground.setLayout(jpLoginBackgroundLayout);
        jpLoginBackgroundLayout.setHorizontalGroup(
            jpLoginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLoginBackgroundLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jpLoginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlUser)
                    .addComponent(jlPass))
                .addGap(18, 18, 18)
                .addGroup(jpLoginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLoginBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbLogin)
                .addGap(20, 20, 20))
        );
        jpLoginBackgroundLayout.setVerticalGroup(
            jpLoginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLoginBackgroundLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpLoginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlUser)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpLoginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPass)
                    .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jbLogin)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jpTitleBackground, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jpLoginBackground, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jpLoginBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jpTitleBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jpTitleBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpLoginBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ContraseñaActionPerformed

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed
        // TODO add your handling code here:
        String User = "alumnos@ulp.edu.com";
        String Password = "12345678";
        
        String Pass = new String (Contraseña.getPassword());
        
        if (Username.getText().equals(User) && Pass.equals(Password)) {
            JOptionPane.showMessageDialog(this, "Welcome back!" );
        }else JOptionPane.showMessageDialog(this, "Wrong Username or Password" );
        
        Contraseña.setText("");
        Username.setText("");
        
        
      
    }//GEN-LAST:event_jbLoginActionPerformed

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:z
    }//GEN-LAST:event_UsernameActionPerformed

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
            java.util.logging.Logger.getLogger(AcountAccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcountAccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcountAccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcountAccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcountAccess().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JTextField Username;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JButton jbLogin;
    private javax.swing.JLabel jlPass;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JLabel jlUser;
    private javax.swing.JPanel jpLoginBackground;
    private javax.swing.JPanel jpTitleBackground;
    // End of variables declaration//GEN-END:variables
}
