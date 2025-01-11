import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindNumberTest{

	@Test
	public void findNumberBeforeInputTest () {

		//given(pre-conditions)
		FindNumber findNumber = new FindNumber();
		int[] numbers = {12, 17, 24, 32, 14};
		
		int number = 14;

		//action (the functionality being tested)
		int result = findNumber.getIndex(numbers, number);

		//check
		int expected = 4;
		assertEquals(expected , result);

	}
}
