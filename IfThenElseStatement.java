package chapter2.Statements;

public class IfThenElseStatement {
	public static void main(String[] args) {
		
		for (int hourOfDay = 0; hourOfDay < 24; hourOfDay++ ) {
			System.out.print("hourOfDay = " +hourOfDay+": ");
			
			if (hourOfDay <= 11) {
				System.out.println("Good Morning");
			}else if (hourOfDay <= 17) {
				System.out.println("Good Afternoon");
			}else {
				System.out.println("Good Evening");
			}
		}
	}

}
