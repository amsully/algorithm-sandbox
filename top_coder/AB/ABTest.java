package AB;
//Examples
//0)
//3
//2
//Returns: "ABB"
//This string has exactly two pairs (i, j) mentioned in the statement: (0, 1) and (0, 2).
//1)
//2
//0
//Returns: "BA"
//Please note that there are valid test cases with K = 0.
//2)
//5
//8
//Returns: ""
//Five characters is too short for this value of K.
//3)
//10
//12
//Returns: "BAABBABAAB"
import static org.junit.Assert.*;

import org.junit.Test;

public class ABTest {

	AB stringGenerator = new AB();
	
	@Test
	public void test32() {
				
		assertEquals("ABB", stringGenerator.createString(3, 2) );
		
	}
	@Test
	public void test20() {
				
		assertEquals("BA", stringGenerator.createString(2, 0) );
		
	}

	@Test
	public void test58() {
				
		assertEquals("", stringGenerator.createString(5, 8) );
		
	}
	@Test
	public void test1012() {
				
		assertEquals("BAABBABAAB", stringGenerator.createString(10, 12) );
		
	}

	
	@Test
	public void testStringCutTechnique()
	{
		String createdString = "AAAAA";
		int cut = createdString.length()/2;
		createdString = createdString.substring(0, cut)+'B'+createdString.substring(cut+1);		
		assertEquals("AABAA", createdString);
	}

}
