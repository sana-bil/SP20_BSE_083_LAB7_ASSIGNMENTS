public class Runner1 {
    public static void main(String[] args) {
        StudentRecord s = new StudentRecord("MBA");
        employeeRecord e = new employeeRecord(111, 50000);
        Manager m1 = new Manager("financeManager", 5000, e, s ) ;
        m1.display();
    }
}
