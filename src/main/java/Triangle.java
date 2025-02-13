public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isTriangle(int a, int b, int c) {
        // Проверка на положительные стороны
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        // Используем long для избежания переполнения
        long sumAB = (long) a + b;
        long sumBC = (long) b + c;
        long sumAC = (long) a + c;

        // Проверка условия существования треугольника
        return sumAB > c && sumBC > a && sumAC > b;
    }

    public boolean isEquilateralTriangle(int a, int b, int c) {
        return isTriangle(a, b, c) && (a == b && b == c);
    }

    public boolean isIsoscelesTriangle(int a, int b, int c) {
        return isTriangle(a, b, c) && ((a == b && a != c) || (a == c && a != b) || (b == c && b != a));
    }
}