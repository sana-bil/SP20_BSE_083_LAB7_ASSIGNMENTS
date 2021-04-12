public class Person {
    private String firstName;
    private String lastName;
    private Address ad;
    //CONSTRUCTORS
    public Person() {
    }
    public Person(String x, String y)
    {
        firstName=x;
        lastName=y;
    }
    //SETTERS
    public void setfirstName(String x)
    {
        firstName=x;
    }
    public void setlastName(String y)
    {
        lastName=y;
    }
    //GETTERS
    public String getfirstName()
    {
        return firstName;
    }
    public String getlastName()
    {
        return lastName;
    }
    //display method
    public void display(Address a1)
    {
        System.out.println("First Name:" +this.firstName+ "\nLast Name:" +this.lastName);
        String s1=String.format("Address is: \n%s%s",a1.gethome(),a1.getstreet(),a1.getcity());
    }
    //Check for city
    public boolean check(Address a1)
    {
        String a=a1.getcity();
        a=a.toLowerCase();
        if(a.equals("islamabad"))
            return true;

        else
        return false;
    }
}
