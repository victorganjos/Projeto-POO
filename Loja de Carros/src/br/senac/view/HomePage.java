/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.view;

import br.senac.model.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author victor.ganjos
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public HomePage() {
        initComponents();
        Usuario ativo = new Usuario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_HomePageBackground = new javax.swing.JPanel();
        pnl_HomeBackground = new javax.swing.JPanel();
        lbl_TitleHome = new javax.swing.JLabel();
        btn_CadastroCliente = new javax.swing.JButton();
        btn_Venda = new javax.swing.JButton();
        btn_CadastroUsuario = new javax.swing.JButton();
        btn_CadastroProdutos = new javax.swing.JButton();
        btn_ConsultaCliente = new javax.swing.JButton();
        btn_Estoque = new javax.swing.JButton();
        btn_ConsultaUsuario = new javax.swing.JButton();
        btn_ConsultaProduto = new javax.swing.JButton();
        btn_Logout = new javax.swing.JButton();
        pnl_TitleLoginPageBackground = new javax.swing.JPanel();
        lbl_TitleLoginPage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnl_HomePageBackground.setBackground(new java.awt.Color(255, 255, 255));

        pnl_HomeBackground.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleHome.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbl_TitleHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TitleHome.setText("Menu");

        btn_CadastroCliente.setText("Cadastro de Clientes");
        btn_CadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastroClienteActionPerformed(evt);
            }
        });

        btn_Venda.setText("Venda");

        btn_CadastroUsuario.setText("Cadastro de Usuários");
        btn_CadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastroUsuarioActionPerformed(evt);
            }
        });

        btn_CadastroProdutos.setText("Cadastro de Produtos");

        btn_ConsultaCliente.setText("Consultar Cliente");

        btn_Estoque.setText("Estoque");

        btn_ConsultaUsuario.setText("Consultar Usuário");

        btn_ConsultaProduto.setText("Consultar Produto");

        javax.swing.GroupLayout pnl_HomeBackgroundLayout = new javax.swing.GroupLayout(pnl_HomeBackground);
        pnl_HomeBackground.setLayout(pnl_HomeBackgroundLayout);
        pnl_HomeBackgroundLayout.setHorizontalGroup(
            pnl_HomeBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_HomeBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_HomeBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_CadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_TitleHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Venda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_CadastroUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(btn_CadastroProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(btn_ConsultaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(btn_Estoque, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(btn_ConsultaUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(btn_ConsultaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_HomeBackgroundLayout.setVerticalGroup(
            pnl_HomeBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_HomeBackgroundLayout.createSequentialGroup()
                .addComponent(lbl_TitleHome)
                .addGap(18, 18, 18)
                .addComponent(btn_Venda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_CadastroCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_CadastroProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_CadastroUsuario)
                .addGap(7, 7, 7)
                .addComponent(btn_Estoque)
                .addGap(18, 18, 18)
                .addComponent(btn_ConsultaCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ConsultaProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ConsultaUsuario)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        btn_Logout.setText("Logout");
        btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_HomePageBackgroundLayout = new javax.swing.GroupLayout(pnl_HomePageBackground);
        pnl_HomePageBackground.setLayout(pnl_HomePageBackgroundLayout);
        pnl_HomePageBackgroundLayout.setHorizontalGroup(
            pnl_HomePageBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_HomePageBackgroundLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(pnl_HomeBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                .addComponent(btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_HomePageBackgroundLayout.setVerticalGroup(
            pnl_HomePageBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_HomePageBackgroundLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(pnl_HomeBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnl_HomePageBackgroundLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btn_Logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_TitleLoginPageBackground.setBackground(new java.awt.Color(0, 99, 149));

        lbl_TitleLoginPage.setBackground(new java.awt.Color(255, 255, 255));
        lbl_TitleLoginPage.setFont(new java.awt.Font("Century Gothic", 1, 56)); // NOI18N
        lbl_TitleLoginPage.setForeground(new java.awt.Color(255, 255, 255));
        lbl_TitleLoginPage.setText("Pole Position Store");

        javax.swing.GroupLayout pnl_TitleLoginPageBackgroundLayout = new javax.swing.GroupLayout(pnl_TitleLoginPageBackground);
        pnl_TitleLoginPageBackground.setLayout(pnl_TitleLoginPageBackgroundLayout);
        pnl_TitleLoginPageBackgroundLayout.setHorizontalGroup(
            pnl_TitleLoginPageBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TitleLoginPageBackgroundLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lbl_TitleLoginPage, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addGap(48, 48, 48))
        );
        pnl_TitleLoginPageBackgroundLayout.setVerticalGroup(
            pnl_TitleLoginPageBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TitleLoginPageBackgroundLayout.createSequentialGroup()
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
                    .addComponent(pnl_TitleLoginPageBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_HomePageBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_TitleLoginPageBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_HomePageBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogoutActionPerformed
        int logout = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente Sair?");
        System.out.println(logout);
        if (logout == 0) {
            JOptionPane.showMessageDialog(rootPane, "Você Saiu!");
            LoginPage loginPage = new LoginPage();
            loginPage.setVisible(true);
            HomePage.this.dispose();
        }
    }//GEN-LAST:event_btn_LogoutActionPerformed

    private void btn_CadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastroUsuarioActionPerformed
        CadastroUsuario cadastro = new CadastroUsuario();
        cadastro.setVisible(true);
        HomePage.this.dispose();
    }//GEN-LAST:event_btn_CadastroUsuarioActionPerformed

    private void btn_CadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastroClienteActionPerformed
        String value = JOptionPane.showInputDialog(null, "Digite 1 - para cliente pessoa física \nDigite 2 - para pessoa jurídica");
        switch (value) {
            case "1":
                CadastroPF cadastroPF = new CadastroPF();
                cadastroPF.setVisible(true);
                HomePage.this.dispose();
                break;
            case "2":
                CadastroPJ cadastroPJ = new CadastroPJ();
                cadastroPJ.setVisible(true);
                HomePage.this.dispose();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida!");
                break;

        }


    }//GEN-LAST:event_btn_CadastroClienteActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CadastroCliente;
    private javax.swing.JButton btn_CadastroProdutos;
    private javax.swing.JButton btn_CadastroUsuario;
    private javax.swing.JButton btn_ConsultaCliente;
    private javax.swing.JButton btn_ConsultaProduto;
    private javax.swing.JButton btn_ConsultaUsuario;
    private javax.swing.JButton btn_Estoque;
    private javax.swing.JButton btn_Logout;
    private javax.swing.JButton btn_Venda;
    private javax.swing.JLabel lbl_TitleHome;
    private javax.swing.JLabel lbl_TitleLoginPage;
    private javax.swing.JPanel pnl_HomeBackground;
    private javax.swing.JPanel pnl_HomePageBackground;
    private javax.swing.JPanel pnl_TitleLoginPageBackground;
    // End of variables declaration//GEN-END:variables
}
