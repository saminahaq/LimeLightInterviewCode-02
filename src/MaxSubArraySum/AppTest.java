package MaxSubArraySum;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class AppTest {

	private AppTest testApp;

	App a = new App();
	List<Integer> list1 = Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4);
	List<Integer> list2 = Arrays.asList(-2, -3, 4, -1, -2, 1, 5, -3);
	List<Integer> list3 = Arrays.asList(1, 5, 0, 1, 2, 2, 0, 3);

	@Before
	public void setup() {
		testApp = new AppTest();
	}

	@Test
	public void testList1() {
		int maxSum = a.getMaxSumList(list1);
		int maxSumExpected = 6;
		Assert.assertEquals(maxSumExpected, maxSum);
	}

	@Test
	public void testList2() {
		int maxSum = a.getMaxSumList(list2);
		int expectedSum = 7;
		Assert.assertEquals(expectedSum, maxSum);
	}

	@Test
	public void testList3() {
		int maxSum = a.getMaxSumList(list3);
		int expectedSum = 14;
		Assert.assertEquals(expectedSum, maxSum);
	}
	
	@Test
	public void testList3NotEqual() {
		int maxSum = a.getMaxSumList(list3);
		int expectedSum = 104;
		Assert.assertNotEquals(expectedSum, maxSum);
	}
}
