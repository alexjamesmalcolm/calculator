package calculator;

public class Calculator {
	public int add(String input) {
		if (input.equals("")) {
			return 0;
		}
		return Integer.parseInt(input);
	}
}
