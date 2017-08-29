package spring02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring02Test {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		
		Spring02 spr = ac.getBean(Spring02.class);
		
		spr.spring02();
	}

}
