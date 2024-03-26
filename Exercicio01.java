
import java.util.Scanner;

public class Exercicio01{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        
        double vet[] = new double[5];
        
        double media = 0;
        
        int i;
        
        for(i=0; i<5; i++){
            System.out.println("Digite o valor " + (i + 1) + " :");
            vet[i] = leitor.nextDouble();
            media += vet[i];
        }
        
        media = media/5;
        
        System.out.println("Média: " + media);
        
        System.out.println("Os valores menores que a média são: ");
        for(i=0; i<5; i++){
            if(vet[i] < media){
                System.out.println(vet[i]);
            }
            
        }
        
        System.out.println("Os valores iguais à média são: ");
        for(i=0; i<5; i++){
            if(vet[i] == media){
                System.out.println(vet[i]);
            }
            
        }
        
        System.out.println("Os valores maiores que a média são: ");
        for(i=0; i<5; i++){
            if(vet[i] > media){
                System.out.println(vet[i]);
            }
            
        }
        
        leitor.close();

    }
}


