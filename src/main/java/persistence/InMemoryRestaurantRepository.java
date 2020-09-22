package persistence;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import domain.model.Restaurant;
import domain.repository.RestaurantRepository;

public class InMemoryRestaurantRepository implements RestaurantRepository<Restaurant, String>{

	Map<String, Restaurant> repository;
	
	public InMemoryRestaurantRepository() {
		this.repository = new HashMap<String, Restaurant>();
	}
	
	
	public void add(Restaurant entity) {
		
		this.repository.put(entity.getName(), entity);
	}

	public void remove(String id) {
		if(this.repository.containsKey(id)){
			this.repository.remove(id);
		}
	}

	public void update(Restaurant entity) {
		if(this.repository.containsKey(entity.getName())) {
			this.repository.put(entity.getName(), entity);
		}
		
	}

	public boolean contains(String id) {

		throw new UnsupportedOperationException("Not implemented here. HashMap already have this method.");
	}

	public Restaurant get(String id) {
	
		throw new UnsupportedOperationException("Not implemented here. HashMap already have this method.");
	}

	public Collection<Restaurant> getAll() {

		return this.repository.values();
	}

	public boolean containsName(String name) {
		return this.repository.containsKey(name);
	}
	

}
