
import java.util.Scanner;

public class Exercicio07{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        double vet1[] = new double[5];
        
        double vet2[] = new double[5];
        
        int i;
        
        for(i=0; i<5; i++){
            System.out.println("Vetor 1, índice " + i + " : ");
            vet1[i] = leitor.nextDouble();
        }
        
        for(i=0; i<5; i++){
            System.out.println("Vetor 2, índice " + i + " : ");
            vet2[i] = leitor.nextDouble();
        }
        
        int flag = 0;
        
        for(i=0; i<5; i++){
            if(vet1[i] == vet2[i]){
                flag++;
            }
        }
        
        if(flag == 5){
            System.out.println("Os vetores são iguais!");
        } else{
            System.out.println("Os vetores são diferentes!");
        }
        
        leitor.close();

    }
}


