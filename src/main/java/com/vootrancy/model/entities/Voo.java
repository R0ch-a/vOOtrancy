package com.vootrancy.model.entities;

public abstract class Voo {
    protected long vooID;
    protected Aeroporto destino;
    protected Aviao aviao;
    protected String classe; // atributo mais importante
    protected double precoBase;

    public Voo(long vooID, Aeroporto destino, Aviao aviao, String tipo, double preco) {
        this.vooID = vooID;
        this.destino = destino;
        this.aviao = aviao;
        this.classe = tipo;
        this.precoBase = preco;
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

    public String getClasse(){
        return classe;
    }

    public double getPreco(){
        return precoBase;
    }

    // Se o tipo for economico, fazer um calcuo de preco, senão fazer outro.
    abstract void definirPreco();


}
