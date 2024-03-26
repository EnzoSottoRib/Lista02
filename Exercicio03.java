
import java.util.Scanner;

public class Exercicio03{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
        double vet[] = new double[3];
        
        int i;
        
        for(i=0; i<3; i++){
            System.out.println("Digite o valor " + (i + 1) + " : ");
            vet[i] = leitor.nextDouble();
        }
        
        double vetdobro[] = new double[3];
        
        for(i=0; i<3; i++){
            vetdobro[i] = vet[i] * 2;
        }

        for(i=0; i<3; i++){
            System.out.println(vetdobro[i]);
        }
     
        leitor.close();

    }
}


