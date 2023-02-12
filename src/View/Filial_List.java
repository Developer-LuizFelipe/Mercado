package View;

import Controller.Controller_Cidade;
import Controller.Controller_Filial;
import Model.Filial;
import Util.Serviços;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import static View.Menu_principal.Tela;

public class Filial_List extends javax.swing.JInternalFrame {

    Controller_Filial Con_F = new Controller_Filial();

    public Filial_List() {
        initComponents();
        DefaultTableModel Modelo = (DefaultTableModel) tabela_filial.getModel();
        tabela_filial.setRowSorter(new TableRowSorter(Modelo));
        dadosTabela();
        orgTabela();
    }

    public void dadosTabela() {
        DefaultTableModel Modelo = (DefaultTableModel) tabela_filial.getModel();

        for (Filial filial : Con_F.Listar()) {
            Modelo.addRow(new Object[]{
                filial.getCod(),
                filial.getNome(),
                Serviços.colocar_cnpj(filial.getCnpj()),
                filial.getLogradouro() + ", " + filial.getNumero() + ", " + filial.getCidade().getNome() + ", " + filial.getCidade().getEstado().getNome(),});
        }
    }

    public void Pesquisar() {
        DefaultTableModel Modelo = (DefaultTableModel) tabela_filial.getModel();
        Modelo.setNumRows(0);
        for (Filial filial : Con_F.Pesquisar(pesquisar.getText())) {
            Modelo.addRow(new Object[]{
                filial.getCod(),
                filial.getNome(),
                Serviços.colocar_cnpj(filial.getCnpj()),
                filial.getLogradouro() + ", " + filial.getNumero() + ", " + filial.getCidade().getNome() + ", " + filial.getCidade().getEstado().getNome(),});
        }
    }

    public void orgTabela() {

        tabela_filial.getColumnModel().getColumn(0).setPreferredWidth(40);
        tabela_filial.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabela_filial.getColumnModel().getColumn(2).setPreferredWidth(150);
        tabela_filial.getColumnModel().getColumn(3).setPreferredWidth(300);

        ((DefaultTableCellRenderer) tabela_filial.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_filial = new javax.swing.JTable();
        Cadastrar = new javax.swing.JButton();
        pesquisar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("PESQUISAR FILIAL");

        tabela_filial.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tabela_filial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "NOME", "CNPJ", "ENDEREÇO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_filial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_filialMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_filial);
        if (tabela_filial.getColumnModel().getColumnCount() > 0) {
            tabela_filial.getColumnModel().getColumn(0).setResizable(false);
            tabela_filial.getColumnModel().getColumn(1).setResizable(false);
            tabela_filial.getColumnModel().getColumn(2).setResizable(false);
            tabela_filial.getColumnModel().getColumn(3).setResizable(false);
        }

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

        pesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisarKeyReleased(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
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
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Alterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Excluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabela_filialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_filialMouseClicked

    }//GEN-LAST:event_tabela_filialMouseClicked

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        Filial_Register Ca_F = new Filial_Register();
        Tela.add(Ca_F);
        Ca_F.setVisible(true);
        dispose();
    }//GEN-LAST:event_CadastrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisarKeyReleased
        Pesquisar();

    }//GEN-LAST:event_pesquisarKeyReleased

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed

        if (tabela_filial.getSelectedRow() != -1) {
            for (Filial filial : Con_F.Listar()) {
                if (tabela_filial.getValueAt(tabela_filial.getSelectedRow(), 0) == filial.getCod()) {

                    Filial_Edit Edit_F = new Filial_Edit(filial);
                    Menu_principal.Tela.add(Edit_F);
                    Edit_F.setVisible(true);
                    dispose();

                }

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione a filial Primeiro!");
        }

    }//GEN-LAST:event_AlterarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed

        if (tabela_filial.getSelectedRow() != -1) {
            for (Filial filial : Con_F.Listar()) {
                if (tabela_filial.getValueAt(tabela_filial.getSelectedRow(), 0) == filial.getCod()) {
                    if (0 == JOptionPane.showConfirmDialog(rootPane, "Quer realmente Excluir essa filial ?")) {
                        Con_F.Excluir(filial.getCod());
                        JOptionPane.showMessageDialog(rootPane, "Filial Excluida com Sucesso!  ");
                        Pesquisar();
                    }

                }
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione a filial Primeiro!");
        }


    }//GEN-LAST:event_ExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pesquisar;
    private javax.swing.JTable tabela_filial;
    // End of variables declaration//GEN-END:variables
}
