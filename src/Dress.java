public class Dress extends Item {
    //Set up private attributes
    private String size;
    private String fabric;

    public Dress() {
        size = "";
        fabric = "";

    }

    public void setFabric(String f){

        fabric = f;

    }

    public void setSize(String s){

        size = s;
    }

    public String getSize()
    {
        return size;
    }

    public String getFabric(){

        return fabric;
    }

    public Dress(String n, double p, String s, String f){

        super(n, p);
        setSize(s);
        setFabric(f);
    }

    public String formattedOutput()
    {
        return name + "," + price + "," + size + "," + fabric;
    }

}
