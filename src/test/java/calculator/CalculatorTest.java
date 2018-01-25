package calculator;

import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest {

	@Test
	public void shouldReturnZeroForEmptyString() {
		Calculator underTest = new Calculator();
		int actual = underTest.add("");
		Assert.assertEquals(0, actual);
	}

}
