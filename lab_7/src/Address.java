public class Address {
    private String home;
    private String street;
    private String city;
    //CONSTRUCTORS
    public Address()
    {
    }
    public Address(String a, String b,String c)
    {
        home=a;
        street=b;
        city=c;
    }
    //SETTERS
    public void sethome(String a)
    {
        home=a;
    }
    public void setstreet(String b)
    {
        street=b;
    }
    public void setcity(String c)
    {
        city=c;
    }
    //GETTERS
    public String gethome()
    {
        return home;
    }
    public String getstreet()
    {
        return street;
    }
    public String getcity()
    {
        return city;
    }
    //display method
    public void display(Address a1)
    {
        System.out.println("Address is:" + a1.gethome() + "-"
                +a1.getstreet() + "-" + a1.getcity());
    }
}

