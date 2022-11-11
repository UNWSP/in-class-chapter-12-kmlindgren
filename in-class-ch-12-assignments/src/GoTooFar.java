
public class GoTooFar {

	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5};
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println(intArray[i]);
			}
		} catch(Exception ArrayIndexOutOfBoundException) {
			System.out.println("Now you've gone too far.");
		}
	}

}
