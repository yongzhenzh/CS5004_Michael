/******

Name: Yongzhen "Michael" Zhang

Assignment: Lab01: getting started

Date: 1.17.2024

Notes: the JUnit test class for the Person class

******/
package lab0;


import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;


/**
 * A JUnit test class for the Person class.
 */
public class PersonTest {

  private Person john;
  /**
   * create an instance from the Person class named john
   */
  @Before
  public void setUp() {
  /**
   * run before the test method, used as a setup method before testing
   */  
    john = new Person("John", "Doe", 1989);
  }
  /**
   * creating a new instance of the Person class with the values "John"
   * for the first name, "Doe" for the last name, and 1989 for the birth year.
   */ 
  @Test // testing the getter methods
  public void testFirst() {
    assertEquals("John", john.getFirstName());

  }

  @Test
  public void testSecond() {
    assertEquals("Doe", john.getLastName());
  }

  @Test
  public void testYearOfBirth() {
    assertEquals(1989, john.getYearOfBirth());
  }
  
}
