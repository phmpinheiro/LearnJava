package DeAlunoParaAluno.Aulas;

import java.util.Scanner;
 
public class ParOuImpar_Aula20{ //Operadores && (e), || (ou), == e !=
    
    public static void main(String[] Args){
        
        Scanner s = new Scanner(System.in);
        int numero;

        System.out.println("Valor para o número: ");
        numero = s.nextInt();
     
        if ((numero % 2 == 0)) {
            System.out.println("É par");
        }

        if ((numero % 2 != 0)) {
            System.out.println("É ímpar");
        }     

        if ((numero % 2 == 0) && (numero > 10)) {
            System.out.println("É par e mairo que 10");
        }          

        if ((numero % 2 != 0) && (numero < 10)) {
            System.out.println("É ímpar e menor que 10");
        }     

        if ((numero % 2 != 0) || (numero > 10)) {
            System.out.println("É ímpar ou maior que 10");
        }      

        if ((numero % 2 == 0) || (numero < 10)) {
            System.out.println("É par ou menor que 10");
        }                
        
    }
    
}