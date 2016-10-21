package br.unesc.reserva.modelo;

import java.util.Date;

public class Reservas {
    private int codigo;
    private int idSala;
    private int idResponsavel;
    private Date data;
    private float horainicial;
    private float horaFinal;
    private String periodo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(int idResponsavel) {
        this.idResponsavel = idResponsavel;
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
