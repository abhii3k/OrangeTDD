package Data;

import org.testng.annotations.DataProvider;

public class Data {

	
	@DataProvider()
	public Object[][] d1(){
		
		Object[][] ms= {{"Admin","admin123"},{"Wrong","Wrong1234"}};
	    return ms;
	}
	
}
