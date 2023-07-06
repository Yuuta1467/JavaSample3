package problem4;

public class Problem403 {
	
	public static void main(String[] args) {
		
		int dice = (int)(Math.random()*11)+1;
		System.out.println(dice);
		
		int i = 1;
		do {
			System.out.print("◼ ︎️");
			i++;
		}while(i <= dice);
		System.out.println();
	}

}
