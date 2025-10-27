import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlotTestStudent {
	Plot Plot1;
	Plot Plot2;
	Plot Plot3;

	@BeforeEach
	void setUp() throws Exception {
		Plot1 = new Plot(1,2,3,4);
		Plot2 = new Plot(2,3,1,1);
		Plot3 = new Plot(15,15,1,1);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		Plot1 = null;
		Plot2 = null;
		Plot3 = null;
	}

	@Test
	void testOverlaps(){
		assertEquals(Plot1.overlaps(Plot2), true);
		assertEquals(Plot2.overlaps(Plot1), true);
		assertEquals(Plot2.overlaps(Plot3),false);

	}

	@Test
	void testEncompasses() {
		assertEquals(Plot1.encompasses(Plot2), true);
		assertEquals(Plot2.encompasses(Plot1), false);
		assertEquals(Plot1.encompasses(Plot3),true);

	}

	@Test
	void testToString() {
		

		
		assertEquals("1,2,3,4",Plot1.toString());
		assertEquals("2,3,1,1",Plot2.toString());
		assertEquals("15,15,1,1",Plot3.toString());


	}

}
