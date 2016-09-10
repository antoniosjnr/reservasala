package br.unesc.reserva.modelo;

import java.util.Date;

public class Reservas {
    int codigo;
    int id_sala;
    int id_responsavel;
    Date data;
    float horainicial;
    float horaFinal;
    String periodo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getId_sala() {
        return id_sala;
    }

    public void setId_sala(int id_sala) {
        this.id_sala = id_sala;
    }

    public int getId_responsavel() {
        return id_responsavel;
    }

    public void setId_responsavel(int id_responsavel) {
        this.id_responsavel = id_responsavel;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getHorainicial() {
        return horainicial;
    }

    public void setHorainicial(float horainicial) {
        this.horainicial = horainicial;
    }

    public float getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(float horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    

}
