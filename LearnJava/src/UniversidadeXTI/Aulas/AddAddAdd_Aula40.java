package UniversidadeXTI.Aulas;

import Classes.Funcionario;

public class AddAddAdd_Aula40{
    
    public static void main(String[] Args){ //Método get e set

        String nomeFuncionario;        
               
        Funcionario f = new Funcionario();
        f.setNome("Teste nome");
        
        System.out.println(f.getNome() + " Ativo? " + f.isAtivo());
        
        f.adicionaUm().adicionaUm().adicionaUm().adicionaUm().adicionaUm();        
        System.out.println("Teste de retorno do proprio objeto: " + f.contadorRetornaObjeto);       
    }
    
}