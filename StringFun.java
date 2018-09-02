import java.util.Scanner;

public class StringFun{

	    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = args[0];
		String otherString = args[1];
		String subString = args[2];
		System.out.println(args[2].length());
        System.out.println("The program will now print out the results of nine methods for each of the three input strings.");
		System.out.println("------------------------------------------------------");
		for (int i = 0; i < args.length; i++) {
		if (i==0) {
			System.out.println("------------------------------------------------------");
			System.out.println("String 's': " + s);
			//  s.length()
			System.out.println("length = " + s.length());
			//  s.equals(s)
			System.out.println("Enter a string to see if it equals " + s + ": ");
			String comparisonString = scan.nextLine();
			if (s.equals(comparisonString)){
				System.out.println("Strings are equal");
			} else if (s != comparisonString) {
				System.out.println("Strings are not equal");
			}
			// s.substring(startIndex, endIndex)
			System.out.println("Enter a startIndex");
			int checkStartIndex = readInt(scan);
			System.out.println("Enter an endIndex");
			int checkEndIndex = readInt(scan);
			System.out.println(s+ ".substring("+checkStartIndex + "," + checkEndIndex + ") = " + s.substring(checkStartIndex, checkEndIndex));
			//  s.trim
			System.out.println(s + ".trim() = " + s.trim());
			// indexOf(substring)
			System.out.println("Enter a string to check index of:");
			String whatAreWeCheckingIndexOf2 = scan.next();
			System.out.println("Index of " + whatAreWeCheckingIndexOf2 + " in " + s +" is " + s.indexOf(whatAreWeCheckingIndexOf2));
			//  s.lastIndexOf(s)
			System.out.println("Enter a string to check last index of:");
			String whatAreWeCheckingLastIndexOf2 = scan.next();
			System.out.println("Last index of " + whatAreWeCheckingLastIndexOf2 + " in " + s +" is " + s.lastIndexOf(whatAreWeCheckingLastIndexOf2));
			// s.charAt(index)
			System.out.println("Enter an index to return the character at that index:");
			int charAtThisIndex = readInt(scan);
			System.out.println("Character at index " + charAtThisIndex + " is "+ s.charAt(charAtThisIndex));
			// s.toUpperCase() (Personal Pick 1)
			System.out.println(s + ".toUpperCase() = " + s.toUpperCase());
			// s.contains(CharSequence s) (Personal Pick 2)
			System.out.println("Enter an CharSequence to return a boolean reflecting if it's contained in " + s + " :");
			String charSequenceWeAreChecking = scan.next();
			System.out.println(s.contains(charSequenceWeAreChecking));

		} else if (i==1) {
			System.out.println("------------------------------------------------------");
			System.out.println("String 'otherString': " + otherString);
			//  s.length()
			System.out.println("length = " + otherString.length());
			//  s.equals(otherString)
			System.out.println("Enter a string to see if it equals " + otherString + ": ");
			String comparisonString = scan.nextLine();
			if (otherString.equals(comparisonString)){
				System.out.println("Strings are equal");
			} else if (otherString != comparisonString) {
				System.out.println("Strings are not equal");
			}
			// s.substring(startIndex, endIndex)
			System.out.println("Enter a startIndex");
			int checkStartIndex = readInt(scan);
			System.out.println("Enter an endIndex");
			int checkEndIndex = readInt(scan);
			System.out.println(otherString+ ".substring("+checkStartIndex + "," + checkEndIndex + ") = " + otherString.substring(checkStartIndex, checkEndIndex));
			//  s.trim
			System.out.println(otherString + ".trim() = " + otherString.trim());
			// indexOf(substring)
			System.out.println("Enter a string to check index of:");
			String whatAreWeCheckingIndexOf2 = scan.next();
			System.out.println("Index of " + whatAreWeCheckingIndexOf2 + " in " + otherString +" is " + otherString.indexOf(whatAreWeCheckingIndexOf2));
			//  s.lastIndexOf(otherString)
			System.out.println("Enter a string to check last index of:");
			String whatAreWeCheckingLastIndexOf2 = scan.next();
			System.out.println("Last index of " + whatAreWeCheckingLastIndexOf2 + " in " + otherString +" is " + otherString.lastIndexOf(whatAreWeCheckingLastIndexOf2));
			// s.charAt(index)
			System.out.println("Enter an index to return the character at that index:");
			int charAtThisIndex = readInt(scan);
			System.out.println("Character at index " + charAtThisIndex + " is "+ otherString.charAt(charAtThisIndex));
			// s.toUpperCase() (Personal Pick 1)
			System.out.println(otherString + ".toUpperCase() = " + otherString.toUpperCase());
			// s.contains(CharSequence s) (Personal Pick 2)
			System.out.println("Enter an CharSequence to return a boolean reflecting if it's contained in " + otherString + " :");
			String charSequenceWeAreChecking = scan.next();
			System.out.println(otherString.contains(charSequenceWeAreChecking));
		}
		else if (i==2) {
			System.out.println("------------------------------------------------------");
			System.out.println("String 'subString': " + subString);
			//  s.length()
			System.out.println("length = " + subString.length());
			//  s.equals(otherString)
			System.out.println("Enter a string to see if it equals " + subString + ": ");
			String comparisonString = scan.nextLine();
			if (subString.equals(comparisonString)){
				System.out.println("Strings are equal");
			} else if (!subString.equals(comparisonString)) {
				System.out.println("Strings are not equal");
			}
			// s.substring(startIndex, endIndex)
			System.out.println("Enter a startIndex");
			int checkStartIndex = readInt(scan);
			System.out.println("Enter an endIndex");
			int checkEndIndex = readInt(scan);
			System.out.println(subString+ ".substring("+checkStartIndex + "," + checkEndIndex + ") = " + subString.substring(checkStartIndex, checkEndIndex));
			//  s.trim
			System.out.println(subString + ".trim() = " + subString.trim());
			// indexOf(substring)
			System.out.println("Enter a string to check index of:");
			String whatAreWeCheckingIndexOf2 = scan.next();
			System.out.println("Index of " + whatAreWeCheckingIndexOf2 + " in " + subString +" is " + subString.indexOf(whatAreWeCheckingIndexOf2));
			//  s.lastIndexOf(subString)
			System.out.println("Enter a string to check last index of:");
			String whatAreWeCheckingLastIndexOf2 = scan.next();
			System.out.println("Last index of " + whatAreWeCheckingLastIndexOf2 + " in " + subString +" is " + subString.lastIndexOf(whatAreWeCheckingLastIndexOf2));
			// s.charAt(index)
			System.out.println("Enter an index to return the character at that index:");
			int charAtThisIndex = readInt(scan);
			System.out.println("Character at index " + charAtThisIndex + " is "+ subString.charAt(charAtThisIndex));
			// s.toUpperCase() (Personal Pick 1)
			System.out.println(subString + ".toUpperCase() = " + subString.toUpperCase());
			// s.contains(CharSequence s) (Personal Pick 2)
			System.out.println("Enter an CharSequence to return a boolean reflecting if it's contained in " + subString + " :");
			String charSequenceWeAreChecking = scan.next();
			System.out.println(subString.contains(charSequenceWeAreChecking));
		}
        }
    }

	/**
	 *
	 * @param scanner
	 * @return
	 */
	static int readInt(Scanner scanner) {
		while(true) {
			try {
				System.out.print("Give me an integer: ");
				String line = scanner.next();
				return Integer.parseInt(line);
			} catch (NumberFormatException e) {
				System.out.println("Input not properly formatted!" + e.getMessage());
			}
		}
	}
}