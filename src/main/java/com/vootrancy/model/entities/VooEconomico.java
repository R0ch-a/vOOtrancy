package com.vootrancy.model.entities;

public class VooEconomico extends Voo{
    private double preco;

    public VooEconomico(long vooID, Aeroporto destino, Aviao aviao, double preco){
        super(vooID, destino, aviao, "econômico", preco);
    }

    @Override
    public  void definirPreco(){
        this.preco = (precoBase * 2.0) - 100.0;
    }

    @Override
    public double getPreco(){
        return this.preco;
    }
}
