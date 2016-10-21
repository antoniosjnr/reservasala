package br.unesc.reserva.app;

import br.unesc.reserva.view.JanelaLogin;
import javax.swing.JFrame;

public class Principal {
    public static void main(String[] args) {
        
        JanelaLogin janelaLogin = new JanelaLogin();
        janelaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaLogin.setVisible(true);
        System.out.println("Teste");
    }
    
}
