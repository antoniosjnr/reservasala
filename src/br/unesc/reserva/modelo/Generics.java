package br.unesc.reserva.modelo;

import java.io.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Generics {

    public static Date formataData(String data) throws Exception {
        if (data == null || data.equals("")) {
            return null;
        }
        Date date = null;
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = (java.sql.Date) formatter.parse(data);
        } catch (ParseException e) {
            throw e;
        }
        return date;
    }

    public static void GerarLog(String mensagem, String login) throws IOException {

        String arquivo = "log.txt";

        BufferedWriter bufferedWriter = null;

        try {
            FileWriter fileWriter = new FileWriter(arquivo, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
            String data = sdf.format(new java.util.Date());
            String msg = data + " - " + login + " : " + mensagem + "\r\n";
            bufferedWriter.write(msg);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + ex);

        } finally {
            bufferedWriter.flush();
            bufferedWriter.close();
        }

    }

    public static String getUsuario(){
        String usuario = "";

        File arquivo = new File("USUARIO.txt");
        BufferedReader arq = null;
        try {
            arq = new BufferedReader(new FileReader(arquivo));
            usuario = arq.readLine();
        } catch (Exception ex) {
            // Tratar Exception
        } finally {
            try {
                arq.close();
            } catch (IOException ex) {
                Logger.getLogger(Generics.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return usuario;
    }
}
