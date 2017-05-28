package spring.hw;

public interface Refrigerator extends HomeAppliances{

	@Override
	public void turnOff();
	@Override
	public void turnOn();
	abstract void open();
	abstract void close();
}
