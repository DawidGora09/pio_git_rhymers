package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	private final static int EMPTY_STACK_VALUE = -1;
	private final static int STACK_CAPACITY = 12;

	@Test
	public void testCountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		int testValue = 4;
		rhymer.countIn(testValue);

		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertTrue(result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertFalse(result);
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertFalse(result);
			rhymer.countIn(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertTrue(result);
	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

		int result = rhymer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void TestFIFORhymer() {
		FIFORhymer fifoRhymer = new FIFORhymer();

		int result = fifoRhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int[] testValues = {1,2,3,4};
		fifoRhymer.countIn(testValues[0]);
		fifoRhymer.countIn(testValues[1]);
		fifoRhymer.countIn(testValues[2]);
		fifoRhymer.countIn(testValues[3]);

		result = fifoRhymer.countOut();
		Assert.assertEquals(result, testValues[0]);

		fifoRhymer.countOut();
		fifoRhymer.countOut();

		result = fifoRhymer.countOut();
		Assert.assertEquals(result, testValues[3]);

		result = fifoRhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void TestHanoiRhymer() {
		HanoiRhymer hanoiRhymer = new HanoiRhymer();

		int result = hanoiRhymer.countOut();
		Assert.assertEquals(result, EMPTY_STACK_VALUE);

		int[] testValues = {5,2,3};
		hanoiRhymer.countIn(testValues[0]);
		hanoiRhymer.countIn(testValues[1]);
		hanoiRhymer.countIn(testValues[2]);

		result = hanoiRhymer.reportRejected();
		Assert.assertEquals(result, 1);

		hanoiRhymer.countOut();

		result = hanoiRhymer.countOut();
		Assert.assertEquals(result, testValues[0]);

		result = hanoiRhymer.countOut();
		Assert.assertEquals(result, EMPTY_STACK_VALUE);
	}

	@Test
	public void testIntLinkedList() {
		IntLinkedList intLinkedList = new IntLinkedList();

		Assert.assertTrue(intLinkedList.isEmpty());
		Assert.assertFalse(intLinkedList.isFull());
		Assert.assertEquals(intLinkedList.top(), EMPTY_STACK_VALUE);

		int testValue = 1;
		intLinkedList.push(testValue);
		Assert.assertEquals(intLinkedList.top(), testValue);

		Assert.assertEquals(intLinkedList.pop(), testValue);
		Assert.assertEquals(intLinkedList.top(), EMPTY_STACK_VALUE);

		Assert.assertTrue(intLinkedList.isEmpty());
	}

}
