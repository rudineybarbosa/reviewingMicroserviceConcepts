package domain.model;

public abstract class Entity<TypeOfId> {

	TypeOfId id;
	String name;
	
	public Entity(TypeOfId id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Entity() {
		
	}
	
	public TypeOfId getId() {
		return id;
	}
	public void setId(TypeOfId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
