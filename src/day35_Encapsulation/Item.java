package day35_Encapsulation;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank() || name == null ) {
            System.err.println("Invalid Entry: " + name);
            System.exit(0);
        }

        String specialChar = ""; // to get all special chars other than space

        for (char each : name.toCharArray()){
            if (!Character.isLetterOrDigit(each) && each != ' '){ // getting all special character except for space
                specialChar += each;
            }
        }

        if (specialChar.length() > 0){ // if contains special characters others than space
            System.err.println("Invalid Entry: " + name);
            System.exit(0);
        }

        if (!Character.isLetter(name.charAt(0))){ // if name does not start with letter
            System.err.println("Invalid Entry: " + name);
            System.exit(0);
        }

        this.name = name;

    }


    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0 ){
            System.err.println("Invalid Entry: " + unitPrice);
            System.exit(0);
        }
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0 ){
            System.err.println("Invalid Entry: " + unitPrice);
            System.exit(0);
        }

        if(name.equalsIgnoreCase("toilet paper")){
            quantity = 1;
        }

        this.quantity = quantity;
    }

    public double calCost(){
        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice= €" + unitPrice +
                ", quantity=" + quantity +
                ", total cost= €" + calCost() +
                '}';
    }
}

/*
4. Item Task
		4.1create a class called Item
	            private variables:
	            	name, unitPrice, quantity
            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1
            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)
            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */