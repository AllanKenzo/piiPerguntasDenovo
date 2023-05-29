/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mantendoperguntas;

import java.util.List;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 23.01362-0
 */
public class AtualizarPergunta extends javax.swing.JFrame {

    /**
     * Creates new form AtualizarPergunta
     */
    public AtualizarPergunta() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atualizarPerguntaText = new javax.swing.JTextPane();
        alternativa4TextField = new javax.swing.JTextField();
        respostaTextField = new javax.swing.JTextField();
        pontosTextField = new javax.swing.JTextField();
        atualizarConfirmarButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        enunciadoTextField = new javax.swing.JTextField();
        alternativa1TextField = new javax.swing.JTextField();
        alternativa2TextField = new javax.swing.JTextField();
        alternativa3TextField = new javax.swing.JTextField();
        idPerguntaTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        atualizarPerguntaText.setEditable(false);
        atualizarPerguntaText.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        atualizarPerguntaText.setText("Selecione uma pergunta para atualizar");
        jScrollPane1.setViewportView(atualizarPerguntaText);

        alternativa4TextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Alternativa 4"));

        respostaTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Resposta"));

        pontosTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Pontos"));

        atualizarConfirmarButton.setText("Atualizar");
        atualizarConfirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarConfirmarButtonActionPerformed(evt);
            }
        });

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        enunciadoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Enunciado"));

        alternativa1TextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Alternativa 1"));

        alternativa2TextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Alternativa 2"));

        alternativa3TextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Alternativa 3"));

        idPerguntaTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Id da Pergunta"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(voltarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atualizarConfirmarButton))
                    .addComponent(enunciadoTextField)
                    .addComponent(alternativa1TextField)
                    .addComponent(alternativa2TextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(alternativa3TextField)
                    .addComponent(alternativa4TextField)
                    .addComponent(respostaTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pontosTextField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 48, Short.MAX_VALUE))
                    .addComponent(idPerguntaTextField))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(idPerguntaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enunciadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alternativa1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alternativa2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alternativa3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alternativa4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(respostaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pontosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizarConfirmarButton)
                    .addComponent(voltarButton))
                .addGap(108, 108, 108))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        PerguntasGeral perguntasGeralTela = new PerguntasGeral();
        perguntasGeralTela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void atualizarConfirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarConfirmarButtonActionPerformed
        try{
        var dao = new PerguntasDAO();

        String idPergunta = idPerguntaTextField.getText();//como acessar esse dado
        String enunciado = enunciadoTextField.getText();
        String alternativa1 = alternativa1TextField.getText();
        String alternativa2 = alternativa2TextField.getText();
        String alternativa3 = alternativa3TextField.getText();
        String alternativa4 = alternativa4TextField.getText();
        String resposta = respostaTextField.getText();
        String pontos = pontosTextField.getText();
        
        var p = new Perguntas(idPergunta, enunciado, alternativa1, alternativa2, alternativa3, alternativa4, resposta, pontos);
        
        dao.atualizarPergunta(p);
        
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_atualizarConfirmarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AtualizarPergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarPergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarPergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarPergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarPergunta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alternativa1TextField;
    private javax.swing.JTextField alternativa2TextField;
    private javax.swing.JTextField alternativa3TextField;
    private javax.swing.JTextField alternativa4TextField;
    private javax.swing.JButton atualizarConfirmarButton;
    private javax.swing.JTextPane atualizarPerguntaText;
    private javax.swing.JTextField enunciadoTextField;
    private javax.swing.JTextField idPerguntaTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pontosTextField;
    private javax.swing.JTextField respostaTextField;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}