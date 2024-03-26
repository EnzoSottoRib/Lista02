
import java.util.Scanner;

public class Exercicio10{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        double vetA[] = new double[5];
        
        double vetB[] = new double[5];
        
        int i;
        
        int j = 4;
        
        for(i=0; i<5; i++){
            System.out.println("Vetor 1, índice " + i + " : ");
            vetA[i] = leitor.nextDouble();
        }
        
        double temp = 0;
        
        for(i=0; i<5; i++){
            temp = vetA[i];
            vetB[j] = temp;
            j--;
        }
        
        System.out.println("Vetor invertido: ");
        
        for(i=0; i<5; i++){
            System.out.println(vetB[i]);
        }
        
        leitor.close();

    }
}


