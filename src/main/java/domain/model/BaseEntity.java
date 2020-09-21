package domain.model;

public abstract class BaseEntity<T> extends Entity<T> {
	
	private boolean isModified;

	public BaseEntity(T id, String name) {
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
