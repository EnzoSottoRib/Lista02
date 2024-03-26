
import java.util.Scanner;

public class Exercicio14{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        int i;
        
        double maior = 0;
        
        int ind = 0;
        
        double temp;
        
        double vet[] = new double[5];
        
        
        for(i=0; i<5; i++){
            System.out.println("Digite o valor " + (i + 1) + " : ");
            vet[i] = leitor.nextDouble();
            if(maior < vet[i]){
                maior = vet[i];
                ind = i;
            }
        }

        temp = vet[4];
        vet[4] = maior;
        vet[ind] = temp;

        for(i=0; i<5; i++){
            System.out.println(vet[i]);
            
        }
     
        leitor.close();

    }
}


