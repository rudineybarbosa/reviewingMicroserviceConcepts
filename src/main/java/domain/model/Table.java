package domain.model;

import java.math.BigInteger;

public class Table extends BaseEntity<BigInteger>{
	
	private int capacity;
	
	public Table(BigInteger id, String name, int capacity) {
		super(id, name);
		this.capacity = capacity;
	}
	
	public Table() {
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
        
		return new StringBuilder("{id: ").append(id).append(", name: ")
                .append(name).append(", capacity: ").append(capacity).append("}").toString();
		
	}

	
}
