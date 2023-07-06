package problem4;

public class Problem411 {
	
	public static void main(String[] args) {
		int max = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i +":");
			int dice = (int)(Math.random()*100)+1;
			System.out.println(dice);
			if (dice > max) {
				max = dice;
			}
		}
		System.out.println("最大値:"+ max);
	}
}