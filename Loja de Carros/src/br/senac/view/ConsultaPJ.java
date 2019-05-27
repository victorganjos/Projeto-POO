/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.view;

import br.senac.controller.PessoaJuridicaController;
import br.senac.repository.Table;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author victor.ganjos
 */
public class ConsultaPJ extends javax.swing.JFrame implements Table {

    public ConsultaPJ() {
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
        ArrayList<String[]> linhasClientes = PessoaJuridicaController.consulta();
        DefaultTableModel tmClientes = new DefaultTableModel();
        tmClientes.addColumn("ID");
        tmClientes.addColumn("NOME");
        tmClientes.addColumn("NOME FANTASIA");
        tmClientes.addColumn("CNPJ");
        tmClientes.addColumn("TELEFONE");
        tbl_ConsultaPJ.setModel(tmClientes);
        for (String[] c : linhasClientes) {
            tmClientes.addRow(c);
        }
        tbl_ConsultaPJ.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbl_ConsultaPJ.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbl_ConsultaPJ.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbl_ConsultaPJ.getColumnModel().getColumn(3).setPreferredWidth(50);
        tbl_ConsultaPJ.getColumnModel().getColumn(4).setPreferredWidth(50);
    }

    public void pesquisar() {
        ArrayList<String[]> linhasClientes = PessoaJuridicaController.consultaPorNome(txt_NomeJuridico.getText());

        DefaultTableModel tmClientes = new DefaultTableModel();
        tmClientes.addColumn("ID");
        tmClientes.addColumn("NOME");
        tmClientes.addColumn("NOME FANTASIA");
        tmClientes.addColumn("CNPJ");
        tmClientes.addColumn("TELEFONE");
        tbl_ConsultaPJ.setModel(tmClientes);

        for (String[] c : linhasClientes) {
            tmClientes.addRow(c);
        }

        tbl_ConsultaPJ.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbl_ConsultaPJ.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbl_ConsultaPJ.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbl_ConsultaPJ.getColumnModel().getColumn(3).setPreferredWidth(50);
        tbl_ConsultaPJ.getColumnModel().getColumn(4).setPreferredWidth(50);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_ConsultaPJ = new javax.swing.JPanel();
        scp_ConsultaPJ = new javax.swing.JScrollPane();
        tbl_ConsultaPJ = new javax.swing.JTable();
        lbl_NomeJuridico = new javax.swing.JLabel();
        txt_NomeJuridico = new javax.swing.JTextField();
        btn_BuscarNomeJuridico = new javax.swing.JButton();
        btn_HomePage = new javax.swing.JButton();
        btn_Atualizar = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JButton();
        pnl_TitleClientePageBackground = new javax.swing.JPanel();
        lbl_TitleLoginPage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnl_ConsultaPJ.setBackground(new java.awt.Color(255, 255, 255));

        tbl_ConsultaPJ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Nome Fantasia", "Cnpj", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scp_ConsultaPJ.setViewportView(tbl_ConsultaPJ);

        lbl_NomeJuridico.setText("Nome: ");

        txt_NomeJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NomeJuridicoActionPerformed(evt);
            }
        });

        btn_BuscarNomeJuridico.setText("Buscar");
        btn_BuscarNomeJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarNomeJuridicoActionPerformed(evt);
            }
        });

        btn_HomePage.setText("Home");
        btn_HomePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HomePageActionPerformed(evt);
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

        javax.swing.GroupLayout pnl_ConsultaPJLayout = new javax.swing.GroupLayout(pnl_ConsultaPJ);
        pnl_ConsultaPJ.setLayout(pnl_ConsultaPJLayout);
        pnl_ConsultaPJLayout.setHorizontalGroup(
            pnl_ConsultaPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ConsultaPJLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ConsultaPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scp_ConsultaPJ)
                    .addGroup(pnl_ConsultaPJLayout.createSequentialGroup()
                        .addComponent(lbl_NomeJuridico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_NomeJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_BuscarNomeJuridico, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_HomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(pnl_ConsultaPJLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(btn_Atualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Excluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_ConsultaPJLayout.setVerticalGroup(
            pnl_ConsultaPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ConsultaPJLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnl_ConsultaPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NomeJuridico)
                    .addComponent(txt_NomeJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_BuscarNomeJuridico)
                    .addComponent(btn_HomePage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scp_ConsultaPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ConsultaPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Atualizar)
                    .addComponent(btn_Excluir))
                .addContainerGap(16, Short.MAX_VALUE))
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
                    .addComponent(pnl_ConsultaPJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_TitleClientePageBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_TitleClientePageBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_ConsultaPJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NomeJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NomeJuridicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NomeJuridicoActionPerformed

    private void btn_BuscarNomeJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarNomeJuridicoActionPerformed
        // TODO add your handling code here:
        pesquisar();
    }//GEN-LAST:event_btn_BuscarNomeJuridicoActionPerformed

    private void btn_HomePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HomePageActionPerformed
        // TODO add your handling code here:
        HomePage home = new HomePage();
        home.setVisible(true);
        ConsultaPJ.this.dispose();
    }//GEN-LAST:event_btn_HomePageActionPerformed

    private void btn_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtualizarActionPerformed
        // TODO add your handling code here:
        if (tbl_ConsultaPJ.getSelectedRow() != -1) {
            AtualizaPJ atualiza = new AtualizaPJ(Integer.parseInt((String) tbl_ConsultaPJ.getValueAt(tbl_ConsultaPJ.getSelectedRow(), 0)));
            atualiza.setVisible(true);
            ConsultaPJ.this.dispose();
        }
    }//GEN-LAST:event_btn_AtualizarActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
        // TODO add your handling code here:
        if (tbl_ConsultaPJ.getSelectedRow() != -1) {

            PessoaJuridicaController.excluir(Integer.parseInt((String) tbl_ConsultaPJ.getValueAt(tbl_ConsultaPJ.getSelectedRow(), 0)));
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
            java.util.logging.Logger.getLogger(ConsultaPJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaPJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaPJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaPJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ConsultaPJ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Atualizar;
    private javax.swing.JButton btn_BuscarNomeJuridico;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_HomePage;
    private javax.swing.JLabel lbl_NomeJuridico;
    private javax.swing.JLabel lbl_TitleLoginPage;
    private javax.swing.JPanel pnl_ConsultaPJ;
    private javax.swing.JPanel pnl_TitleClientePageBackground;
    private javax.swing.JScrollPane scp_ConsultaPJ;
    private javax.swing.JTable tbl_ConsultaPJ;
    private javax.swing.JTextField txt_NomeJuridico;
    // End of variables declaration//GEN-END:variables
}
