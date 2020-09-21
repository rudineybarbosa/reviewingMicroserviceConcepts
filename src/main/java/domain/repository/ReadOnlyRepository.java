package domain.repository;

import java.util.Collection;

/**
 * 
 * @author rudiney
 *
 * @param <TypeEntity> Entity type used by repository
 * @param <TypeOfId> Type of 'id' field
 */
public interface ReadOnlyRepository<TypeEntity, TypeOfId> {

	boolean contains(TypeOfId id);
	
	TypeEntity get(TypeOfId id);
	
	Collection<TypeEntity> getAll();
}
