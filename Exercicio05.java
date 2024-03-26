
import java.util.Scanner;

public class Exercicio05{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        double vet[] = new double[5];
        
        int i;
        
        for(i=0; i<5; i++){
            System.out.println("Digite o valor de índice " + i + " : ");
            vet[i] = leitor.nextDouble();
        }
        
        double n = 0;
        
        System.out.println("Digite N: ");
        n = leitor.nextDouble();
        
        int qtd = 0;
        
        for(i=0; i<5; i++){
            if(vet[i] == n){
                qtd ++;
            }
        }
        
        System.out.println("O número " + n + " apareceu no vetor " + qtd + " vezes!");
        
        leitor.close();

    }
}



