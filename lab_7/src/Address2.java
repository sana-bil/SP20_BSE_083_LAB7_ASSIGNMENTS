public class Address2 {
    private int home;
    private int street;
    private String city;
    //CONSTRUCTORS
    public Address2()
    {
    }
    public Address2(int a, int b,String c)
    {
        home=a;
        street=b;
        city=c;
    }
    //SETTERS
    public void sethome(int a)
    {
        home=a;
    }
    public void setstreet(int b)
    {
        street=b;
    }
    public void setcity(String c)
    {
        city=c;
    }
    //GETTERS
    public int gethome()
    {
        return home;

    }
    public int getstreet()
    {
        return street;
    }
    public String getcity()
    {
        return city;
    }
    //display method
    public void display(Address2 a1)
    {
        System.out.println("\nAddress of author : House#" + a1.gethome() + "- Street#" +a1.getstreet() + "- " + a1.getcity());
    }

}
