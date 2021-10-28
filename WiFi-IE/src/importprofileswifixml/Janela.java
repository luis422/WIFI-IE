package importprofileswifixml;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Janela extends javax.swing.JFrame {

    String linguagem = "br";
    
    public Janela(String lang) {
        initComponents();
        linguagem = lang;
        if(linguagem.toLowerCase().equals("br")){
            this.setTitle("Importar e Exportar Perfis Wi-Fi");
            Texto1.setText("• Este programa importa e exporta perfis de rede Wi-Fi através de arquivos XML.");
            Texto2.setText("• Se você não selecionar a pasta, o caminho padrão será onde o programa está.");
            Texto4.setText("Pasta selecionada:");
            Texto5.setText("Perfis Importados:");
            PerfisExistentes.setText("Perfis Existentes em ");
            Importar.setText("Importar Perfis de");
            Exportar.setText("Exportar Perfis para");
            LimparConsole.setText("Limpar Console");
        }else if(linguagem.toLowerCase().equals("us")){
            this.setTitle("Import and Export Wi-Fi Profile");
            Texto1.setText("• This program imports and exports Wi-Fi network profiles through XML files.");
            Texto2.setText("• If you do not select the folder, the default path is where the program is located.");
            Texto4.setText("Selected folder:");
            Texto5.setText("Imported Profiles:");
            PerfisExistentes.setText("Existing Profiles in ");
            Importar.setText("Import Profiles from");
            Exportar.setText("Export Profiles to");
            LimparConsole.setText("Clear Console");
        }
        try{
            File diretorio = new File("").getAbsoluteFile();
            Pasta.setText(diretorio.toString());
            caminhoPadrao = diretorio;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            String computername = InetAddress.getLocalHost().getHostName();
            PerfisExistentes.setText(PerfisExistentes.getText()+computername);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    File caminho = null;
    File caminhoPadrao = null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        Texto1 = new javax.swing.JLabel();
        Icone = new javax.swing.JLabel();
        PerfisExistentes = new javax.swing.JButton();
        Importar = new javax.swing.JButton();
        Exportar = new javax.swing.JButton();
        Texto4 = new javax.swing.JLabel();
        quadro2 = new javax.swing.JScrollPane();
        Pasta = new javax.swing.JEditorPane();
        quadro = new javax.swing.JScrollPane();
        Arquivos = new javax.swing.JTextArea();
        Texto5 = new javax.swing.JLabel();
        NumPerfil = new javax.swing.JLabel();
        LimparConsole = new javax.swing.JButton();
        info = new javax.swing.JLabel();
        quadro3 = new javax.swing.JScrollPane();
        Texto2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Importar e Exportar Perfis Wi-Fi");
        setMinimumSize(new java.awt.Dimension(652, 554));
        setResizable(false);

        Principal.setBackground(new java.awt.Color(39, 36, 39));
        Principal.setMaximumSize(new java.awt.Dimension(652, 554));
        Principal.setMinimumSize(new java.awt.Dimension(652, 554));

        Texto1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        Texto1.setForeground(new java.awt.Color(204, 204, 204));
        Texto1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto1.setText("• Este programa importa e exporta perfis de rede Wi-Fi através de arquivos XML.");

        Icone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/importprofileswifixml/img.png"))); // NOI18N

        PerfisExistentes.setBackground(new java.awt.Color(76, 76, 76));
        PerfisExistentes.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        PerfisExistentes.setForeground(new java.awt.Color(255, 255, 255));
        PerfisExistentes.setText("Perfis Existentes em %computername%");
        PerfisExistentes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        PerfisExistentes.setFocusPainted(false);
        PerfisExistentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PerfisExistentesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PerfisExistentesMouseExited(evt);
            }
        });
        PerfisExistentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfisExistentesActionPerformed(evt);
            }
        });

        Importar.setBackground(new java.awt.Color(76, 76, 76));
        Importar.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        Importar.setForeground(new java.awt.Color(255, 255, 255));
        Importar.setText("Importar Perfis de");
        Importar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Importar.setFocusPainted(false);
        Importar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ImportarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ImportarMouseExited(evt);
            }
        });
        Importar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportarActionPerformed(evt);
            }
        });

        Exportar.setBackground(new java.awt.Color(76, 76, 76));
        Exportar.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        Exportar.setForeground(new java.awt.Color(255, 255, 255));
        Exportar.setText("Exportar Perfis para");
        Exportar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Exportar.setFocusPainted(false);
        Exportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExportarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExportarMouseExited(evt);
            }
        });
        Exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarActionPerformed(evt);
            }
        });

        Texto4.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        Texto4.setForeground(new java.awt.Color(204, 204, 204));
        Texto4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto4.setText("Pasta selecionada:");

        quadro2.setBorder(null);
        quadro2.setForeground(new java.awt.Color(0, 255, 0));
        quadro2.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        quadro2.setRequestFocusEnabled(false);
        quadro2.setVerifyInputWhenFocusTarget(false);

        Pasta.setBackground(Principal.getBackground());
        Pasta.setBorder(null);
        Pasta.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        Pasta.setForeground(new java.awt.Color(67, 241, 237));
        Pasta.setText(":(");
        Pasta.setDisabledTextColor(new java.awt.Color(67, 241, 237));
        Pasta.setEnabled(false);
        Pasta.setFocusable(false);
        quadro2.setViewportView(Pasta);

        quadro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        Arquivos.setBackground(new java.awt.Color(0, 0, 0));
        Arquivos.setColumns(20);
        Arquivos.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        Arquivos.setForeground(new java.awt.Color(67, 241, 237));
        Arquivos.setLineWrap(true);
        Arquivos.setRows(5);
        Arquivos.setWrapStyleWord(true);
        Arquivos.setDisabledTextColor(new java.awt.Color(67, 241, 237));
        Arquivos.setEnabled(false);
        quadro.setViewportView(Arquivos);

        Texto5.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        Texto5.setForeground(new java.awt.Color(204, 204, 204));
        Texto5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto5.setText("Perfis Importados:");

        NumPerfil.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        NumPerfil.setForeground(new java.awt.Color(67, 241, 237));
        NumPerfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NumPerfil.setText("0");

        LimparConsole.setBackground(Principal.getBackground());
        LimparConsole.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        LimparConsole.setForeground(new java.awt.Color(255, 255, 255));
        LimparConsole.setText("Limpar Console");
        LimparConsole.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        LimparConsole.setRequestFocusEnabled(false);
        LimparConsole.setRolloverEnabled(false);
        LimparConsole.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LimparConsoleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LimparConsoleMouseExited(evt);
            }
        });
        LimparConsole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparConsoleActionPerformed(evt);
            }
        });

        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/importprofileswifixml/info.png"))); // NOI18N
        info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                infoMouseExited(evt);
            }
        });

        quadro3.setBorder(null);
        quadro3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        quadro3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Texto2.setEditable(false);
        Texto2.setBackground(Principal.getBackground());
        Texto2.setColumns(20);
        Texto2.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        Texto2.setForeground(new java.awt.Color(204, 204, 204));
        Texto2.setLineWrap(true);
        Texto2.setRows(5);
        Texto2.setText("• Se você não selecionar a pasta, o caminho padrão será onde o programa está.");
        Texto2.setWrapStyleWord(true);
        Texto2.setBorder(null);
        Texto2.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Texto2.setEnabled(false);
        Texto2.setFocusable(false);
        quadro3.setViewportView(Texto2);

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quadro, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PrincipalLayout.createSequentialGroup()
                        .addComponent(Texto5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NumPerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LimparConsole, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(quadro2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PrincipalLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PrincipalLayout.createSequentialGroup()
                                        .addComponent(Texto4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(175, 175, 175))
                                    .addGroup(PrincipalLayout.createSequentialGroup()
                                        .addComponent(info)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                        .addComponent(Icone, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)))
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Exportar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                    .addComponent(Importar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PerfisExistentes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35))
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(quadro3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Texto1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(10, 10, 10))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quadro3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(PerfisExistentes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Exportar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Icone, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quadro2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quadro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LimparConsole, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto5))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportarActionPerformed
        Arquivos.setText("");
        if(linguagem.toLowerCase().equals("br")){
            Texto5.setText("Perfis Importados:");
        }else if(linguagem.toLowerCase().equals("us")){
            Texto5.setText("Imported Profiles:");
        }
        NumPerfil.setText("0");
        JFileChooser f = new JFileChooser();
        f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        f.showSaveDialog(null);
        caminho = f.getSelectedFile();
        Pasta.setText(""+f.getSelectedFile());
        if (Pasta.getText().equals("null")){
            Pasta.setText(caminhoPadrao.toString());
        }
        /**/
        try{
            File diretorio = new File("").getAbsoluteFile();
            if (caminho!=null){
                diretorio = caminho;
            }
            File arquivos[];
            arquivos = diretorio.listFiles();
            for(int i=0; i<arquivos.length; i++){
                if(arquivos[i].getName().startsWith("Wi-Fi-") && arquivos[i].getName().toLowerCase().endsWith(".xml")){
                    Arquivos.setText(Arquivos.getText()+arquivos[i].getName()+"\n");
                    NumPerfil.setText(Integer.parseInt(NumPerfil.getText())+1+"");
                    String caminhoArquivo = "\""+diretorio.toString()+"\\"+arquivos[i].getName()+"\"";
                    Runtime.getRuntime().exec("netsh wlan add profile filename="+caminhoArquivo+" user=all");
                }
            }
        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(null, "Erro "+e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro "+e);
        }        
    }//GEN-LAST:event_ImportarActionPerformed

    private void PerfisExistentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfisExistentesActionPerformed
        PerfisExistentes j = new PerfisExistentes(linguagem);
        Image iconFrame = Toolkit.getDefaultToolkit().getImage(j.getClass().getResource("/importprofileswifixml/icon.png"));
        j.setIconImage(iconFrame);
        j.setLocationRelativeTo(null);
        j.setAutoRequestFocus(true);
        j.requestFocus();
        j.setVisible(true);
    }//GEN-LAST:event_PerfisExistentesActionPerformed

    private void ImportarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImportarMouseEntered
        if(linguagem.toLowerCase().equals("br")){
            Importar.setToolTipText("Importe os perfis da pasta selecionada");
        }else if(linguagem.toLowerCase().equals("us")){
            Importar.setToolTipText("Import the profiles from the selected folder");
        }
        Importar.setForeground(new Color(67, 241, 237));
        Importar.setBackground(Color.BLACK);
        Importar.setBorder(BorderFactory.createLineBorder(new Color(67, 241, 237)));
    }//GEN-LAST:event_ImportarMouseEntered

    private void PerfisExistentesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfisExistentesMouseEntered
        if(linguagem.toLowerCase().equals("br")){
            PerfisExistentes.setToolTipText("Listar todas as redes salvas neste computador");
        }else if(linguagem.toLowerCase().equals("us")){
            PerfisExistentes.setToolTipText("List all networks saved on this computer");
        }
        PerfisExistentes.setForeground(new Color(67, 241, 237));
        PerfisExistentes.setBackground(Color.BLACK);
        PerfisExistentes.setBorder(BorderFactory.createLineBorder(new Color(67, 241, 237)));
    }//GEN-LAST:event_PerfisExistentesMouseEntered

    private void PerfisExistentesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfisExistentesMouseExited
        PerfisExistentes.setForeground(Color.WHITE);
        PerfisExistentes.setBackground(new Color(76,76,76));
        PerfisExistentes.setBorder(BorderFactory.createLineBorder(Color.WHITE));
    }//GEN-LAST:event_PerfisExistentesMouseExited

    private void ImportarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImportarMouseExited
        Importar.setForeground(Color.WHITE);
        Importar.setBackground(new Color(76,76,76));
        Importar.setBorder(BorderFactory.createLineBorder(Color.WHITE));
    }//GEN-LAST:event_ImportarMouseExited

    private void ExportarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExportarMouseEntered
        if(linguagem.toLowerCase().equals("br")){
            Exportar.setToolTipText("Selecione a pasta onde serão salvos todos os perfis deste computador");
        }else if(linguagem.toLowerCase().equals("us")){
            Exportar.setToolTipText("Select the folder where all the profiles on this computer will be saved");
        }
        Exportar.setForeground(new Color(67, 241, 237));
        Exportar.setBackground(Color.BLACK);
        Exportar.setBorder(BorderFactory.createLineBorder(new Color(67, 241, 237)));
    }//GEN-LAST:event_ExportarMouseEntered

    private void ExportarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExportarMouseExited
        Exportar.setForeground(Color.WHITE);
        Exportar.setBackground(new Color(76,76,76));
        Exportar.setBorder(BorderFactory.createLineBorder(Color.WHITE));
    }//GEN-LAST:event_ExportarMouseExited

    private void ExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarActionPerformed
        Arquivos.setText("");
        if(linguagem.toLowerCase().equals("br")){
            Texto5.setText("Perfis Exportados:");
        }else if(linguagem.toLowerCase().equals("us")){
            Texto5.setText("Exported Profiles:");
        }
        NumPerfil.setText("0");
        JFileChooser f = new JFileChooser();
        f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        f.showSaveDialog(null);
        String caminhoExportacao = f.getSelectedFile().toString();
        Pasta.setText(caminhoExportacao);
        try {
            Arquivos.setText("");
            Process p;
            p = Runtime.getRuntime().exec("netsh wlan export profile folder=\""+caminhoExportacao+"\" key=clear");
            //pega o retorno do processo
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream(), "850"));
            String line;
            int c=1;
            while ((line = stdInput.readLine()) != null) {
                if (line.length() > 0) {
                    line = line.substring (0, line.length() - 1);
                }
                if (c%2==0) {
                    line = line+"\n\n";
                    Arquivos.setText(Arquivos.getText()+line);
                    NumPerfil.setText(Integer.parseInt(NumPerfil.getText())+1+"");
                }c++;
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_ExportarActionPerformed

    private void LimparConsoleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimparConsoleMouseEntered
        if(linguagem.toLowerCase().equals("br")){
            LimparConsole.setToolTipText("Limpa o console e reseta a pasta padrão");
        }else if(linguagem.toLowerCase().equals("us")){
            LimparConsole.setToolTipText("Clears the console and resets the default folder");
        }
        LimparConsole.setForeground(new Color(67, 241, 237));
        LimparConsole.setBackground(Color.BLACK);
        LimparConsole.setBorder(BorderFactory.createLineBorder(new Color(67, 241, 237)));
    }//GEN-LAST:event_LimparConsoleMouseEntered

    private void LimparConsoleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimparConsoleMouseExited
        LimparConsole.setForeground(Color.WHITE);
        LimparConsole.setBackground(Principal.getBackground());
        LimparConsole.setBorder(BorderFactory.createLineBorder(Color.WHITE));
    }//GEN-LAST:event_LimparConsoleMouseExited

    private void LimparConsoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparConsoleActionPerformed
        Arquivos.setText("");
        NumPerfil.setText("0");
        if(linguagem.toLowerCase().equals("br")){
            Texto5.setText("Perfis Exportados:");
        }else if(linguagem.toLowerCase().equals("us")){
            Texto5.setText("Exported Profiles:");
        }
        Pasta.setText(caminhoPadrao.toString());
        caminho = caminhoPadrao;
    }//GEN-LAST:event_LimparConsoleActionPerformed

    private void infoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseEntered
        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/importprofileswifixml/info-2.png")));
    }//GEN-LAST:event_infoMouseEntered

    private void infoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseExited
        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/importprofileswifixml/info.png")));
    }//GEN-LAST:event_infoMouseExited

    private void infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseClicked
    Sobre s = new Sobre(linguagem);
    Image iconFrame = Toolkit.getDefaultToolkit().getImage(s.getClass().getResource("/importprofileswifixml/icon.png"));
    s.setIconImage(iconFrame);
    s.setLocationRelativeTo(null);
    s.setAutoRequestFocus(true);
    s.requestFocus();
    s.setVisible(true);
    }//GEN-LAST:event_infoMouseClicked

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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela("br").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Arquivos;
    private javax.swing.JButton Exportar;
    private javax.swing.JLabel Icone;
    private javax.swing.JButton Importar;
    private javax.swing.JButton LimparConsole;
    private javax.swing.JLabel NumPerfil;
    private javax.swing.JEditorPane Pasta;
    private javax.swing.JButton PerfisExistentes;
    private javax.swing.JPanel Principal;
    private javax.swing.JLabel Texto1;
    private javax.swing.JTextArea Texto2;
    private javax.swing.JLabel Texto4;
    private javax.swing.JLabel Texto5;
    private javax.swing.JLabel info;
    private javax.swing.JScrollPane quadro;
    private javax.swing.JScrollPane quadro2;
    private javax.swing.JScrollPane quadro3;
    // End of variables declaration//GEN-END:variables
}
