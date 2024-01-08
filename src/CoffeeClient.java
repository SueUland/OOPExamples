public class CoffeeClient {
    public static void main(String[] args) {
        // construct a Coffee object ??
        Coffee myCoffee = new Coffee("caramel"); // default constructor
        System.out.println("Size: " + myCoffee.getSize());

        System.out.println("Flavor: " + myCoffee.getFlavor());
        myCoffee.setFlavor("chocolate");
        System.out.println("After Set Flavor: " + myCoffee.getFlavor());

        System.out.println("isIced: " + myCoffee.isIced());

        Object smallCoffee = new Coffee("vanilla");
        // smallCoffee cannot call any of my getters or setters in Coffee class
        // it is constrained by the methods available to the Object class
        System.out.println(smallCoffee.toString());
    }
}
