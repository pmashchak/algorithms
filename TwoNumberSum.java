// Method to calculate if there is a given sum in any of the combination of elements
// Space and time complexity O(n)

import java.util.*;

class Program {
  public static int[] getNumberSum(int[] array, int targetSum) {
		// Pick data structure to store uniq elements from array
		HashSet<Integer> intermediateSum = new HashSet<Integer>();

		// we assume the resulting array is empty
    int[] sumResult = {};
		// making 1 iteration over target array
		for (int i = 0; i < array.length; i++) {
			int pointer = array[i];
			int diff = targetSum - pointer;
			// check if we already traversed over diff element
			if (intermediateSum.contains(diff)) {
				// the beauty of Java, no dynamic arrays
				sumResult = Arrays.copyOf(sumResult, sumResult.length + 2);
				sumResult[sumResult.length - 1] = pointer;
				sumResult[sumResult.length - 2] = diff;
			}
		  // add traversed element to uniq data structure
			intermediateSum.add(pointer);
		}

		return sumResult;
  }
}
