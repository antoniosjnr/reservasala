package br.unesc.reserva.modelo;

import br.unesc.reserva.view.JanelaIReserva;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ReservaAction implements ActionListener{

    JanelaIReserva frame;
    
    String usuario = null;
    
    public ReservaAction(JanelaIReserva frame) throws IOException {
        this.frame = frame;
        usuario = Generics.getUsuario();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        Reserva r = null;
        
        if("salvar".equals(e.getActionCommand())){
            try {
                r = frame.getReserva();
            } catch (Exception ex) {
                Logger.getLogger(ReservaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                System.out.println(r.getCodigo());
                Generics.GerarLog("Cadastrou a reserva de código" + Integer.toString(r.getCodigo()),usuario);                
            } catch (IOException ex) {
                Logger.getLogger(ReservaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if("editar".equals(e.getActionCommand())){
            try {
                r = frame.getReserva();
            } catch (Exception ex) {
                Logger.getLogger(ReservaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                Generics.GerarLog("Editou a reserva de código" + Integer.toString(r.getCodigo()),usuario);
            } catch (IOException ex) {
                Logger.getLogger(ReservaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if("excluir".equals(e.getActionCommand())){
            try {
                r = frame.getReserva();
            } catch (Exception ex) {
                Logger.getLogger(ReservaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                Generics.GerarLog("Excluiu a reserva de código" + Integer.toString(r.getCodigo()),usuario);
            } catch (IOException ex) {
                Logger.getLogger(ReservaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if("consultar".equals(e.getActionCommand())){
            try {
                r = frame.getReserva();
            } catch (Exception ex) {
                Logger.getLogger(ReservaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                Generics.GerarLog("Consultou a reserva de código" + Integer.toString(r.getCodigo()),usuario);
            } catch (IOException ex) {
                Logger.getLogger(ReservaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
