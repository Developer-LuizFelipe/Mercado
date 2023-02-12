package View;

import Controller.Controller_Filial;
import Model.Filial;
import Util.Serviços;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Estoque_Register extends javax.swing.JInternalFrame {

    Controller_Filial Con_F = new Controller_Filial();
    int i = 0;
    double vlr_total_att = 0;
    DecimalFormat formatador = new DecimalFormat("0.00");

    public Estoque_Register() {
        initComponents();

        DefaultTableModel Modelo = (DefaultTableModel) tabela.getModel();
        tabela.setRowSorter(new TableRowSorter(Modelo));
        dados_filial();
        orgTabela();
        data_inicio.setText(data_inicial());

    }

    public String data_inicial() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return "" + dateFormat.format(date);
    }

    public String vlr_total() {
            vlr_total_att = Double.parseDouble(quantidade.getText()) * Double.parseDouble(vlr_unt.getText().replace(",", "."));
            return "" + formatador.format(vlr_total_att);
    }

    public void dados_filial() {
        for (Filial filial : Con_F.Listar()) {
            this.filial.addItem(filial.getNome());
        }
        this.filial.setSelectedItem(null);
    }

    public void orgTabela() {

        tabela.getColumnModel().getColumn(0).setPreferredWidth(10);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(250);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(55);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(70);
        tabela.getColumnModel().getColumn(4).setPreferredWidth(40);
        tabela.getColumnModel().getColumn(5).setPreferredWidth(10);

        ((DefaultTableCellRenderer) tabela.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        data_inicio = new javax.swing.JTextField();
        try{

            javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("##/##/####");

            data_inicio = new javax.swing.JFormattedTextField(format_textField3);

        }catch (Exception e){}
        filial = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        adicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        descricao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        quantidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        try{

            javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("##/##/####");

            validade = new javax.swing.JFormattedTextField(format_textField3);

        }catch (Exception e){}
        validade = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        vlr_total = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        vlr_unt = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setClosable(true);
        setIconifiable(true);
        setTitle("ESTOQUE");

        data_inicio.setEditable(false);
        data_inicio.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

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

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel6.setText("DATA DA ENTRADA");

        adicionar.setBackground(new java.awt.Color(51, 255, 0));
        adicionar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        adicionar.setForeground(new java.awt.Color(255, 255, 255));
        adicionar.setText("Adicionar");
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });

        tabela.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDEM", "DESCRIÇÃO", "QUANTIDADE", "VALOR UNITÁRIO", "TOTAL", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(2).setResizable(false);
            tabela.getColumnModel().getColumn(3).setResizable(false);
            tabela.getColumnModel().getColumn(4).setResizable(false);
            tabela.getColumnModel().getColumn(5).setResizable(false);
        }

        descricao.setEditable(false);
        descricao.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel9.setText("DESCRIÇÃO DO PRODUTO");

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel11.setText("VALOR UNT.");

        quantidade.setEditable(false);
        quantidade.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeActionPerformed(evt);
            }
        });
        quantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantidadeKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel12.setText("QUANTIDADE");

        validade.setEditable(false);
        validade.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel13.setText("DATA DE VALIDADE");

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel14.setText("FILIAL ");

        vlr_total.setEditable(false);
        vlr_total.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        vlr_total.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel15.setText("VALOR TOTAL");

        jButton4.setBackground(new java.awt.Color(51, 102, 255));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Salvar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        vlr_unt.setEditable(false);
        vlr_unt.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        vlr_unt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        vlr_unt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vlr_untKeyReleased(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 102, 0));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(descricao, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantidade)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vlr_unt, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vlr_total, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(data_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(validade, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)))
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(filial, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(data_inicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vlr_total)
                            .addComponent(vlr_unt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validade, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
        DefaultTableModel Modelo = (DefaultTableModel) tabela.getModel();
        i++;
         DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        if (filial.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(rootPane, "O campo Filial e obrigatorio!");
        } else if (descricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo descrição e obrigatorio!");
        } else if (quantidade.getText() == null) {
            JOptionPane.showMessageDialog(rootPane, "O campo Quanatidade e obrigatorio!");
        } else if (quantidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo Valor Unitario e obrigatorio!");
        } else if ("  /  /    ".equals(validade.getText())) {
            JOptionPane.showMessageDialog(rootPane, "O campo Validade e obrigatorio!");
        } else {
            Modelo.addRow(new Object[]{
                i,
                descricao.getText(),
                quantidade.getText(),
                decimalFormat.format(Double.parseDouble(vlr_unt.getText().replace(",", "."))),
                decimalFormat.format(Double.parseDouble(vlr_total.getText().replace(",", "."))),
                "Excluir"

            });
            descricao.setText("");
            quantidade.setText("");
            quantidade.setText("");
            vlr_total.setText("");
            vlr_unt.setText("");
            validade.setText("");

            for (int i = 0; i < tabela.getRowCount(); i++) {
                tabela.setValueAt(i + 1, i, 0);
            }

        }
    }//GEN-LAST:event_adicionarActionPerformed

    private void filialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filialActionPerformed

    }//GEN-LAST:event_filialActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
        if (tabela.getSelectedColumn() == 05) {
            dtm.removeRow(tabela.getSelectedRow());
            tabela.setModel(dtm);

            for (int i = 0; i < tabela.getRowCount(); i++) {
                tabela.setValueAt(i + 1, i, 0);
            }

        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void filialPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_filialPopupMenuWillBecomeInvisible
        if (filial.getSelectedIndex() >= 0) {
            descricao.setEditable(true);
            quantidade.setEditable(true);
            quantidade.setEditable(true);
            validade.setEditable(true);
            vlr_unt.setEditable(true);
            descricao.setEnabled(true);
            quantidade.setEnabled(true);
            quantidade.setEnabled(true);
            validade.setEnabled(true);
            vlr_unt.setEnabled(true);
       }    }//GEN-LAST:event_filialPopupMenuWillBecomeInvisible

    private void quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeActionPerformed
                if (quantidade.getText().isEmpty()|| vlr_unt.getText().isEmpty()) {
            vlr_total.setText("");
        }
        else
        vlr_total.setText("" + vlr_total());

    }//GEN-LAST:event_quantidadeActionPerformed

    private void quantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeKeyReleased
        quantidade.setText(quantidade.getText().replaceAll("[^0-9]", ""));
                if (quantidade.getText().isEmpty()|| vlr_unt.getText().isEmpty()) {
            vlr_total.setText("");
        }
        else
        vlr_total.setText("" + vlr_total());

    }//GEN-LAST:event_quantidadeKeyReleased

    private void vlr_untKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vlr_untKeyReleased
        vlr_unt.setText(vlr_unt.getText().replaceAll("[^0-9 | ^,]", ""));
                if (quantidade.getText().isEmpty()|| vlr_unt.getText().isEmpty()) {
            vlr_total.setText("");
        }
        else
        vlr_total.setText("" + vlr_total());

    }//GEN-LAST:event_vlr_untKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Estoque_List List_P = new Estoque_List();
        Menu_principal.Tela.add(List_P);
        List_P.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar;
    private javax.swing.JTextField data_inicio;
    private javax.swing.JTextField descricao;
    private javax.swing.JComboBox<String> filial;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField quantidade;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField validade;
    private javax.swing.JTextField vlr_total;
    private javax.swing.JTextField vlr_unt;
    // End of variables declaration//GEN-END:variables

}
