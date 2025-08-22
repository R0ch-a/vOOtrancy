package com.vootrancy.model.entities;
import java.text.SimpleDateFormat;

public class Passagem {
    private Passageiro passageiro;
    private Voo voo;
    private String portao;
    private SimpleDateFormat diaIda;
    private SimpleDateFormat horaIda;
    private SimpleDateFormat diaVolta;
    private SimpleDateFormat horaVolta;

    public Passagem(Passageiro passageiro, Voo voo, SimpleDateFormat data, SimpleDateFormat horario) {
        this.passageiro = passageiro;
        this.voo = voo;
        // this.portao = voo.getAviao().getPortao();
        this.diaIda = new SimpleDateFormat("dd/MM/yyyy");
        this.horaIda = new SimpleDateFormat("HH:mm");
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public Aviao getAviao() {
        return voo.aviao;
    }

    public String getPortao() {
        // this.portao = voo.getAviao().getPortao();
        return portao;
    }

    public SimpleDateFormat getDiaIda() {
        return diaIda;
    }

    public SimpleDateFormat getHoraIda() {
        return horaIda;
    }

        public SimpleDateFormat getDiaVolta() {
        return diaVolta;
    }

    public SimpleDateFormat getHoraVolta() {
        return horaVolta;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public void setDiaIda(SimpleDateFormat dia) {
        this.diaIda = dia;
    }

    public void setHoraIda(SimpleDateFormat hora) {
        this.horaIda = hora;
    }

        public void setDiaVolta(SimpleDateFormat dia) {
        this.diaVolta = dia;
    }

    public void setHoraVolta(SimpleDateFormat hora) {
        this.horaVolta = hora;
    }
}
