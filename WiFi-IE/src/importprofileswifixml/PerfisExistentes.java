package importprofileswifixml;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class PerfisExistentes extends javax.swing.JFrame {

    String linguagem = "br";
    public PerfisExistentes(String lang) {
        initComponents();
        linguagem = lang;
        if(linguagem.toLowerCase().equals("br")){
            this.setTitle("Perfis");
            Texto1.setText("Perfis existentes neste PC");
        }else if(linguagem.toLowerCase().equals("us")){
            this.setTitle("Profiles");
            Texto1.setText("Profiles on this PC");
        }
        try {
            Process p;
            p = Runtime.getRuntime().exec("netsh wlan show profile");
            //pega o retorno do processo
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream(), "850"));
            String line;
            while ((line = stdInput.readLine()) != null) {
                Perfis.setText(Perfis.getText()+line+"\n");
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Erro "+e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        Texto1 = new javax.swing.JLabel();
        quadro = new javax.swing.JScrollPane();
        Perfis = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Principal.setBackground(new java.awt.Color(39, 36, 39));
        Principal.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        Texto1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        Texto1.setForeground(new java.awt.Color(204, 204, 204));
        Texto1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto1.setText("Perfis existentes neste PC");

        quadro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        Perfis.setBackground(new java.awt.Color(0, 0, 0));
        Perfis.setColumns(20);
        Perfis.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        Perfis.setForeground(new java.awt.Color(67, 241, 237));
        Perfis.setRows(5);
        Perfis.setAutoscrolls(false);
        Perfis.setDisabledTextColor(new java.awt.Color(67, 241, 237));
        Perfis.setEnabled(false);
        quadro.setViewportView(Perfis);

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Texto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(364, 364, 364))
            .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PrincipalLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(quadro, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
            .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(quadro, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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
            java.util.logging.Logger.getLogger(PerfisExistentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfisExistentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfisExistentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfisExistentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfisExistentes("br").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Perfis;
    private javax.swing.JPanel Principal;
    private javax.swing.JLabel Texto1;
    private javax.swing.JScrollPane quadro;
    // End of variables declaration//GEN-END:variables
}
