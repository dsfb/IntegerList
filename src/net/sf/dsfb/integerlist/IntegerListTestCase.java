package net.sf.dsfb.integerlist;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.model.Statement;

import static org.junit.Assert.assertEquals;

import java.util.*;

public class IntegerListTestCase {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(0);
		lista.add(-1);
		lista.add(2);
		ListMain lm = new ListMain();
		int actual = lm.getMax(lista);
		int expected = 2;
		assertEquals(actual, expected);
	}
	
	@Test(expected = RuntimeException.class)
	public void testNull() {
		List<Integer> lista = null;
		ListMain lm = new ListMain();
		lm.getMax(lista);
	}	
}
