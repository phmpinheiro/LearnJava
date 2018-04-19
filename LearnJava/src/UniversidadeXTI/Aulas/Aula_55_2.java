package UniversidadeXTI.Aulas;

import Exceptions.TesteException;
import Classes.TestesDiversos;

public class Aula_55_2{
    
    public static void main(String[] Args){
        
        TestesDiversos t = new TestesDiversos();
        
        try 
        {
            t.testaSenha("jajaj");
        }
        catch (TesteException e){
            System.out.println("Erro no main: " + e.getMessage());
        }
        
    }
    
}