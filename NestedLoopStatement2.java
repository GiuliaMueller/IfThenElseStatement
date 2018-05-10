package chapter2.Statements;

public class NestedLoopStatement2 {
	public static void main(String[] args) {
		String [] strings = {"abc;", "def;", "ghi;", "jkl;"};
				
		OUTER_LOOP:
			for(String string : strings) {
				
				INNER_LOOP:
					for(char c : string.toCharArray() ) {
				if (c == ';') {
					// break OUTER_LOOP;
					 break INNER_LOOP;
					// break;
					// return;
					// continue OUTER_LOOP;
				}else {
					System.out.print(c + " ");
				}
					
			}
		System.out.println();
			}
	}

}
