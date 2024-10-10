package com.workshops.tests;

import org.junit.*;
import static org.junit.Assert.*;
import com.workshops.Cat;

public class CatTest {
	Cat c;

	@Before
	public void setUp() {
		c = new Cat();
	}

	@Test
	public void testCatSetName() {
		String name = "Whiskers";
		c.setName(name);
		assertEquals(name, c.getName());
	}

	@Test
	public void testCatSetAgeInt() {
		int age = 12;
		c.setAge(age);
		assertEquals(age, c.getAge());
	}

	@Test
	public void testCatSetAgeNegative() {
		c.setAge(-5);
		assertEquals(0, c.getAge());
	}

	@Test
	public void testCatIsAdult() {
		c.setAge(12);
		assertTrue(c.isAdult());
	}

	@Test
	public void testCatIsNotAdult() {
		c.setAge(0);
		assertFalse(c.isAdult());
	}
}
