
import java.util.Scanner;

public class Exercicio02{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        double vet[] = new double[3];
        
        int i;
        
        for(i=0; i<3; i++){
            System.out.println("Digite o valor " + (i + 1) + " : ");
            vet[i] = leitor.nextDouble();
        }
        
        for(i=0; i<3; i++){
            if(vet[i] < 0){
                System.out.println("Número: " + vet[i] + " é negativo!");
            } else if(vet[i] == 0){
                System.out.println("Número: " + vet[i] + " é igual a 0!");
            } else{
                System.out.println("Número: " + vet[i] + " é positivo!");
            }
        }

        leitor.close();

    }
}


