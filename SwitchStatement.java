package chapter2.Statements;

public class SwitchStatement {
	public static void main (String... args) {
		displayName("john", "Smith");
		
	}
	
	public static void displayName( String firstName, final String lastName) {
		int id = 0;
		String middleName = "Joe";
		final String suffix = "Mr.";
		
		switch(firstName) {
		
		case "John":		//literal values will compile
			System.out.println(firstName);
			//break;
		default:			// executes when no case values is matched
			System.out.println(suffix +" "+ firstName +" "+ middleName +" "+ lastName);
			//break;
		case suffix:		//final Constant will compile
			System.out.println(suffix);
			return;
		
			// case lastName:	// Won't compile: final arguments are not final Constants
			// case middleName: // Won't compile: not a literal, enum, or final Constants
			// case 123.456D:	// Won't compile: double, float and long are not valid case values
			// case 'J':		// Won't compile: wrong data type, a char is not a String
		}
	}

}
