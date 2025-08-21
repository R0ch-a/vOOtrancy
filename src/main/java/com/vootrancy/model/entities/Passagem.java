package com.vootrancy.model.entities;
import java.text.SimpleDateFormat;

public class Passagem {
    private Passageiro passageiro;
    private Voo voo;
    private Aviao aviao;
    private String portao;
    private SimpleDateFormat dia;
    private SimpleDateFormat hora;

    public Passagem(Passageiro passageiro, Voo voo, Aviao aviao, String portao, SimpleDateFormat data, SimpleDateFormat horario) {
        this.passageiro = passageiro;
        this.voo = voo;
        this.aviao = aviao;
        this.portao = portao;
        this.dia = new SimpleDateFormat("dd/MM/yyyy");
        this.hora = new SimpleDateFormat("HH:mm");
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public String getPortao() {
        return portao;
    }

    public SimpleDateFormat getDia() {
        return dia;
    }

    public SimpleDateFormat getHora() {
        return hora;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public void setPortao(String portao) {
        this.portao = portao;
    }

    public void setDia(SimpleDateFormat dia) {
        this.dia = dia;
    }

    public void setHora(SimpleDateFormat hora) {
        this.hora = hora;
    }
}
