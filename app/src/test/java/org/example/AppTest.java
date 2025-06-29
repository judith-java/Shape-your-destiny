import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private static final double DELTA = 0.01;

    @Test
    public void testCircle() {
        Circle c = new Circle(3);
        assertEquals(28.27, c.getArea(), DELTA);
        assertEquals(18.85, c.getPerimeter(), DELTA);
    }

    @Test
    public void testRectangle() {
        Rectangle r = new Rectangle(4, 5);
        assertEquals(20.0, r.getArea(), DELTA);
        assertEquals(18.0, r.getPerimeter(), DELTA);
        assertEquals(4, r.numberOfSides());
    }

    @Test
    public void testSquare() {
        Square s = new Square(4);
        assertEquals(16.0, s.getArea(), DELTA);
        assertEquals(16.0, s.getPerimeter(), DELTA);
        assertEquals(4, s.numberOfSides());
    }

    @Test
    public void testRightTriangle() {
        RightTriangle rt = new RightTriangle(3, 4);
        assertEquals(6.0, rt.getArea(), DELTA);
        assertEquals(12.0, rt.getPerimeter(), DELTA); // 3 + 4 + 5
        assertEquals(3, rt.numberOfSides());
    }

    @Test
    public void testIsoscelesRightTriangle() {
        IsoscelesRightTriangle irt = new IsoscelesRightTriangle(5);
        assertEquals(12.5, irt.getArea(), DELTA);
        assertEquals(5 + 5 + Math.sqrt(50), irt.getPerimeter(), DELTA);
        assertEquals(3, irt.numberOfSides());
    }

    @Test
    public void testParallelogram() {
        Parallelogram p = new Parallelogram(6, 3, 4);
        assertEquals(18.0, p.getArea(), DELTA);
        assertEquals(20.0, p.getPerimeter(), DELTA);
        assertEquals(4, p.numberOfSides());
    }
}
