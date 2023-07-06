package problem4;

public class Problem409 {
	
	public static void main(String[] args) {
		
		while(true) {
			int dice = (int)(Math.random()*100)+1;
			System.out.println(dice);
			if (dice % 10 == 0) {
				break;
			}
		}System.out.println("終了");
	}

}
