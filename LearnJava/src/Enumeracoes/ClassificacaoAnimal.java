package Enumeracoes;

public enum ClassificacaoAnimal{
    
    //Primeiro, tem que vir os itens, depois o reto.
    MAMÍFERO("Leite"), 
    RÉPTIL("Ovo"), 
    ANFÍBIO("Insetos"), 
    AVE("Ovos"), 
    INSETO("Larvas"), 
    ARACNÍDEO("Pessoas");
    
    public String alimento;
    
    ClassificacaoAnimal(String pAlimento){
        this.alimento = pAlimento;
    }
    
}