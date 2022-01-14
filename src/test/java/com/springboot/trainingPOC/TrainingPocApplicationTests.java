package com.springboot.trainingPOC;

import com.springboot.trainingPOC.controller.FileManagerController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TrainingPocApplicationTests {

	@Autowired
	private FileManagerController fileManagerController;
	@Test
	void contextLoads() {
		Assertions.assertNotNull(fileManagerController);
	}

}
