package view;
import java.util.Scanner;//biblioteca do scanner
import java.util.Arrays;//biblioteca dos arrays
public class MegaSena {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        int contador = 0;

        while(contador < 6){
            System.out.println("Digite um número entre 1 e 60: ");
            int numero = scanner.nextInt();

            if(numero < 1 || numero > 60){
                System.out.println("Número inválido! Digite um número entre 1 e 60: ");
                continue;
            }
            boolean repetido = false;
            for(int i = 0; i < contador; i++){
                if(numeros[i]== numero){
                    repetido = true;
                    break;
                }
            }
            if(repetido){
                System.out.println("Número já inserido! Tente outro.");
            }
            else{
                numeros[contador]=numero;
                contador++;
            }
        }
        Arrays.sort((numeros));

        System.out.println("Números escolhidos (em ordem crescente): ");
        for (int num: numeros){
            System.out.println(num + " ");
        }
    }
}
