package Exe_2_Score_To_Char.vers_2.Exe_2_Score_To_Char.vers_2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	@Test
	public void exe_2_Partition_C_min() {
		
		String result = App.NumberToChar(50);
		String expected_result="C";
		org.junit.Assert.assertEquals(expected_result,result,0.00001);
	}
	@Test
	public void exe_2_Partition_C_min_plus1() {
		
		String result = App.NumberToChar(51);
		String expected_result="C";
		org.junit.Assert.assertEquals(expected_result,result,0.00001);
	}
	
}
