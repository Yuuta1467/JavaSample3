package problem4;

public class Problem402 {

	public static void main(String[] args) {
		int dice = (int) (Math.random() * 11) + 1;
		System.out.println(dice);

		int i = 1;
		while (i <= dice) {
			System.out.print("* ");
			i++;

		}
		System.out.println();
	}
}