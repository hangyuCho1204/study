package spring.ex01;

public class Zoo {
	
	private Zoo(){
		
	}
	
	private static class ZooSingleton{
		static Zoo instance = new Zoo();
	}
	
	public static Zoo getInstance(){
		return ZooSingleton.instance;
	}
	
	public void clean(){
		System.out.println("청소해요~");
	}
	
	public void open(){
		System.out.println("동물원 개장");
	}
	
	public void close(){
		System.out.println("동물원 폐장");
	}
}
