import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagmentCompanyTestSudent {

    private ManagementCompany noobCompany;
    private ManagementCompany proCompany;
    private Property p1, p2, p3;

    @BeforeEach
    public void setUp() {
        noobCompany = new ManagementCompany();
        proCompany = new ManagementCompany("AlphaMgmt", "12345", 10.0);

        p1 = new Property("dad", "china", 1500.0, "mom", 0, 0, 2, 2);
        p2 = new Property(" Evil", "Alive", 2500.0, "Bin", 2, 2, 3, 3);
        p3 = new Property("Pellegrino", "Chicago", 2000.0, "Charlie", 5, 5, 2, 2);
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals("", noobCompany.getName());
        assertEquals("", noobCompany.getTaxID());
        assertEquals(0, noobCompany.getMgmFeePer());
        assertEquals(0, noobCompany.getNumberOfProperties());
        assertNotNull(noobCompany.getPlot());
        assertEquals(ManagementCompany.MAX_PROPERTY, noobCompany.getProperties().length);
    }

    @Test
    public void testAddProperty() {
        int index1 = proCompany.addProperty(p1);
        assertEquals(index1, 0);
        assertEquals(1, proCompany.getNumberOfProperties());
        assertEquals(p1.getPropertyName(), proCompany.getProperties()[index1].getPropertyName());

        int index2 = proCompany.addProperty(p2);
        assertEquals(1, index2);
        assertEquals(2, proCompany.getNumberOfProperties());

        // Test adding null property returns -2
        assertEquals(-2, proCompany.addProperty((Property)null));
    }

    @Test
    public void testTotalRentAndHighestRent() {
        proCompany.addProperty(p1);
        proCompany.addProperty(p2);
        proCompany.addProperty(p3);

        
        double expectedTotal = p1.getRentAmount() + p2.getRentAmount() + p3.getRentAmount();
        assertEquals(expectedTotal, proCompany.getTotalRent());

        Property highestRent = proCompany.getHighestRentProperty();
        assertEquals(p2.getRentAmount(), highestRent.getRentAmount());
        assertEquals(p2.getPropertyName(), highestRent.getPropertyName());
    }

    @Test
    public void testRemoveLastProperty() {
        proCompany.addProperty(p1);
        proCompany.addProperty(p2);
        proCompany.removeLastProperty();

        assertEquals(proCompany.getProperties()[ManagementCompany.MAX_PROPERTY - 1],null);
        assertEquals(1, proCompany.getNumberOfProperties());
    }

    @Test
    public void testIsPropertiesFull() {
        for (int i = 0; i < ManagementCompany.MAX_PROPERTY; i++) {
            proCompany.addProperty(new Property("P" + i, "City", 1000 + i, "Owner"));
        }
        assertEquals(proCompany.isPropertiesFull(), false);
    }

    @Test
    public void testManagementFeeValidation() {
        assertTrue(proCompany.isManagementFeeValid());
        ManagementCompany invalidCompany = new ManagementCompany("BadMgmt", "000", 150);
        assertFalse(invalidCompany.isManagementFeeValid());
    }




}