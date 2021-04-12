public class AddressRunner {
    public static void main(String[] args) {
        Address a1=new Address("House#41", "Street#21","peshawar");
        Person p1= new Person("Sana","JAVED");
        a1.display(a1);
        p1.display(a1);
        System.out.println("\nIs the person live in Islamabad:\n" +
                p1.check(a1));
    }
}
