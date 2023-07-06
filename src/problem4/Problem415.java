package problem4;

public class Problem415 {
	
	public static void main(String[] args) {
		int dice = (int)(Math.random()*10)+1;
		if(dice % 2 == 0) {
			for(int i = 1;i <= dice; i++) {
				System.out.print("★");
			}
		}else {
			for(int i = 1;i <= dice; i++) {
				System.out.print("⭐︎");
			}
		}
	}

}
