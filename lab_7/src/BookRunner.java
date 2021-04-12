public class BookRunner {
    public static void main(String[] args) {
        Address2 a1=new Address2(97, 21 ,"PESHAWAR");
        Person2 p1= new Person2("AMNA","SHEIKH",a1);
        Book b1= new Book(p1,"CHIRAAG","MSK Publishers");
        b1.display();
        p1.display(a1);
        a1.display(a1);
        System.out.println("\nIs the street number is less than 10:\n" + p1.check(a1));
    }
}
