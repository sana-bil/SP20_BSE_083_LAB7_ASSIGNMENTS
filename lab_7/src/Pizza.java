public class Pizza {
    private String sz;
    private int NcheeseToppings;
    private int NpepperoniToppings;
    private int NhamToppings;
    public Pizza()
    {
        sz = null;
        NcheeseToppings = 0;
        NpepperoniToppings = 0;
        NhamToppings = 0;
    }
    public Pizza(String s, int c, int p, int h)
    {
        sz = s;
        NcheeseToppings = c;
        NpepperoniToppings = p;
            NhamToppings = h;
    }
    public Pizza(Pizza s)
    {
        this.sz = s.sz;
        this.NcheeseToppings = s.NcheeseToppings;
        this.NpepperoniToppings = s.NpepperoniToppings;
        this.NhamToppings = s.NhamToppings;
    }
    public void setSize(String s)
    {
        sz = s;
    }
    public void setCheeseTopping(int c)
    {
        NcheeseToppings = c;
    }
    public void setPepperoniTopping(int p)
    {
        NpepperoniToppings = p;
    }
    public void setHamTopping(int h)
    {
        NhamToppings = h;
    }
    public String getSize()
    {
        return sz;
    }
    public int getCheeseTopping()
    {
        return NcheeseToppings;
    }
    public int getPepperoniTopping()
    {
        return NpepperoniToppings;
    }
    public int getHamTopping()
    {
        return NhamToppings;
    }
    public double calCost()
    {
        double size;
        if (getSize() == "small") {
            size = 10;
        }
        else if (getSize() == "medium") {
            size = 12;
        }
        else if (getSize() == "large"){
            size = 14;
        }
        else {
            size = 0;
        }
        double toppings = getCheeseTopping() + getPepperoniTopping() +
                getHamTopping();
        return size + 2*(toppings);
    }
    public String getDescription()
    {
        return getSize() +" : "+ String.valueOf(getCheeseTopping()) + " Cheese Toppings, "+ String.valueOf(getPepperoniTopping())+" Pepperoni Toppings, "+String.valueOf(getHamTopping())+
                " Ham Toppings";
    }
}
