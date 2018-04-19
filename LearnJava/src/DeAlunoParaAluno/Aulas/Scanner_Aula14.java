package DeAlunoParaAluno.Aulas;
import java.util.Scanner;

public class Scanner_Aula14{
    
    public static void main(String[] Args){
        
        //Converter gramas em Kilos usando %        
        int kilos;
        int gramas;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um valor em gramas");
        gramas = s.nextInt();
        
        kilos = gramas / 1000;
        gramas = gramas % 1000;
        
        System.out.println("O total em kilos:" + kilos);
        System.out.println("O total em gramas:" + gramas);                       
    }
}