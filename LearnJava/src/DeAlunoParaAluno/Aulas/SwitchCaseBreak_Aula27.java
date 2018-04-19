package DeAlunoParaAluno.Aulas;

import java.util.Scanner;

public class SwitchCaseBreak_Aula27{ //SWITCH
    
    public static void main(String[] Args){
        
        Scanner s = new Scanner(System.in);
        int i;
        
        System.out.println("Digite um número de 1 a 10");
        i = s.nextInt();
        
        switch(i){
            case 1:
                System.out.println("Escolheu 1");
                break;            
            case 2:    
                System.out.println("Escolheu 2");
                break;                
            case 3:    
                System.out.println("Escolheu 3");
                break;
            case 4:    
                System.out.println("Escolheu 4");
                break;                 
            case 5:    
                System.out.println("Escolheu 5");
                break;             
            default:
                System.out.println("Default");
                break;  
        }
    }
}