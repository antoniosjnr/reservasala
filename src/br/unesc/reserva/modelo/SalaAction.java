package br.unesc.reserva.modelo;

import br.unesc.reserva.view.JanelaISala;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SalaAction implements ActionListener{
    
    private JanelaISala frame;
    private String login;
    
    public SalaAction(JanelaISala frame) throws IOException {
        this.frame = frame;
        login = Generics.getUsuario();
    }   
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if("salvar".equals(e.getActionCommand())){
            // inicialização dos componentes
            Sala s = frame.getSala();
            try {
                Generics.GerarLog("Criou a sala de código: " + s.getCodigo(),login);
            } catch (IOException ex) {
                Logger.getLogger(SalaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if("editar".equals(e.getActionCommand())){            
            Sala s = frame.getSala();
            try {
                Generics.GerarLog("Editou a sala de código: " + s.getCodigo(),login);
            } catch (IOException ex) {
                Logger.getLogger(SalaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if("excluir".equals(e.getActionCommand())){
            Sala s = frame.getSala();
            try {
                Generics.GerarLog("Excluiu a sala de código: " + s.getCodigo(),login);
            } catch (IOException ex) {
                Logger.getLogger(SalaAction.class.getName()).log(Level.SEVERE, null, ex);
            }           
        }
        
        if("consultar".equals(e.getActionCommand())){
            Sala s = frame.getSala();
            try {
                Generics.GerarLog("Consultou a sala de código: " + s.getCodigo(),login);
            } catch (IOException ex) {
                Logger.getLogger(SalaAction.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
    }
}
