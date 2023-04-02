package Lab7_sub;

import static org.junit.Assert.*;

import org.junit.Test;

public class DimSumTester {

	@Test
	public void checkorderinput() {
		DimSumOrdering ordering1 = new DimSumOrdering();
		int[] input1 = new int[]{1,2,3,4}; 
		int[] expect1 = {1,2,3,4};
		int[] actual1 = ordering1.start(input1);
		assertArrayEquals(expect1, actual1);
	}

	@Test
	public void checktotalbill() {
		DimSumOrdering ordering2 = new DimSumOrdering();
		int[] input2 = new int[]{1,2,3,4}; 
		float expectpay = 291;
		float actualpay = ordering2.showBill(input2);
		float delta = 0.001f;
		assertEquals(expectpay, actualpay, delta);
	}
	
	
}