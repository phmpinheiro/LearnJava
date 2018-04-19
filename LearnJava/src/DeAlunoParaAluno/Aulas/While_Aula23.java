package DeAlunoParaAluno.Aulas;

public class While_Aula23{
    
    public static void main(String[] Args){ //Do While, 
        
        int a,b;
        
        a = 1;
        b = 1;
        
        do {
            System.out.println("Valor de A: " + a);
            a++;
        } while( a < 1);
        
        while (b < 1) {
            System.out.println("Valor de B:" + b);
            b++;
        }
        
        //Ou seja, tem o mesmo conceito do for,
        //ele entra a primeira vez no laço e depois testa.
        
    }
    
}