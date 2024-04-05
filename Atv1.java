import java.util.Scanner;
public class Atv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int i = 0;
    int[] numeros = new int[5];

    for (i = 0; i < 5;i++) {
        System.out.println("Digite um numero: ");
            numeros[i] = scanner.nextInt();
    }
    scanner.close();

    for(i = 0;i<5;i++){
        System.err.println("Os numeros são: " + numeros[i]);
            }     

        }
    }
