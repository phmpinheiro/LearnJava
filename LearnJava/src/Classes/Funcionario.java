package Classes;

public class Funcionario{
    
    public static int quantidadeFuncionariosEstanciados;
    
    private String nome;
    private boolean ativo;
    public int contadorRetornaObjeto;
    
    public Funcionario(){
      quantidadeFuncionariosEstanciados++;
    }
    
    public String getNome(){
        return this.nome.toUpperCase();
    }
    
    public void setNome(String aNome){
        this.nome = aNome;
    }    
    
    public boolean isAtivo(){
        return this.ativo;
    }
    
    public Funcionario adicionaUm(){
      contadorRetornaObjeto++;
      return this;
    }
    
    
}