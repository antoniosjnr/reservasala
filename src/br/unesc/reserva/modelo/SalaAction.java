package br.unesc.reserva.modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class SalaAction implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if("salvar".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(null,"Clicado no salvar!");
        }
        
        if("editar".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(null,"Clicado no editar!");
        }
        
        if("excluir".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(null,"Clicado no excluir!");
        }
        
        if("consultar".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(null,"Clicado no consultar!");
        }
    }
}
