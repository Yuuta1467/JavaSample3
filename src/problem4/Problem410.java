package problem4;

public class Problem410 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i +":");
			int dice = (int)(Math.random()*100)+1;
			System.out.println(dice);
		}
	}
}
