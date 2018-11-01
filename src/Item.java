//Class for item//

public class Item {

    //Protected variable
    protected String name; //Name of the item
    protected double price; //Price of the item

    public void setName(String n) {
        this.name = n; //sets the name of item
    }

    public void setPrice(double p) {

        if(p>0){
            price = p; //sets price to p if greater then 0
        }

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
        name = n;
        price = p;
    }

    //Default constructor
    Item(){
        name = "";
        price = 0;
    }

}
