package UniversidadeXTI.Aulas;

public class Aula_61{
    
    public static void main(String[] Args){ //Regular Expression
        
        boolean teste = false;
        String stringAux = new String();
        
        /* Modificadore:
          (?i), ignora maiúsculo e minúsculo
          (?x), Comentários
          (?m), MultiLinha
          (?s), Dottal          
        */
        
        //Os testes abaixo, sempre retornarão TRUE
        stringAux = "Java";
        
        teste = stringAux.matches("(?i)java");
        System.out.println(teste);
        teste = stringAux.matches("(?im)java");
        System.out.println(teste);    
        
        /* MetaCaracteres
          . qualquer caracter.
         \d dígitos      [0-9] 
         \D Não dígitos  [^0-9]
         \s espaços      [ \t \n \x0b \f \r]
         \S Não é espaço [^\s]       
         \w letra        [a-zA-Z_0-9]       
         \W Não é letra
        */
        
        /* Quantificadores:
          X{n}    X, Exatamente N  vezes.
          X{n,}   X, pelo menos N vezes
          X{n,m}  X, pelo menos N mas não mais do que M
          X?      X, 0 ou 1 vez
          X*      X, 0 ou + vezes
          X+      X, 1 ou + vezes
        */
        
        //Caractere
        teste = stringAux.matches("."); //Retorna False pois é mais que um caractere
        System.out.println(teste);        
        teste = stringAux.matches("...."); 
        System.out.println(teste);   
        
        //Dígitos
        String stringDigito = new String("100");
        teste = stringDigito.matches("\\d"); //Retorna false, pois são 3 dígitos
        System.out.println(teste);
        teste = stringDigito.matches("\\d{3}");
        System.out.println(teste);
        
        //Não dígitos
        teste = stringAux.matches("\\D");//Retorna False, pois são 4 letras
        System.out.println(teste);        
        teste = stringAux.matches("\\D{4}");
        System.out.println(teste);                
        
        //Espaço
        String stringEspaco = new String("  ");
        teste = stringEspaco.matches("\\s"); //Retorna false, pois são 2 espaços
        System.out.println(teste);                
        teste = stringEspaco.matches("\\s{2}"); 
        System.out.println(teste);
        
        //Não espaço:
        teste = stringEspaco.matches("\\S");
        System.out.println(teste);
        
        //Letra:
        teste = stringAux.matches("\\w{4}");
        System.out.println(teste);        
        
        //Não letra:
        String Caractere = new String("*");
        teste = Caractere.matches("\\W{1}");
        System.out.println(teste);                
        
        
        /*
          Concatenações:
        */
       String cep = new String("89055-110");
       teste = cep.matches("\\d{5}-\\d{3}");
       System.out.println(teste);
       
       /* Metacaracteres de Fronteira (Se string comeca ou termina com X)
         ^  Inicia
         $  Termina
         |  Ou
       */
       
       teste = stringAux.matches("(?i)^ja.*"); //Comeca com 'ja'
       System.out.println(teste);
       teste = stringAux.matches(".*va$"); //Termina com 'va'
       System.out.println(teste);       
       
       String stringAuxConcat = new String("Tem Java aqui dentro");
       teste = stringAuxConcat.matches(".*(?i)java.*"); //Tem java no meio
       System.out.println(teste);              
       teste = stringAuxConcat.matches("^T.* .*tro$"); //Comeca com T termina com tros
       System.out.println(teste);                            
       teste = stringAuxConcat.matches(".*dentro$"); //Termina com dentro
       System.out.println(teste);                     
       teste = stringAuxConcat.matches("^Te.*|Teste"); //Começa com Tem
       System.out.println(teste);   
       
       /* Agrupadores
         [...]           Agrupamento 
         [a-z]           Alcançe
         [a-e][i-u]      União
         [a-z&&[aeiou]]  Interseção
         [^abc]          Exceção
         [a-z&&[^m-p]]   Subtração
         \x              Fuga de literal
       */
       
    }
}