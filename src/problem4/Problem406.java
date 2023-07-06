package problem4;

public class Problem406 {
	
	public static void main(String[] args) {
		
		while(true) {
			int dice = (int)(Math.random()*10)+1;
			System.out.println(dice);
			if(dice == 10) {
				break;
			}
		}System.out.println("終了");
	}
}
