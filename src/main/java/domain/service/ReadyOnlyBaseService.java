package domain.service;

import domain.repository.ReadOnlyRepository;
import domain.repository.Repository;

public class ReadyOnlyBaseService<TypeOfEntity, TypeOfId> {

	private ReadOnlyRepository<TypeOfEntity, TypeOfId> repository;
	
	public ReadyOnlyBaseService(Repository<TypeOfEntity, TypeOfId>
	 repository){
		
		this.repository = repository;
	}
	
}
