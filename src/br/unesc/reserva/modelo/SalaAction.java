package br.unesc.reserva.modelo;

import br.unesc.reserva.dao.SalaDAO;
import br.unesc.reserva.view.JanelaISala;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SalaAction implements ActionListener {

    private JanelaISala frame;
    private String login;
    
    SalaDAO dao = new SalaDAO();

    public SalaAction(JanelaISala frame) throws IOException {
        this.frame = frame;
        login = Generics.getUsuario();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if ("salvar".equals(e.getActionCommand())) {
            // inicialização dos componentes
            Sala s = frame.getSala();

            if (isValid(s)) {
                try {
                    dao.insert(s);
                    JOptionPane.showMessageDialog(null,"Sala inserida com sucesso!");
                    Generics.GerarLog("Criou a sala de código: " + s.getCodigo(), login);
                } catch (IOException ex) {
                    Logger.getLogger(SalaAction.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        if ("editar".equals(e.getActionCommand())) {
            Sala s = frame.getSala();

            if (isValid(s)) {
                try {
                    dao.update(s);
                    JOptionPane.showMessageDialog(null,"Sala editada com sucesso!");
                    Generics.GerarLog("Editou a sala de código: " + s.getCodigo(), login);
                } catch (IOException ex) {
                    Logger.getLogger(SalaAction.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        if ("excluir".equals(e.getActionCommand())) {
            Sala s = frame.getSala();
            try {
                dao.delete(s);
                JOptionPane.showMessageDialog(null,"Sala excluida com sucesso!");
                Generics.GerarLog("Excluiu a sala de código: " + s.getCodigo(), login);
            } catch (IOException ex) {
                Logger.getLogger(SalaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if ("consultar".equals(e.getActionCommand())) {
            Sala s = frame.getSala();
            try {
                Generics.GerarLog("Consultou a sala de código: " + s.getCodigo(), login);
            } catch (IOException ex) {
                Logger.getLogger(SalaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private boolean isValid(Sala sala) {
        String mensagem = "";

        if (sala.getAndar() == 0) {
            mensagem += " > Informe o andar da sala! \n";
            JOptionPane.showMessageDialog(frame, mensagem);
            return false;
        }
        return true;
    }
    
    public Sala getSala(Sala sala) {

        return dao.getSala(sala.getCodigo());

    }
}
