package spring.ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class scopeTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/ex01/beanScope-declare.xml");
		
		Dog d1 = (Dog)ctx.getBean("dog");
		Dog d2 = (Dog)ctx.getBean("dog");
		System.out.println("d1 : "+d1);
		System.out.println("d2 : "+d2);
		
		Zoo zoo = (Zoo)ctx.getBean("zoo");
		
		((ClassPathXmlApplicationContext)ctx).destroy();
	}
}
