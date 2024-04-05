import java.util.Scanner;
public class Atv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    double[] notas = new double[4];
    double soma = 0;

    for(int i = 0;i < 4;i++){
        System.out.print("Digite a " + (i+1) + " nota: ");
        notas[i] = scanner.nextDouble();
        soma += notas[i];
    }
    double media = soma / 4;
    for(int i = 0;i < 4; i++){
        System.out.println("Notas:" + notas[i]);
    }
    for(int i = 0;i < 1;i++){
        System.out.println("A media é "+media);
    }
    scanner.close();
    }
}
