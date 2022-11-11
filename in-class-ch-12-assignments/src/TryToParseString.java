
public class TryToParseString {

	public static void main(String[] args) {
		String defAnInt = "This is definitely an integer.";
		try {
			Integer.parseInt(defAnInt);
		} catch(Exception NumberFormatException) {
			System.out.println("That was definitely not an integer.");
		}
	}

}
