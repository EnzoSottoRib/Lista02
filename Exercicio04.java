
import java.util.Scanner;

public class Exercicio04{
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
        
        System.out.println("O índice dos elementos menores que N são: ");
        for(i=0; i<5; i++){
            if(vet[i] < n){
                System.out.println(i);
            }
        }
        
        leitor.close();

    }
}


