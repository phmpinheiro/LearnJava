package UniversidadeXTI.Aulas;

import Classes.Funcionario;

public class Aula_41{
    
    public static void main(String[] args){ //Variáveis e métodos estáticos
        
        Funcionario f = new Funcionario();
        Funcionario f2 = new Funcionario();
        Funcionario f3 = new Funcionario();
        Funcionario f4 = new Funcionario();
        
        //MESMA COISA:
        System.out.println("Quantidade de instancias da classe: " + Funcionario.quantidadeFuncionariosEstanciados);
        System.out.println("Quantidade de instancias da classe: " + f.quantidadeFuncionariosEstanciados);        
        
        
    }
    
}