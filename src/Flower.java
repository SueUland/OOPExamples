public class Flower {
    private String type;
    private boolean fed;
    private boolean watered;

    public Flower(String flowerType) {
        this.type = flowerType;
        fed = false;
        watered = false;
    }

    public void feed(String food){
        System.out.println("You feed the plant " + food);
        fed = true;
    }

    public void water(){
        System.out.println("You water the plant");
        watered = true;
    }

    public boolean isItWilting(){
        return fed == false && watered == false;
    }
}
