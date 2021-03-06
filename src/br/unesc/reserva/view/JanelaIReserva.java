/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesc.reserva.view;

import br.unesc.reserva.dao.ReservaDAO;
import br.unesc.reserva.modelo.Generics;
import br.unesc.reserva.modelo.Reserva;
import br.unesc.reserva.modelo.ReservaAction;
import br.unesc.reserva.modelo.Responsavel;
import br.unesc.reserva.modelo.ResponsavelCombo;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Antônio
 */
public class JanelaIReserva extends javax.swing.JInternalFrame {
    
    ReservaAction ra;
    
    ReservaDAO dao = new ReservaDAO();
    
    List<String> listaSalas = new ArrayList<>();
    List<ResponsavelCombo> listResponsavel = new ArrayList<>();
    List<String> nomesResponsavel = new ArrayList<>();
    
    public JanelaIReserva() throws IOException {
        this.ra = new ReservaAction(this);
        listaSalas = dao.getSalas();
        listResponsavel = dao.getResponsavel();
        
        for (ResponsavelCombo resp : listResponsavel) {
            nomesResponsavel.add(resp.getNome());
        }        
        
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

        painelFundo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblSala = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        cbxSala = new javax.swing.JComboBox();
        lblResponsavel = new javax.swing.JLabel();
        cbxResponsavel = new javax.swing.JComboBox();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        lblPeriod = new javax.swing.JLabel();
        cbxPeriodo = new javax.swing.JComboBox();
        btnSalvar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelFundo.setBackground(new java.awt.Color(153, 153, 153));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Cadastro Reserva");

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Código");

        lblSala.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSala.setForeground(new java.awt.Color(255, 255, 255));
        lblSala.setText("Sala");

        cbxSala.setModel(new javax.swing.DefaultComboBoxModel(listaSalas.toArray()));

        lblResponsavel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblResponsavel.setForeground(new java.awt.Color(255, 255, 255));
        lblResponsavel.setText("Responsável");

        cbxResponsavel.setModel(new javax.swing.DefaultComboBoxModel(nomesResponsavel.toArray()));

        lblData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        lblData.setText("Data");

        lblPeriod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPeriod.setForeground(new java.awt.Color(255, 255, 255));
        lblPeriod.setText("Período");

        cbxPeriodo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Matutino", "Vespertino", "Noturno" }));

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(ra);
        btnSalvar.setActionCommand("salvar");

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(ra);
        btnConsultar.setActionCommand("consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(ra);
        btnEditar.setActionCommand("editar");

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(ra);
        btnExcluir.setActionCommand("excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxPeriodo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPeriod))
                        .addGap(236, 236, 236))
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCodigo)
                                    .addComponent(lblSala)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxSala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblResponsavel)
                                    .addComponent(cbxResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFechar)))
                        .addContainerGap(66, Short.MAX_VALUE))))
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(lblResponsavel)
                        .addGap(26, 26, 26))
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lblSala)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(lblData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(lblPeriod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar)
                    .addComponent(btnConsultar)
                    .addComponent(btnFechar))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        try {
            Generics.GerarLog("Fechou a tela de Reservas", Generics.getUsuario());
        } catch (IOException ex) {
            Logger.getLogger(JanelaISala.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ReservaDAO dao = new ReservaDAO();
        try {
            dao.delete(getReserva());
        } catch (Exception ex) {
            Logger.getLogger(JanelaIReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            setReserva();
        } catch (Exception ex) {
            Logger.getLogger(JanelaIReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed
    public Reserva getReserva() throws Exception {
        Reserva reserva = new Reserva();
        
        Date data = null;
        
        int codigo = txtCodigo.getText().isEmpty() ? 0 : Integer.valueOf(txtCodigo.getText());
        
        try {
            data = Generics.formataData(txtData.getText());
        } catch (Exception ex) {
            Generics.GerarLog("Erro ao formatar data da reserva: " + ex.toString(), Generics.getUsuario());
        }
        
        reserva.setCodigo(codigo);
        reserva.setData(data);
        reserva.setIdResponsavel(listResponsavel.get(cbxResponsavel.getSelectedIndex()).getCodigo());
        reserva.setIdSala(Integer.parseInt(listaSalas.get(cbxSala.getSelectedIndex())));
        
        switch (cbxPeriodo.getSelectedIndex()) {
            case 0:
                reserva.setPeriodo("Matutino");
                break;
            case 1:
                reserva.setPeriodo("Vespertino");
                break;
            case 2:
                reserva.setPeriodo("Noturno");
                break;
            default:
                break;
        }
            
        
                
        
        
        return reserva;
    }
    
    public void setReserva() throws Exception {
        
        if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Necessário informar código da reserva para realizar consulta!");
            return;
        }
        
        Reserva r = new Reserva();
        
        r = ra.getReserva(getReserva());
        
        if (r == null) {
            JOptionPane.showMessageDialog(null, "Reserva não encontrada!");
            return;
        }
        
        txtCodigo.setText(String.valueOf(r.getCodigo()));
        cbxSala.setSelectedIndex(r.getIdSala()-1);
        cbxResponsavel.setSelectedIndex(r.getIdResponsavel()-1);
        
        int periodo = 0;
        
        switch (r.getPeriodo()) {
            case "Matutino":
                periodo = 0;
                break;
            case "Vespertino":
                periodo = 1;
                break;
            case "Noturno":
                periodo = 2;
                break;
            default:
                break;
        }
        
        cbxPeriodo.setSelectedIndex(periodo);
        
    }
    
    public void limpaCampos(){
        txtCodigo.setText("");
        cbxSala.setSelectedIndex(0);
        cbxResponsavel.setSelectedIndex(0);
        txtData.setText("");
        cbxPeriodo.setSelectedIndex(0);
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbxPeriodo;
    private javax.swing.JComboBox cbxResponsavel;
    private javax.swing.JComboBox cbxSala;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblPeriod;
    private javax.swing.JLabel lblResponsavel;
    private javax.swing.JLabel lblSala;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtData;
    // End of variables declaration//GEN-END:variables
}
