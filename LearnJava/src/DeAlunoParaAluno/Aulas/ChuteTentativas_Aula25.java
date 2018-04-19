package DeAlunoParaAluno.Aulas;

import java.util.Scanner;
import java.util.Random;

public class ChuteTentativas_Aula25{
    
    public static void main (String[] Args){
                
        Scanner s = new Scanner(System.in);
        Random r = new Random();        
        
        int numeroSecreto = r.nextInt();
        long numeroUsuario;
        int tentativas = 10;
        boolean acertou = false;
        
        System.out.println(numeroSecreto);
        
        while ( (!acertou) && tentativas > 0  ){
            
            tentativas--;               
            
            System.out.println("Chute um número");
            numeroUsuario = s.nextLong();
            
            if (numeroUsuario == numeroSecreto) {               
                System.out.println("Acertou! Número secreto: "+numeroSecreto);
                acertou = true;
            } else if (numeroSecreto > numeroUsuario){
                System.out.println("Chute um número maior: ");
                System.out.println("Restam: "+tentativas+ " tentativas.");
            } else {
                System.out.println("Chute um número menor: ");
                System.out.println("Restam: "+tentativas+ " tentativas.");
            }
        }       
        
    }
    
}
