package br.unesc.reserva.modelo;

import br.unesc.reserva.view.JanelaIReserva;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ReservaAction implements ActionListener{

    JanelaIReserva frame;
    
    public ReservaAction(JanelaIReserva frame) {
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if("salvar".equals(e.getActionCommand())){
            Reserva r = frame.getReserva();
        }
        
        if("editar".equals(e.getActionCommand())){
            Reserva r = frame.getReserva();
        }
        
        if("excluir".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(null,"Clicado no excluir!");
        }
        
        if("consultar".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(null,"Clicado no consultar!");
        }
    }
}
