package basic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GuavaTest {
	private Guava guava;
	@Before
	public void setup() {
		guava = new Guava();
	}
	@Test
	public void testGuavaMap() {
		assertEquals(guava.checkMap("day", 11), 11);
	}
	
	@Test
	public void testGuqvaList(){
		Guava guava = new Guava();
		guava.addItemList("dayoung");
		assertEquals(guava.checkList("dayoung"), true);
	}
	
	@Test
	public void testGuavaSet(){
		guava.addItemToSet("dkdlrh");
		assertEquals(guava.checkSet("dkdlrh"),true);
	}
}
