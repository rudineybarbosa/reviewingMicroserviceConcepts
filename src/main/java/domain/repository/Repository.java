package domain.repository;

public interface Repository<TypeOfEntity, TypeOfId> extends ReadOnlyRepository<TypeOfEntity, TypeOfId> {
	
	void add(TypeOfEntity entity);
	
	void remove(TypeOfId id);
	
	void update(TypeOfEntity entity);

}
