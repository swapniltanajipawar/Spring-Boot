package com.jspiders.springboot.dependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAOImpl implements PersonDAO
{
	@Autowired
	private Person person;

	@Override
	public void create(){
		System.out.println("Record inserted with details: "+person);
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person)
	{
		this.person = person;
	}
	
}
