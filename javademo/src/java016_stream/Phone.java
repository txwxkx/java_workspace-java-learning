package java016_stream;

import java.io.Serializable;

public class Phone implements Serializable {
	String name;
	transient int price;
	
	public Phone() {
		
	}

	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%s %d", name, price);
	}
	
	
	
	
	
}//end class
