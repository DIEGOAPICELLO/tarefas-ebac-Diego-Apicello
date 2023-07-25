import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor inteiro");
        int num1 = sc.nextInt();
        long num2 = num1; //Para fazer o casting entre tipos primitivos

        Integer num3 = num1; // Casting tipo primitivo x wrapper

        System.out.println("Valor informado: " + num3);

    }
}