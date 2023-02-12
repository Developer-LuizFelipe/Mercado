package View;

import Controller.Controller_Cidade;
import Controller.Controller_Filial;
import Controller.Controller_Funcionario;
import Model.Cidade;
import Model.Filial;
import Model.Funcionario;
import Util.Serviços;
import java.util.List;
import javax.swing.JOptionPane;
import static View.Menu_principal.Tela;

public class Funcionario_Edit extends javax.swing.JInternalFrame {

    Controller_Filial Con_F = new Controller_Filial();
    Controller_Funcionario Con_Fun = new Controller_Funcionario();
    Controller_Cidade Con_C = new Controller_Cidade();
    List<Cidade> cidade;
    Funcionario funcionario_new = new Funcionario();

    public Funcionario_Edit(Funcionario funcionario) {
        initComponents();
        sexo.addItem("Masculino");
        sexo.addItem("Feminino");
        sexo.addItem("Outro");
        sexo.setSelectedItem(null);

        cargo.addItem("Vendedor");
        cargo.addItem("Gerente");
        cargo.setSelectedItem(null);
        this.funcionario_new = funcionario;
        prencherCidade();
        dados_filial();
        DadosFuncionario();

    }

    public void prencherCidade() {
        cidade = Con_C.buscar();
        for (Cidade cidade1 : cidade) {
            Op_cidade.addItem(cidade1.getNome());
        }
    }

    public void dados_filial() {
        for (Filial filial : Con_F.Listar()) {
            this.filial.addItem(filial.getNome());
        }
        this.filial.setSelectedItem(null);
    }

    public void DadosFuncionario() {
        codigo.setText("" + funcionario_new.getCod());
        nome.setText(funcionario_new.getNome());
        Op_cidade.setSelectedItem(funcionario_new.getCidade().getNome());
        uf.setText(funcionario_new.getCidade().getEstado().getNome());
        logradouro.setText(funcionario_new.getLogradouro());
        num.setText(funcionario_new.getNumero());
        bairro.setText(funcionario_new.getBairro());
        cep.setText(funcionario_new.getCep());
        telefone.setText(funcionario_new.getTelefone());
        cpf.setText(funcionario_new.getCpf());
        rg.setText(funcionario_new.getRg());
        email.setText(funcionario_new.getEmail());
        data_nasc.setText(Serviços.retornar_Data(funcionario_new.getNascimento()));
        cargo.setSelectedItem(Serviços.cargo(funcionario_new.getCargo()));
        filial.setSelectedItem(funcionario_new.getFilial().getNome());
        sexo.setSelectedItem(Serviços.sexo(funcionario_new.getSexo()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        rg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        data_nasc = new javax.swing.JTextField();
        try{

            javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("##/##/####");

            data_nasc = new javax.swing.JFormattedTextField(format_textField3);

        }catch (Exception e){}
        jLabel7 = new javax.swing.JLabel();
        telefone = new javax.swing.JTextField();
        try{

            javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("(##)#.####-####");

            telefone = new javax.swing.JFormattedTextField(format_textField3);

        }catch (Exception e){}
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        logradouro = new javax.swing.JTextField();
        num = new javax.swing.JTextField();
        cep = new javax.swing.JTextField();
        try{

            javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("#####-###");

            cep = new javax.swing.JFormattedTextField(format_textField3);

        }catch (Exception e){}
        bairro = new javax.swing.JTextField();
        uf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        filial = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        sexo = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        Op_cidade = new javax.swing.JComboBox<>();
        cargo = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("EDITAR FUNCIONARIO");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel24.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel24.setText("CODIGO");

        jLabel25.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel25.setText("CARGO");

        nome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        nome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeKeyReleased(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel26.setText("FILIAL ");

        rg.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rg.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rgKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText(" Nº");

        try{

            javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("###.###.###-##");

            cpf = new javax.swing.JFormattedTextField(format_textField3);

        }catch (Exception e){}
        cpf.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cpf.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel19.setText("CEP.");

        data_nasc.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        data_nasc.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText(" BAIRRO");

        telefone.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        telefone.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText(" LOGRADOURO");

        email.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText(" CIDADE");

        codigo.setEditable(false);
        codigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        codigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        codigo.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText(" UF");

        logradouro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        num.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        cep.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        bairro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        uf.setEditable(false);
        uf.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

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

        jLabel22.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel22.setText("TELEFONE");

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

        jLabel23.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel23.setText("E-MAIL");

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

        jButton3.setBackground(new java.awt.Color(80, 141, 224));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Alterar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 102, 0));
        jButton4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(jLabel23))
                            .addComponent(jLabel22))
                        .addGap(346, 346, 346))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(181, 181, 181)
                                        .addComponent(jLabel20))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpf)))
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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(sexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(email))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(logradouro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)))
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26)))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(2, 2, 2)
                            .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Op_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeKeyReleased
        nome.setText(nome.getText().replaceAll("[^A-Z |^a-z]", ""));
    }//GEN-LAST:event_nomeKeyReleased

    private void rgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rgKeyReleased
        rg.setText(rg.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_rgKeyReleased

    private void filialPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_filialPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_filialPopupMenuWillBecomeInvisible

    private void sexoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_sexoPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoPopupMenuWillBecomeInvisible

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (Op_cidade.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(rootPane, "A campo Cidade e obrigatorio!");
        } else if (nome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo Nome e obrigatorio!");
        } else if ("   .   .   -  ".equals(cpf.getText())) {
            JOptionPane.showMessageDialog(rootPane, "O campo CPF e obrigatorio!");
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
            Integer funcionario;
            for (Cidade cidade1 : cidade) {
                if (cidade1.getNome().equals(Op_cidade.getSelectedItem())) {
                    if (uf.getText().equals(cidade1.getEstado().getNome())) {
                        for (Filial filial : Con_F.Listar()) {
                            if (filial.getNome().equals(this.filial.getSelectedItem())) {

                                funcionario = Con_Fun.editar(nome.getText(), cidade1.getCod(),
                                        logradouro.getText(), num.getText(), bairro.getText(),
                                        cep.getText().replaceAll("[^\\d ]", ""),
                                        cpf.getText().replaceAll("[^\\d ]", ""),
                                        rg.getText(), telefone.getText().replaceAll("[^\\d ]", ""),
                                        email.getText(), sexo.getSelectedIndex() + 1,
                                        cargo.getSelectedIndex() + 2, data_nasc.getText(),
                                        filial.getCod(), Integer.parseInt(codigo.getText()));
                                if (funcionario != 0) {
                                    JOptionPane.showMessageDialog(rootPane, "Funcionario Editado com Sucesso! \n ");
                                    Funcionario_List List_F = new Funcionario_List();
                                    Tela.add(List_F);
                                    List_F.setVisible(true);
                                    dispose();
                                } else {
                                    JOptionPane.showMessageDialog(rootPane, "Não foi possovel Editar o Funcionario! \n Favor entrar em contato com tecnico.");
                                }
                            }
                        }
                    }
                }
            }
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Funcionario_List List_F = new Funcionario_List();
        Menu_principal.Tela.add(List_F);
        List_F.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<Object> Op_cidade;
    private javax.swing.JTextField bairro;
    private javax.swing.JComboBox<String> cargo;
    private javax.swing.JTextField cep;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField data_nasc;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> filial;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField logradouro;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField num;
    private javax.swing.JTextField rg;
    private javax.swing.JComboBox<String> sexo;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField uf;
    // End of variables declaration//GEN-END:variables
}
