package domain.model;

public abstract class Entity<T> {

	T id;
	String name;
	
	public Entity(T id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Entity() {
		
	}
	
	public T getId() {
		return id;
	}
	public void setId(T id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
