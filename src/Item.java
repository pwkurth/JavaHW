//Class for item//

public class Item {

    //Protected variable
    protected String name; //Name of the item
    protected double price; //Price of the item

    public void setName(String n) {
        this.name = name; //sets the name of item
    }

    public void setPrice(double p) {
        this.price = price; //sets the price of item
    }

    public String getName() {
        return name; //retrieves name
    }

    public double getPrice() {
        return price; //retrieves price
    }

    public String formattedOutput(){

       return name + "," + price;

    }
    //Constructor to set name and price to new variables
    Item(String n, double p){
        this.name = n;
        this.price = p;
    }

    //Default constructor
    Item(){
        this.name = "";
        this.price = 0;
    }


}