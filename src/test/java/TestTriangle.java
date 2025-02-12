import org.junit.Test;
import static org.junit.Assert.*;

public class TestTriangle {
    @Test
    public void testIsTriangle() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertTrue(triangle.isTriangle(3, 4, 5));
        assertFalse(triangle.isTriangle(1, 2, 3));
        assertFalse(triangle.isTriangle(10,2,3));
    }

    @Test
    public void testIsEquilateralTriangle() {
        Triangle triangle = new Triangle(5, 5, 5);
        assertTrue(triangle.isEquilateralTriangle(5, 5, 5));
        assertFalse(triangle.isEquilateralTriangle(3, 4, 5));
        assertFalse(triangle.isEquilateralTriangle(4, 4, 5));
    }

    @Test
    public void testIsIsoscelesTriangle() {
        Triangle triangle = new Triangle(5, 5, 8);
        assertTrue(triangle.isIsoscelesTriangle(5, 5, 8));
        assertTrue(triangle.isIsoscelesTriangle(8, 5, 8));
        assertTrue(triangle.isIsoscelesTriangle(8, 8, 5));
        assertFalse(triangle.isIsoscelesTriangle(3, 4, 5));
        assertFalse(triangle.isIsoscelesTriangle(3, 3, 3));
    }



}

