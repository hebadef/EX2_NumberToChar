package Exe_2_Score_To_Char.vers_2.Exe_2_Score_To_Char.vers_2;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	@Test
	public void exe_2_Partition_A_min() {
		
		String result = App.NumberToChar(90);
		String expected_result="A";
		org.junit.Assert.assertEquals(expected_result,result);
	}
	@Test
	public void exe_2_Partition_A_min_plus1() {
		
		String result = App.NumberToChar(91);
		String expected_result="A";
		org.junit.Assert.assertEquals(expected_result,result);
	}
	@Test
	public void exe_2_Partition_A_Nominal() {
		
		String result = App.NumberToChar(95);
		String expected_result="A";
		org.junit.Assert.assertEquals(expected_result,result);
	}
	@Test
	public void exe_2_Partition_A_max_min1() {
		
		String result = App.NumberToChar(99);
		String expected_result="A";
		org.junit.Assert.assertEquals(expected_result,result);
	}
	@Test
	public void exe_2_Partition_A_max() {
		
		String result = App.NumberToChar(100);
		String expected_result="A";
		org.junit.Assert.assertEquals(expected_result,result);
	}
	
	
	
	
}
