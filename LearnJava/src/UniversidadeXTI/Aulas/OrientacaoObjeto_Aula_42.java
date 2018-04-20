package UniversidadeXTI.Aulas;

import Classes.Matematica;

public class OrientacaoObjeto_Aula_42{
    
    
    public static void main(String[] args){      
        
        Matematica calc = new Matematica();        
        
        double soma;        
        soma = calc.somaMultimosArgumentos(1,2,3);                
        System.out.println(soma);
        
        soma = 0;
        
        double[] vetor = {1,2,3,4,5,6,7,8};
        soma = calc.somaMultimosArgumentosV2(vetor);
        System.out.println(soma);        
        
    }
    
}