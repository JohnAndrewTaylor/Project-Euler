/** Author: John Taylor
*   Title: PE57
*   Purpose: Finds the # of square root convergent fractions with the numerator
*       having more digits than the denominator up to 1000 iterations.
*   Date: 03/31/19
*/

import java.math.BigInteger;

public class PE57 {

	public static void main(String[] args) {
        //BigInteger is used because int and long were not sufficient
		BigInteger m = new BigInteger("3"); //initial numerator
		BigInteger n = new BigInteger("2"); //initial denominator
		BigInteger a = new BigInteger("1"); //numerator increment
		BigInteger b = new BigInteger("1"); //denominator increment
        //k is the currect iteration
		rec(m, n, a, b, 1, 0);
	}

	public static void rec(BigInteger m, BigInteger n, BigInteger a, BigInteger b, int k, int count) {
		if (k > 999) {
			System.out.println(count);
		} else {
			if (String.valueOf(m).length() > String.valueOf(n).length()) {
				count++;
			}
			m = m.add(m).add(a);
			n = n.add(n).add(b);
			BigInteger bOld = b;
			b = a.add(b);
			a = b.add(bOld);
			k++;
			rec(m, n, a, b, k, count);
		}
	}

}
