/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesc.reserva.view;

import br.unesc.reserva.modelo.Generics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Antônio , Jefferson
 */
public class JanelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form JanelaLogin
     */
    String x = System.getProperty("user.name");
    String local = "C:\\Users\\"+x+"\\Documents\\NetBeansProjects\\reservasala\\USUARIO.txt";
    String usuario;

    public JanelaLogin() {
        analizar();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        lblLogin1 = new javax.swing.JLabel();
        lblSenha1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelFundo.setBackground(new java.awt.Color(153, 153, 153));

        lblLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Login");

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        lblLogin1.setBackground(new java.awt.Color(50, 50, 50));
        lblLogin1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLogin1.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin1.setIcon(new javax.swing.ImageIcon("C:\\Users\\jeff\\Downloads\\aa.jpg")); // NOI18N

        lblSenha1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSenha1.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha1.setText("Sistema de Reserva Salas");

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblSenha1))
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEntrar)
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSenha)
                                    .addComponent(lblLogin))
                                .addGap(18, 18, 18)
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(lblSenha1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogin)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSenha)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEntrar)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        if (evt.getSource() == btnEntrar) {

            File arquivo = new File("USUARIO.txt");

            String caminho = arquivo.getAbsolutePath();
            //ESCREVE O LOGIN
            try {
                PrintWriter arq = new PrintWriter(caminho);
                arq.println(txtLogin.getText());
                arq.close();
                System.out.println("Escrveu no arquivo");
            } catch (Exception ex) {
                System.out.println("Nao escrveu no arquivo \nErro: " + ex);
            }
        }

        JanelaPrincipal jp = null;
        try {
            jp = new JanelaPrincipal();
        } catch (IOException ex) {
            Logger.getLogger(JanelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        jp.setVisible(true);
        this.dispose();

        String usuario = null;
        usuario = Generics.getUsuario();

        try {
            Generics.GerarLog("Entrou no sistema",usuario);
        } catch (IOException ex) {
            Logger.getLogger(JanelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed

    }//GEN-LAST:event_txtLoginActionPerformed

    private void analizar() {

        File arquivo = new File(local);
       
        if (arquivo.exists()) {
            try {
                System.out.println("existe");

                BufferedReader arq = new BufferedReader(new FileReader(local));
                usuario = arq.readLine();
                arq.close();
                initComponents();
                this.txtLogin.setDocument(new teclasletras());
                this.txtLogin.setText(usuario);
                this.txtLogin.setSelectionStart(txtLogin.getText().length());
                this.setLocation(450,200);
                this.txtLogin.setEditable(true);
      
            } 
            catch (Exception erro) {
                //Tratar Exception
            }
        }
        else
        {
            initComponents();
            this.setLocation(450,200);
            txtLogin.setDocument(new teclasletras());
                         
        }
        
    }

        public class teclasletras extends PlainDocument {

        @Override
        public void insertString(int offset, String str, javax.swing.text.AttributeSet attr)
                throws BadLocationException {
            super.insertString(offset, str.replaceAll("[^a-z|^A-Z]",""), attr);}}
        
        public class teclasnumeros extends PlainDocument {

            @Override
            public void insertString(int offset, String str, javax.swing.text.AttributeSet attr)
                    throws BadLocationException {
                super.insertString(offset, str.replaceAll("[^0-9]",""), attr);}}
    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogin1;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSenha1;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
