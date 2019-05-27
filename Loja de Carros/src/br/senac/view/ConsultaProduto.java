/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.view;

import br.senac.controller.ProdutoController;
import br.senac.repository.Table;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author victor.ganjos
 */
public class ConsultaProduto extends javax.swing.JFrame implements Table{

    public ConsultaProduto() {
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @Override
    public void loadTable() {
        ArrayList<String[]> linhasProduto = ProdutoController.consulta();
        DefaultTableModel tmProduto = new DefaultTableModel();
        tmProduto.addColumn("ID");
        tmProduto.addColumn("Modelo");
        tmProduto.addColumn("Marca");
        tmProduto.addColumn("Ano");
        tmProduto.addColumn("Cor");
        tmProduto.addColumn("Placa");
        tmProduto.addColumn("Valor Compra");
        tbl_ConsultaProduto.setModel(tmProduto);
        for (String[] c : linhasProduto) {
            tmProduto.addRow(c);
        }
        tbl_ConsultaProduto.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbl_ConsultaProduto.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbl_ConsultaProduto.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbl_ConsultaProduto.getColumnModel().getColumn(3).setPreferredWidth(50);
        tbl_ConsultaProduto.getColumnModel().getColumn(4).setPreferredWidth(50);
        tbl_ConsultaProduto.getColumnModel().getColumn(4).setPreferredWidth(50);
        tbl_ConsultaProduto.getColumnModel().getColumn(4).setPreferredWidth(50);
    }

    public void pesquisar() {
        ArrayList<String[]> linhasProduto = ProdutoController.consultaPorNome(txt_Nome.getText());

        DefaultTableModel tmProduto = new DefaultTableModel();
        tmProduto.addColumn("ID");
        tmProduto.addColumn("Modelo");
        tmProduto.addColumn("Marca");
        tmProduto.addColumn("Ano");
        tmProduto.addColumn("Cor");
        tmProduto.addColumn("Placa");
        tmProduto.addColumn("Valor Compra");
        tbl_ConsultaProduto.setModel(tmProduto);

        for (String[] c : linhasProduto) {
            tmProduto.addRow(c);
        }

        tbl_ConsultaProduto.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbl_ConsultaProduto.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbl_ConsultaProduto.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbl_ConsultaProduto.getColumnModel().getColumn(3).setPreferredWidth(50);
        tbl_ConsultaProduto.getColumnModel().getColumn(4).setPreferredWidth(50);
        tbl_ConsultaProduto.getColumnModel().getColumn(4).setPreferredWidth(50);
        tbl_ConsultaProduto.getColumnModel().getColumn(4).setPreferredWidth(50);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_ConsultaPF = new javax.swing.JPanel();
        scp_ConsultaProduto = new javax.swing.JScrollPane();
        tbl_ConsultaProduto = new javax.swing.JTable();
        lbl_Nome = new javax.swing.JLabel();
        txt_Nome = new javax.swing.JTextField();
        btn_BuscarNome = new javax.swing.JButton();
        btn_Home = new javax.swing.JButton();
        btn_Atualizar = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JButton();
        pnl_TitleClientePageBackground = new javax.swing.JPanel();
        lbl_TitleLoginPage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnl_ConsultaPF.setBackground(new java.awt.Color(255, 255, 255));

        tbl_ConsultaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Modelo", "Marca", "Cor", "Placa", "Valor_Compra"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_ConsultaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ConsultaProdutoMouseClicked(evt);
            }
        });
        scp_ConsultaProduto.setViewportView(tbl_ConsultaProduto);

        lbl_Nome.setText("Nome: ");

        txt_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NomeActionPerformed(evt);
            }
        });

        btn_BuscarNome.setText("Buscar");
        btn_BuscarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarNomeActionPerformed(evt);
            }
        });

        btn_Home.setText("Home");
        btn_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HomeActionPerformed(evt);
            }
        });

        btn_Atualizar.setText("Atualizar");
        btn_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtualizarActionPerformed(evt);
            }
        });

        btn_Excluir.setText("Excluir");
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_ConsultaPFLayout = new javax.swing.GroupLayout(pnl_ConsultaPF);
        pnl_ConsultaPF.setLayout(pnl_ConsultaPFLayout);
        pnl_ConsultaPFLayout.setHorizontalGroup(
            pnl_ConsultaPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ConsultaPFLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ConsultaPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scp_ConsultaProduto)
                    .addGroup(pnl_ConsultaPFLayout.createSequentialGroup()
                        .addComponent(lbl_Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_BuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(pnl_ConsultaPFLayout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(btn_Atualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Excluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_ConsultaPFLayout.setVerticalGroup(
            pnl_ConsultaPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ConsultaPFLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnl_ConsultaPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nome)
                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_BuscarNome)
                    .addComponent(btn_Home))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scp_ConsultaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_ConsultaPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Atualizar)
                    .addComponent(btn_Excluir))
                .addContainerGap(12, Short.MAX_VALUE))
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
                    .addComponent(pnl_ConsultaPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_TitleClientePageBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_TitleClientePageBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_ConsultaPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NomeActionPerformed

    private void btn_BuscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarNomeActionPerformed
        // TODO add your handling code here:
        pesquisar();
    }//GEN-LAST:event_btn_BuscarNomeActionPerformed

    private void btn_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HomeActionPerformed
        // TODO add your handling code here:
        HomePage home = new HomePage();
        home.setVisible(true);
        ConsultaProduto.this.dispose();
    }//GEN-LAST:event_btn_HomeActionPerformed

    private void tbl_ConsultaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ConsultaProdutoMouseClicked
        // TODO add your handling code here:
        /*  if (tbl_ConsultaPF.getSelectedRow() != -1) {
            List<PessoaFisica> linhasClientes = PessoaFisicaController.consultarPorId((int) tbl_ConsultaPF.getValueAt(tbl_ConsultaPF.getSelectedRow(), 0));
            AtualizaPF atualiza = new AtualizaPF();
            atualiza.setVisible(true);
            ConsultaPF.this.dispose();

        }*/
    }//GEN-LAST:event_tbl_ConsultaProdutoMouseClicked

    private void btn_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtualizarActionPerformed
        // TODO add your handling code here:
        if (tbl_ConsultaProduto.getSelectedRow() != -1) {
            //  List<PessoaFisica> linhasClientes = PessoaFisicaController.consultarPorId((int) tbl_ConsultaPF.getValueAt(tbl_ConsultaPF.getSelectedRow(), 0));
            AtualizaProduto atualiza = new AtualizaProduto(Integer.parseInt((String) tbl_ConsultaProduto.getValueAt(tbl_ConsultaProduto.getSelectedRow(), 0)));
            atualiza.setVisible(true);
            ConsultaProduto.this.dispose();

        }

    }//GEN-LAST:event_btn_AtualizarActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
        // TODO add your handling code here:
        if (tbl_ConsultaProduto.getSelectedRow() != -1) {

            ProdutoController.excluir(Integer.parseInt((String) tbl_ConsultaProduto.getValueAt(tbl_ConsultaProduto.getSelectedRow(), 0)));
            loadTable();
        }
    }//GEN-LAST:event_btn_ExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new ConsultaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Atualizar;
    private javax.swing.JButton btn_BuscarNome;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_Home;
    private javax.swing.JLabel lbl_Nome;
    private javax.swing.JLabel lbl_TitleLoginPage;
    private javax.swing.JPanel pnl_ConsultaPF;
    private javax.swing.JPanel pnl_TitleClientePageBackground;
    private javax.swing.JScrollPane scp_ConsultaProduto;
    private javax.swing.JTable tbl_ConsultaProduto;
    private javax.swing.JTextField txt_Nome;
    // End of variables declaration//GEN-END:variables
}
