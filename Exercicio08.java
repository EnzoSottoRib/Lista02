
import java.util.Scanner;

public class Exercicio08{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        double vetA[] = new double[5];
        
        double vetB[] = new double[5];
        
        double vetC[] = new double[10];
        
        int i;
        
        for(i=0; i<5; i++){
            System.out.println("Vetor 1, índice " + i + " : ");
            vetA[i] = leitor.nextDouble();
        }
        
        for(i=0; i<5; i++){
            System.out.println("Vetor 2, índice " + i + " : ");
            vetB[i] = leitor.nextDouble();
        }
        
        for(i=0; i<10; i++){
            if(i < 5){
                vetC[i] = vetA[i];
            } else{
                vetC[i] = vetB[i - 5];
            }
        }
        
        System.out.println("Vetor concatenado: ");
        
        for(i=0; i<10; i++){
            System.out.println(vetC[i]);
        }
        
        leitor.close();

    }
}



