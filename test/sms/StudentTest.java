/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sms;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 100442G
 */
public class StudentTest {

    public StudentTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAddress method, of class Student.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class Student.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Student.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegNumber method, of class Student.
     */
    @Test
    public void testGetRegNumber() {
        System.out.println("getRegNumber");
        Student instance = new Student();
        long expResult = 0L;
        long result = instance.getRegNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}