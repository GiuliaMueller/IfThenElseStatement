package chapter2.Statements;

public class LoopStatements {
	public static void main(String[] args) {
		String[] strings = {"one", "two", "three", "four"};
		
		// While loop Statement
		int w = 0;
		while(w < strings.length) {
			System.out.println("while: index position: "+w+" is string "+strings[w]);
			w++;
		}
		
		// do while loop Statement check the boolean expression after executing the code block at least once.
		int dw = 0;
		do {
			System.out.println("do-while: index position: "+dw+" is string "+strings[dw]);
		}while(dw != 0);
		
		//basic for loop
		for(int f=0; f <strings.length; f++) {
			System.out.println("for: index position: "+f+" is string "+strings[f]);
		}
		
		// enhanced for-each loop [no array index positioning required]
		for(String string : strings) {
			System.out.println("for-each: string = "+string);
		}
	}

}
