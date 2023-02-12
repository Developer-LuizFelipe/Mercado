package View;

import Controller.Controller_Cidade;
import Controller.Controller_Filial;
import Model.Cidade;
import Model.Funcionario;
import java.util.List;
import javax.swing.JOptionPane;

public class Filial_Register extends javax.swing.JInternalFrame {

    Controller_Filial Con_F = new Controller_Filial();
    Controller_Cidade Con_C = new Controller_Cidade();
    List<Cidade> cidade;

    public Filial_Register() {
        initComponents();
        prencherCidade();
    }

    public void prencherCidade() {
        cidade = Con_C.buscar();
        for (Cidade cidade1 : cidade) {
            Op_cidade.addItem(cidade1.getNome());
        }
        this.Op_cidade.setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CNPJ = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cnpj = new javax.swing.text.MaskFormatter("##.###.###/####-##");
            CNPJ = new javax.swing.JFormattedTextField(cnpj);
        }
        catch (Exception e){
        }
        jLabel2 = new javax.swing.JLabel();
        uf = new javax.swing.JTextField();
        Op_cidade = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        logradouro = new javax.swing.JTextField();
        cep = new javax.swing.JTextField();
        try{

            javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("#####-###");

            cep = new javax.swing.JFormattedTextField(format_textField3);

        }catch (Exception e){}
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bairro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        nome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        telefone = new javax.swing.JTextField();
        try{

            javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("(##)#.####-####");

            telefone = new javax.swing.JFormattedTextField(format_textField3);

        }catch (Exception e){}
        jLabel9 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        try{

            javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("(##)#.####-####");

            telefone = new javax.swing.JFormattedTextField(format_textField3);

        }catch (Exception e){}
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("CADASTRAR FILIAL");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("CNPJ");

        CNPJ.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText(" LOGRADOURO");

        uf.setEditable(false);
        uf.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        Op_cidade.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Op_cidade.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Op_cidadePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText(" CIDADE");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText(" UF");

        num.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText(" Nº");

        logradouro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        cep.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("CEP.");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText(" BAIRRO");

        bairro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jButton1.setBackground(new java.awt.Color(80, 141, 224));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cadastrar");
        jButton1.setPreferredSize(new java.awt.Dimension(91, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText(" NOME DA FILIAL");

        telefone.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("TELEFONE");

        email.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("E-MAIL");

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(logradouro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(nome)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel7))
                            .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefone)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(Op_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CNPJ, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Op_cidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Op_cidadePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Op_cidadePopupMenuWillBecomeInvisible
        for (Cidade cidade1 : cidade) {
            if (cidade1.getNome().equals(Op_cidade.getSelectedItem())) {
                uf.setText(cidade1.getEstado().getNome());
            }
        }
    }//GEN-LAST:event_Op_cidadePopupMenuWillBecomeInvisible

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (Op_cidade.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(rootPane, "A campo Cidade e obrigatorio!");
        } else if (nome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo Nome e obrigatorio!");
        } else if ("  .   .   /    -  ".equals(CNPJ.getText())) {
            JOptionPane.showMessageDialog(rootPane, "O campo CNPJ e obrigatorio!");
        } else if (email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo E-mail e obrigatorio!");
        } else if (logradouro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo Logradouro e obrigatorio!");
        } else if (num.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo Numero e obrigatorio!");
        } else if (bairro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo Bairro e obrigatorio!");
        } else if ("(  ) .    -    ".equals(telefone.getText())) {
            JOptionPane.showMessageDialog(rootPane, "O campo Telefone e obrigatorio!");
        }  else if ("     -   ".equals(cep.getText())) {
            JOptionPane.showMessageDialog(rootPane, "O campo CEP e obrigatorio!");
        } else {

            for (Cidade cidade1 : cidade) {
                if (cidade1.getNome().equals(Op_cidade.getSelectedItem())) {
                    if (uf.getText().equals(cidade1.getEstado().getNome())) {
                        Integer id = Con_F.Cadastrar(nome.getText(), cidade1.getCod(),
                                logradouro.getText(), num.getText(), bairro.getText(),
                                cep.getText().replaceAll("[^\\d ]", ""),
                                CNPJ.getText().replaceAll("[^\\d ]", ""),
                                telefone.getText().replaceAll("[^\\d ]", ""), email.getText());
                        if (id != 0) {
                            JOptionPane.showMessageDialog(rootPane, "Filial Cadastrada com Sucesso! \n "
                                    + "Número de indentificação: " + id);
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro ao inserir a Filial!\n ");
                        }

                        Filial_List List_F = new Filial_List();
                        Menu_principal.Tela.add(List_F);
                        List_F.setVisible(true);

                        dispose();
                    }

                }
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Filial_List List_F = new Filial_List();
        Menu_principal.Tela.add(List_F);
        List_F.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CNPJ;
    public javax.swing.JComboBox<Object> Op_cidade;
    private javax.swing.JTextField bairro;
    private javax.swing.JTextField cep;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField logradouro;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField num;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField uf;
    // End of variables declaration//GEN-END:variables
}
