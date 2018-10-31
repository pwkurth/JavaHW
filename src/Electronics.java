//Electronics class

public class Electronics extends Item {
    private String model; //String model
    private int year; //Initialize variable year

    public void setModel(String value) {
        model = value;
    }

    public void setYear(int year) {
        //Considered an invalid input and ignored if year<0
        if (year >= 0)
            this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String formattedOutput() {
        return name + "," + model + "," + year;
    }

    //Electronics constructor with parameters
    Electronics(String n, double p, String md, int my) {
        super(n, p);
        setYear(my);
        model = md;
    }

    //Default constructor definition
    Electronics() {
        super();
        model = "";
        year = 0;
    }
}
