package UniversidadeXTI.Aulas;

import Classes.Cachorro;
import Classes.Galinha;
import Classes.Animal;
import Enumeracoes.ClassificacaoAnimal;

public class Aula_48 {
    
    public static void main(String[] Args){ //Testando SuperClasse
        
        Cachorro dog = new Cachorro();
        dog.nome = "Lilica";
        dog.peso = 2;
        dog.classificacao = ClassificacaoAnimal.MAM�FERO;
        
        imprimeAnimalLocal(dog);
        System.out.println("-----------");
        dog.imprimeAnimal();
        System.out.println("-----------");
        
        Galinha pintadinha = new Galinha();
        //Aqui imprimiu o peso da SuperClass (Animal)
        pintadinha.imprimeAnimal();                                                           
        //Aqui imprimiu o atributo da classe local;
        System.out.println("Peso no atributo da classe Galinha: " + pintadinha.peso);         
        System.out.println("-----------");
        
        Galinha clonePintadinha = new Galinha();
        clonePintadinha = pintadinha;
        
        System.out.println(pintadinha.equals(clonePintadinha));
        System.out.println(pintadinha.toString());
    }
    
    public static void imprimeAnimalLocal(Animal pAnimal){

        System.out.println("Método: imprimeAnimalLocal");
        System.out.println("Nome: " + pAnimal.nome);
        System.out.println("Peso: " + pAnimal.peso);
        System.out.println("Classificação: " + pAnimal.classificacao);
        System.out.println("(Enum) O que o mamífero come?  " + pAnimal.classificacao.alimento);
        
    }
    
}
