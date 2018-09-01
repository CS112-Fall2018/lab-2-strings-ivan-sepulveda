import java.util.Scanner;

public class StringFun{

	    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = args[0];
		String otherString = args[1];
		String subString = args[2];

        System.out.println("The program will now print out the results of nine methods for each of the three input strings.");
		System.out.println("------------------------------------------------------");
		for (int i = 0; i < args.length; i++) {
		if (i==0){
			System.out.println("String 's': " + s);
			System.out.println("length = " + s.length());
			System.out.println("Enter a string to check last index of:");
			String whatAreWeCheckingLastIndexOf0 = scan.nextLine();
			System.out.println("Last index of " + whatAreWeCheckingLastIndexOf0 + " in " + s +" is " + s.lastIndexOf(whatAreWeCheckingLastIndexOf0));
		} else if (i==1) {
			System.out.println("------------------------------------------------------");
			System.out.println("String 'otherString': " + otherString);
			System.out.println("Enter a string to check last index of:");
			String whatAreWeCheckingLastIndexOf1 = scan.nextLine();
			System.out.println("Last index of " + whatAreWeCheckingLastIndexOf1 + " in " + otherString +" is " + otherString.lastIndexOf(whatAreWeCheckingLastIndexOf1));
		} else if (i==2) {
			System.out.println("------------------------------------------------------");
			System.out.println("String 'subString': " + subString);
			//  s.length()
			System.out.println("length = " + s.length());
			//  s.equals(otherString)
			System.out.println("Enter a string to see if it equals " + subString + ": ");
			String comparisonString = scan.nextLine();
			if (subString.equals(comparisonString)){
				System.out.println("Strings are equal");
			} else if (subString != comparisonString) {
				System.out.println("Strings are not equal");
			}
			// s.substring(startIndex, endIndex)
			System.out.println("Enter a startIndex");
			int checkStartIndex = scan.nextInt();
			System.out.println("Enter an endIndex");
			int checkEndIndex = scan.nextInt();
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
			int charAtThisIndex = scan.nextInt();
			System.out.println("Character at index " + charAtThisIndex + " is "+ subString.charAt(charAtThisIndex));
		}
        }
    }
}