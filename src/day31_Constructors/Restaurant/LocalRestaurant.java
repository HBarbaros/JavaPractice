package day31_Constructors.Restaurant;

public class LocalRestaurant {

    public static void main(String[] args) {

        Server[] servers = {
                new Server("Yasin", 2904, 15, false),
                new Server("Sabryne", 2805, 10, false),
                new Server("Karim", 2706, 12, false),
                new Server("Aysel", 2607, 20, true),
                new Server("Kamal", 2508, 23, true),
        };

        Chef[] chefs = {
                new Chef("Selim", 9828, 50,true),
                new Chef("Halim", 2308, 35, true),
                new Chef("Habib", 2204, 26, false),
                new Chef("Bojan", 2101, 27, true),
        };

        Restaurant restaurant = new Restaurant("Ali", "Gothenburg", 4);
        restaurant.hireServers(servers);
        restaurant.hireChefs(chefs);

        System.out.println(restaurant);

    }

}

/*
6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object
	            - Print your whole restaurants information
 */