package Classes;

public class TV{
    
    public String fabricante = "Samsung";
    public String observacoes;
    
    public int volume;
    public int canal;
    public int polegadas;
    
    public boolean ligada;
    
    //Essa variável vai armazenar quantas vezes
    //foi instanciada a classe. Isso é possível por causa do 'Static'
    //que faz com que essa variável seja estática a classe.
    public static int vezesClasseFoiInstanciada;
    
    /** 
    * @param ligada Define ligada/desligada
    * @param volume Define Volume
    */
    public TV(boolean pLigada, int pVolume){
        
        ligada = pLigada;
        volume = pVolume;
        observacoes = "Objeto criado pelo constructor public TV(boolean pLigada, int pVolume)";
        vezesClasseFoiInstanciada++;
    }

    public TV() {
     observacoes = "Objeto criado pelo constructor vazio";   
     vezesClasseFoiInstanciada++;
    }

    public void aumentarVolume(){                
        if (volume <= 10){
            volume++;        
        }        
    }
    
    public void diminuirVolume(){                
        if (volume >= 0){
            volume--;        
        }        
    }    
    
    public void ligarTelevisao(){                
        ligada = true;       
    }        
    
    public void desligarTelevisao(){                
        ligada = false;       
    }            
    
}
