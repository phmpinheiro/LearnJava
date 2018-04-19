package Classes;

import Enumeracoes.ClassificacaoAnimal;

public class Galinha extends Animal{

    public int peso;
    
    public void botarOvo(){
        System.out.println("Coloquei um ovo.");
    }
    
    public Galinha(){
        super("Carijó", ClassificacaoAnimal.AVE, 2);
        super.peso++;        
        this.peso++;       
    }
    
}