public class Runner2 {
    public static void main(String[] args) {
        Date b = new Date (1,12,1990);
        Date h = new Date (5,6,2016);
        Employee e1=new Employee("ALI", "ISHFAQ",b, h);
        e1.display();
        b.tostring();
        h.tostring();
        e1.toString();
    }
}

