package uisuperfatorial;

import java.awt.Color;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import superfatorial.*;

public class JanelaUsuario extends javax.swing.JFrame {

    /**
     * Creates new form JanelaUsuario
     */
    public JanelaUsuario() {
        super("Calculo de SuperFatorial");
        initComponents();
        sp = new SuperFatorial();
        spCached = new SuperFatorialCached();
        spDisco = new SuperFatorialFile();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        valorTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        diretoRb = new javax.swing.JRadioButton();
        cacheRb = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadoTxt = new javax.swing.JTextArea();
        calcularBt = new javax.swing.JButton();
        discoRb = new javax.swing.JRadioButton();
        sairBt = new javax.swing.JButton();
        verificarResumoBt = new javax.swing.JButton();
        gerarResumoBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Valor");

        jLabel2.setText("Tipo de cálculo");

        bg.add(diretoRb);
        diretoRb.setSelected(true);
        diretoRb.setText("Direto (sem cache)");

        bg.add(cacheRb);
        cacheRb.setText("Com cache em memória");
        cacheRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cacheRbActionPerformed(evt);
            }
        });

        jLabel3.setText("Resultado");

        resultadoTxt.setEditable(false);
        resultadoTxt.setColumns(20);
        resultadoTxt.setLineWrap(true);
        resultadoTxt.setRows(5);
        jScrollPane1.setViewportView(resultadoTxt);

        calcularBt.setText("Calcular");
        calcularBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularBtActionPerformed(evt);
            }
        });

        bg.add(discoRb);
        discoRb.setText("Ler o cache do disco");

        sairBt.setText("Sair");
        sairBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBtActionPerformed(evt);
            }
        });

        verificarResumoBt.setText("Verificar Resumo");
        verificarResumoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarResumoBtActionPerformed(evt);
            }
        });

        gerarResumoBt.setText("Gerar Resumo");
        gerarResumoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarResumoBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorTxt)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(discoRb)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(diretoRb)
                            .addComponent(cacheRb)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calcularBt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(gerarResumoBt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(verificarResumoBt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sairBt)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diretoRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cacheRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(discoRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calcularBt)
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairBt)
                    .addComponent(verificarResumoBt)
                    .addComponent(gerarResumoBt))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularBtActionPerformed
        // TODO add your handling code here:

        try {
            int valor = Integer.parseInt(valorTxt.getText());
            SuperFatorial spTemp;

            if (cacheRb.isSelected()) {
                spTemp = spCached;
            } else if (discoRb.isSelected()) {
                spTemp = spDisco;
            } else {
                spTemp = sp;
            }
            resultadoTxt.setForeground(Color.BLACK);
            long tempoInicial = System.currentTimeMillis();
            resultadoTxt.setText("Superfatorial de " + valor + ":\n\n" + spTemp.getSuperFatorial(valor) + "\n\n" + (System.currentTimeMillis() - tempoInicial) + " ms");
            resultadoTxt.setCaretPosition(0);
        } catch (NumberFormatException | InputException erro) {
            resultadoTxt.setForeground(Color.RED);
            if (erro instanceof NumberFormatException) {
                resultadoTxt.setText("O texto informado não é um número válido");
            } else {
                resultadoTxt.setText(erro.getMessage());
            }
        }


    }//GEN-LAST:event_calcularBtActionPerformed

    private void cacheRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cacheRbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cacheRbActionPerformed

    private void gerarResumoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarResumoBtActionPerformed
        try {
            (new MessageDigestForSFatorial()).fazResumo();
        } catch (NoSuchAlgorithmException | IOException e) {
            Logger logger = Logger.getLogger(MessageDigestForSFatorial.class.getName());
            logger.log(Level.WARNING, e.getMessage());
        }
    }//GEN-LAST:event_gerarResumoBtActionPerformed

    private void sairBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBtActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairBtActionPerformed

    private void verificarResumoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarResumoBtActionPerformed
        try {
            if( (new MessageDigestForSFatorial()).verificaResumo() )
                JOptionPane.showMessageDialog(rootPane, "Arquivo válido");
            else
                JOptionPane.showMessageDialog(rootPane, "Arquivo inválido", "", JOptionPane.ERROR_MESSAGE);
        } catch (NoSuchAlgorithmException | IOException e) {
            Logger logger = Logger.getLogger(MessageDigestForSFatorial.class.getName());
            logger.log(Level.WARNING, e.getMessage());
        }
    }//GEN-LAST:event_verificarResumoBtActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaUsuario janela = new JanelaUsuario();
                janela.setLocationRelativeTo(null);
                janela.setVisible(true);
            }
        });
    }

    SuperFatorial sp;
    SuperFatorialCached spCached;
    SuperFatorialFile spDisco;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg;
    private javax.swing.JRadioButton cacheRb;
    private javax.swing.JButton calcularBt;
    private javax.swing.JRadioButton diretoRb;
    private javax.swing.JRadioButton discoRb;
    private javax.swing.JButton gerarResumoBt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultadoTxt;
    private javax.swing.JButton sairBt;
    private javax.swing.JTextField valorTxt;
    private javax.swing.JButton verificarResumoBt;
    // End of variables declaration//GEN-END:variables
}
