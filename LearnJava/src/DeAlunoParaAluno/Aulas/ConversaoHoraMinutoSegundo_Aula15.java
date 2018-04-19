package DeAlunoParaAluno.Aulas;

public class ConversaoHoraMinutoSegundo_Aula15{
    
    public static void main(String[] Args){
        
        long totalMilisegundos, totalSegundos, segundosAtual, totalMinutos, minutosAtual, totalHoras, horaAtual;
        
        totalMilisegundos = (System.currentTimeMillis()) - 10800000; //Desconta o fusohorario.        
        
        totalSegundos = (totalMilisegundos) / 1000;        
        segundosAtual = totalSegundos / 60;        
        
        totalMinutos = (totalSegundos) / 60;
        minutosAtual = (totalMinutos)  % 60;      
        
        totalHoras = (totalMinutos) / 60;
        horaAtual = (totalHoras) % 24;
        
        System.out.println(horaAtual + ":" + minutosAtual + ":" + segundosAtual);
    }
    
}