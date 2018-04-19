package DeAlunoParaAluno.Aulas;

import java.util.Scanner;

public class ArrayEScanner_Aula34{
    
    public static void main(String[] Args){
        
        double x[][] = new double[3][3];
        Scanner s = new Scanner(System.in);
       
        
        for (int l = 0; l < x.length; l++) {            
            for (int c = 0; c < x[l].length; c++){
                System.out.println("Digite um valor para a linha/coluna: ["+l+"],["+c+"]");
                x[l][c] = s.nextDouble();                
            }            
        }
        
        
        /*
        x[0][0] = 10;
        x[0][1] = 20;        
        x[0][2] = 30;
        x[1][0] = 40;
        x[1][1] = 50;
        x[1][2] = 60;
        x[2][0] = 70;
        x[2][1] = 80;
        x[2][2] = 90;
        */
        
        System.out.println("Valores da matriz:");
        
        for (int l = 0; l < x.length; ++l) {            
            for (int c = 0; c < x[l].length; ++c){
                System.out.print(l+"|"+c+"=" + x[l][c] + "\t");                              
            }   
            System.out.println("\n");       
        }                
    }    
}
