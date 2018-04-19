package DeAlunoParaAluno.Aulas;

import java.util.Scanner;

public class ArrayInvertido_Aula41{
    
    public static int[] inverteVetor(int[] aVetor){
        
        int[] vetorInvertido = new int[aVetor.length]; 
        
        for (int i = 0; i < aVetor.length; ++i){          
            vetorInvertido[i] = aVetor[(aVetor.length - 1) -i];            
        }
        
        return vetorInvertido;        
    }    
    
    public static void main(String[] args){ //Desafio, vetor ao contrário
        
        Scanner s = new Scanner(System.in);
        
        int[] vetorOriginal = new int[4];
        int[] vetorInvertido = new int[4]; 
        
        for (int i = 0; i < vetorOriginal.length; ++i){            
            
            System.out.println("Digite o " + (i+1) + "º valor do vetor");
            vetorOriginal[i] = s.nextInt();
        };
        
        vetorInvertido = inverteVetor(vetorOriginal);
        System.out.println("");
        System.out.println("Vetor invertido: ");
        
        for (int i = 0; i < vetorInvertido.length; ++i) {
            System.out.print(vetorInvertido[i]);                    
        }        
        
        System.out.println("");
                
    }
}

