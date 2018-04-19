package DeAlunoParaAluno.Aulas;

import java.util.Scanner;

public class AnoBissexto_Aula21{
    
    public static void main(String[] args){ //Calcula ano bisexto.
        
        Scanner s = new Scanner(System.in);
        int ano;         
        
        System.out.println("Digite o ano");
        ano = s.nextInt();
        
                        //Multimos de 400        ou  Multiplos de 4 e  não múltiplo de 100             
        boolean verdadeiro = ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)));
        
        if (verdadeiro) {
            System.out.println("Ano: " + ano + " é bissexto");
        } else
        {
          System.out.println("Ano: " + ano + " não é bissexto");
        }
        
    }
    
}