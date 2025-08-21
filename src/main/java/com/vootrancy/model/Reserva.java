package com.vootrancy.model;

import com.vootrancy.model.entities.*;

public class Reserva {
    private Aeroporto aeroporto;
    private Aviao aviao;
    private Passagem passagem;
    private int quantPassagem;

    public Reserva (Aeroporto aeroporto, Aviao aviao, Passagem passagem, int quantPassagem) {
        this.aeroporto = aeroporto;
        this.aviao = aviao;
        this.passagem = passagem;
        this.quantPassagem = quantPassagem;
    }

    @Override
    public String toString () {
        return aeroporto + " " + aviao + " " + passagem + " " + quantPassagem;
    }
}
