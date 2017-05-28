package spring.hw;

import java.util.Collection;

public class House {
	private int price = 1000;
	private String address = "¿ï»ê";
	private Collection<Furniture> furniture;
	private Collection<HomeAppliances> HomeAppliances;
	
	House(){};
	
	House(String address){};
	
	void buy(){
		
	}
	void sell(){
		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Collection<Furniture> getFurniture() {
		return furniture;
	}

	public void setFurniture(Collection<Furniture> furniture) {
		this.furniture = furniture;
	}

	public Collection<HomeAppliances> getHomeAppliances() {
		return HomeAppliances;
	}

	public void setHomeAppliances(Collection<HomeAppliances> homeAppliances) {
		HomeAppliances = homeAppliances;
	}
	
	
}
