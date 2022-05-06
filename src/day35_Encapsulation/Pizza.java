package day35_Encapsulation;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setSize(String size) {

        if (!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large"))){
            System.err.println("Invalid Entry: " + size);
            System.exit(0);
        }
        this.size = size;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {

        if (numberOfCheeseTopping < 0 || numberOfCheeseTopping > 5){
            System.err.println("Invalid Entry: " + numberOfCheeseTopping);
            System.exit(0);
        }

        if (size.equalsIgnoreCase("small") && numberOfCheeseTopping <= 3){
            numberOfCheeseTopping = numberOfCheeseTopping;
        }else if (size.equalsIgnoreCase("medium") && numberOfCheeseTopping <= 4){
            numberOfCheeseTopping = numberOfCheeseTopping;
        }else if (size.equalsIgnoreCase("large") && numberOfCheeseTopping <= 5){
            numberOfCheeseTopping = numberOfCheeseTopping;
        }

        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {

        if(numberOfPepperoniTopping < 0 || numberOfPepperoniTopping > 6){
            System.out.println("Invalid number of pepperoni topping: "+numberOfPepperoniTopping);
            System.exit(0);
        }

        if(size.equalsIgnoreCase("small") && numberOfPepperoniTopping <= 4){
            numberOfPepperoniTopping = numberOfPepperoniTopping;
        }else if(size.equalsIgnoreCase("medium") && numberOfPepperoniTopping <= 5){
            numberOfPepperoniTopping = numberOfPepperoniTopping;
        }else if(size.equalsIgnoreCase("medium") && numberOfPepperoniTopping <= 6){
            numberOfPepperoniTopping = numberOfPepperoniTopping;
        }

        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){

        double pizzaPrice = (size.equalsIgnoreCase("small")) ? 10 : (size.equalsIgnoreCase("medium"))? 12 : 14;
        double totalPrice = pizzaPrice + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", number of cheese topping=" + numberOfCheeseTopping +
                ", number of pepperoni topping=" + numberOfPepperoniTopping +
                ", total price=" + calcCost() +
                '}';
    }
}

/*
5. Pizza Task:
		5.1 Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping
				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive
							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5
							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:
										small: 4
										medium: 5
										large: 6
				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)
				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */