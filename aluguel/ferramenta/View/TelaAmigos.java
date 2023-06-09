/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto.aluguel.ferramenta.View;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import projeto.aluguel.ferramenta.DAO.AmigoDAO;
import projeto.aluguel.ferramenta.Model.Amigo;

/**
 *
 * @author Pichau
 */
public class TelaAmigos extends javax.swing.JFrame {

    /**
     * Creates new form TelaAmigos
     */
    public TelaAmigos() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tabelaDeAmigos.getModel();
        tabelaDeAmigos.setRowSorter(new TableRowSorter(modelo));
        
        readJTable();
    }
    
    public void readJTable(){
        
        DefaultTableModel modelo = (DefaultTableModel) tabelaDeAmigos.getModel();
        modelo.setNumRows(0);
        AmigoDAO dao = new AmigoDAO();
        
        for (Amigo a: dao.Read()) {
            
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getTelefone()   
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDeAmigos = new javax.swing.JTable();
        botaoVoltar = new javax.swing.JButton();
        botaoAtualizarAmigo = new javax.swing.JButton();
        botaoCadastrarAmigo = new javax.swing.JButton();
        botaoEmprestarFerramenta = new javax.swing.JButton();
        botaoRemoverAmigo1 = new javax.swing.JButton();
        campoTextoTelefone = new javax.swing.JTextField();
        campoTextoNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tabelaDeAmigos.setAutoCreateRowSorter(true);
        tabelaDeAmigos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tabelaDeAmigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaDeAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDeAmigosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaDeAmigos);

        botaoVoltar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botaoVoltar.setText("voltar");
        botaoVoltar.setMaximumSize(new java.awt.Dimension(120, 30));
        botaoVoltar.setMinimumSize(new java.awt.Dimension(120, 30));
        botaoVoltar.setPreferredSize(new java.awt.Dimension(120, 30));
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoAtualizarAmigo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botaoAtualizarAmigo.setText("atualizar amigo");
        botaoAtualizarAmigo.setMaximumSize(new java.awt.Dimension(120, 30));
        botaoAtualizarAmigo.setMinimumSize(new java.awt.Dimension(120, 30));
        botaoAtualizarAmigo.setPreferredSize(new java.awt.Dimension(120, 30));
        botaoAtualizarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarAmigoActionPerformed(evt);
            }
        });

        botaoCadastrarAmigo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botaoCadastrarAmigo.setText("cadastrar amigo");
        botaoCadastrarAmigo.setMaximumSize(new java.awt.Dimension(120, 30));
        botaoCadastrarAmigo.setMinimumSize(new java.awt.Dimension(120, 30));
        botaoCadastrarAmigo.setPreferredSize(new java.awt.Dimension(120, 30));
        botaoCadastrarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarAmigoActionPerformed(evt);
            }
        });

        botaoEmprestarFerramenta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botaoEmprestarFerramenta.setText("emprestar ferramenta");
        botaoEmprestarFerramenta.setMaximumSize(new java.awt.Dimension(161, 30));
        botaoEmprestarFerramenta.setMinimumSize(new java.awt.Dimension(161, 30));
        botaoEmprestarFerramenta.setPreferredSize(new java.awt.Dimension(161, 30));

        botaoRemoverAmigo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botaoRemoverAmigo1.setText("remover amigo");
        botaoRemoverAmigo1.setMaximumSize(new java.awt.Dimension(120, 30));
        botaoRemoverAmigo1.setMinimumSize(new java.awt.Dimension(120, 30));
        botaoRemoverAmigo1.setPreferredSize(new java.awt.Dimension(120, 30));
        botaoRemoverAmigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverAmigo1ActionPerformed(evt);
            }
        });

        campoTextoTelefone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campoTextoTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoTextoNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campoTextoNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Telefone");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoEmprestarFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoTextoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(155, 155, 155))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(botaoCadastrarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoRemoverAmigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoAtualizarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoEmprestarFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTextoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAtualizarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastrarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoRemoverAmigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoCadastrarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarAmigoActionPerformed
        
