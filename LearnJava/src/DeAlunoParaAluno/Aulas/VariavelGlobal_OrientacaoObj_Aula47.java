package DeAlunoParaAluno.Aulas;

import Classes.InicializacaoDeVariaveis;

//Valores padrões de inicialização de variáveis
public class VariavelGlobal_OrientacaoObj_Aula47{
    
    public static void main(String[] args){ 
        
        //Apenas variáveis globais é que podem ser impressas sem ter o valor inicializado.
        
        InicializacaoDeVariaveis exemplo = new InicializacaoDeVariaveis();        
        
        System.out.println("Byte: " + exemplo.a);
        System.out.println("short: " + exemplo.b);
        System.out.println("int: " + exemplo.c);
        System.out.println("long: " + exemplo.d);
        System.out.println("float: " + exemplo.e);
        System.out.println("double: " + exemplo.f);
        System.out.println("char: " + exemplo.g);
        System.out.println("boolean: " + exemplo.h);
        System.out.println("String: " + exemplo.i);
        
    }
    
}