package examples;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author namiq
 *
 */
public class ColumnarTransposition {
	public static void main(String[] args) {

		String plainText = "SALAMAZERBAYCAN";
		String keyWord = "TEZLIK";
		int pl = plainText.length();
		int kl = keyWord.length();

		char[][] arr = new char[(int) Math.ceil((double) pl / kl)][kl];

		Map<String, String> map = new HashMap<>();

		int index = 0;
		int row = 0;

		while (index < pl) {
			String preCrypt = "";
			// inserting map
			for (int i = 0; i < kl; i++) {
				if (index == pl)
					break;
				map.put("" + keyWord.charAt(i), "" + plainText.charAt(index++));
			}
			// Sorting map
			SortedSet<String> keys = new TreeSet<>(map.keySet());
			for (String key : keys)
				preCrypt += map.get(key);
			System.out.println(preCrypt);
			// cleanig map
			map.clear();

			// inserting array
			for (int i = 0; i < preCrypt.length(); i++)
				arr[row][i] = preCrypt.charAt(i);
			row++;
		}
		// read array by column side
		for (int i = 0; i < kl; i++)
			for (int j = 0; j < row; j++)
				if (arr[j][i] != 0)
					System.out.print(arr[j][i]);

	}
}
