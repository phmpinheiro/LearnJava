package DeAlunoParaAluno.Aulas;

import java.util.Scanner;

public class BreakContinue_Aula26{
    
    public static void main(String[] Args){
        
        Scanner s = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite um número de 0 a 10:");
        numero = s.nextInt();
        
        for (int i = 0; i <= 10; i++){
            
            if(i == numero){
                System.out.println("Seu número é: " + i);
                break; //Vai parar o FOR
            } else {
                System.out.println("Seu número não é: " + i);
                continue; // Vai pular o resto do FOR
            }
            
            //Essa mensagem só aparece SE retirar o Break OU o Continue, com os 2 ele já se liga que não vai rolar nenhuma vez.
            //------------------------------------------------------------------------------------------
            //System.out.println("Essa mensagem só vai aparecer quando acertar meu número.");
            //System.out.println("Se não existisse o CONTINUE, essa mensagem se repetiria 10 vezes.");
        }   //------------------------------------------------------------------------------------------
        
    }
    
}