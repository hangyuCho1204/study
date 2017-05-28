package spring.hw;

public class Dresser implements Furniture{
	@Override
	public void putIn() {
		// TODO Auto-generated method stub
		System.out.println("Dresser에 Dress를 putIn");
	}
	@Override
	public void putOut() {
		// TODO Auto-generated method stub
		System.out.println("Dresser에 Dress를 putOut");
	}
}
