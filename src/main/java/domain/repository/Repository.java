package domain.repository;

public interface Repository<TypeEntity, TypeId> extends ReadOnlyRepository<TypeEntity, TypeId> {
	
	void add(TypeEntity entity);
	
	void remove(TypeId id);
	
	void update(TypeEntity entity);

}
