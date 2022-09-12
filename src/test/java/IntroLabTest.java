/*
 * This file contains JUnit test cases for IntroLab.java
 *
 * Complete the TODO in this file!
 */

import org.junit.*;

import static org.junit.Assert.*;

public class IntroLabTest {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 10)
    public void testExampleStudent() {
        String expected = "Hello! My name is Stu Dent! " +
                "I like cats more than dogs! Welcome to CSC207!";
        String actual = IntroLab.exampleStudent();
        assertEquals(expected, actual);
    }

    @Test(timeout = 100)
    public void testDonne121() {
        String expected = "Hello! My name is Harvey Donnelly! " + "I like cats more than dogs! Reject Java. Return to Basic.";
        String actual = IntroLab.donne121();
        assertEquals(expected, actual);
    }
}
