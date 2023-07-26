import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        double grade1, grade2, grade3, grade4, average;
        System.out.println("put your first grade: ");
        grade1 = sc.nextDouble();
        System.out.println("put your second grade: ");
        grade2 = sc.nextDouble();
        System.out.println("put your third grade: ");
        grade3 = sc.nextDouble();
        System.out.println("put your fourth grade: ");
        grade4 = sc.nextDouble();

        average = (grade1 + grade2 + grade3 + grade4) / 4;
        System.out.println("Your average is: " + average);

        if (average >= 7) {
            System.out.println("You are approved");
        } else if (average >= 5) {
            System.out.println("You are in recuperation");
        } else {
            System.out.println("You failed");
        }

    }
}