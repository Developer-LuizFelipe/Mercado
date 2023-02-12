package View;

import Controller.Controller_Cidade;
import Controller.Controller_Filial;
import Model.Cidade;
import Model.Filial;
import Util.Serviços;
import java.util.List;
import javax.swing.JOptionPane;

public class Filial_Edit extends javax.swing.JInternalFrame {

    Controller_Filial Con_F = new Controller_Filial();
    Controller_Cidade Con_C = new Controller_Cidade();
    List<Cidade> cidade;
    Filial filial = new Filial();

    public Filial_Edit(Filial filial) {
        initComponents();
        prencherCidade();
        this.filial = filial;
        DadosFilial();
    }

    public void prencherCidade() {
        cidade = Con_C.buscar();
        for (Cidade cidade1 : cidade) {
            Op_cidade.addItem(cidade1.getNome());
        }

    }

    public void DadosFilial() {
        nome.setText(filial.getNome());
        Op_cidade.setSelectedItem(filial.getCidade().getNome());
        uf.setText(filial.getCidade().getEstado().getNome());
        logradouro.setText(filial.getLogradouro());
        num.setText(filial.getNumero());
        bairro.setText(filial.getBairro());
        cep.setText(filial.getCep());
        telefone.setText(Serviços.colocar_telefone(filial.getTelefone()));
        CNPJ.setText(filial.getCnpj());
        email.setText(filial.getEmail());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
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
        jButton2 = new javax.swing.JButton();
        CNPJ = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cnpj = new javax.swing.text.MaskFormatter("##.###.###/####-##");
            CNPJ = new javax.swing.JFormattedTextField(cnpj);
        }
        catch (Exception e){
        }
        jLabel8 = new javax.swing.JLabel();
        telefone = new javax.swing.JTextField();
        try{

            javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("#####-###");

            cep = new javax.swing.JFormattedTextField(format_textField3);

        }catch (Exception e){}
        jLabel9 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        try{

            javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("(##)#.####-####");

            telefone = new javax.swing.JFormattedTextField(format_textField3);

        }catch (Exception e){}
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("EDITAR FILIAL");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText(" NOME DA FILIAL");

        nome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

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

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(80, 141, 224));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Alterar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        CNPJ.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("CNPJ");

        telefone.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("TELEFONE");

        email.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("E-MAIL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(nome)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Op_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addContainerGap())
                                .addComponent(num))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(email))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(15, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Op_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CNPJ)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
        } else if ("     -   ".equals(cep.getText())) {
            JOptionPane.showMessageDialog(rootPane, "O campo CEP e obrigatorio!");
        } else {
            for (Cidade cidade1 : cidade) {
                if (cidade1.getNome().equals(Op_cidade.getSelectedItem())) {

                    filial.setNome(nome.getText());
                    filial.setCidade(cidade1);
                    filial.setLogradouro(logradouro.getText());
                    filial.setNumero(num.getText());
                    filial.setBairro(bairro.getText());
                    filial.setCep(cep.getText().replaceAll("[^\\d ]", ""));
                    filial.setCnpj(CNPJ.getText().replaceAll("[^\\d ]", ""));
                    filial.setEmail(email.getText());
                    filial.setTelefone(telefone.getText().replaceAll("[^\\d ]", ""));

                    if (0 == JOptionPane.showConfirmDialog(rootPane, "Quer realmente Editar essa filial ?")) {
                        Con_F.Atualizar(filial);

                        JOptionPane.showMessageDialog(rootPane, "Filial Editada com Sucesso! ");
                        Filial_List List_F = new Filial_List();
                        Menu_principal.Tela.add(List_F);
                        List_F.setVisible(true);
                        dispose();
                    }

                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Filial_List List_F = new Filial_List();
        Menu_principal.Tela.add(List_F);
        List_F.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Op_cidadePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Op_cidadePopupMenuWillBecomeInvisible
        for (Cidade cidade1 : cidade) {
            if (cidade1.getNome().equals(Op_cidade.getSelectedItem())) {
                uf.setText(cidade1.getEstado().getNome());
            }
        }
    }//GEN-LAST:event_Op_cidadePopupMenuWillBecomeInvisible


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CNPJ;
    private javax.swing.JComboBox<Object> Op_cidade;
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
