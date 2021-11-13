package org.springframework.samples.petclinic.sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class TestControllerTest {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void testDI() {
		TestController bean = applicationContext.getBean(TestController.class);
		assertNotNull(bean);
	}
}
