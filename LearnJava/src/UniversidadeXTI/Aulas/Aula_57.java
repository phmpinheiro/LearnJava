package UniversidadeXTI.Aulas;

public class Aula_57{
    
    public static void main(String[] Args){
        
        int[] arrayTeste = new int[Integer.max(0, 50)];
        
        for(int i=0; i < arrayTeste.length; i++){            
            arrayTeste[i] = i;            
        }
        
        int teste = 0;
        
        for(int i=0; i < arrayTeste.length; i++){ 
               teste++;
               System.out.println(arrayTeste[i]+teste);  
               
        }
       
        
        
    }
    
}