package examples;

/**
 * @author namiq
 *
 */
public class RailFence {

	public static void main(String[] args) {
		
		String plainText = "salamdunya";
		int k = 4;
		int a = 0;
		int l = plainText.length();
		char cryptArr[][] = new char[k][l];
		boolean bool = false;
		
		for (int i = 0; i < l; i++) {
			cryptArr[a][i] = plainText.charAt(i);

			if (a == k - 1)
				bool = true;
			if (a == 0)
				bool = false;
			if (bool)
				a--;
			else
				a++;
		}
		
		for (char ch[] : cryptArr) {
			for (char i : ch) {
				if (i != 0)
					System.out.print(i);
			}
		}
	}
}