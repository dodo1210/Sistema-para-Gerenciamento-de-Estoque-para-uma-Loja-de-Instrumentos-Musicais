/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DAOProduto;
import Model.Produto;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tomaz
 */
public class ListarProdView extends javax.swing.JFrame {
    
    /**
     * Creates new form ListarProdView
     */
    public ListarProdView() {
        initComponents();
        rbCod.setSelected(true);
        DAOProduto produtos = new DAOProduto();
        list = produtos.listar_todos();
        construirTabla(list);
    }
    public void construirTabla(ArrayList<Produto> produtos){
        modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
       
        for(Produto p: produtos){
            modelo.addRow(new Object[]{
                p.getCode(),
                p.getNome(),
                p.getMarca(),
                p.getModelo(),
                p.getPreco(),
                p.getQuant()
            });
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        rbCod = new javax.swing.JRadioButton();
        rbProduto = new javax.swing.JRadioButton();
        tfBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_Realizar_Venda = new javax.swing.JMenu();
        menu_Historico_Venda = new javax.swing.JMenu();
        menu_cadastrar_produto = new javax.swing.JMenu();
        menu_lista_produtos = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Buscar:");

        rbCod.setText("Código de Barras");
        rbCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCodActionPerformed(evt);
            }
        });

        rbProduto.setText("Produto");
        rbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbProdutoActionPerformed(evt);
            }
        });

        tfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBuscarActionPerformed(evt);
            }
        });
        tfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfBuscarKeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de Barras", "Produto", "Marca", "Modelo", "Preço", "Quantidade em Estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Editar Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Apagar Item");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Lista de Produtos");

        menu_Realizar_Venda.setText("Realizar Venda");
        menu_Realizar_Venda.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menu_Realizar_VendaMenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
        });
        jMenuBar1.add(menu_Realizar_Venda);

        menu_Historico_Venda.setText("Historico Venda");
        menu_Historico_Venda.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menu_Historico_VendaMenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
        });
        jMenuBar1.add(menu_Historico_Venda);

        menu_cadastrar_produto.setText("Cadastrar Produto");
        menu_cadastrar_produto.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menu_cadastrar_produtoMenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
        });
        jMenuBar1.add(menu_cadastrar_produto);

        menu_lista_produtos.setText("Lista Produtos");
        menu_lista_produtos.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menu_lista_produtosMenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
        });
        jMenuBar1.add(menu_lista_produtos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(768, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbCod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbProduto))
                            .addComponent(jLabel1)
                            .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(401, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbCod)
                                .addComponent(rbProduto))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(56, 56, 56)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(63, 63, 63))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2)
                                .addComponent(jButton1))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int i = jTable1.getSelectedRow();
       if(i!=-1){ 
            Produto p = list.get(i);
            this.dispose();
            new EditarView(p);
       }else{
           JOptionPane.showMessageDialog(null, "Selecione algum Produto!");
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarKeyReleased
                  if(tfBuscar.getText().equals("")){
                    DAOProduto produtos = new DAOProduto();
                    list = produtos.listar_todos();
                    construirTabla(list);
                  }else{
                        DAOProduto produtos = new DAOProduto();
                        if(rbCod.isSelected()){
                            try{
                               int code = Integer.parseInt(tfBuscar.getText());
                               list = produtos.listar_por_cod(code);
                               construirTabla(list); 
                            }catch(NumberFormatException e){
                                list = new ArrayList();
                                construirTabla(list);
                            }   
                        }
                        if(rbProduto.isSelected()){
                            list = produtos.listar_por_prod(tfBuscar.getText());
                            construirTabla(list);
                        }
                    
                  }
    }//GEN-LAST:event_tfBuscarKeyReleased

    private void rbCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCodActionPerformed
         if(evt.getSource()==rbCod){
           rbProduto.setSelected(false);
        } 
    }//GEN-LAST:event_rbCodActionPerformed

    private void rbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbProdutoActionPerformed
         if(evt.getSource()==rbProduto){
            rbCod.setSelected(false);
        }
     }//GEN-LAST:event_rbProdutoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int i = jTable1.getSelectedRow();
        if(i!=-1){ 
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "Deseja realmene excluir o prouto selecionado?","Warning",dialogButton);
            if(dialogResult==JOptionPane.YES_OPTION){
                Produto p = list.get(i);
                DAOProduto produtos = new DAOProduto();
                if(produtos.delete(p)){
                    JOptionPane.showMessageDialog(null, "Produto Excluido com Sucesso");
                    list = produtos.listar_todos();
                    construirTabla(list);
                }else{
                    JOptionPane.showMessageDialog(null, "Problemas ao Excluir");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione algum Produto!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void menu_Realizar_VendaMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menu_Realizar_VendaMenuSelected
        // TODO add your handling code here:
        new VendaView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu_Realizar_VendaMenuSelected

    private void menu_Historico_VendaMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menu_Historico_VendaMenuSelected
        // TODO add your handling code here:
        new HistVendasView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu_Historico_VendaMenuSelected

    private void menu_cadastrar_produtoMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menu_cadastrar_produtoMenuSelected
        // TODO add your handling code here:
        new CadastroView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu_cadastrar_produtoMenuSelected

    private void menu_lista_produtosMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menu_lista_produtosMenuSelected
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menu_lista_produtosMenuSelected

    

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ListarProdView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ListarProdView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ListarProdView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ListarProdView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ListarProdView().setVisible(true);
//            }
//        });
//    }
    ArrayList<Produto> list;
    DefaultTableModel modelo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu menu_Historico_Venda;
    private javax.swing.JMenu menu_Realizar_Venda;
    private javax.swing.JMenu menu_cadastrar_produto;
    private javax.swing.JMenu menu_lista_produtos;
    private javax.swing.JRadioButton rbCod;
    private javax.swing.JRadioButton rbProduto;
    private javax.swing.JTextField tfBuscar;
    // End of variables declaration//GEN-END:variables
}
