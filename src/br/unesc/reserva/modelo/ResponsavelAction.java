package br.unesc.reserva.modelo;

import br.unesc.reserva.dao.ResponsavelDAO;
import br.unesc.reserva.view.JanelaIResponsavel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ResponsavelAction implements ActionListener {

    JanelaIResponsavel frame;
    private final String login;

    ResponsavelDAO dao = new ResponsavelDAO();

    public ResponsavelAction(JanelaIResponsavel frame) {
        this.frame = frame;
        login = Generics.getUsuario();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if ("salvar".equals(e.getActionCommand())) {
            Responsavel r = frame.getResponsavel();

            if (isValid(r)) {
                try {
                    dao.insert(r);
                    JOptionPane.showMessageDialog(null, "Responsável incluído com sucesso!");

                    Generics.GerarLog("Criou o responsável de código: ", login);
                } catch (IOException ex) {
                    Logger.getLogger(SalaAction.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        if ("editar".equals(e.getActionCommand())) {
            Responsavel r = frame.getResponsavel();

            dao.update(r);
            JOptionPane.showMessageDialog(null, "Responsavel editado com sucesso!");

            if (isValid(r)) {
                try {
                    dao.insert(r);
                    JOptionPane.showMessageDialog(null, "Responsável incluído com sucesso!");

                    Generics.GerarLog("Editou o responsável de código: " + r.getCodigo(), login);
                } catch (IOException ex) {
                    Logger.getLogger(SalaAction.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        if ("excluir".equals(e.getActionCommand())) {
            Responsavel r = frame.getResponsavel();

            dao.delete(r);

            JOptionPane.showMessageDialog(null, "Responsavel excluido com sucesso!");
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

    private boolean isValid(Responsavel responsavel) {

        String mensagem = "";
        boolean isValid = true;

        if (responsavel.getCPF().isEmpty()) {
            mensagem += " > Informe o cpf! \n";
            isValid = false;
        }

        if (responsavel.getNome().isEmpty()) {
            mensagem += " > Informe o nome! \n";
            isValid = false;
        }

        if (responsavel.getEmail().isEmpty() && responsavel.getTelefone().isEmpty()) {
            mensagem += " > Informe o e-mail ou telefone para contato! \n";
            isValid = false;
        }

        if (!isValid) {
            JOptionPane.showMessageDialog(frame, mensagem);
        }

        return isValid;
    }

    public Responsavel getResponsavel(Responsavel responsavel) {

        return dao.getResponsavel(responsavel.getCodigo());

    }
}
