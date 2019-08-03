import java.math.BigInteger;

public class DeffieHellman {

	public static void main(String[] args) {

		// Ayşə və Azərin açıq açarları p = 91, g = 12
		int p = 91;
		int g = 12;

		System.out.println("p mod dəyəri: " + p);
		System.out.println("g kök dəyəri: " + g);

		// Ayşənin gizli açarı a = 11
		int a = 11;
		System.out.println("Ayşənin gizli açarı: " + a);

		// Azərin gizli açarı
		int b = 8;
		System.out.println("Azərin gizli açarı: " + b);

		// Ayşə A dəyərini hesablayır Azərə göndrir
		int A = calculate(g, a, p);
		System.out.println("A dəyəri: " + A);

		// Azər B dəyərini hesablayır Ayşəyə göndrir
		int B = calculate(g, b, p);
		System.out.println("B dəyəri: " + B);

		// Ayşə simmetrik açarı hesablayır
		System.out.println("Ayşənin simmetrik açarı: " + calculate(B, a, p));

		// Azər simmetrik açarı hesablayır
		System.out.println("Azərin simmetrik açarı: " + calculate(A, b, p));

	}

	public static int calculate(int x, int y, int p) {

		BigInteger a = new BigInteger(String.valueOf(x));
		BigInteger b = new BigInteger(String.valueOf(p));

		return a.pow(y).mod(b).intValue();
	}

}
