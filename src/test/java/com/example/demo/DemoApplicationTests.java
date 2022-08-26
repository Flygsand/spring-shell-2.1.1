package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.shell.Shell;

@SpringBootTest(properties = {
		"spring.shell.script.enabled=false",
		"spring.shell.interactive.enabled=false",
		"spring.main.allow-circular-references=true"
})
class DemoApplicationTests {

	@Autowired
	private Shell shell;

	@Test
	public void testHelloWorld() {
		assertEquals("Hello world!", shell.evaluate(() -> "hello-world"));
	}

}
