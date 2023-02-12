package View;

import Controller.Controller_Funcionario;
import Model.Funcionario;
import Util.Serviços;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import static View.Menu_principal.Tela;


public class Venda_Relatorio extends javax.swing.JInternalFrame {

    Controller_Funcionario Con_F = new Controller_Funcionario();

    public Venda_Relatorio() {
        initComponents();
        DefaultTableModel Modelo = (DefaultTableModel) tabela_funcionario.getModel();
        tabela_funcionario.setRowSorter(new TableRowSorter(Modelo));
        dadosTabela();
        orgTabela();
    }

    public void dadosTabela() {
//        DefaultTableModel Modelo = (DefaultTableModel) tabela_funcionario.getModel();
//
//        for (Funcionario funcionario : Con_F.Listar()) {
//            Modelo.addRow(new Object[]{
//                funcionario.getCod(),
//                funcionario.getNome(),
//                Serviços.cargo(funcionario.getCargo()),
//                funcionario.getFilial().getNome(),
//                Serviços.colocar_telefone(funcionario.getTelefone())
//            });
//        }
    }

    public void orgTabela() {
        DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
        cellRender.setHorizontalAlignment(SwingConstants.CENTER);
        tabela_funcionario.getColumnModel().getColumn(0).setPreferredWidth(50);
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
        jButton2 = new javax.swing.JButton();
        data_inicio = new javax.swing.JTextField();
        try{

            javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("##/##/####");

            data_inicio = new javax.swing.JFormattedTextField(format_textField3);

        }catch (Exception e){}
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        data_inicio1 = new javax.swing.JTextField();
        try{

            javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("##/##/####");

            data_inicio = new javax.swing.JFormattedTextField(format_textField3);

        }catch (Exception e){}
        filial = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        filial1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("RELATORIO");

        tabela_funcionario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tabela_funcionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD ", "DATA DA VENDA", "VENDEDOR ", "ITENS", "TOTAL"
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

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Pesquisar ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        data_inicio.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel6.setText("DATA INICIAL");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel7.setText("DATA FINAL");

        data_inicio1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        filial.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        filial.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                filialPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        filial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filialActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel14.setText("FILIAL ");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel8.setText("DESCRIÇÃO DO PRODUTO");

        filial1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        filial1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                filial1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        filial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filial1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel15.setText("FUNCIONARIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(filial, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(jLabel6))
                                        .addComponent(data_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(jLabel7))
                                        .addComponent(data_inicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextField1)
                                    .addComponent(filial1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(data_inicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filial, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(filial1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabela_funcionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_funcionarioMouseClicked
        for (Funcionario funcionario : Con_F.Listar()) {
//            if (tabela_funcionario.getValueAt(tabela_funcionario.getSelectedRow(), 0) == funcionario.getCod()) {
//                Funcionario_Edit edit_F = new Funcionario_Edit(funcionario);
//                Menu_principal.Tela_principal.add(edit_F);
//                edit_F.setVisible(true);
//                dispose();
//            }

        }
    }//GEN-LAST:event_tabela_funcionarioMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void filialPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_filialPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_filialPopupMenuWillBecomeInvisible

    private void filialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filialActionPerformed

    }//GEN-LAST:event_filialActionPerformed

    private void filial1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_filial1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_filial1PopupMenuWillBecomeInvisible

    private void filial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filial1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filial1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField data_inicio;
    private javax.swing.JTextField data_inicio1;
    private javax.swing.JComboBox<String> filial;
    private javax.swing.JComboBox<String> filial1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabela_funcionario;
    // End of variables declaration//GEN-END:variables
}
