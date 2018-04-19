
package UniversidadeXTI.Aulas;


public class Aula_59 {
    
    public static void main(String[] Args){ //Tokens
        
        String[] arrayString;
        String stringTokens = new String("Token1;Token2;Token3;Token4;Token5");
        
        arrayString = stringTokens.split(";");
        
        for (String s : arrayString) {
            System.out.println(s);
        }
        
        for (int i = 0; i < arrayString.length; ++i){
            System.out.println(arrayString[i]);
        }
        
        System.out.println(arrayString.length);
        
        
    }
    
}
