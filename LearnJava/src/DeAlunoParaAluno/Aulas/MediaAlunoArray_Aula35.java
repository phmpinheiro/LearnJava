package DeAlunoParaAluno.Aulas;

import java.util.Scanner;

public class MediaAlunoArray_Aula35{
    
    public static void main(String[] Args){
        
        Scanner s = new Scanner(System.in);
        
        final int TOTAL_ALUNOS = 2;
        final int TOTAL_BIMESTRE = 4;
        double[][] notaAlunos = new double[TOTAL_ALUNOS][TOTAL_BIMESTRE];        
        double[] mediaAlunos = new double[TOTAL_ALUNOS];        
        double media = 0;
        
        String[] nomeAlunos = new String[TOTAL_ALUNOS]; 
        
        //Obtem o nome dos alunos
        for (int i = 0; i < TOTAL_ALUNOS; i++){
            System.out.println("Digite o nome do " + (i+1) + "º aluno: ");
            nomeAlunos[i] = s.nextLine();
        }        
        
        //Obtem a nota dos alunos
        for (int a = 0; a < TOTAL_ALUNOS; a++){
            for (int b = 0; b < TOTAL_BIMESTRE; b++) {            
                System.out.println("Digite a nota do aluno: " + nomeAlunos[a] + " para o " + (b+1) + "º Bimestre:");
                notaAlunos[a][b] = s.nextDouble();
            }
        }
        
        //Calcular a média.
        for (int aluno = 0; aluno < TOTAL_ALUNOS; aluno++){ 
            for (int bimestre = 0; bimestre < TOTAL_BIMESTRE; bimestre++){
                mediaAlunos[aluno] += notaAlunos[aluno][bimestre];
            }
            mediaAlunos[aluno] /= TOTAL_BIMESTRE; 
        }
        
        for (int aluno = 0; aluno < TOTAL_ALUNOS; aluno++){ 
            
            System.out.println("Aluno: " + nomeAlunos[aluno]);
            System.out.println("Média: " + mediaAlunos[aluno]);
            
            aprovadoReprovado(mediaAlunos[aluno]);                       
        }
    }  
    
    public static void aprovadoReprovado(double aNota){
        
        if (aNota < 7) {
            System.out.println("Reprovado!");
        } else
        {
            System.out.println("Aprovado");
        }       
    }
}