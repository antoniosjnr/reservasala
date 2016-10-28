package br.unesc.reserva.modelo;

import br.unesc.reserva.view.JanelaISala;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class SalaAction implements ActionListener{
    
    private JanelaISala frame;
    
    public SalaAction(JanelaISala frame) {
        this.frame = frame;
    }   
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if("salvar".equals(e.getActionCommand())){
            // inicialização dos componentes
            Sala s = frame.getSala();
        }
        
        if("editar".equals(e.getActionCommand())){
            Sala s = frame.getSala();
        }
        
        if("excluir".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(null,"Clicado no excluir!");
        }
        
        if("consultar".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(null,"Clicado no consultar!");
        }
    }
}
