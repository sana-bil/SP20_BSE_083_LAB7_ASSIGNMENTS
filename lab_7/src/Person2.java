public class Person2 {
    private String firstName;
    private String lastName;
    private Address2 ad;
    //CONSTRUCTORS
    public Person2() {
    }
    public Person2(String x, String y,Address2 z)
    {
        firstName=x;
        lastName=y;
        ad=z;
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
    public void setAddress(Address2 z)
    {
        ad=z;
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
    public Address2 getAddress()
    {
        return ad;
    }
//display method

    public void display(Address2 a1)
    {
        System.out.println("AUTHOR NAME :" + this.firstName + " " +
                this.lastName);
        String s1=String.format("Address :\n%s%s",a1.gethome(),a1.getstreet(),a1.getcity());
    }
    //Check for city
    public boolean check(Address2 a1)
    {
        int a=a1.getstreet();
        if(a<10&&a>0)
            return true;
        else
            return false;
    }

}
