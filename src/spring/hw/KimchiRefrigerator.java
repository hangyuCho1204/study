package spring.hw;

public class KimchiRefrigerator implements Refrigerator{
	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("±èÄ¡³ÃÀå°í ´İÈû");
	}
	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("±èÄ¡³ÃÀå°í ¿­¸²");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("±èÄ¡³ÃÀå°í ²¨Áü");
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("±èÄ¡³ÃÀå°í ÄÑÁü");
	}
}
