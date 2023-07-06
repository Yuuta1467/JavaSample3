package problem4;

public class Problem413 {
	
	public static void main(String[] args) {
		int dice = (int)(Math.random()*10)+1;
		if(dice >= 5) {
			for(int i = 1; i <= dice; i++) {
				System.out.print("⭐︎");
			}
		}else {
			System.out.println("発生した数字:"+ dice);
		}
	}

}
