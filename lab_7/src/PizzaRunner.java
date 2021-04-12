public class PizzaRunner {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("small",3,3,2);
        Pizza p2 = new Pizza ("large",3,2,2);
        PizzaOrder order = new PizzaOrder(p1,p2);
        System.out.println("Total bill = "+order.calcTotal()+"£");
        order.display();
//System.out.println(p1.getDescription());
    }
    }

