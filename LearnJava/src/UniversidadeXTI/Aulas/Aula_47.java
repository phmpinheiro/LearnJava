package UniversidadeXTI.Aulas;

import Classes.Cachorro;
import Classes.Galinha;

public class Aula_47{
    
    public static void main(String[] args){ //Herança de classe
        
        Cachorro c = new Cachorro();
        c.nome = "Lilica";
        System.out.println(c.nome);
        c.cavarBuraco();
        
        Galinha g = new Galinha();
        g.nome = "Cocoricó";
        System.out.println(g.nome);        
        g.botarOvo();        
        
    }
     /*
     Teste para saber se é interessante fazer a extensão de classe.
     Somente pode ser extendida uma classe quando é possível fazer a pergunta "é um" ?
     ou seja.. Cachorro "é um" animal? Se a resposta for SIM, tudo bem.
             
     1. Cachorro É UM animal? SIM - Faz sentido.
     2. Bebida É UM bebida? Não - é o contrário.     
    */   
}