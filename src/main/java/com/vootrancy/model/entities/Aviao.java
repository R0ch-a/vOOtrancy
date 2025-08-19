package com.vootrancy.model.entities;

// import Voo;

public class Aviao {
    protected int maxLotacao;
    protected int poltronasOcupadas;
    protected Voo tipoVoo;
    

    public Aviao(String marcaNome, String modeloNome, int lotacaoMaxima, Voo tipoVoo){
        // super(marcaNome, modeloNome);
        this.maxLotacao = lotacaoMaxima;
        this.poltronasOcupadas = 4;
        this.tipoVoo = tipoVoo;
    }

    public int getLotacao(){
        return maxLotacao;
    }

    public void setOcupacao(int novosPassageiros){
        if (poltronasOcupadas <= maxLotacao){
            poltronasOcupadas += novosPassageiros;
        }
    }

    public int getTotalPassageiros(){
        return poltronasOcupadas;
    }
}