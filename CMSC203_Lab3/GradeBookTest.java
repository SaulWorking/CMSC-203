import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
	GradeBook object1;
	GradeBook object2;
	@BeforeEach
	void setUp() throws Exception {
	 object1 = new GradeBook(5);	
	 object2 = new GradeBook(5);
		for(int i=0; i<5; ++i) 
		{
			object1.addScore(50 + i);
			
		}
		for(int i=0; i<5; ++i) 
		{
			object2.addScore(10 + i);
		}
	}

	@AfterEach
	void tearDown() throws Exception {
		
		object1 = null;
		object2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(object1.toString().equals("50.0 51.0 52.0 53.0 54.0 "));
		assertTrue(object2.toString().equals("10.0 11.0 12.0 13.0 14.0 "));
	}


	@Test
	void testSum() {	
		assertEquals(260, object1.sum(), 0.001);
		assertEquals(60, object2.sum(), 0.001);
	}

	@Test
	void testMinimum() {
		
		assertEquals(50, object1.minimum());
		assertEquals(10, object2.minimum());

	}

	@Test
	void testFinalScore() {
		assertEquals(210,object1.finalScore());
		assertEquals(50,object2.finalScore());
	}

	@Test
	void testGetScoreSize() {
		assertEquals(5,object1.getScoreSize());
		assertEquals(5,object2.getScoreSize());
	}



}
