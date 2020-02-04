package amok;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RoboPetTest {
	RoboPet underTest = new RoboPet("", "", "");

	@Test
	public void catWalkStart() {
		// act
		int result = underTest.getWalk(); // makes a method in VP2 class
		// assert
		assertEquals(6, result);
	}
//@Test
//public void 
	@Test
	public void roboCatHasOil() {
		int result = underTest.getOil();
		assertEquals(6, result);
	}

}