package View;

import Controller.Controller_Funcionario;
import Model.Filial;
import Model.Funcionario;
import Util.Serviços;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import static View.Menu_principal.Tela;
import javax.swing.JOptionPane;

public class Funcionario_List extends javax.swing.JInternalFrame {

    Controller_Funcionario Con_F = new Controller_Funcionario();

    public Funcionario_List() {
        initComponents();
        DefaultTableModel Modelo = (DefaultTableModel) tabela_funcionario.getModel();
        tabela_funcionario.setRowSorter(new TableRowSorter(Modelo));
        dadosTabela();
        orgTabela();
    }

    public void Pesquisar() {
        DefaultTableModel Modelo = (DefaultTableModel) tabela_funcionario.getModel();
        Modelo.setNumRows(0);
        for (Funcionario funcionario : Con_F.Pesquisar(Pesquisar.getText())) {
            Modelo.addRow(new Object[]{
                funcionario.getCod(),
                funcionario.getNome(),
                Serviços.cargo(funcionario.getCargo()),
                funcionario.getFilial().getNome(),
                Serviços.colocar_telefone(funcionario.getTelefone())
            });
        }
    }

    public void dadosTabela() {
        DefaultTableModel Modelo = (DefaultTableModel) tabela_funcionario.getModel();

        for (Funcionario funcionario : Con_F.Listar()) {
            Modelo.addRow(new Object[]{
                funcionario.getCod(),
                funcionario.getNome(),
                Serviços.cargo(funcionario.getCargo()),
                funcionario.getFilial().getNome(),
                Serviços.colocar_telefone(funcionario.getTelefone())
            });
        }
    }

    public void orgTabela() {
        DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
        cellRender.setHorizontalAlignment(SwingConstants.CENTER);
        tabela_funcionario.getColumnModel().getColumn(0).setPreferredWidth(01);
        tabela_funcionario.getColumnModel().getColumn(1).setPreferredWidth(200);
        tabela_funcionario.getColumnModel().getColumn(2).setPreferredWidth(80);
        tabela_funcionario.getColumnModel().getColumn(3).setPreferredWidth(110);
        tabela_funcionario.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabela_funcionario.getColumnModel().getColumn(4).setCellRenderer(cellRender);
        tabela_funcionario.getColumnModel().getColumn(3).setCellRenderer(cellRender);
        tabela_funcionario.getColumnModel().getColumn(2).setCellRenderer(cellRender);
        tabela_funcionario.getColumnModel().getColumn(0).setCellRenderer(cellRender);

        ((DefaultTableCellRenderer) tabela_funcionario.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_funcionario = new javax.swing.JTable();
        Pesquisar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        Cadastrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("FUNCIONARIO");

        tabela_funcionario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tabela_funcionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "NOME", "CARGO", "FILIAL", "TELEFONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_funcionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabela_funcionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_funcionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_funcionario);
        if (tabela_funcionario.getColumnModel().getColumnCount() > 0) {
            tabela_funcionario.getColumnModel().getColumn(0).setResizable(false);
            tabela_funcionario.getColumnModel().getColumn(1).setResizable(false);
            tabela_funcionario.getColumnModel().getColumn(2).setResizable(false);
            tabela_funcionario.getColumnModel().getColumn(3).setResizable(false);
            tabela_funcionario.getColumnModel().getColumn(4).setResizable(false);
        }

        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });
        Pesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PesquisarKeyReleased(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Pesquisar ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Excluir.setBackground(new java.awt.Color(204, 0, 0));
        Excluir.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Excluir.setForeground(new java.awt.Color(255, 255, 255));
        Excluir.setText("Excluir");
        Excluir.setToolTipText("Exluir Dados da Filial Selecionada.");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        Alterar.setBackground(new java.awt.Color(255, 102, 0));
        Alterar.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Alterar.setForeground(new java.awt.Color(255, 255, 255));
        Alterar.setText("Alterar");
        Alterar.setToolTipText("Alterar dados da Filial selecionada.");
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });

        Cadastrar.setBackground(new java.awt.Color(102, 204, 0));
        Cadastrar.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        Cadastrar.setText("Cadastrar");
        Cadastrar.setToolTipText("Cadastrar novasFilial.");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Alterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Excluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cadastrar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabela_funcionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_funcionarioMouseClicked

    }//GEN-LAST:event_tabela_funcionarioMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Pesquisar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesquisarKeyReleased
        {
            Pesquisar();
        }    }//GEN-LAST:event_PesquisarKeyReleased

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
    }//GEN-LAST:event_PesquisarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed

        if (tabela_funcionario.getSelectedRow() != -1) {
            for (Funcionario funcionario : Con_F.Listar()) {
                if (0 == JOptionPane.showConfirmDialog(rootPane, "Quer realmente Excluir esse funcionario ?")) {
                    Con_F.Excluir(funcionario.getCod());
                    JOptionPane.showMessageDialog(rootPane, "Funcionario Excluido com Sucesso!  ");

                    Pesquisar();

                }

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione a filial Primeiro!");
        }

    }//GEN-LAST:event_ExcluirActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed

        if (tabela_funcionario.getSelectedRow() != -1) {
            for (Funcionario funcionario : Con_F.Listar()) {
                if (tabela_funcionario.getValueAt(tabela_funcionario.getSelectedRow(), 0) == funcionario.getCod()) {
                    Funcionario_Edit edit_F = new Funcionario_Edit(funcionario);
                    Menu_principal.Tela.add(edit_F);
                    edit_F.setVisible(true);
                    dispose();
                }

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione o Funcinario Primeiro!");
        }
    }//GEN-LAST:event_AlterarActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        Funcionario_Register Ca_F = new Funcionario_Register();
        Tela.add(Ca_F);
        Ca_F.setVisible(true);
        dispose();
    }//GEN-LAST:event_CadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton Excluir;
    private javax.swing.JTextField Pesquisar;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_funcionario;
    // End of variables declaration//GEN-END:variables
}
