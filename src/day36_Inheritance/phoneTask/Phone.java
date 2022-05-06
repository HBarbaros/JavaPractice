package day36_Inheritance.phoneTask;

public class Phone {

        public String brand, model, size, color;
        public double price;

        public void setInfo(String brand, String model, String size, String color, double price) {

            this.brand = brand;
            this.model = model;
            this.size = size;
            this.color = color;
            this.price = price;
        }

        public void call(long phoneNumber){
            System.out.println(model + " is calling " + phoneNumber);
        }

        public void text(long phoneNumber){
            System.out.println(model + " is texting " + phoneNumber);
        }

        public String toString() {
            return "PhoneTask{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", size='" + size + '\'' +
                    ", color='" + color + '\'' +
                    ", price=" + price +
                    '}';
        }

}
