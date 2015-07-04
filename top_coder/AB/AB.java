package AB;
//Problem Statement
//You are given two s: N and K. Lun the dog is interested in strings that satisfy the following conditions:
//
//The string has exactly N characters, each of which is either 'A' or 'B'.
//The string s has exactly K pairs (i, j) (0 <= i < j <= N-1) such that s[i] = 'A' and s[j] = 'B'.
//If there exists a string that satisfies the conditions, find and return any such string. Otherwise, return an empty string.
//
//Definition
//Class: AB
//Method: createString
//Parameters: int, int
//Returns: String
//Method signature: String createString(int N, int K)
//(be sure your method is public)
//Limits
//Time limit (s): 2.000
//Memory limit (MB): 256
//Constraints
//- N will be between 2 and 50, inclusive.
//- K will be between 0 and N(N-1)/2, inclusive.

//Please note that this is an example of a solution; other valid solutions will also be accepted.
//This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
public class AB {
	
	public String createString(int N, int K)
	{
		String createdString = "";
		for(int i = 0; i < N; i++)
		{
			createdString = createdString + "A";
		}
		
		return	createStringHelper(createdString, K);
		
	}
	
	private int calculateNumberOfPairs( String createdString )
	{
		
		int BCount = 0;
		int KCount = 0;
		for(int i = createdString.length()-1; i >= 0; i-- )
		{
			if( createdString.charAt(i) == 'B')
			{
				BCount++;
			}
			else
			{
				KCount = KCount + BCount;
			}
			
		}
		return KCount;
	}
	
	private String createStringHelper(String createdString, int K)
	{
		for( int h = createdString.length()-1; h >=0; h-- )
		{

			for( int i = h; i >=0; i-- )
			{    
				String originalString = createdString;
				createdString = createdString.substring(0, i)+'B'+createdString.substring(i+1);
				
				int pairs = calculateNumberOfPairs(createdString);
				
				if(K == pairs)
				{
					System.out.println(createdString);
					return createdString;
				}else if( K < pairs )
				{
					createdString = originalString;
				}
				
			}
		}
		
		return "";
	}
	
}
