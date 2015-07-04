package ANDEquation;

import static org.junit.Assert.*;

import org.junit.Test;

public class ANDEquationTest {

	
	ANDEquation andEquation = new ANDEquation();
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

//	Examples
//	0)
//	{1, 3, 5}
//	Returns: 1
//	5 AND 3 = 1
	@Test
	public void test0() {
		int[] input = {1,3,5};
		assertEquals(1, andEquation.restoreY( input ) );
	}
	
//	1)
//	{31, 7}
//	Returns: -1
//	Clearly, no AND-equation is possible in this case.
	@Test
	public void test1() {
		int[] input = {31,7};
		assertEquals(-1, andEquation.restoreY( input ) );
	}
	
//	2)
//	{31, 7, 7}
//	Returns: 7
//	7 AND 31 = 7
//	Note that duplicate elements are possible in the input. If an element appears several times in A,
//	it must be used the same number of times in the equation.
	@Test
	public void test2() {
		int[] input = {31,7};
		assertEquals(-1, andEquation.restoreY( input ) );
	}
	
	
//	3)
//	{1,0,0,1,0,1,0,1,0,0,0,0,0,0,0,1,0,0, 0,0,0,0,0,0,1,0,1,0,1,1,0,0,0,1}
//	Returns: 0
//	Zeros are possible in the input.
	@Test
	public void test3() {
		int[] input = {1,0,0,1,0,1,0,1,0,0,0,0,0,0,0,1,0,0, 0,0,0,0,0,0,1,0,1,0,1,1,0,0,0,1};
		assertEquals(0, andEquation.restoreY( input ) );
	}
	
//	4)
//	{191411,256951,191411,191411,191411,256951,195507,191411,192435,191411, 191411,195511,191419,191411,256947,
//	191415,191475,195579,191415,191411, 191483,191411,191419,191475,256947,191411,191411,191411,191419,256947, 
//	191411,191411,191411}
//	Returns: 191411
	@Test
	public void test4() {
		int[] input = 	{191411,256951,191411,191411,191411,256951,195507,191411,192435,191411, 191411,195511,191419,191411,256947,
				191415,191475,195579,191415,191411, 191483,191411,191419,191475,256947,191411,191411,191411,191419,256947, 
				191411,191411,191411};
		assertEquals(191411, andEquation.restoreY( input ) );
	}
		
//	5)
//	{1362,1066,1659,2010,1912,1720,1851,1593,1799,1805,1139,1493,1141,1163,1211}
//	Returns: -1
	@Test
	public void test5() {
		int[] input = 	{1362,1066,1659,2010,1912,1720,1851,1593,1799,1805,1139,1493,1141,1163,1211};
		assertEquals(-1, andEquation.restoreY( input ) );
	}	
	
//	6)
//	{2, 3, 7, 19}
//	Returns: -1
	@Test
	public void test6() {
		int[] input = 	{2, 3, 7, 19};
		assertEquals(-1, andEquation.restoreY( input ) );
	}	
}
