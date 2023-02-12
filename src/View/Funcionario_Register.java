package View;

import Controller.Controller_Cidade;
import Controller.Controller_Filial;
import Controller.Controller_Funcionario;
import Model.Cidade;
import Model.Filial;
import java.util.List;
import javax.swing.JOptionPane;
import static View.Menu_principal.Tela;

public class Funcionario_Register extends javax.swing.JInternalFrame {

    Controller_Filial Con_F = new Controller_Filial();
    Controller_Cidade Con_C = new Controller_Cidade();
    Controller_Funcionario Con_Fun = new Controller_Funcionario();
    List<Cidade> cidade;

    public Funcionario_Register() {
        initComponents();
        dados_filial();
        prencherCidade();
        
        sexo.addItem("Masculino");
        sexo.addItem("Feminino");
        sexo.addItem("Outro");
        sexo.setSelectedItem(null);

        cargo.addItem("Vendedor");
        cargo.addItem("Gerente");
        cargo.setSelectedItem(null);

    }

    public void dados_filial() {
        for (Filial filial : Con_F.Listar()) {
            this.filial.addItem(filial.getNome());
        }
        this.filial.setSelectedItem(null);
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
        cadastrar = new javax.swing.JButton();
        filial = new javax.swing.JComboBox<>();
        sexo = new javax.swing.JComboBox<>();
        Op_cidade = new javax.swing.JComboBox<>();
        cargo = new javax.swing.JComboBox<>();
        nome = new javax.swing.JTextField();
        rg = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        data_nasc = new javax.swing.JTextField();
        try{

            javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("##/##/####");

            data_nasc = new javax.swing.JFormattedTextField(format_textField3);

        }catch (Exception e){}
        telefone = new javax.swing.JTextField();
        try{

            javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("(##)#.####-####");

            telefone = new javax.swing.JFormattedTextField(format_textField3);

        }catch (Exception e){}
        email = new javax.swing.JTextField();
        codigo = new javax.swing.JTextField();
        logradouro = new javax.swing.JTextField();
        num = new javax.swing.JTextField();
        cep = new javax.swing.JTextField();
        try{

            javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("#####-###");

            cep = new javax.swing.JFormattedTextField(format_textField3);

        }catch (Exception e){}
        bairro = new javax.swing.JTextField();
        uf = new javax.swing.JTextField();
        usuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("CADASTRAR FUNCIONARIO");
        setToolTipText("");
        setDoubleBuffered(true);
        setFocusCycleRoot(false);

        cadastrar.setBackground(new java.awt.Color(80, 141, 224));
        cadastrar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        filial.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        filial.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                filialPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        sexo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        sexo.setToolTipText("");
        sexo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                sexoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

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

        cargo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cargo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cargoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        nome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        nome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeKeyReleased(evt);
            }
        });

        rg.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rg.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rgKeyReleased(evt);
            }
        });

        try{

            javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("###.###.###-##");

            cpf = new javax.swing.JFormattedTextField(format_textField3);

        }catch (Exception e){}
        cpf.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cpf.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        data_nasc.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        data_nasc.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        telefone.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        telefone.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        email.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        codigo.setEditable(false);
        codigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        codigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        logradouro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        num.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        cep.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        bairro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        uf.setEditable(false);
        uf.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        usuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("SEXO");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("RG");

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel18.setText("NOME COMPLETO");

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel20.setText("CPF");

        jLabel21.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel21.setText("DATA NASCIMENTO");

        jLabel22.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel22.setText("TELEFONE");

        jLabel23.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel23.setText("E-MAIL");

        jLabel24.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel24.setText("CODIGO");

        jLabel25.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel25.setText("CARGO");

        jLabel26.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel26.setText("FILIAL ");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText(" Nº");

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel19.setText("CEP.");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText(" BAIRRO");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText(" LOGRADOURO");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText(" CIDADE");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText(" UF");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("USUARIO");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("SENHA");

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
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(Op_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(cep)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(181, 181, 181)
                                .addComponent(jLabel20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(cpf))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(data_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(filial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(sexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(filial, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(data_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(num, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(37, 37, 37)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Op_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usuario)
                            .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void Op_cidadePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Op_cidadePopupMenuWillBecomeInvisible
        for (Cidade cidade1 : cidade) {
            if (cidade1.getNome().equals(Op_cidade.getSelectedItem())) {
                uf.setText(cidade1.getEstado().getNome());
            }
        }
    }//GEN-LAST:event_Op_cidadePopupMenuWillBecomeInvisible

    private void cargoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cargoPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoPopupMenuWillBecomeInvisible

    private void sexoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_sexoPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoPopupMenuWillBecomeInvisible

    private void filialPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_filialPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_filialPopupMenuWillBecomeInvisible

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        Integer  funcionario;
        String pwd = new String(senha.getPassword());
        if (cargo.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(rootPane, "O campo Cargo e obrigatorio!");
        } else if (this.filial.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(rootPane, "O campo Filial e obrigatorio!");
        } else if (nome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo Nome e obrigatorio!");
        } else if (sexo.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(rootPane, "O campo Sexo e obrigatorio!");
        } else if (rg.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo RG e obrigatorio!");
        } else if ("   .   .   -  ".equals(cpf.getText())) {
            JOptionPane.showMessageDialog(rootPane, "O campo CPF e obrigatorio!");
        } else if ("  /  /    ".equals(data_nasc.getText())) {
            JOptionPane.showMessageDialog(rootPane, "O campo Data Nascimento e obrigatorio!");
        } else if ("(  ) .    -    ".equals(telefone.getText())) {
            JOptionPane.showMessageDialog(rootPane, "O campo Telefone e obrigatorio!");
        } else if (email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo E-mail e obrigatorio!");
        } else if (logradouro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo Logradouro e obrigatorio!");
        } else if (num.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo Numero e obrigatorio!");
        } else if (bairro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo Bairro e obrigatorio!");
        } else if (Op_cidade.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(rootPane, "O campo Cidade e obrigatorio!");
        } else if ("     -   ".equals(cep.getText())) {
            JOptionPane.showMessageDialog(rootPane, "O campo CEP e obrigatorio!");
        } else if (pwd.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo Senha e obrigatorio!");
        } else if (usuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo Usuario e obrigatorio!");
        } else {

            for (Cidade cidade1 : cidade) {
                if (cidade1.getNome().equals(Op_cidade.getSelectedItem())) {
                    if (uf.getText().equals(cidade1.getEstado().getNome())) {
                        for (Filial filial : Con_F.Listar()) {
                            if (filial.getNome().equals(this.filial.getSelectedItem())) {
                                System.out.println("entrou e mandou par la");
                                funcionario = Con_Fun.Cadastrar(nome.getText(), cidade1.getCod(),
                                        logradouro.getText(),num.getText(), bairro.getText(),
                                        cep.getText().replaceAll("[^\\d ]", ""),cpf.getText().replaceAll("[^\\d ]", ""),
                                        rg.getText(), telefone.getText().replaceAll("[^\\d ]", ""),
                                        email.getText(), sexo.getSelectedIndex() + 1,
                                        cargo.getSelectedIndex() + 2, data_nasc.getText(),
                                        filial.getCod(), usuario.getText(),pwd);
                                if (funcionario != null) {
                                    JOptionPane.showMessageDialog(rootPane, "Funcionario Cadastrada com Sucesso! \n "
                                            + "Número de indentificação: " + funcionario);
                                    Funcionario_List List_F = new Funcionario_List();
                                    Tela.add(List_F);
                                    List_F.setVisible(true);
                                    dispose();
                                } else {
                                    JOptionPane.showMessageDialog(rootPane, "Não foi possovel cadastrar o Funcionario! \n Favor entrar em contato com tecnico.");
                                }

                            }
                        }
                    }
                }
            }
        }
//        for (Curso curso : Con_C.Listar()) {
//            if (curso.getNome().equals(this.curso.getSelectedItem())) {
//                if (curso.getCargahoraria().equals(this.carga_h.getText())&& curso.getAreac().getNome().equals(this.area_curso.getText())) {
//
//                }
//                if (0 == JOptionPane.showConfirmDialog(rootPane, "Quer realmente Cadastrar essa Turma ?")) {
//                    Con_T.Cadastrar(data_inicio.getText(), data_fim.getText(), h_inicio.getText(),
//                        h_final.getText(),curso.getId());
//                    JOptionPane.showMessageDialog(rootPane, "Turma Cadastrada com Sucesso!");
//                    data_inicio.setText("");
//                    data_fim.setText("");
//                    h_inicio.setText("");
//                    h_final.setText("");
//                    this.curso.setSelectedItem(null);
//                }
//            }
//        }
    }//GEN-LAST:event_cadastrarActionPerformed

    private void rgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rgKeyReleased
        rg.setText(rg.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_rgKeyReleased

    private void nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeKeyReleased
        nome.setText(nome.getText().replaceAll("[^A-Z |^a-z]", ""));
    }//GEN-LAST:event_nomeKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Funcionario_List List_F = new Funcionario_List();
        Menu_principal.Tela.add(List_F);
        List_F.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<Object> Op_cidade;
    private javax.swing.JTextField bairro;
    private javax.swing.JButton cadastrar;
    private javax.swing.JComboBox<String> cargo;
    private javax.swing.JTextField cep;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField data_nasc;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> filial;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField logradouro;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField num;
    private javax.swing.JTextField rg;
    private javax.swing.JPasswordField senha;
    private javax.swing.JComboBox<String> sexo;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField uf;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

}
