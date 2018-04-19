package DeAlunoParaAluno.Aulas;

public class Incremento_Aula29{
    
    public static void main (String[] Args){ //Pré e pós incremento.
        
        
        int a = 10;        
        System.out.println("A: " + a);        
        int b = a++;
        System.out.println("B: " + b);
        
        int c = 10;
        int d = c++;
        
        System.out.println("C: " + c);
        System.out.println("D: " + d);
        
        
        int e = 10;
        int f = ++e;
        
        System.out.println("e: " + e);
        System.out.println("f: " + f);
    }
    
}