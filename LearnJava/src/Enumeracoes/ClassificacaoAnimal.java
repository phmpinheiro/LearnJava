package Enumeracoes;

public enum ClassificacaoAnimal{
    
    //Primeiro, tem que vir os itens, depois o reto.
    MAM�FERO("Leite"), 
    R�PTIL("Ovo"), 
    ANF�BIO("Insetos"), 
    AVE("Ovos"), 
    INSETO("Larvas"), 
    ARACN�DEO("Pessoas");
    
    public String alimento;
    
    ClassificacaoAnimal(String pAlimento){
        this.alimento = pAlimento;
    }
    
}