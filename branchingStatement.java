package Day12_Branching_Statements;

public class branchingStatement {

	public static void main(String[] args) {
		
		int number=0;
		
		while (number<15) {
			
			number ++;
			
			if (number<=5) {
				
				System.out.println("Skipping number " + number);
				continue;
							
			}
			
			System.out.println("number= " + number );
			if (number>=10) {
				
				System.out.println("Breaking at " + number);
				break;
			}
		}

	}

}
