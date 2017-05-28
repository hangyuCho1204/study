package spring.ex01;

public class Dog {
	
	String name;
	String food;
	Cat cat;
	
	public Dog(){};
	
	public Dog(String name){
		this.name = name;
	}
	
	public Dog(String name, String food) {
		// TODO Auto-generated method stub
		this.name =name;
		this.food =food;
	}
	
	
	
	public Dog(String name, String food, Cat cat) {
		this.name = name;
		this.food = food;
		this.cat = cat;
	}

	public void sleep(){
		System.out.println("������ ���� �ܴ�.");
	}
	
	public void eat(){
		System.out.println("��������"+food+"�� �Ծ��~");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	
}
