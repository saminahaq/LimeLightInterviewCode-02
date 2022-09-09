package MaxSubArraySum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {

		System.out.println("JDK 17 here...");

		List<Integer> arrList = List.of(-2, -3, 4, -1, -2, 1, 5, -3);
		System.out.println(displayList(arrList));
		System.out.println(getMaxSumList(arrList));

	}

	public static List<Integer> displayList(List<Integer> nums) {
		if (nums.size() == 0) {
			return Collections.emptyList();
		}

		final int maxSum = getMaxSumList(nums);
		int curSum = nums.get(0);

		int start = 0;
		int end = 0;

		for (int i = 1; i < nums.size(); i++) {
			if (curSum == maxSum) {
				end = i;
				break; // maximus sub-array was found
			}

			if (nums.get(i) > curSum + nums.get(i)) {
				start = i;
				curSum = nums.get(i);
			} else {
				curSum += nums.get(i);
			}
		}
		return new ArrayList<>(nums.subList(start, end));
	}

	// using Kadane's algorithm
	public static int getMaxSumList(List<Integer> nums) {
		int max = Integer.MIN_VALUE;
		int sum = nums.get(0);
		for (int i = 1; i < nums.size(); i++) {
			sum = Math.max(nums.get(i), sum + nums.get(i));
			max = Math.max(max, sum);
		}
		return max;
	}

}
