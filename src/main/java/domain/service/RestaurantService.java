package domain.service;

import java.util.Collection;

import domain.model.Restaurant;
import domain.repository.RestaurantRepository;

public class RestaurantService extends BaseService<Restaurant, String>{

	private RestaurantRepository<Restaurant, String> restaurantRepository;
	
	public RestaurantService(RestaurantRepository<Restaurant, String> repository) {
	
		super(repository);
		this.restaurantRepository = repository;

	}
	
	@Override
	public Collection<Restaurant> getAll() {
	
		return super.getAll();
	}
	
	@Override
	public void add(Restaurant restaurant) throws Exception {
		if(restaurantRepository.containsName(restaurant.getName())) {
			throw new Exception("Resturant already exist");
		}
		
		if(restaurant.getName() == null || restaurant.getName().trim().length() == 0) {
			throw new Exception("Resturant name could not be null or empty");
		}
		
		super.add(restaurant);
	}

}
