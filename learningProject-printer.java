
public class Main {

	public static void main(String[] args) {
		
		ThePrinter theprinter = new ThePrinter(50, true);
		System.out.println("intial page count = " + theprinter.getPagesPrinted());
		int pagesPrinted = theprinter.printPages(4);
		System.out.println("pages printed was " + pagesPrinted + " new total count for printer = " + theprinter.getPagesPrinted());

	}

}
