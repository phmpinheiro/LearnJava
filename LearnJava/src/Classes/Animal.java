package Classes;

import Interfaces.interfaceComum;
import Enumeracoes.ClassificacaoAnimal;

public class Animal implements interfaceComum{
        
    public String nome;
    public ClassificacaoAnimal classificacao;
    public int peso;
    
    public Animal(){};
    
    
    @Override
    public String TipoDaClasse(){
        return this.toString();
    }
    
    public Animal(String pNome, ClassificacaoAnimal pClassificacaoAnimal, int pPeso){
        this.nome = pNome;        
        this.classificacao = pClassificacaoAnimal;
        this.peso = pPeso;
    }
    
    public void imprimeAnimal(){

        System.out.println("M�todo: imprimeAnimal (SuperClasse)");
        System.out.println("Nome: " + this.nome);
        System.out.println("Peso: " + this.peso);
        System.out.println("Classificação: " + this.classificacao);
        
    }    
    
    
    public void fazerBarulho(String pBarulho){
        
        System.out.println("Barulho: " + pBarulho);
        
    }
    
    public void dormir(){
        
        System.out.println("Dormiu!");
        
    }
    
    
    
}