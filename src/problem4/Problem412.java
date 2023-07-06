package problem4;

public class Problem412 {

	public static void main(String[] args) {

		int min = 100;

		for (int i = 1; i <= 6; i++) {
			int dice = (int)(Math.random()*100)+1;
			System.out.println(i + ":"+dice);
			if(min > dice) {
				min = dice;
			}
		}System.out.println("最小値:"+min);
	}

}
