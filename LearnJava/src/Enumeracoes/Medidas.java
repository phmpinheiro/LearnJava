package Enumeracoes;

public enum Medidas{    
    
    MM("Milímetro"), CM("Centímetro"), M("Metro"), KM("Kilometros");
    
    public String descricao;
    
    private Medidas(String pDescricao) {
         this.descricao = pDescricao;
    }
    
    
    
    
}