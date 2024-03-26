
import java.util.Scanner;

public class Exercicio12{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        double vetA[] = new double[12];
        
        int i;
        
        for(i=0; i<12; i++){
            System.out.println("Vetor 1, índice " + i + " : ");
            vetA[i] = leitor.nextDouble();
        }
        
        double prod = 1;
        
        for(i=0; i<12; i++){
            if(vetA[i] % 2 == 0 && vetA[i] != 0 && vetA[i] > 0){
                prod = prod * vetA[i];
            }   

        }
        
        System.out.println("Produto: " + prod);
        
        leitor.close();

    }
}


