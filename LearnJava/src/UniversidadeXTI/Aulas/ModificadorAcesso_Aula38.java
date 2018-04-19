package UniversidadeXTI.Aulas;

import java.util.Scanner;

public class ModificadorAcesso_Aula38{ //Desafico Raiz quadrada com equação de Pell
    
    private String privateModificadoresDeACesso = "Teste Private";
    public String publicModificadoresDeACesso = "Teste Public";
    
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);       
        int numeroBase;
        
        System.out.println("Número base: ");
        numeroBase = s.nextInt();
        
        System.out.print("Raíz quadrada de: " + numeroBase + " = ");
        System.out.println(resolveRaizQuadrada(numeroBase));        
    }
    
    public static int resolveRaizQuadrada(int aNumeroBase){
      
      int numeroImpar = 1;      
      int raizQuadrara = 0;
      
      while (aNumeroBase >= numeroImpar){
          
        aNumeroBase -= numeroImpar;
        numeroImpar += 2;          
        raizQuadrara++;
      } 
      
      return raizQuadrara;
    }
    
}