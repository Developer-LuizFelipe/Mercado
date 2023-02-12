package View;

import Controller.Controller_Funcionario;
import Model.Funcionario;
import Util.Serviços;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import static View.Menu_principal.Tela;


public class Venda_Register extends javax.swing.JInternalFrame {

    Controller_Funcionario Con_F = new Controller_Funcionario();

    public Venda_Register() {
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
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        data_inicio = new javax.swing.JTextField();
        try{

            javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("##/##/####");

            data_inicio = new javax.swing.JFormattedTextField(format_textField3);

        }catch (Exception e){}
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("PRODUTO");

        tabela_funcionario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tabela_funcionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "DESCRIÇÃO ", "GTD", "VLR. UNT.", "TOTAL"
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

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel14.setText("COD PRODUTO");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jTextField2.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel15.setText("QUANTIDADE");

        jTextField3.setEditable(false);
        jTextField3.setEnabled(false);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jTextField4.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel16.setText("R$");

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel17.setText("SUB TOTAL:");

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel18.setText("TOTAL");

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jTextField5.setEnabled(false);

        data_inicio.setEditable(false);
        data_inicio.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        data_inicio.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel6.setText("DATA DA VENDA");

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel19.setText("F10 - FINALIZAR A VENDA   ");

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel20.setText("F2 - EXCLUIR ITEM");

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel21.setText("F9 - DESCONTO ");

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel22.setText("ESC - CANCELAR A VENDA ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(508, 508, 508))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel22))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(data_inicio)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jTextField1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)))))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(data_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField data_inicio;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tabela_funcionario;
    // End of variables declaration//GEN-END:variables
}
