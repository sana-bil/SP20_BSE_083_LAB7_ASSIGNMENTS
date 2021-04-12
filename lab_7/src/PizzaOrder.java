public class PizzaOrder {
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;

    public PizzaOrder() {
        pizza1 = new Pizza();
        pizza2 = new Pizza();
        pizza3 = new Pizza();
    }

    public PizzaOrder(Pizza p1) {
        pizza1 = new Pizza(p1);
        pizza2 = new Pizza();
        pizza3 = new Pizza();
    }


    public PizzaOrder(Pizza p1, Pizza p2) {
        pizza1 = new Pizza(p1);
        pizza2 = new Pizza(p2);
        pizza3 = new Pizza();
    }

    public PizzaOrder(Pizza p1, Pizza p2, Pizza p3) {
        pizza1 = new Pizza(p1);
        pizza2 = new Pizza(p2);
        pizza3 = new Pizza(p3);
    }

    public PizzaOrder(PizzaOrder order) {
        this.pizza1 = order.pizza1;
        this.pizza2 = order.pizza2;
        this.pizza3 = order.pizza3;
    }

    public void setPizza1(Pizza p) {
        pizza1 = p;
    }

    public void setPizza2(Pizza p) {
        pizza2 = p;
    }

    public void setPizza3(Pizza p) {
        pizza3 = p;
    }

    public Pizza getPizza1() {
        return pizza1;
    }

    public Pizza getPizza2() {
        return pizza2;
    }

    public Pizza getPizza3() {
        return pizza3;
    }

    public double calcTotal() {
        return pizza1.calCost() + pizza2.calCost() + pizza3.calCost();

    }

    public void display() {
        System.out.println();
        System.out.println("Description:");
        if (pizza3.calCost() > 0) {
            System.out.println(pizza1.getDescription());
            System.out.println(pizza2.getDescription());
            System.out.println(pizza3.getDescription());
        } else if (pizza2.calCost() > 0) {
            System.out.println(pizza1.getDescription());
            System.out.println(pizza2.getDescription());
        } else if ((pizza1.calCost() > 0)) {
            System.out.println(pizza1.getDescription());
        } else {
            System.out.println(" No Order!");
        }
    }
}
