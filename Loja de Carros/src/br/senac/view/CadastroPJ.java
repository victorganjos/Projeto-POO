/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.view;

import br.senac.controller.PessoaJuridicaController;
import javax.swing.JOptionPane;

/**
 *
 * @author victor.ganjos
 */
public class CadastroPJ extends javax.swing.JFrame {

    public CadastroPJ() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_TitlePageBackground = new javax.swing.JPanel();
        pnl_CadastroBackground = new javax.swing.JPanel();
        lbl_TextoInfo = new javax.swing.JLabel();
        lbl_NomeFant = new javax.swing.JLabel();
        txt_NomeFant = new javax.swing.JTextField();
        lxl_CNPJ = new javax.swing.JLabel();
        txt_CNPJ = new javax.swing.JTextField();
        lbl_Nome = new javax.swing.JLabel();
        txt_Nome = new javax.swing.JTextField();
        lbl_Endereco = new javax.swing.JLabel();
        txt_Endereco = new javax.swing.JTextField();
        lbl_Telefone = new javax.swing.JLabel();
        txt_Telefone = new javax.swing.JTextField();
        lbl_Numero = new javax.swing.JLabel();
        txt_NumeroEnd = new javax.swing.JTextField();
        lbl_UF = new javax.swing.JLabel();
        lbl_Cidade = new javax.swing.JLabel();
        txt_Cidade = new javax.swing.JTextField();
        cbo_UF = new javax.swing.JComboBox<>();
        lbl_Bairro = new javax.swing.JLabel();
        txt_Bairro = new javax.swing.JTextField();
        lbl_CEP = new javax.swing.JLabel();
        txt_CEP = new javax.swing.JTextField();
        btn_Salvar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        btn_Limpar = new javax.swing.JButton();
        pnl_TitleClientePageBackground = new javax.swing.JPanel();
        lbl_TitleLoginPage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnl_TitlePageBackground.setBackground(new java.awt.Color(255, 255, 255));

