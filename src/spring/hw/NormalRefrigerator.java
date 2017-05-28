package spring.hw;

public class NormalRefrigerator implements Refrigerator{
	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("ÀÏ¹Ý³ÃÀå°í ´ÝÈû");
	}
	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("ÀÏ¹Ý³ÃÀå°í ¿­¸²");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("ÀÏ¹Ý³ÃÀå°í ²¨Áü");
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("ÀÏ¹Ý³ÃÀå°í ÄÑÁü");
	}
}
