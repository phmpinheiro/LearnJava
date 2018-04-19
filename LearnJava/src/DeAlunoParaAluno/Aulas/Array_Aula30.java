package DeAlunoParaAluno.Aulas;

import java.util.Scanner;

public class Array_Aula30{ //Arrays
    
    public static void main(String[] Args){
        
        int qtdAlunos = 4;
        
        //Declarações de arrays
        double[] notaAlunos = new double[qtdAlunos];
        double[] arrayFixo = {1,2,3,4,5,6,7,8};
        
        Scanner s = new Scanner(System.in);
        
        //Definir um valor padrão para todas as posições do array
        {
            java.util.Arrays.fill(notaAlunos,10);
            System.out.println("Valor padrão do Array:");        
            for(int i = 0; i < notaAlunos.length; i++){
              System.out.println(notaAlunos[i]);           
            }
        }        
       
        //Definir um valor padrão para uma faixa
        {
            System.out.println("Valor padrão da faixa de 1 até array.length:");
            java.util.Arrays.fill(notaAlunos,1,notaAlunos.length,0);

            for(int i = 0; i < notaAlunos.length; i++){
              System.out.println(notaAlunos[i]);           
            }
        }        
        
        for(int i = 0; i < notaAlunos.length; i++){
          System.out.println("Digite a nota do aluno ");
          notaAlunos[i] = s.nextDouble();                  
        }
    }
    
}

