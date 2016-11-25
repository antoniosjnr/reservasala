package br.unesc.reserva.modelo;

import br.unesc.reserva.dao.ReservaDAO;
import br.unesc.reserva.view.JanelaIReserva;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ReservaAction implements ActionListener {

    JanelaIReserva frame;

    String usuario = null;

    public ReservaAction(JanelaIReserva frame) {
        this.frame = frame;
        usuario = Generics.getUsuario();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Reserva r = null;

        if ("salvar".equals(e.getActionCommand())) {
            try {
                r = frame.getReserva();
                ReservaDAO dao = new ReservaDAO();
                dao.insert(r);
                
            } catch (Exception ex) {
                Logger.getLogger(ReservaAction.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                System.out.println(r.getCodigo());
                Generics.GerarLog("Criou a reserva de código" + r.getCodigo(), usuario);
            } catch (IOException ex) {
                Logger.getLogger(ReservaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!");
        }

        if ("editar".equals(e.getActionCommand())) {
            try {
                r = frame.getReserva();
            } catch (Exception ex) {
                Logger.getLogger(ReservaAction.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                System.out.println(r.getCodigo());
                Generics.GerarLog("Editou a reserva de código" + r.getCodigo(), usuario);
            } catch (IOException ex) {
                Logger.getLogger(ReservaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if ("excluir".equals(e.getActionCommand())) {
            try {
                r = frame.getReserva();
            } catch (Exception ex) {
                Logger.getLogger(ReservaAction.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                System.out.println(r.getCodigo());
                Generics.GerarLog("Excluiu a reserva de código" + r.getCodigo(), usuario);
            } catch (IOException ex) {
                Logger.getLogger(ReservaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if ("consultar".equals(e.getActionCommand())) {
            try {
                r = frame.getReserva();
            } catch (Exception ex) {
                Logger.getLogger(ReservaAction.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                System.out.println(r.getCodigo());
                Generics.GerarLog("Consultou a reserva de código" + r.getCodigo(), usuario);
            } catch (IOException ex) {
                Logger.getLogger(ReservaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private boolean isValid(Reserva reserva) {
        String mensagem = "";

        boolean isValid = true;

        if (reserva.getData() == null) {
            mensagem += "> Informe uma data para a reserva! \n";
            isValid = false;
        }

        if (reserva.getIdResponsavel() == -1) {
            mensagem += "> Selecione um responsável! \n";
            isValid = false;
        }

        if (reserva.getIdSala() == -1) {
            mensagem += "> Selecione uma sala! \n";
            isValid = false;
        }

        if (reserva.getPeriodo().isEmpty()) {
            mensagem += "> Selecione um período! \n";
            isValid = false;
        }

        if (!isValid) {
            JOptionPane.showMessageDialog(frame, mensagem);
        }

        return isValid;
    }
}
