
import java.util.Scanner;

public class Exercicio06{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        double notas[] = new double[5];
        
        double pesos[] = new double[5];
        
        int i;
        
        for(i=0; i<5; i++){
            System.out.println("Digite a nota " + (i + 1) + " : ");
            notas[i] = leitor.nextDouble();
        }
        
        for(i=0; i<5; i++){
            System.out.println("Digite o peso " + (i + 1) + " : ");
            pesos[i] = leitor.nextDouble();
        }
        
        double mediap = 0;
        
        mediap = ((notas[0] * pesos[0]) + (notas[1] * pesos[1]) + (notas[2] * pesos[2]) + (notas[3] * pesos[3]) + (notas[4] * pesos[4]))/(pesos[0] + pesos[1] + pesos[2] + pesos[3] + pesos[4]);
        
        System.out.println("Média ponderada: " + mediap);
        
        leitor.close();

    }
}


