
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntEqualityPrinter printer = new IntEqualityPrinter();
		
		printer.printEqual(1, 1, 1);
		printer.printEqual(1, 1, 2);
		printer.printEqual(-1, -1, -1);
		printer.printEqual(1, 1, -1);
		printer.printEqual(1, 2, 3);
	}

}
