package domain;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import domain.model.Restaurant;
import domain.model.Table;
import domain.service.RestaurantService;
import persistence.InMemoryRestaurantRepository;

public class ResturantMain {

	public static void main(String[] args) {

		try {

			RestaurantService resturantService = new RestaurantService(new InMemoryRestaurantRepository());

			List<Table> listTable = createTables("Table 1", "Table 2");
			Restaurant restaurant1 = new Restaurant("1", "Resturant 1", listTable);
			resturantService.add(restaurant1);

			listTable = createTables("Table 1", "Table 2", "Table 3", "Table 4", "Table 5");
			Restaurant restaurant2 = new Restaurant("2", "Resturant 2", listTable);
			resturantService.add(restaurant2);

			Restaurant restaurant3 = new Restaurant("3", "Resturant 3", null);
			resturantService.add(restaurant3);

			//Simulating exception Restaurant already exist
				//Restaurant restaurant4 = new Restaurant("3", "Resturant 3", null);
				//resturantService.add(restaurant4);
			
				
			Collection<Restaurant> resturantsList = resturantService.getAll();
			System.out.println("Resturant list: ");
			resturantsList.stream().forEach(restaurant -> {
				System.out.println(restaurant);
				});
			
		}catch(Exception e) {
			System.out.println("Error Message: " + e.getMessage());
		}

	}

	private static List<Table> createTables(String... tableNames){
		List<Table> listTable = new ArrayList<Table>();

		if(tableNames != null ) {
			for (int i = 0; i < tableNames.length; i++) {
				Table table = new Table(BigInteger.valueOf(i+1), tableNames[i], i+1);
				
				listTable.add(table);
			}
		}

		return listTable;

	}

}