        pnl_CadastroBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnl_CadastroBackground.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));

        lbl_TextoInfo.setText("Preencha os campos abaixo:");

        lbl_NomeFant.setText("Nome Fantasia*");

        lxl_CNPJ.setText("CNPJ*");

        lbl_Nome.setText("Nome*");

        lbl_Endereco.setText("Endereço*");

        lbl_Telefone.setText("Telefone*");

        lbl_Numero.setText("Nº");

        lbl_UF.setText("Estado-(UF)*");

        lbl_Cidade.setText("Cidade*");

        cbo_UF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbl_Bairro.setText("Bairro");

        lbl_CEP.setText("CEP*");

        javax.swing.GroupLayout pnl_CadastroBackgroundLayout = new javax.swing.GroupLayout(pnl_CadastroBackground);
        pnl_CadastroBackground.setLayout(pnl_CadastroBackgroundLayout);
        pnl_CadastroBackgroundLayout.setHorizontalGroup(
            pnl_CadastroBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CadastroBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_CadastroBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_CadastroBackgroundLayout.createSequentialGroup()
                        .addComponent(lbl_Endereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Numero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_NumeroEnd))
                    .addGroup(pnl_CadastroBackgroundLayout.createSequentialGroup()
                        .addComponent(lbl_UF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_UF, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Cidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Cidade))
                    .addGroup(pnl_CadastroBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_TextoInfo)
                        .addGroup(pnl_CadastroBackgroundLayout.createSequentialGroup()
                            .addComponent(lbl_NomeFant)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_NomeFant))
                        .addGroup(pnl_CadastroBackgroundLayout.createSequentialGroup()
                            .addComponent(lbl_Nome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_CadastroBackgroundLayout.createSequentialGroup()
                            .addComponent(lxl_CNPJ)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbl_Telefone)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Telefone)))
                    .addGroup(pnl_CadastroBackgroundLayout.createSequentialGroup()
                        .addComponent(lbl_Bairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_CEP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_CEP)))
                .addContainerGap())
        );
        pnl_CadastroBackgroundLayout.setVerticalGroup(
            pnl_CadastroBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CadastroBackgroundLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl_TextoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(pnl_CadastroBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_NomeFant, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_NomeFant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_CadastroBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_CadastroBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_CadastroBackgroundLayout.createSequentialGroup()
                        .addGroup(pnl_CadastroBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lxl_CNPJ))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_CadastroBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Endereco)
                            .addComponent(txt_NumeroEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Numero)))
                    .addGroup(pnl_CadastroBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Telefone)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_CadastroBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_UF)
                    .addComponent(txt_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Cidade)
                    .addComponent(cbo_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_CadastroBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Bairro)
                    .addComponent(txt_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_CEP))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        btn_Salvar.setBackground(new java.awt.Color(71, 140, 104));
        btn_Salvar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Salvar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Salvar.setText("Salvar");
        btn_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalvarActionPerformed(evt);
            }
        });

        btn_Cancelar.setBackground(new java.awt.Color(71, 140, 104));
        btn_Cancelar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        btn_Limpar.setBackground(new java.awt.Color(71, 140, 104));
        btn_Limpar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Limpar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Limpar.setText("Limpar");
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_TitlePageBackgroundLayout = new javax.swing.GroupLayout(pnl_TitlePageBackground);
        pnl_TitlePageBackground.setLayout(pnl_TitlePageBackgroundLayout);
        pnl_TitlePageBackgroundLayout.setHorizontalGroup(
            pnl_TitlePageBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TitlePageBackgroundLayout.createSequentialGroup()
                .addGroup(pnl_TitlePageBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_TitlePageBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_TitlePageBackgroundLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(pnl_CadastroBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_TitlePageBackgroundLayout.setVerticalGroup(
            pnl_TitlePageBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_TitlePageBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_CadastroBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_TitlePageBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Salvar)
                    .addComponent(btn_Limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnl_TitleClientePageBackground.setBackground(new java.awt.Color(0, 99, 149));

        lbl_TitleLoginPage.setBackground(new java.awt.Color(255, 255, 255));
        lbl_TitleLoginPage.setFont(new java.awt.Font("Century Gothic", 1, 56)); // NOI18N
        lbl_TitleLoginPage.setForeground(new java.awt.Color(255, 255, 255));
        lbl_TitleLoginPage.setText("Pole Position Store");

        javax.swing.GroupLayout pnl_TitleClientePageBackgroundLayout = new javax.swing.GroupLayout(pnl_TitleClientePageBackground);
        pnl_TitleClientePageBackground.setLayout(pnl_TitleClientePageBackgroundLayout);
        pnl_TitleClientePageBackgroundLayout.setHorizontalGroup(
            pnl_TitleClientePageBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TitleClientePageBackgroundLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lbl_TitleLoginPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_TitleClientePageBackgroundLayout.setVerticalGroup(
            pnl_TitleClientePageBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TitleClientePageBackgroundLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbl_TitleLoginPage, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_TitlePageBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_TitleClientePageBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_TitleClientePageBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_TitlePageBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalvarActionPerformed
        PessoaJuridicaController control = new PessoaJuridicaController();
        String nome = txt_Nome.getText();
        String nomeFant = txt_NomeFant.getText();
        String cnpj = txt_CNPJ.getText();
        String telefone = txt_Telefone.getText();
        String endereco = txt_Endereco.getText();
        String numero = txt_NumeroEnd.getText();
        String uf = cbo_UF.getSelectedItem().toString();
        String cidade = txt_Cidade.getText();
        String bairro = txt_Bairro.getText();
        String cep = txt_CEP.getText();

        if (nome.equals("") || nomeFant.equals("") ||  cnpj.equals("")
                || telefone.equals("") || endereco.equals("") || numero.equals("")
                || uf.equals("") || cidade.equals("") || cep.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");

        } else {
            control.salvar(Long.parseLong(cnpj), nomeFant, Integer.parseInt(numero), nome, endereco, bairro, cidade, uf, telefone, Long.parseLong(cep));
            JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!");
            HomePage home = new HomePage();
            home.setVisible(true);
            CadastroPJ.this.dispose();
        }

    }//GEN-LAST:event_btn_SalvarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        int logout = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente Cancelar?");
        System.out.println(logout);
        if (logout == 0) {
            JOptionPane.showMessageDialog(rootPane, "Operação Cancelada!");
            HomePage home = new HomePage();
            home.setVisible(true);
            CadastroPJ.this.dispose();
        }
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed
        txt_NomeFant.setText("");
        txt_Nome.setText("");
        txt_CNPJ.setText("");
        txt_Telefone.setText("");
        txt_Endereco.setText("");
        txt_NumeroEnd.setText("");
        txt_Cidade.setText("");
        txt_Bairro.setText("");
        txt_CEP.setText("");
    }//GEN-LAST:event_btn_LimparActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CadastroPJ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JButton btn_Salvar;
    private javax.swing.JComboBox<String> cbo_UF;
    private javax.swing.JLabel lbl_Bairro;
    private javax.swing.JLabel lbl_CEP;
    private javax.swing.JLabel lbl_Cidade;
    private javax.swing.JLabel lbl_Endereco;
    private javax.swing.JLabel lbl_Nome;
    private javax.swing.JLabel lbl_NomeFant;
    private javax.swing.JLabel lbl_Numero;
    private javax.swing.JLabel lbl_Telefone;
    private javax.swing.JLabel lbl_TextoInfo;
    private javax.swing.JLabel lbl_TitleLoginPage;
    private javax.swing.JLabel lbl_UF;
    private javax.swing.JLabel lxl_CNPJ;
    private javax.swing.JPanel pnl_CadastroBackground;
    private javax.swing.JPanel pnl_TitleClientePageBackground;
    private javax.swing.JPanel pnl_TitlePageBackground;
    private javax.swing.JTextField txt_Bairro;
    private javax.swing.JTextField txt_CEP;
    private javax.swing.JTextField txt_CNPJ;
    private javax.swing.JTextField txt_Cidade;
    private javax.swing.JTextField txt_Endereco;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_NomeFant;
    private javax.swing.JTextField txt_NumeroEnd;
    private javax.swing.JTextField txt_Telefone;
    // End of variables declaration//GEN-END:variables
}
