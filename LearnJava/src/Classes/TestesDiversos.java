package Classes;

import Exceptions.TesteException;
import java.io.FileReader;
import java.util.ArrayList;

public class TestesDiversos {
    
    public static void main(String[] Args){
        
        int teste = 0;
        int contador = 7;
        
        while ((teste = contador) < 10){
            ++contador;
            System.out.println(teste);
        }
        
        ArrayList<Integer> arrayTeste = new ArrayList<>();
        
        for (int i = 0; i < 99; ++i) {
            arrayTeste.add(i);
        }
        
        for (int i = 0; i < arrayTeste.size(); ++i) {
            System.out.println(arrayTeste.get(i));
        }
        
    }
    
    
    public void M1() throws  Exception{
        FileReader f = new FileReader("notExist.txt");        
    }
    
    public void testaSenha(String pSenha) throws TesteException{
        
        if ("Senha".equals(pSenha)){
            System.out.println("Logado");
        } else {
            throw new TesteException();
        }
        
    }
    
}
