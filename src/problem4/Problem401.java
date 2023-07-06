package problem4;

public class Problem401 {
	
	public static void main(String[] args) {
		
		int dice = (int)(Math.random()*11)+1;
		System.out.println(dice);
		
		for(int i = 1; i <= dice; i++) {
			System.out.print("■ ");
		}System.out.println();
	}
}