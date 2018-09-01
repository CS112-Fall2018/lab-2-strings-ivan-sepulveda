import java.util.Scanner;

public class StringFun{

	    public static void main(String[] args) {
		String s = args[0];
		String otherString = args[1];
		String subString = args[2];

        System.out.println("The program will now print out the results of nine methods for each of the three input strings.");

        for (int i = 0; i < args.length; i++) {
        	if (i==0){
			    System.out.println("String 's': " + s);
			    System.out.println("length = " + s.length());
        	} else if (i==1) {
        		System.out.println("String 'otherString': " + otherString);
        	} else if (i==2) {
        		System.out.println("String 'subString': " + subString);
				whatStringAreWeCheckingLastIndexOf = readString(scanner);
				System.out.println("length = " + subString.lastIndexOf(subString));

			}
			


        }
    }
	static String readString(Scanner scanner) {
		while(true) {
			try {
				System.out.print("Give me an string: ");
				String line = scanner.nextLine();
				String value = String.parseString(line);
				return value;
			} catch (NumberFormatException e) {
				System.out.println("Input not properly formatted!" + e.getMessage());
				continue;
			}
		}
	}
}
// 	public static void main(String[] args){

// 	String s = String.
// 	int a = Integer.parseInt(args[0]);
// 	int b = Integer.parseInt(args[1]);
// 	float x = Float.parseFloat(args[2]);
// 	float y = Float.parseFloat(args[3]);
// 	/**
// 	Declaring/Assigning intergers and floats
// 	*/
// 	int a = 2;
// 	int b = 4;
// 	float x = 0.5f;
// 	float y = 0.25f;
// 	// Addition
// 	System.out.println("a + b = " + (a+b)); // a plus b, b plus a not needed
// 	System.out.println("a + x = " + (a+x)); // a plus x
// 	System.out.println("a + y = " + (a+y)); // a plus y
// 	System.out.println("b + x = " + (b+x)); // b plus x
// 	System.out.println("b + y = " + (b+y)); // b plus y
// 	System.out.println("x + y = " + (x+y)); // x plus y
// 	// Division
// 	// Start with all a-operations
// 	System.out.println("a / b = " + (a/b)); // a divided by b
// 	System.out.println("a / x = " + (a/x)); // a divided by x
// 	System.out.println("a / y = " + (a/y)); // a divided by y
// 	// All b-operationso
// 	System.out.println("b / a = " + (b/a)); // b divided by a
// 	System.out.println("b / x = " + (b/x)); // b divided by x
// 	System.out.println("b / y = " + (b/y)); // b divided by y
// 	// All x-operations
// 	System.out.println("x / a = " + (x/a)); // x divided by a
// 	System.out.println("x / b = " + (x/b)); // x divided by b
// 	System.out.println("x / y = " + (x/y)); // x divided by y
// 	// All y-operations
// 	System.out.println("y / a = " + (y/a)); // y divided by a
// 	System.out.println("y / b = " + (y/b)); // y divided by b
// 	System.out.println("y / x = " + (y/x)); // y divided by x

// 	}
// }