//        DefaultTableModel dtmProdutos = (DefaultTableModel) tabelaDeAmigos.getModel();
//        Object[] dados = {campoTextoNome.getText(), campoTextoTelefone.getText()};
//        if((!campoTextoNome.getText().trim().isEmpty()) && (!campoTextoTelefone.getText().trim().isEmpty())){
//            dtmProdutos.addRow(dados);
//        }else{
//            
//            JOptionPane.showMessageDialog(null, "Informe todos os dados!", "Erro", JOptionPane.ERROR_MESSAGE);
//        }
          Amigo amigo = new Amigo();
          AmigoDAO dao = new AmigoDAO();
          
          amigo.setNome(campoTextoNome.getText());
          try{
              amigo.setTelefone(Integer.parseInt(campoTextoTelefone.getText()));
              dao.Create(amigo);
              
              campoTextoNome.setText(null);
              campoTextoTelefone.setText(null);
              
              
          }catch(NumberFormatException ex){
              JOptionPane.showMessageDialog(null, "Informe o telefone corretamente!");
          }
          readJTable();
  
    }//GEN-LAST:event_botaoCadastrarAmigoActionPerformed

    private void botaoRemoverAmigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverAmigo1ActionPerformed
        
        if(tabelaDeAmigos.getSelectedRow() != -1){
            
            Amigo amigo = new Amigo();
            AmigoDAO dao = new AmigoDAO();
          
            amigo.setId((int)tabelaDeAmigos.getValueAt(tabelaDeAmigos.getSelectedRow(), 0));
            dao.Delete(amigo);  
            
            campoTextoNome.setText(null);
            campoTextoTelefone.setText(null);
            
            readJTable();
        }else{
            
            JOptionPane.showMessageDialog(null, "Selecione algo para excluir!");
        }
    }//GEN-LAST:event_botaoRemoverAmigo1ActionPerformed

    private void tabelaDeAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDeAmigosMouseClicked
        if(tabelaDeAmigos.getSelectedRow() != -1){
            
            campoTextoNome.setText(tabelaDeAmigos.getValueAt(tabelaDeAmigos.getSelectedRow(), 1).toString());
            campoTextoTelefone.setText(tabelaDeAmigos.getValueAt(tabelaDeAmigos.getSelectedRow(), 2).toString());
    
        }
    }//GEN-LAST:event_tabelaDeAmigosMouseClicked

    private void botaoAtualizarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarAmigoActionPerformed
        
        if(tabelaDeAmigos.getSelectedRow() != -1){
            
            if((!campoTextoNome.getText().trim().isEmpty()) && (!campoTextoTelefone.getText().trim().isEmpty())){
            
            Amigo amigo = new Amigo();
          AmigoDAO dao = new AmigoDAO();
          
          amigo.setNome(campoTextoNome.getText());
          try{
              amigo.setTelefone(Integer.parseInt(campoTextoTelefone.getText()));
              amigo.setId((int)tabelaDeAmigos.getValueAt(tabelaDeAmigos.getSelectedRow(), 0));
              dao.Update(amigo);
              
              campoTextoNome.setText(null);
              campoTextoTelefone.setText(null);
              
              tabelaDeAmigos.clearSelection();
          }catch(NumberFormatException ex){
              JOptionPane.showMessageDialog(null, "Informe o telefone corretamente!");
          }
          readJTable();

            
            }else{
                
                JOptionPane.showMessageDialog(null, "Coloque o nome e o telefone!", "Erro", JOptionPane.ERROR_MESSAGE);
            
            }
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Selecione algo que queira atualizar!");
        }
        
        
    }//GEN-LAST:event_botaoAtualizarAmigoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAmigos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAtualizarAmigo;
    private javax.swing.JButton botaoCadastrarAmigo;
    private javax.swing.JButton botaoEmprestarFerramenta;
    private javax.swing.JButton botaoRemoverAmigo1;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoTextoNome;
    private javax.swing.JTextField campoTextoTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaDeAmigos;
    // End of variables declaration//GEN-END:variables
}
