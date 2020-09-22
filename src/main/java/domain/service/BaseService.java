package domain.service;

import java.util.Collection;

import domain.repository.Repository;

public abstract class BaseService<TypeOfEntity, TypeOfId> extends ReadyOnlyBaseService<TypeOfEntity, TypeOfId> {

	private Repository<TypeOfEntity, TypeOfId> repository;
	
	public BaseService(Repository<TypeOfEntity, TypeOfId> repository) {
		super(repository);
		
		this.repository = repository;
	}
	
	public void add(TypeOfEntity entity) throws Exception {
		this.repository.add(entity);

	}
	
	public Collection<TypeOfEntity> getAll(){
		return this.repository.getAll();
	}
	
}
