package UniversidadeXTI.Aulas;

import Classes.Cachorro;
import Classes.Galinha;

public class Heranca_Aula_47{
    
    public static void main(String[] args){ //Heran√ßa de classe
        
        Cachorro c = new Cachorro();
        c.nome = "Lilica";
        System.out.println(c.nome);
        c.cavarBuraco();
        
        Galinha g = new Galinha();
        g.nome = "Cocoric√≥";
        System.out.println(g.nome);        
        g.botarOvo();        
        
    }
     /*
     Teste para saber se È interessante fazer a extens„o de classe.
     Somente pode ser extendida uma classe quando È possÌvel fazer a pergunta "… um" ?
     ou seja.. Cachorro "… um" animal? Se a resposta for SIM, tudo bem.
             
     1. Cachorro … UM animal? SIM - Faz sentido.
     2. Bebida … UM bebida? N„o - … o contr·rio.     
    */   
}