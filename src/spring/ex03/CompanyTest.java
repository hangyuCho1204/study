package spring.ex03;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyTest {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/ex03/bean-collection.xml");
		Company com = (Company)ctx.getBean("company");
		
		Collection<Department> teams = com.getDepartment();
		
		
		for (Department team : teams) {
			team.work();
		}
		
		Company com2 = (Company)ctx.getBean("company2");
		Map<String, Department> depts = com2.getDept();
		/*for (Map.Entry<String, Department> key : depts.entrySet()) {
			System.out.println(key.getKey());
		}*/
		
		Set<Entry<String, Department>> sets = depts.entrySet();
		
		for (Entry<String, Department> entry : sets) {
			System.out.print(entry.getKey()+" ");
			entry.getValue().work();
		}
		
		for (Map.Entry<String, Department> key : depts.entrySet()){
			System.out.print(key.getKey()+" ");
			key.getValue().work();
		}
		
		Company com3 = (Company)ctx.getBean("company3");
		
		Properties props = com3.getD();
		
		Set<Entry<Object, Object>> prop = props.entrySet();
		
		for (Entry<Object, Object> key:prop) {
			System.out.println(key.getKey());
			System.out.println(key.getValue());
		}
		
		Set<String> ss = com3.getD().stringPropertyNames();
		
		for(String key:ss){
			System.out.println(key);
		}
	}
}
