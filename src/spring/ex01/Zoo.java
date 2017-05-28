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
		System.out.println("û���ؿ�~");
	}
	
	public void open(){
		System.out.println("������ ����");
	}
	
	public void close(){
		System.out.println("������ ����");
	}
}
