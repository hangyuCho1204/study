package spring.ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDeclareTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/ex01/bean-declare.xml");
		//1. ºó ¼±¾ð
		Dog d = (Dog)ctx.getBean("dog");
		
		d.sleep();
		
		Cat c = (Cat)ctx.getBean("cat");
		
		System.out.println(c.name);
		
		Dog d2 = (Dog)ctx.getBean("dog2");
		
		System.out.println(d2.getName());
		
		Dog d3 = (Dog)ctx.getBean("dog3");
		
		System.out.println(d3.getName());
		
		Dog d4 = (Dog)ctx.getBean("dog4");
		
		System.out.println(d4.getName()+d4.getFood()+d4.getCat().name);
		
		Zoo zoo = (Zoo)ctx.getBean("zoo");
		
		zoo.clean();
	}
}
