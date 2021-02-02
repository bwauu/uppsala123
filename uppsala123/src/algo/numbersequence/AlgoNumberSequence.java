package algo.numbersequence;

import algo.util.StopWatch;
/**
 * Invokes algorithms with different values to test efficiency.
 */
public class AlgoNumberSequence {
	/**
	 * Program entry point.
	 *
	 * @param args not used.
	 */
	public static void main(String[] args) {
		long[] n;		
		NumberSequence numberSequence = null;
		long time = 0;
		StopWatch stopWatch = new StopWatch();
		
		/*
		 * Testing NumberSequenceIterative
		 */
		numberSequence = new NumberSequenceIterative();
		n = new long[] {1000000000, 1250000000, 1500000000, 1750000000, 2000000000 };

		//warming up
		System.out.println("Warming up ...");
		numberSequence.calculate(n[1]);
		
		System.out.println("Testing NumberSequenceIterative");
		
		for(int i = 0; i < n.length; i ++) {
			stopWatch.start();
			numberSequence.calculate(n[i]);
			time = stopWatch.stop();
			System.out.println("Calculating " + n[i] + ":th number in sequence. Time: " + time);
		}
		
		/*
		 * Testing NumberSequenceRecursive
		 */
		numberSequence = new NumberSequenceRecursive();
		n = new long[] {40, 45, 50, 55, 60};
		
		System.out.println("Testing NumberSequenceRecursive");
		
		for(int i = 0; i < n.length; i ++) {
			stopWatch.start();
			numberSequence.calculate(n[i]);
			time = stopWatch.stop();
			System.out.println("Calculating " + n[i] + ":th number in sequence. Time: " + time);
		}
	}
}