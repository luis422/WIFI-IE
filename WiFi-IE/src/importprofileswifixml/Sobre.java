package importprofileswifixml;

public class Sobre extends javax.swing.JFrame {

    String linguagem = "br";
    public Sobre(String lang) {
        initComponents();
        linguagem = lang;
        if (linguagem.toLowerCase().equals("br")){
            this.setTitle("Sobre o Software");
            Texto1.setText("Software Brasileiro");
            Texto2.setText("Este software foi desenvolvido por um programador brasieiro do interior de São Paulo, com a intenção de facilitar a importação e a exportação de perfis de rede Wi-Fi do Windows.");
        }else if(linguagem.toLowerCase().equals("us")){
            this.setTitle("About the Software");
            Texto1.setText("Brazilian Software");
            Texto2.setText("This software was developed by a Brazilian programmer from the interior of São Paulo, with the intention of facilitating the import and export of Windows Wi-Fi network profiles.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        Texto1 = new javax.swing.JLabel();
        icone = new javax.swing.JLabel();
        quadro = new javax.swing.JScrollPane();
        Texto2 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre o Software");
        setMinimumSize(new java.awt.Dimension(518, 143));
        setResizable(false);

        Principal.setBackground(new java.awt.Color(39, 36, 39));
        Principal.setMaximumSize(new java.awt.Dimension(518, 143));
        Principal.setMinimumSize(new java.awt.Dimension(518, 143));

        Texto1.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        Texto1.setForeground(new java.awt.Color(204, 204, 204));
        Texto1.setText("Software Brasileiro");

        icone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/importprofileswifixml/brasil.png"))); // NOI18N

        quadro.setBorder(null);

        Texto2.setBackground(new java.awt.Color(39, 36, 39));
        Texto2.setBorder(null);
        Texto2.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        Texto2.setForeground(new java.awt.Color(204, 204, 204));
        Texto2.setText("Este software foi desenvolvido por um programador brasieiro do interior de São Paulo, com a intenção de facilitar a importação e a exportação de perfis de rede Wi-Fi do Windows.");
        Texto2.setCaretColor(new java.awt.Color(204, 204, 204));
        Texto2.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Texto2.setEnabled(false);
        quadro.setViewportView(Texto2);

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icone, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Texto1)
                    .addComponent(quadro, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icone, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quadro)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sobre("br").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principal;
    private javax.swing.JLabel Texto1;
    private javax.swing.JTextPane Texto2;
    private javax.swing.JLabel icone;
    private javax.swing.JScrollPane quadro;
    // End of variables declaration//GEN-END:variables
}
