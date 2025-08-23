package com.vootrancy.model.entities;

public class VooExecutivo extends Voo{
    private double preco;

    public VooExecutivo(long vooID, Aeroporto destino, Aviao aviao, double preco){
        super(vooID, destino, aviao, "executivo", preco);
    }

    @Override
    public  void definirPreco(){
        this.preco = precoBase * 10.0;
    }

    @Override
    public double getPreco(){
        return this.preco;
    }
}
