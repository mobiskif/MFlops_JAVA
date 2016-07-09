package test;

import static org.junit.Assert.*;
import org.junit.Test;

import mvc.Controller;
import mvc.Model;
import mvc.View;

public class ModelTest {
	@Test
	public void testAddThread() {
		assertTrue( new View(new Model(new Controller())).model.addThread() == "Success: addThread() " );
	}

	@Test
	public void testStopAll() {
		assertTrue(new Model(new Controller()).stopAll() == "Error: addThread() ");
	}

	@Test
	public void testRun() {
		//f>0
		//assertTrue(new Model(new Controller()).stopAll() == "Error: addThread() ");
	}
}
