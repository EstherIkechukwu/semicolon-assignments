import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsogramStandardTest{

	@Test
	public void getAlphabetStringBeforeInputTest () {

		//given(pre-conditions)
		Isogram isogram = new Isogram();
		String words = "The quick brown fox jumps over the lazy dog";

		//action (the functionality being tested)
		boolean result = isogram.getAlphabetString(words);

		//check
		boolean expected = true;
		assertEquals(expected , result);

	}
}













}