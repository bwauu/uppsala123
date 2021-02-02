package algo.numbersequence;
/**
 * Calculate numbers in the number sequence starting with { 0, 1, 2 }
 * where additional numbers are calculated using the formula:
 * n = (n - 1) + (n - 3) resulting in the sequence
 * { 0, 1, 2, 2, 3, 5, 7, 10, 15, 22, 32, 47, 69, 101 } etc.
 * using a recursive algorithm.
 */
public class NumberSequenceRecursive implements NumberSequence {

	@Override
	public long calculate(long n) {
		// TODO Implement a recursive solution.
		if (n <= 1) {
			return n;
		}
		return calculate(n-1) + calculate(n-2);
	}
}