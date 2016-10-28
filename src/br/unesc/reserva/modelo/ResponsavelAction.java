package br.unesc.reserva.modelo;

import br.unesc.reserva.view.JanelaIResponsavel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ResponsavelAction implements ActionListener{
    
    JanelaIResponsavel frame;
    public ResponsavelAction(JanelaIResponsavel frame) {
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if("salvar".equals(e.getActionCommand())){
            Responsavel r = frame.getResponsavel();
        }
        
        if("editar".equals(e.getActionCommand())){
            Responsavel r = frame.getResponsavel();
        }
        
        if("excluir".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(null,"Clicado no excluir!");
        }
        
        if("consultar".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(null,"Clicado no consultar!");
        }
    }
}
