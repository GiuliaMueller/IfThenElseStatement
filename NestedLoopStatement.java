package chapter2.Statements;

public class NestedLoopStatement {
	public static void main(String... args) {
		
		int [] [] list = {{1,13,5},{1,2,5},{2,7,2}};
		int searchVal = 2, posX = -1, posY = -1;
		
		OUTER_LOOP:
			for(int i=0; i < list.length; i++) {
				INNER_LOOP:
					for (int j=0; j < list[i].length; j++) {
						if(list[i][j] == searchVal) {
							posX = i;
							posY = j;
							System.out.println("Value " +searchVal+" found at: "+"("+posX +", "+posY+")");
							//break OUTER_LOOP;
							break INNER_LOOP;
							//continue OUTER_LOOP;
							//continue INNER_LOOP;
						}
					}
			}
		if (posX == -1 || posY == -1 ) {
			System.out.println("Value " +searchVal+" not found.");
		}
	}

}
