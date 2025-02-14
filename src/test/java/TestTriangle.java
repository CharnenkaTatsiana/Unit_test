import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class TestTriangle {

    @ParameterizedTest
    @MethodSource("provideTriangleTestCases")
    public void testIsTriangle(int a, int b, int c, boolean expected) {
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(expected, triangle.isTriangle(a, b, c));
    }

    @ParameterizedTest
    @MethodSource("provideEquilateralTriangleTestCases")
    public void testIsEquilateralTriangle(int a, int b, int c, boolean expected) {
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(expected, triangle.isEquilateralTriangle(a, b, c));
    }

    @ParameterizedTest
    @MethodSource("provideIsoscelesTriangleTestCases")
    public void testIsIsoscelesTriangle(int a, int b, int c, boolean expected) {
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(expected, triangle.isIsoscelesTriangle(a, b, c));
    }

    private static Stream<Arguments> provideTriangleTestCases() {
        return Stream.of(
                Arguments.of(3, 4, 5, true),  // Корректный треугольник
                Arguments.of(1, 2, 3, false), // Не треугольник
                Arguments.of(10, 2, 3, false), // Не треугольник
                Arguments.of(0, 0, 0, false), // Нулевые стороны
                Arguments.of(-1, 2, 3, false), // Отрицательные стороны
                Arguments.of(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true), // Максимальные значения
                Arguments.of(Integer.MAX_VALUE, 1, 1, false), // Переполнение
                Arguments.of(1, 1, 1, true), // Минимальные положительные значения
                Arguments.of(3, 2, 4, true) // Разносторонний треугольник с минимальными значениями
        );
    }

    private static Stream<Arguments> provideEquilateralTriangleTestCases() {
        return Stream.of(
                Arguments.of(5, 5, 5, true),  // Корректный равносторонний треугольник
                Arguments.of(3, 4, 5, false), // Разносторонний треугольник
                Arguments.of(0, 0, 0, false), // Нулевые стороны
                Arguments.of(-1, -1, -1, false), // Отрицательные стороны
                Arguments.of(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true), // Максимальные значения
                Arguments.of(1, 1, 1, true) // Минимальные положительные значения
        );
    }

    private static Stream<Arguments> provideIsoscelesTriangleTestCases() {
        return Stream.of(
                Arguments.of(5, 5, 8, true),  // Корректный равнобедренный треугольник
                Arguments.of(8, 5, 8, true),  // Корректный равнобедренный треугольник
                Arguments.of(8, 8, 5, true),  // Корректный равнобедренный треугольник
                Arguments.of(3, 4, 5, false), // Разносторонний треугольник
                Arguments.of(0, 0, 0, false), // Нулевые стороны
                Arguments.of(-1, -1, 2, false), // Отрицательные стороны
                Arguments.of(Integer.MAX_VALUE, Integer.MAX_VALUE, 1, true), // Равнобедренный треугольник с максимальными значениями
                Arguments.of(2, 2, 1, true), // Равнобедренный треугольник с минимальными значениями
                Arguments.of(1, 1, 2, false) // Не треугольник
        );
    }
}

