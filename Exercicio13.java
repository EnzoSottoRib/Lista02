
import java.util.Scanner;

public class Exercicio13{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        int n;
        
        System.out.println("Digite n: ");
        n = leitor.nextInt();

        int[] vet = new int[n];

        vet[0] = 1;
        vet[1] = 1;

        if(n >= 3){
            for(int i = 2 ; i < n; i++){
                vet[i] = vet[i - 1] + vet[i - 2];
            }
        }

        System.out.print("Resultado: ");
        for(int i = 0; i < (n - 1); i++){
            System.out.printf(vet[i] + ", ");
        }

        System.out.println(vet[n - 1]);
        
        leitor.close();

    }
}


