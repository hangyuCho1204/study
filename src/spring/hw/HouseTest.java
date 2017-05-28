package spring.hw;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HouseTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/hw/BeanDeclare.xml");
		House hou = (House)ctx.getBean("house");
		System.out.println("----------hou------------");
		System.out.println(hou.getAddress());
		System.out.println(hou.getPrice());
		System.out.println("-------------------------");
		
		House hou2 = (House)ctx.getBean("house2");
		System.out.println("----------hou2------------");
		System.out.println();
		System.out.println("--------------------------");

		House hou3 = (House)ctx.getBean("house3");
		System.out.println("----------hou3------------");
		System.out.println(hou3.getAddress());
		System.out.println(hou3.getPrice());
		
		List<Furniture> furns = (List<Furniture>)hou3.getFurniture();
		
		for(Furniture furn:furns){
			furn.putIn();
			furn.putOut();
		}
		
		List<HomeAppliances> homes = (List<HomeAppliances>)hou3.getHomeAppliances();
		for(HomeAppliances home:homes){
			home.turnOff();
			home.turnOn();
			
			if(home instanceof Refrigerator){
				Refrigerator ref = (Refrigerator)home;
				ref.open();
				ref.close();
			}
		}
		
	    Refrigerator ref = new KimchiRefrigerator();
	    ref.open();
	    ref.close();

	    HomeAppliances ho = new KimchiRefrigerator();
	    ho.turnOff();
	    ho.turnOn();
	    
	    Refrigerator r = (Refrigerator)ho;
	    r.open();
	    r.close();
	    
		//Refrigerator ref = hou3.getHomeAppliances();
		System.out.println("-------------------------");
	}
}