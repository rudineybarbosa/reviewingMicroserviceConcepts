package domain.model;

public abstract class BaseEntity<TypeOfId> extends Entity<TypeOfId> {
	
	private boolean isModified;

	public BaseEntity(TypeOfId id, String name) {
		super(id, name);
		
		this.isModified = false;
	}

	public BaseEntity() {
		
	}
	
	public boolean isModified() {
		return isModified;
	}

	public void setModified(boolean isModified) {
		this.isModified = isModified;
	}


}
