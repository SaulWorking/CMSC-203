import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HolidayBonusTestStudent {

    private double[][] data = {
        {1.0, 2.0, 3.0},
        {4.0, -1.0},
        {2.0, 5.0, 1.0}
    };

    @Test
    public void testCalculateHolidayBonus() {
        double[] expected = {8000.0, 5000.0, 8000.0};

        double[] actual = HolidayBonus.calculateHolidayBonus(data);

        assertEquals(expected.length, actual.length);

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i], 0.001);
        }
    }

    @Test
    public void testCalculateTotalHolidayBonus() {
        double expectedTotal = 21000.0;
        double actualTotal = HolidayBonus.calculateTotalHolidayBonus(data);

        assertEquals(expectedTotal, actualTotal, 0.001);
    }
}

