import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строну a:");
        int a = input.nextInt();
        System.out.println("Введите строну b:");
        int b = input.nextInt();
        System.out.println("Введите строну c:");
        int c = input.nextInt();
        input.close();
        Triangle triangle = new Triangle(a, b, c);
        if (triangle.isTriangle(a,b,c)){
            if(triangle.isIsoscelesTriangle(a,b,c)){
                System.out.println("Треугольник равнобедренный");
            } else  if (triangle.isEquilateralTriangle(a,b,c)){
                System.out.println("Треугольник равносторонний");
            } else {
                System.out.println("Треугольник разносторонний");
            }
        }else {
            System.out.println("Треугольник не существует");
        }
    }
}
