package UniversidadeXTI.Aulas;

import Exceptions.SenhaInvalidaException;

public class TesteSenha_Aula_55{
    
    public static void testaSenha(String pSenha) throws SenhaInvalidaException{
        
        String senhaCorreta = "!@#$%";
        
        if (senhaCorreta.equals(pSenha)){
            System.out.println("Autenticado!");
        } else {
            throw new SenhaInvalidaException();
        }
        
    }
    
    public static void main(String[] Args){        
        try {
            testaSenha("12345");
        } catch (Exception e) {
            System.out.println("Erro no método Main: " + e.getMessage());
            System.out.println("Trace do erro: ");
            e.printStackTrace();
        }   
    }
    
}