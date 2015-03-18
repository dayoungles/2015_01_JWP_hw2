package basic;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class JodatimeTest {
	private Jodatime jd;
	
	@Before
	public void setup(){
		jd = new Jodatime();
	}
	@Test
	public void testJoda() {
		jd.setTime("1988-03-09");
		assertEquals(jd.getDay(), "Wednesday");
		
	}

}
