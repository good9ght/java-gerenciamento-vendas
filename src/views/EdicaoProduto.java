/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.sql.SQLException;

import javax.swing.JOptionPane;
import helpers.CaracteresHelper;
import controllers.ProdutosController;
import models.Produto;

/**
 *
 * @author victor.ananias
 */
public class EdicaoProduto extends javax.swing.JFrame {
        private Produto produto;

        /**
         * Creates new form EditarProd
         */
        public EdicaoProduto(Produto produto) {
                this.produto = produto;
                initComponents();
                // Centralizando a tela
                this.setLocationRelativeTo(null);
                this.setProduto();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                btGroupTipo = new javax.swing.ButtonGroup();
                jPanelPrincipal = new javax.swing.JPanel();
                jLabelTitle = new javax.swing.JLabel();
                jLabelNome = new javax.swing.JLabel();
                jLabelPreco = new javax.swing.JLabel();
                jTextPrecoProd = new javax.swing.JTextField();
                jBtSalvar = new javax.swing.JButton();
                jLabel5 = new javax.swing.JLabel();
                jRBtPerecivel = new javax.swing.JRadioButton();
                jRBtN = new javax.swing.JRadioButton();
                jTextNome = new javax.swing.JTextField();
                jLabelAviso1 = new javax.swing.JLabel();
                jBtVoltar = new javax.swing.JButton();
                jLabelCodigo = new javax.swing.JLabel();
                jTextCodigo = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Edição de Produto");

                jPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
                jPanelPrincipal.setPreferredSize(new java.awt.Dimension(1100, 600));

                jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jLabelTitle.setText("Edição de Produto");

                jLabelNome.setText("Nome do Produto:");

                jLabelPreco.setText("Preço:");

                jTextPrecoProd.setPreferredSize(new java.awt.Dimension(10, 25));
                jTextPrecoProd.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyTyped(java.awt.event.KeyEvent evt) {
                            jTextPrecoProdKeyTyped(evt);
                    }
                });

                jBtSalvar.setText("Salvar");
                jBtSalvar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jBtSalvarActionPerformed(evt);
                        }
                });

                jLabel5.setText("Tipo:");

                btGroupTipo.add(jRBtPerecivel);
                jRBtPerecivel.setSelected(true);
                jRBtPerecivel.setText("Perecível");
                jRBtPerecivel.setActionCommand("P");

                btGroupTipo.add(jRBtN);
                jRBtN.setText("Não Perecível");
                jRBtN.setActionCommand("N");

                jTextNome.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                jTextNomeFocusLost(evt);
                        }
                });
                jTextNome.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                jTextNomeKeyTyped(evt);
                        }
                });

                jLabelAviso1.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
                jLabelAviso1.setForeground(java.awt.Color.red);

                jBtVoltar.setText("Voltar");
                jBtVoltar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jBtVoltarActionPerformed(evt);
                        }
                });

                jLabelCodigo.setText("Código: ");

                jTextCodigo.setEditable(false);
                jTextCodigo.setEnabled(false);
                jTextCodigo.setPreferredSize(new java.awt.Dimension(80, 25));

                javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
                jPanelPrincipal.setLayout(jPanelPrincipalLayout);
                jPanelPrincipalLayout.setHorizontalGroup(jPanelPrincipalLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout
                                                .createSequentialGroup()
                                                .addGap(0, 209, Short.MAX_VALUE)
                                                .addGroup(jPanelPrincipalLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jBtSalvar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                105,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                                                                .addComponent(jLabel5)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                67, Short.MAX_VALUE)
                                                                                .addComponent(jRBtPerecivel)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jRBtN))
                                                                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                                                                .addGroup(jPanelPrincipalLayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jLabelNome,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabelCodigo,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabelPreco,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGap(26, 26, 26)
                                                                                .addGroup(jPanelPrincipalLayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                false)
                                                                                                .addComponent(jTextPrecoProd,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jTextNome)
                                                                                                .addComponent(jTextCodigo,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                150,
                                                                                                                Short.MAX_VALUE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelAviso1, javax.swing.GroupLayout.PREFERRED_SIZE, 154,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(200, 200, 200))
                                .addGroup(jPanelPrincipalLayout.createSequentialGroup().addGroup(jPanelPrincipalLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelPrincipalLayout.createSequentialGroup().addContainerGap()
                                                                .addComponent(jBtVoltar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                115,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                                .addGap(480, 480, 480)
                                                .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 117, javax.swing.GroupLayout.DEFAULT_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)));
                jPanelPrincipalLayout.setVerticalGroup(jPanelPrincipalLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabelTitle)
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanelPrincipalLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabelCodigo).addComponent(jTextCodigo,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanelPrincipalLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(jPanelPrincipalLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jTextNome,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                25,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabelNome))
                                                                .addComponent(jLabelAviso1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanelPrincipalLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jTextPrecoProd,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabelPreco))
                                                .addGap(22, 22, 22)
                                                .addGroup(jPanelPrincipalLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel5).addComponent(jRBtPerecivel)
                                                                .addComponent(jRBtN))
                                                .addGap(26, 26, 26)
                                                .addComponent(jBtSalvar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76,
                                                                Short.MAX_VALUE)
                                                .addComponent(jBtVoltar).addContainerGap()));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE,  javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 1, Short.MAX_VALUE)));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE,  javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jTextPrecoProdKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextPrecoProdKeyTyped
                // if(!(conversorCaracteres.getNUMEROS()+",").contains(
                // (evt.getKeyChar()+""))){
                // evt.consume();
                // }
        }// GEN-LAST:event_jTextPrecoProdKeyTyped

    private void setProduto() {
        jTextCodigo.setText(String.valueOf(produto.getId()));
        jTextNome.setText(String.valueOf(produto.getNome()));
        jTextPrecoProd.setText(String.valueOf(CaracteresHelper.addMascaraMonetaria(produto.getValor())));
    }

    private void verificaCampoNome() {
        if (jTextNome.getText().equals("")) {
            jLabelAviso1.setText("Campo Obrigatório");
        } else {
            jLabelAviso1.setText("");
        }
    }

    private void jBtSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBtSalvarActionPerformed
        this.verificaCampoNome();

        if (jTextNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo \"Nome do Produto\"\n" + "precisa ser preenchido.", "Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        if (jTextPrecoProd.getText().equals("")) {
            jTextPrecoProd.setText("0");
        }

        try {
            produto.setNome(jTextNome.getText());
            produto.setValor(CaracteresHelper.rmMascaraMonetaria(jTextPrecoProd.getText()));
            produto.setTipo(btGroupTipo.getSelection().getActionCommand());
            produto.save();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao atualizar produto", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(null, "Informações Atualizadas", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        
    }// GEN-LAST:event_jBtSalvarActionPerformed

    private void jTextNomeFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextNomeFocusLost
        this.verificaCampoNome();
    }// GEN-LAST:event_jTextNomeFocusLost

    private void jTextNomeKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextNomeKeyTyped
        // if(!(evt.getKeyChar()+"").equals(" ")){
        // String texto = jTextNome.getText();
        // String letra = conversorCaracteres.verificaLetra(evt);
        // evt.consume();
        // jTextNome.setText(texto + letra);
        // }
    }// GEN-LAST:event_jTextNomeKeyTyped

    private void jBtVoltarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBtVoltarActionPerformed
        EdicaoProduto.this.dispose();
        new Estoque().setVisible(true);
    }// GEN-LAST:event_jBtVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btGroupTipo;
    private javax.swing.JButton jBtSalvar;
    private javax.swing.JButton jBtVoltar;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelAviso1;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JRadioButton jRBtN;
    private javax.swing.JRadioButton jRBtPerecivel;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextPrecoProd;
    // End of variables declaration//GEN-END:variables
}
