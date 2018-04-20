package UniversidadeXTI.Aulas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Except_Aula_53 {

    public static void main(String[] Args){ //Try, Catch, Finally
        
        int a = 1;
        int b = 0;
        boolean deuPau = false;
        String excecao = "";
        
        
        Scanner s = new Scanner(System.in);
        
        try
        {         
           System.out.println("Valor para A: "); 
           a = s.nextInt();
           
           System.out.println("Valor para b: "); 
           b = s.nextInt();           
           
           System.out.println(a/b);
 
        } catch(Exception e){
            deuPau = true;
            excecao = e.toString();
            System.out.println("Executando pelo Catch: " + e.toString());                        
            
        } finally{
            System.out.println("Executando pelo Finally: " + (deuPau ? excecao : "") );                        
        }
        /*   
        } catch(InputMismatchException IE){
            System.out.println(IE.toString());
        } catch (ArithmeticException AE){
            System.out.println(AE.toString());
        */   
    }        
}
    

