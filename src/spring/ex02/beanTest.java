package spring.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/ex02/bean-property.xml");
		
		
		//¹æ¹ý 1
		Department dept = (Department)ctx.getBean("department");
		
		System.out.println(dept.name);
		
		
		
		Employee emp = (Employee)ctx.getBean("employee");
		
		System.out.println(emp.name);
		/*System.out.println(emp.dept.name);*/
	}
	
	
	
}
