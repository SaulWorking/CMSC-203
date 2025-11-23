import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoDimRaggedArrayUtilityTestStudent {

    private double[][] data;

    @BeforeEach
    void setUp() {
        data = new double[][] {
                {2.5, 4.0},
                {1.0, 3.5,5.0},
                {7.0},
                {9.0}
        };
    }

    @AfterEach
    void tearDown() {
        data = null;
    }

    @Test
    void testGetTotal() {
        assertEquals(32.0, TwoDimRaggedArrayUtility.getTotal(data));
    }

    @Test
    void testGetAverage() {
        assertEquals(32.0 / 7.0, TwoDimRaggedArrayUtility.getAverage(data));
    }

    @Test
    void testGetRowTotal() {
        assertEquals(6.5, TwoDimRaggedArrayUtility.getRowTotal(data, 0));
        assertEquals(9.5, TwoDimRaggedArrayUtility.getRowTotal(data, 1));
        assertEquals(7.0, TwoDimRaggedArrayUtility.getRowTotal(data, 2));
        assertEquals(9.0, TwoDimRaggedArrayUtility.getRowTotal(data, 3));
    }

    @Test
    void testGetColumnTotal() {
        assertEquals(19.5, TwoDimRaggedArrayUtility.getColumnTotal(data, 0));
        assertEquals(7.5, TwoDimRaggedArrayUtility.getColumnTotal(data, 1));
        assertEquals(5.0, TwoDimRaggedArrayUtility.getColumnTotal(data, 2));
    }

    @Test
    void testGetHighestInRow() {
        assertEquals(4.0, TwoDimRaggedArrayUtility.getHighestInRow(data, 0));
        assertEquals(5.0, TwoDimRaggedArrayUtility.getHighestInRow(data, 1));
        assertEquals(7.0, TwoDimRaggedArrayUtility.getHighestInRow(data, 2));
        assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInRow(data, 3));
    }

    @Test
    void testGetHighestInRowIndex() {
        assertEquals(1, TwoDimRaggedArrayUtility.getHighestInRowIndex(data, 0));
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInRowIndex(data, 1));
        assertEquals(0, TwoDimRaggedArrayUtility.getHighestInRowIndex(data, 2));
        assertEquals(0, TwoDimRaggedArrayUtility.getHighestInRowIndex(data, 3));
    }

    @Test
    void testGetLowestInRow() {
        assertEquals(2.5, TwoDimRaggedArrayUtility.getLowestInRow(data, 0));
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInRow(data, 1));
        assertEquals(7.0, TwoDimRaggedArrayUtility.getLowestInRow(data, 2));
        assertEquals(9.0, TwoDimRaggedArrayUtility.getLowestInRow(data, 3));
    }

    @Test
    void testGetLowestInRowIndex() {
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(data, 0));
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(data, 1));
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(data, 2));
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(data, 3));
    }

    @Test
    void testGetHighestInColumn() {
        assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInColumn(data, 0));
        assertEquals(4.0, TwoDimRaggedArrayUtility.getHighestInColumn(data, 1));
        assertEquals(5.0, TwoDimRaggedArrayUtility.getHighestInColumn(data, 2));
    }

    @Test
    void testGetHighestInColumnIndex() {
        assertEquals(3, TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, 0));
        assertEquals(0, TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, 1));
        assertEquals(1, TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, 2));
    }

    @Test
    void testGetLowestInColumn() {
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInColumn(data, 0));
        assertEquals(3.5, TwoDimRaggedArrayUtility.getLowestInColumn(data, 1));
        assertEquals(5.0, TwoDimRaggedArrayUtility.getLowestInColumn(data, 2));
    }

    @Test
    void testGetLowestInColumnIndex() {
        assertEquals(1, TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, 0));
        assertEquals(1, TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, 1));
        assertEquals(1, TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, 2));
    }

    @Test
    void testGetHighestInArray() {
        assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInArray(data));
    }

    @Test
    void testGetLowestInArray() {
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArray(data));
    }
}