
import java.util.Scanner;

public class Exercicio15{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        int i;
        
        double vet[] = new double[5];
        
        double num = 0;
        
        int j = 0;
        
        
        
        for(i=0; i<5; j++){
            System.out.println("Digite o valor " + (i + 1) + " : ");
            num = leitor.nextDouble();
            if(i==0){
                vet[i] = num;
                i++;
            } else if(num > vet[i - 1] && i != 0){
                vet[i] = num;
                i++;
            }
        }

        for(i=0; i<5; i++){
            System.out.println(vet[i]);
            
        }
     
        leitor.close();

    }
}


