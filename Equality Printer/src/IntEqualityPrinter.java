
public class IntEqualityPrinter {

	public static void printEqual(int a, int b, int c) {
	
		if(a < 0 || b < 0 || c < 0){
			System.out.println("Invalid Value. Negative present.");
		}
		else if (a == b && a == c) {
			System.out.println("All numbers are equal");
		}
		
		else if ((a == b && a != c)||(a !=b && a == c)) {
			System.out.println("Two numbers are the same, but one is different.");
		}
		
		else if((a != b && a != c) && (b != a && b != c)) {
			System.out.println("All numbers are different.");
		}
		else {
			System.out.println("Bad entry");
		}
	}
}
