
package UniversidadeXTI.Aulas;

public class Strings_Aula_58 {
    
    public static void main(String[] Args){ //Teste de Strings
                
        String str3 =  new String("Java Virtual Machine");
        String testeMaiorMenor = "k";
        
        char[] charToString = {'J','A','V','A'};        
        String str4 = new String(charToString); 
        
        //operações
        int tamanho = str3.length();
        System.out.println("STR3: " + str3.toString());        
        System.out.println("tamanho: " + tamanho);
        
        //Localizacao
        int posicao = str3.indexOf("Virtual");
        System.out.println("STR3: Index of 'Virtual' " + posicao);
        
        int ultimoIndexA = str3.lastIndexOf('a');
        System.out.println("Último index de 'A':" + ultimoIndexA);        
              
        
        //Comparacao
        boolean stringIgual = str3.toLowerCase().equals("java virtual machine");
        System.out.println("lower case = java virtual machine?? " + stringIgual );
        
        boolean stringComecaCom = str3.startsWith("Java");        
        System.out.println("Comeca com Java : " + stringComecaCom);        
        
        boolean stringFinalizaCom = str3.toLowerCase().endsWith("machine");
        System.out.println("Lower case finaliza com 'machine' : " + stringFinalizaCom);
        
        //Verifica se vem antes ou depois na ordem alfabética.. retorna a diferenca
        int maiorMenor = "j".compareTo(testeMaiorMenor);
        System.out.println(maiorMenor);
        
        boolean existeStringNaString = str3.regionMatches(13, "Machine",0, 7);
        System.out.println(existeStringNaString);
        
        boolean existeStringNaStringIgnorePascal = str3.toLowerCase().regionMatches(13, "machine",0, 7);
        System.out.println(existeStringNaStringIgnorePascal);
        
        existeStringNaStringIgnorePascal = str3.regionMatches(true,13, "machine",0, 7);
        System.out.println(existeStringNaStringIgnorePascal);
        
        //Extração
        String brasil = new String("O Brasil é lindo");
        System.out.println(brasil.substring(11)); //lindo
        System.out.println(brasil.substring(2,8));
        System.out.println(brasil.substring(11).concat(str4));
        
        //Modificação
        System.out.println(str4.replace('A','O'));
        System.out.println(str4.replaceFirst("A","O"));
        System.out.println(str4.replaceAll("A","O"));
        System.out.println("    sss e er     ".trim());
        
    }
    
}
