package problem4;

public class Problem414 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			if(i % 10 == 0) {
				System.out.println(i);
			}else {
				System.out.print(i + ":");
			}
		}
	}

}
