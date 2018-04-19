package DeAlunoParaAluno.Aulas;

import Classes.TV;

public class OrientacaoObjetoTelevisao_Aula42{
    
    public static void mostraTv(TV pTelevisao){ 
        
        System.out.println("Fabricante: " + pTelevisao.fabricante);
        System.out.println("A televistão está: " + (pTelevisao.ligada == true ? "Ligada" : "Desligada"));
        System.out.println("Volume: " + pTelevisao.volume);
        
        System.out.println("");
        
        pTelevisao.ligarTelevisao();        
        pTelevisao.aumentarVolume();
        pTelevisao.aumentarVolume();

        System.out.println("A televistão está: " + (pTelevisao.ligada == true ? "Ligada" : "Desligada"));
        System.out.println("Volume: " + pTelevisao.volume);  
        System.out.println("Observações: " + pTelevisao.observacoes);                  
        System.out.println("Quantas vezes eu instanciei a classe TV: " + TV.vezesClasseFoiInstanciada);                  
        
        
        System.out.println("FIM\n");        
        
    }
    
    public static void main(String[] args){
        
        TV televisao = new TV();
        System.out.println("Mostrando primeira televisão: ");
        mostraTv(televisao);
        
        TV televisaoTesteConstructor = new TV(true, 8);
        System.out.println("Mostrando segunda televisão: ");
        mostraTv(televisaoTesteConstructor);     
    }
    
}