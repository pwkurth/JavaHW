//Electronics class

public class Electronics extends Item {
    private String model; //String model
    private int year; //Initialize variable year

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        //Considered an invalid input and ignored if year<0
        if(year >=0)
            this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String formattedOutput()
    {
        return name + "," + model + "," + year;
    }
//Electronics constructor with parameters
    Electronics(String n, double p, String md, int my) {

        if (my < 0)

            year = 0;
    }
//Default constructor definition
     Electronics(){
        model = "";
        year = 0;

    }
}
