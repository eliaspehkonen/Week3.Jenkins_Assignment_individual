import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateDistanceBetweenTwoPointsTest {
    // Define a small delta value for floating-point comparisons
    private static final double DELTA = 0.001;
    CalculateDistanceBetweenTwoPoints obj = new CalculateDistanceBetweenTwoPoints();

    @Test
    public void testCalculateDistanceBetweenTwoPoints() {
        assertEquals(2.828, obj.calculateDistanceBetweenTwoPoints(1, 2, 3, 4), DELTA);
    }
}
