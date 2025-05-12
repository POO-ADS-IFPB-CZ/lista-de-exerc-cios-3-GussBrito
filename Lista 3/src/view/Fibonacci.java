package view;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da serie de Fibonacci deseja ver: ");
        int n = scanner.nextInt();

        if(n <= 0){
            System.out.println("Informe um numero maior que 0.");
        }
        else{
                int[]fibonacci = new int[n];

                for(int i = 0;  i < n; i++){
                    if(i == 0){
                        fibonacci[i] = 0;
                    }
                    else if(i == 1){
                        fibonacci[i]=1;
                    }
                    else{
                        fibonacci[i] = fibonacci[i -1] + fibonacci[i - 2];
                    }
                }
                //exibir a sequencia
            System.out.print("Sequencia de fibonacci: [");
                for(int i = 0; i < n; i++){
                    System.out.print(fibonacci[i]);
                    if (i < n -1){
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
        }
    }
}
