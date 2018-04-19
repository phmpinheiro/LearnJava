package DeAlunoParaAluno.Aulas;

import java.util.Scanner;

public class Scanner_Aula17{ //Trabalhando com strings
    
    public static void main(String[] Args){ 
        
        Scanner s = new Scanner(System.in);
        String primeiroNome = "";
        String ultimoNome = "";
        int idade;
        
        System.out.println("Primeiro nome");
        primeiroNome = s.next();
        
        System.out.println("Segundo nome");
        ultimoNome = s.next();        
        
        System.out.println("Idade");
        idade = s.nextInt();             
        
        System.out.println("Nome: " + primeiroNome + " " + ultimoNome + " Idade: " + idade + " anos.");       
        
        
    }
            
    
}