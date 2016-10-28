package br.unesc.reserva.modelo;

import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import sun.nio.cs.ext.Johab;

public class Generics {

    public static Date formataData(String data) throws Exception {
        if (data == null || data.equals("")) {
            return null;
        }
        Date date = null;
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = (java.util.Date) formatter.parse(data);
        } catch (ParseException e) {
            throw e;
        }
        return date;
    }

    public static void GerarLog(String mensagem, String login) throws IOException {

        String local = "..\\src\\Logs\\log.txt";
        
        new File(local).mkdirs();
        
        BufferedWriter bufferedWriter = null;

        try {
            FileWriter fileWriter = new FileWriter(local, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            String data = (new java.util.Date()).toString();
            String msg = data + " - " + login + " : " + mensagem + "\n";
            bufferedWriter.write(msg);
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null,"");                    

        } finally {
            bufferedWriter.flush();
            bufferedWriter.close();
        }

    }
}
