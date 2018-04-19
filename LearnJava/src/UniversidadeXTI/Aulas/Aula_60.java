package UniversidadeXTI.Aulas;

public class Aula_60{
    
    public static void main(String[] Args){ //StringBuilder e StringBuffer
        
        char[] arrayChar = {' ','J','a','v','a'};
        
        String s = new String("Teste");
        System.out.println("S hash: " + s.hashCode());
        s += " segundo teste";
        System.out.println("S hash: " + s.hashCode());

        
        StringBuilder sb = new StringBuilder("First string ").append("Second string ");  
        sb.append("Terceira String ").append("Quarta String ");
        System.out.println("Hash do SB: " + sb.hashCode());
        sb.append(arrayChar);
        System.out.println("Hash do SB: " + sb.hashCode());
        System.out.println(sb.toString());
        System.out.println("SB lenght: " + sb.length()); 
        System.out.println("SB capacity: " + sb.capacity());
        System.out.println("Hash do SB: " + sb.hashCode());
        System.out.println("SB Reverse: " + sb.reverse());
        System.out.println("SB UnReverse: " + sb.reverse());
        System.out.println("Delete das 5 primeiras posicoes: " + sb.delete(0, 5));
        
    }
    
}