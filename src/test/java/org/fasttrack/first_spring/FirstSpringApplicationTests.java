package org.fasttrack.first_spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstSpringApplicationTests {

	@Autowired
	private Train train;

	@Test
	void contextLoads() {
		Assertions.assertEquals(100, train.getEngine().getHorsePower());
		train.doSomething();
	}

}
