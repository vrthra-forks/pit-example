package com.theladders;

public class PersonFactory
{
  public Person createPerson()
  {
    Person person = new Person();
    person.setFirstName("First");
    person.setLastName("Last");
    return person;
  }
}
