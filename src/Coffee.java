/**
 * This class represents a cup of coffee
 */
public class Coffee extends Object {
    // fields or state ??
    private boolean isIced; // true or false
    private String flavor; // "caramel" "vanilla" "chocolate"
    private int size; // 8 oz 12 oz 16 oz


    // constructors what we need to construct a coffee object?

    public Coffee(String myFlavor) {
        isIced = false;
        flavor = myFlavor;
        size = 0;
    }

    public boolean isIced() {
        return isIced;
    }

    public String getFlavor() {
        return flavor;
    }

    public int getSize() {
        return size;
    }


    //setters
    public void setIced(boolean iced) {
        isIced = iced;
    }

    public void setFlavor(String flavor) {
        // instance variables ALWAYS go on left
        this.flavor = flavor;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
