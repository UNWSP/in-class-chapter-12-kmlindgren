
public class TwoExceptions {

	public static void main(String[] args) {
		String defAnInt = "This is definitely an integer.";
		int num = 0;
		try {
			System.out.println(5 / num);
			//Integer.parseInt(defAnInt);
		} /*catch(NumberFormatException e) {
			System.out.println("Unable to format this 'integer.'");
		} */catch (ArithmeticException e) {
			System.out.println("Unable to perform this arithmetic equation.");
		} finally {
			System.out.println("Program has concluded.");
		}
	}

}
