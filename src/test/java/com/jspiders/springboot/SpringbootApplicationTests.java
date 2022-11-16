package com.jspiders.springboot;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import com.jspiders.springboot.dependency.PersonDAOImpl;

@SpringBootTest
class SpringbootApplicationTests 
{
	@Autowired
	ApplicationContext context;

	@Test
	void testPerson()
	{
		PersonDAOImpl personDAOImpl = context.getBean(PersonDAOImpl.class);
		personDAOImpl.create();
	}

}
