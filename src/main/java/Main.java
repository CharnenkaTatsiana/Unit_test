import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Введите сторону a:");
            int a = input.nextInt();
            System.out.println("Введите сторону b:");
            int b = input.nextInt();
            System.out.println("Введите сторону c:");
            int c = input.nextInt();

            Triangle triangle = new Triangle(a, b, c);

            if (triangle.isTriangle(a, b, c)) {
                if (triangle.isEquilateralTriangle(a, b, c)) {
                    System.out.println("Треугольник равносторонний");
                } else if (triangle.isIsoscelesTriangle(a, b, c)) {
                    System.out.println("Треугольник равнобедренный");
                } else {
                    System.out.println("Треугольник разносторонний");
                }
            } else {
                System.out.println("Треугольник не существует");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено нечисловое значение. Пожалуйста, введите целые числа.");
        } finally {
            input.close(); // Закрываем Scanner
        }
    }
}