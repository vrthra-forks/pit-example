package com.theladders;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonFactoryTest
{

  @Test
  public void test()
  {
    Person person = new PersonFactory().createPerson();
    String firstName = person.getFirstName();
    String lastName = person.getLastName();
    assertEquals("First", firstName);
    // forgot test for last name
  }
}
