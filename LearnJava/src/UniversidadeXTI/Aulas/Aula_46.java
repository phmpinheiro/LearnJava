package UniversidadeXTI.Aulas;

import Enumeracoes.PecasXadrez;
import Enumeracoes.Medidas;

public class Aula_46{
    
    //Isso significa uma constante simples de uma classe.
    public static final double PI = 3.14;
    
    public static void main(String[] Args){ //Constantes e Enums        
     
        System.out.println(PecasXadrez.PEAO);
        System.out.println(Medidas.CM.descricao);
        
        for (Medidas m : Medidas.values()){
            System.out.println(m.descricao);
        }
        
    }
    
}