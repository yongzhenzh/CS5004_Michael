/******

Name: Yongzhen "Michael" Zhang

Assignment: Lab01: getting started

Date: 1.17.2024

Notes: the JUnit test class for the Book class

******/
package lab0;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;


/**
 * A JUnit test class for the Book class.
 */
public class BookTest {

  private Book book;
  private Person author;
  /**
   * create an instance from the Book class named book
   * create an instance from the Person class named author
   */
  @Before
  public void setUp() {
  /**
   * run before the test method, used as a setup method before testing
   */ 
	author = new Person("Adam","Smith", 1723);
    book = new Book("TheWealthofNations", author, 29.99f);
    
  }
  /**
   * creating a new instance of the Book class with the values "TheWealthofNations"
   * for the title, author for the author, and 29.99f for the price.
   * creating a new instance of the Person class with the values "Adam"
   * for the first name, "Smith" for the last name, and 1723 for the birth year.
   */ 
  @Test // testing the getter methods
  public void testTitle() {
    assertEquals("TheWealthofNations", book.getTitle());

  }

  @Test
  public void testPrice() {
    assertEquals(29.99f, book.getPrice(), 0.001f);
  }

  @Test
  public void testAuthor() {
    assertEquals(author, book.getAuthor());
  }
  
}
