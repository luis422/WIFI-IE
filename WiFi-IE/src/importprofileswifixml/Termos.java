package importprofileswifixml;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.BorderFactory;

public class Termos extends javax.swing.JFrame {

    String linguagem = "br";
    
    public Termos() {
        initComponents();
        aceitar.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        Principal = new javax.swing.JPanel();
        Texto1 = new javax.swing.JLabel();
        quadro = new javax.swing.JScrollPane();
        Termos = new javax.swing.JTextPane();
        aceitar = new javax.swing.JButton();
        recusar = new javax.swing.JButton();
        icone = new javax.swing.JLabel();
        selecaoLinguagem = new javax.swing.JComboBox<>();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Termos de uso");
        setMinimumSize(new java.awt.Dimension(639, 290));
        setResizable(false);

        Principal.setBackground(new java.awt.Color(39, 36, 39));
        Principal.setMinimumSize(new java.awt.Dimension(639, 290));

        Texto1.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        Texto1.setForeground(new java.awt.Color(204, 204, 204));
        Texto1.setText("Termos de uso do software");

        quadro.setBackground(new java.awt.Color(39, 36, 39));
        quadro.setBorder(null);

        Termos.setBackground(new java.awt.Color(39, 36, 39));
        Termos.setBorder(null);
        Termos.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        Termos.setForeground(new java.awt.Color(204, 204, 204));
        Termos.setText("Ao clicar no botão \"Aceitar\" você concorda em dar acesso ás pastas de todos os dispositivos de armazenamento conectados neste computador(hd, ssd, pendrive etc.), ao cmd, a perfis de wifi salvos neste computador, e ao nome deste computador.");
        Termos.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Termos.setEnabled(false);
        quadro.setViewportView(Termos);

        aceitar.setBackground(new java.awt.Color(76, 76, 76));
        aceitar.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        aceitar.setForeground(new java.awt.Color(255, 255, 255));
        aceitar.setText("Aceitar");
        aceitar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        aceitar.setFocusPainted(false);
        aceitar.setMaximumSize(new java.awt.Dimension(70, 25));
        aceitar.setMinimumSize(new java.awt.Dimension(70, 25));
        aceitar.setPreferredSize(new java.awt.Dimension(70, 25));
        aceitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aceitarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aceitarMouseExited(evt);
            }
        });
        aceitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceitarActionPerformed(evt);
            }
        });

        recusar.setBackground(new java.awt.Color(76, 76, 76));
        recusar.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        recusar.setForeground(new java.awt.Color(204, 204, 204));
        recusar.setText("Recusar");
        recusar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        recusar.setFocusPainted(false);
        recusar.setMaximumSize(new java.awt.Dimension(90, 25));
        recusar.setMinimumSize(new java.awt.Dimension(90, 25));
        recusar.setPreferredSize(new java.awt.Dimension(90, 25));
        recusar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                recusarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recusarMouseExited(evt);
            }
        });
        recusar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recusarActionPerformed(evt);
            }
        });

        icone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/importprofileswifixml/img.png"))); // NOI18N
        icone.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        icone.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        selecaoLinguagem.setBackground(new java.awt.Color(76, 76, 76));
        selecaoLinguagem.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        selecaoLinguagem.setForeground(new java.awt.Color(67, 241, 237));
        selecaoLinguagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Português (BR)", "English (US)" }));
        selecaoLinguagem.setAutoscrolls(true);
        selecaoLinguagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(67, 241, 237)));
        selecaoLinguagem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        selecaoLinguagem.setFocusable(false);
        selecaoLinguagem.setRequestFocusEnabled(false);
        selecaoLinguagem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selecaoLinguagemItemStateChanged(evt);
            }
        });
        selecaoLinguagem.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                selecaoLinguagemMouseWheelMoved(evt);
            }
        });
        selecaoLinguagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecaoLinguagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quadro, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(selecaoLinguagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315)
                .addComponent(recusar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aceitar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quadro, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(icone)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceitar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recusar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecaoLinguagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recusarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recusarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_recusarActionPerformed

    private void aceitarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceitarMouseEntered
        aceitar.setForeground(new Color(67, 241, 237));
        aceitar.setBackground(Color.BLACK);
        aceitar.setBorder(BorderFactory.createLineBorder(new Color(67, 241, 237)));
    }//GEN-LAST:event_aceitarMouseEntered

    private void recusarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recusarMouseEntered
        recusar.setForeground(new Color(67, 241, 237));
        recusar.setBackground(Color.BLACK);
        recusar.setBorder(BorderFactory.createLineBorder(new Color(67, 241, 237)));
    }//GEN-LAST:event_recusarMouseEntered

    private void aceitarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceitarMouseExited
        aceitar.setForeground(Color.WHITE);
        aceitar.setBackground(new Color(76,76,76));
        aceitar.setBorder(BorderFactory.createLineBorder(Color.WHITE));
    }//GEN-LAST:event_aceitarMouseExited

    private void recusarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recusarMouseExited
        recusar.setForeground(new Color(204,204,204));
        recusar.setBackground(new Color(76,76,76));
        recusar.setBorder(BorderFactory.createLineBorder(new Color(204,204,204)));
    }//GEN-LAST:event_recusarMouseExited

    private void aceitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceitarActionPerformed
        this.toBack();
        this.setVisible(false);
        Janela j = new Janela(linguagem);
        Image iconFrame = Toolkit.getDefaultToolkit().getImage(j.getClass().getResource("/importprofileswifixml/icon.png"));
        j.setIconImage(iconFrame);
        j.setLocationRelativeTo(null);
        j.setAutoRequestFocus(true);
        j.requestFocus();
        j.setVisible(true);
    }//GEN-LAST:event_aceitarActionPerformed

    private void selecaoLinguagemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selecaoLinguagemItemStateChanged
        int index = selecaoLinguagem.getSelectedIndex();
        if (index == 0){
            linguagem = "br";
            this.setTitle("Termos de uso");
            aceitar.setText("Aceitar");
            recusar.setText("Recusar");
            Texto1.setText("Termos de uso do Software");
            Termos.setText("Ao clicar no botão \"Aceitar\" você concorda em dar acesso ás pastas de todos os dispositivos de armazenamento conectados neste computador(hd, ssd, pendrive etc.), ao cmd, a perfis de wifi salvos neste computador, e ao nome deste computador.");
        }else if (index == 1){
            linguagem = "us";
            this.setTitle("Terms of use");
            aceitar.setText("Accept");
            recusar.setText("Decline");
            Texto1.setText("Software Terms of Use");
            Termos.setText("By clicking on the \"Accept\" button, you agree to access the folders of all storage devices on the computer (hd, ssd, pendrive etc.), cmd, wifi profiles saved on this computer and the name of this computer.");
        }
    }//GEN-LAST:event_selecaoLinguagemItemStateChanged

    private void selecaoLinguagemMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_selecaoLinguagemMouseWheelMoved
        try{
            if (evt.getWheelRotation() < 0 && selecaoLinguagem.getSelectedIndex() > 0){
                    selecaoLinguagem.setSelectedIndex(selecaoLinguagem.getSelectedIndex()-1);
            }else if(evt.getWheelRotation() > 0 && !(selecaoLinguagem.getSelectedIndex() > selecaoLinguagem.getMaximumRowCount())){
                    selecaoLinguagem.setSelectedIndex(selecaoLinguagem.getSelectedIndex()+1);
            }
        }catch(Exception e){}
    }//GEN-LAST:event_selecaoLinguagemMouseWheelMoved

    private void selecaoLinguagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecaoLinguagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selecaoLinguagemActionPerformed

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
            java.util.logging.Logger.getLogger(Termos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Termos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Termos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Termos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Termos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principal;
    private javax.swing.JTextPane Termos;
    private javax.swing.JLabel Texto1;
    private javax.swing.JButton aceitar;
    private javax.swing.JLabel icone;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JScrollPane quadro;
    private javax.swing.JButton recusar;
    private javax.swing.JComboBox<String> selecaoLinguagem;
    // End of variables declaration//GEN-END:variables
}
