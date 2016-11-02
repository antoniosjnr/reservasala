package br.unesc.reserva.modelo;

import br.unesc.reserva.view.JanelaIResponsavel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ResponsavelAction implements ActionListener {

    JanelaIResponsavel frame;
    private String login;

    public ResponsavelAction(JanelaIResponsavel frame){
        this.frame = frame;
        login = Generics.getUsuario();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if ("salvar".equals(e.getActionCommand())) {
            Responsavel r = frame.getResponsavel();
            try {
                Generics.GerarLog("Criou o responsável de código: " + r.getCodigo(), login);
            } catch (IOException ex) {
                Logger.getLogger(SalaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if ("editar".equals(e.getActionCommand())) {
            Responsavel r = frame.getResponsavel();
            try {
                Generics.GerarLog("Editou o responsável de código: " + r.getCodigo(), login);
            } catch (IOException ex) {
                Logger.getLogger(SalaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if ("excluir".equals(e.getActionCommand())) {
            Responsavel r = frame.getResponsavel();
            try {
                Generics.GerarLog("Excluiu o responsável de código: " + r.getCodigo(), login);
            } catch (IOException ex) {
                Logger.getLogger(SalaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if ("consultar".equals(e.getActionCommand())) {
            Responsavel r = frame.getResponsavel();
            try {
                Generics.GerarLog("Consultou o responsável de código: " + r.getCodigo(), login);
            } catch (IOException ex) {
                Logger.getLogger(SalaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
