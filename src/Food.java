public class Food extends Item {
    //Set private variables for Food
    private double weight;
    private String weightUnit;

    public void setWeightUnit(String wu){

        this.weightUnit = wu;
    }
    public void setWeight(double value) {
        if (value > 0) {
            weight = value;

        }

    }
    public String getWeightUnit(){

        return weightUnit;
    }

    public double getWeight(){

        return weight;
    }

    public String formattedOutput()
    {
        return name + "," + price + "," + weight + "," + weightUnit;
    }

    public Food(String n, double p, double w, String wu){

        super(n, p);
        setWeight(w);
        setWeightUnit(wu);


    }
    public Food(){

        weight = 0.0;
        weightUnit = "";
    }


}
