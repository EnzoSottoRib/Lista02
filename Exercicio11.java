
import java.util.Scanner;

public class Exercicio11{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        double vetA[] = new double[5];
        
        double vetB[] = new double[5];
        
        int i;
        
        for(i=0; i<5; i++){
            System.out.println("Vetor 1, índice " + i + " : ");
            vetA[i] = leitor.nextDouble();
        }
        
        for(i=0; i<5; i++){
            System.out.println("Vetor 1, índice " + i + " : ");
            vetB[i] = leitor.nextDouble();
        }
        
        double prod = 0;
        
        for(i=0; i<5; i++){
            prod = prod + (vetA[i] * vetB[i]);
        }
        
        System.out.println("Produto escalar: " + prod);
        
        leitor.close();

    }
}


