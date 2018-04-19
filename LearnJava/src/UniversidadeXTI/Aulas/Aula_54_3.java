package UniversidadeXTI.Aulas;

import java.lang.ArithmeticException;
import java.util.InputMismatchException;
import Classes.Matematica;
import java.*;

public class Aula_54_3 {

    public static void main(String[] Args){//throws
     
        Matematica calc = new Matematica();
        boolean continua = true;
        
        while (continua) {
        
            try{
                int a = calc.dividePorZero(1, 0);        
                continua = false;
            } 
            catch (Exception ex){
                System.err.println("Aula54: " + ex.getMessage());
            }
        }
        /*catch (InputMismatchException ex){
            System.out.println("Erro aritimetico na aula_54_3");
        } catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        */
        
    }
    
}
