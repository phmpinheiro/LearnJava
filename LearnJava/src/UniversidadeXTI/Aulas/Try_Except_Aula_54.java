package UniversidadeXTI.Aulas;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;

public class Try_Except_Aula_54{
            
public static void main(String[] Args){ //MultiCatch  e erros comuns      
        int a = 0;
        int b = 0;

        Scanner s = new Scanner(System.in);


        try
        {         
           System.out.println("Valor para A: "); 
           a = s.nextInt();

           System.out.println("Valor para b: "); 
           b = s.nextInt();           

           System.out.println(a/b);

        } catch(InputMismatchException | ArithmeticException multiException){  
            System.out.println("toString(): " + multiException.toString());
            System.out.println("printStackTrace(): ");
            multiException.printStackTrace();
            System.out.println("getMessage: " + multiException.getMessage());
        } finally{
            System.out.println("Executando pelo Finally: " );                        
        }
        
    }
}