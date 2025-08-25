package com.vootrancy.model.entities;
import java.util.List;
// import Voo;

public class Aviao {
    private String nome;
    private String modelo;
    public List<String> poltronasLivres;
    public List<String> poltronasOcupadas;
    protected int maxLotacao;
    protected Short portao;
    

    public Aviao(String nome, String modelo, List<String> poltronasLivres, List<String> poltronasOcupadas, int lotacaoMaxima, short portao){
        this.nome = nome;
        this.modelo = modelo;
        this.poltronasLivres = poltronasLivres;
        this.poltronasOcupadas = poltronasOcupadas;
        this.maxLotacao = lotacaoMaxima;
        this.portao = portao;
    }

    public String getNome(){
        return nome;
    }
    public String getModelo(){
        return modelo;
    }
    public List<String> getPoltronasLivres(){
        return poltronasLivres;
    }
        public List<String> getPoltronasOcupadas(){
        return poltronasOcupadas;
    }
    public int getLotacao(){
        return maxLotacao;
    }
    public short getPortao(){
        return portao;
    }

    //@param poltrona: O nome da poltrona a ser ocupada (ex: "12A").
    public void setAddPassageiro(String poltrona){
        if (poltronasOcupadas.size() < maxLotacao && poltronasLivres.contains(poltrona)) {

            // Remove a poltrona da lista de poltronas livres
            poltronasLivres.remove(poltrona);

            // Adiciona a poltrona à lista de poltronas ocupadas
            poltronasOcupadas.add(poltrona);

            System.out.println("Passageiro adicionado à poltrona " + poltrona + ".");

        } else if (poltronasOcupadas.size() >= maxLotacao) {
            System.out.println("Erro: Voo está lotado. Não é possível adicionar mais passageiros.");
        } else {
            System.out.println("Erro: A poltrona " + poltrona + " não está disponível ou não existe.");
        }
    }

    public int getTotalPassageiros(){
        return poltronasOcupadas.size();
    }
}
