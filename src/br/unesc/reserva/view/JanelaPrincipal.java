/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesc.reserva.view;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Antônio
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    private JanelaISala jis = new JanelaISala();
    private JanelaIResponsavel jire = new JanelaIResponsavel();
    private JanelaIReserva jirs = new JanelaIReserva();

    public JanelaPrincipal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    public JDesktopPane getPainelDesk() {
        return painelFundo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCadastros = new javax.swing.JMenu();
        mnuSala = new javax.swing.JMenuItem();
        mnuResponsavel = new javax.swing.JMenuItem();
        mnuReserva = new javax.swing.JMenuItem();
        mnuSobrePai = new javax.swing.JMenu();
        mnuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelFundo.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        mnuCadastros.setText("Cadastros");

        mnuSala.setText("Sala");
        mnuSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalaActionPerformed(evt);
            }
        });
        mnuCadastros.add(mnuSala);

        mnuResponsavel.setText("Responsável");
        mnuResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuResponsavelActionPerformed(evt);
            }
        });
        mnuCadastros.add(mnuResponsavel);

        mnuReserva.setText("Reserva");
        mnuReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReservaActionPerformed(evt);
            }
        });
        mnuCadastros.add(mnuReserva);

        jMenuBar1.add(mnuCadastros);

        mnuSobrePai.setText("Sobre");

        mnuSobre.setText("Sobre");
        mnuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSobreActionPerformed(evt);
            }
        });
        mnuSobrePai.add(mnuSobre);

        jMenuBar1.add(mnuSobrePai);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSobreActionPerformed
        JOptionPane.showMessageDialog(this, "Reserva Salas v1.0", "Reserva", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_mnuSobreActionPerformed

    private void mnuSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalaActionPerformed
        painelFundo.remove(jis);
        painelFundo.add(jis);
        jis.setVisible(true);

    }//GEN-LAST:event_mnuSalaActionPerformed

    private void mnuResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuResponsavelActionPerformed
        painelFundo.remove(jire);
        painelFundo.add(jire);
        jire.setVisible(true);

    }//GEN-LAST:event_mnuResponsavelActionPerformed

    private void mnuReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReservaActionPerformed
        painelFundo.remove(jirs);
        painelFundo.add(jirs);
        jirs.setVisible(true);

    }//GEN-LAST:event_mnuReservaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuCadastros;
    private javax.swing.JMenuItem mnuReserva;
    private javax.swing.JMenuItem mnuResponsavel;
    private javax.swing.JMenuItem mnuSala;
    private javax.swing.JMenuItem mnuSobre;
    private javax.swing.JMenu mnuSobrePai;
    private javax.swing.JDesktopPane painelFundo;
    // End of variables declaration//GEN-END:variables
}
