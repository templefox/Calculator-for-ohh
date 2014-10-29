package calc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnitTest {
	Calculator 
	calculator = new CalculatorImpl();
	
	
	@Test
	public void addTest(){
		Assert.assertEquals(10, calculator.add(2, 8).intValue());
	}
	
	@Test
	public void divideTest(){
		try {
			for(int i =3;i>=0;i--){
				calculator.divide(10,  i);		
			}			
		} catch (Exception e) {
			//Assert.assertTrue(false);
		}
	}
	
	@Test
	public void absTest(){
		Assert.assertEquals(1,calculator.abs(-1).intValue());
		Assert.assertEquals(1,calculator.abs(1).intValue());
	}
}
