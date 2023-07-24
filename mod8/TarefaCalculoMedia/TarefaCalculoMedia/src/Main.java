import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1,num2,num3,num4,media;

        System.out.println("Informe sua primeira nota:");
        num1 = sc.nextInt();
        System.out.println("Informe sua segunda nota:");
        num2 = sc.nextInt();
        System.out.println("Informe sua terceira nota:");
        num3 = sc.nextInt();
        System.out.println("Informe sua quarta nota:");
        num4 = sc.nextInt();

        media = (num1 + num2 + num3 + num4) / 4;
        System.out.printf("Sua média é: %.2f", media);

        /* Ao invés de já declarar os valores, resolvi fazer com entrada de valores,
        onde o usuário informa suas 4 notas e o sistema calcula a média e imprime.
         */
    }
}