package amok;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AmokCatTest {
AmokCat underTest = new AmokCat("", "", "");
	
	@Test
	public void catWalkStart() {
		// act
		int result = underTest.getWalk(); // makes a method in VP2 class
		// assert
		assertEquals(6, result);	}

}
