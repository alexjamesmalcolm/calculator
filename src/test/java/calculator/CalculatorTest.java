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

	@Test
	public void shouldReturnNumberEntered() {
		Calculator underTest = new Calculator();
		int actual = underTest.add("42");
		Assert.assertEquals(42, actual);
	}

	@Test
	public void shouldAddNumbers() {
		Calculator underTest = new Calculator();
		int actual = underTest.add("23,19");
		Assert.assertEquals(42, actual);
	}

}
