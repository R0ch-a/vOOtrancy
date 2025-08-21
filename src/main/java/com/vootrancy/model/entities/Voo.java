package com.vootrancy.model.entities;

public abstract class Voo {
    protected long vooID;
    protected Aeroporto destino;
    protected Aviao aviao;

    public Voo(long vooID, Aeroporto destino, Aviao aviao) {
        this.vooID = vooID;
        this.destino = destino;
        this.aviao = aviao;
    }

    public long getVooID() {
        return vooID;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public abstract String getStatusVoo();
}
