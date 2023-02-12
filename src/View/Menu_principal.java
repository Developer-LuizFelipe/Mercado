package View;

import Controller.Controller_Funcionario;
import Model.Funcionario;

public class Menu_principal extends javax.swing.JFrame {

    Controller_Funcionario Con_Fun = new Controller_Funcionario();
    Integer codigo = null, cod_log = 0;

    public Menu_principal(Integer cod) {
        initComponents();
        this.codigo = cod;
        painel.setVisible(false);

        for (Funcionario funcionario : Con_Fun.Listar()) {
            if (cod == funcionario.getCod()) {
                Entrar.setText(funcionario.getNome().split(" ")[0]+" "+funcionario.getNome().split(" ")[1]);
            }
        }
        Entrar.setSize(150, 53);
        Entrar.setAlignmentX(CENTER_ALIGNMENT);
    }

    public void logar() {
        Tela_Login log = new Tela_Login();
        Tela.add(log);
        log.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tela = new javax.swing.JDesktopPane();
        avatar = new javax.swing.JLabel();
        Entrar = new javax.swing.JButton();
        Filial = new javax.swing.JButton();
        Funcionario = new javax.swing.JButton();
        Estoque = new javax.swing.JButton();
        Relatorio = new javax.swing.JButton();
        Venda = new javax.swing.JButton();
        Requisição = new javax.swing.JButton();
        Mensagem = new javax.swing.JButton();
        painel = new javax.swing.JPanel();
        Logout = new javax.swing.JButton();
        Config = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        Tela.setForeground(new java.awt.Color(255, 255, 255));
        Tela.setPreferredSize(new java.awt.Dimension(1365, 700));
        Tela.setRequestFocusEnabled(false);
        Tela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelaMouseClicked(evt);
            }
        });

        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo_man.png"))); // NOI18N
        avatar.setToolTipText("");

        Entrar.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Entrar.setForeground(new java.awt.Color(255, 255, 255));
        Entrar.setText("Entrar");
        Entrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        Entrar.setBorderPainted(false);
        Entrar.setContentAreaFilled(false);
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });

        Filial.setBackground(new java.awt.Color(153, 153, 153));
        Filial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/link-company-child-removebg-preview.png"))); // NOI18N
        Filial.setToolTipText("Filiais");
        Filial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Filial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilialActionPerformed(evt);
            }
        });

        Funcionario.setBackground(new java.awt.Color(153, 153, 153));
        Funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fund-removebg-preview.png"))); // NOI18N
        Funcionario.setToolTipText("Funcionarios");
        Funcionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuncionarioActionPerformed(evt);
            }
        });

        Estoque.setBackground(new java.awt.Color(153, 153, 153));
        Estoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/estoque_22-removebg-preview.png"))); // NOI18N
        Estoque.setToolTipText("Estoque");
        Estoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstoqueActionPerformed(evt);
            }
        });

        Relatorio.setBackground(new java.awt.Color(153, 153, 153));
        Relatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/RELATORIO.png"))); // NOI18N
        Relatorio.setToolTipText("Relatorios");
        Relatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioActionPerformed(evt);
            }
        });

        Venda.setBackground(new java.awt.Color(153, 153, 153));
        Venda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/VENDA 1.png"))); // NOI18N
        Venda.setToolTipText("Venda");
        Venda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendaActionPerformed(evt);
            }
        });

        Requisição.setBackground(new java.awt.Color(153, 153, 153));
        Requisição.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/requisição-.png"))); // NOI18N
        Requisição.setToolTipText("Requisições");
        Requisição.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Requisição.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequisiçãoActionPerformed(evt);
            }
        });

        Mensagem.setBackground(new java.awt.Color(153, 153, 153));
        Mensagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MENS-.png"))); // NOI18N
        Mensagem.setToolTipText("");
        Mensagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MensagemActionPerformed(evt);
            }
        });

        painel.setBackground(new java.awt.Color(153, 153, 153));

        Logout.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("Logout");
        Logout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        Logout.setBorderPainted(false);
        Logout.setContentAreaFilled(false);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        Config.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Config.setForeground(new java.awt.Color(255, 255, 255));
        Config.setText("Configurações");
        Config.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        Config.setBorderPainted(false);
        Config.setContentAreaFilled(false);
        Config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Config, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Config, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        Tela.setLayer(avatar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Tela.setLayer(Entrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Tela.setLayer(Filial, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Tela.setLayer(Funcionario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Tela.setLayer(Estoque, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Tela.setLayer(Relatorio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Tela.setLayer(Venda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Tela.setLayer(Requisição, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Tela.setLayer(Mensagem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Tela.setLayer(painel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout TelaLayout = new javax.swing.GroupLayout(Tela);
        Tela.setLayout(TelaLayout);
        TelaLayout.setHorizontalGroup(
            TelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(TelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaLayout.createSequentialGroup()
                        .addComponent(Filial, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(Estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(Venda, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(Mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(avatar)
                        .addGap(6, 6, 6)
                        .addGroup(TelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(TelaLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TelaLayout.createSequentialGroup()
                        .addComponent(Relatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(Requisição, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        TelaLayout.setVerticalGroup(
            TelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(TelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Filial, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TelaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TelaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TelaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Venda, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TelaLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(Mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TelaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Entrar)
                        .addGap(1, 1, 1)
                        .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(TelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Relatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Requisição, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Filial.getAccessibleContext().setAccessibleName("Filial");

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/house.png"))); // NOI18N
        jMenu2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add.png"))); // NOI18N
        jMenuItem1.setText("Adicionar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/magnifier.png"))); // NOI18N
        jMenuItem2.setText("Pesquisar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tela, javax.swing.GroupLayout.DEFAULT_SIZE, 1353, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Tela, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        if (cod_log == 0) {
            cod_log = 1;
            painel.setVisible(true);
        } else {
            cod_log = 0;
            painel.setVisible(false);
        }
    }//GEN-LAST:event_EntrarActionPerformed

    private void FilialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilialActionPerformed
        if (codigo != null) {
            Filial_List List_F = new Filial_List();
            Tela.add(List_F);
            List_F.setVisible(true);
        }
    }//GEN-LAST:event_FilialActionPerformed

    private void FuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuncionarioActionPerformed
        if (codigo != null) {
            Funcionario_List List_F = new Funcionario_List();
            Tela.add(List_F);
            List_F.setVisible(true);
        }
    }//GEN-LAST:event_FuncionarioActionPerformed

    private void EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstoqueActionPerformed
        if (codigo != null) {
            Estoque_List list_P = new Estoque_List();
            Estoque_Register List_E = new Estoque_Register();
            Tela.add(list_P);
//        Tela_principal.add(List_E);
//        List_E.setVisible(true);
            list_P.setVisible(true);
        }
    }//GEN-LAST:event_EstoqueActionPerformed

    private void RelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioActionPerformed
        if (codigo != null) {
            Venda_Relatorio Relatorio_V = new Venda_Relatorio();
            Tela.add(Relatorio_V);
            Relatorio_V.setVisible(true);
        }
    }//GEN-LAST:event_RelatorioActionPerformed

    private void VendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VendaActionPerformed

    private void RequisiçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequisiçãoActionPerformed
        if (codigo != null) {
            Tela_messagem Mensagem = new Tela_messagem();
            Tela.add(Mensagem);
            Mensagem.setVisible(true);
        }
    }//GEN-LAST:event_RequisiçãoActionPerformed

    private void MensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MensagemActionPerformed
        Funcionario.setEnabled(true);
    }//GEN-LAST:event_MensagemActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
    }//GEN-LAST:event_formFocusGained

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Filial_List List_F = new Filial_List();
        Tela.add(List_F);
        List_F.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Filial_Register Ca_F = new Filial_Register();
        Tela.add(Ca_F);
        Ca_F.setVisible(true);
        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo_girl.png")));
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        dispose();
        new Tela_Login().setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

    private void ConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfigActionPerformed
        for (Funcionario funcionario : Con_Fun.Listar()) {
            if (codigo == funcionario.getCod()) {
                Funcionario_Edit edit_F = new Funcionario_Edit(funcionario);
                Tela.add(edit_F);
                edit_F.setVisible(true);
                painel.setVisible(false);
                cod_log = 0;
            }

        }
    }//GEN-LAST:event_ConfigActionPerformed

    private void TelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelaMouseClicked
        painel.setVisible(false);
        cod_log = 0;
    }//GEN-LAST:event_TelaMouseClicked

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
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_principal(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Config;
    private javax.swing.JButton Entrar;
    private javax.swing.JButton Estoque;
    private javax.swing.JButton Filial;
    private javax.swing.JButton Funcionario;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Mensagem;
    private javax.swing.JButton Relatorio;
    private javax.swing.JButton Requisição;
    public static javax.swing.JDesktopPane Tela;
    private javax.swing.JButton Venda;
    private javax.swing.JLabel avatar;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
}
