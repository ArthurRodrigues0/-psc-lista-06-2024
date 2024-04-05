import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int[] numeros = new int[5];
    int i = 0;
    int soma = 0;
    int multi = 1;

    for(i = 0; i <= 4;i++){
        System.out.println("digite um numero: ");
         numeros[i] = scanner.nextInt();

         soma += numeros[i];
         multi *= numeros[i];
    }
    System.out.println("Números digitados:");
    for (int num : numeros) {
        System.out.print(num + " ");
    }
    System.out.println();

    
    System.out.println("Soma dos números: " + soma);
    System.out.println("Multiplicação dos números: " + multi);


    scanner.close();
    }
}
