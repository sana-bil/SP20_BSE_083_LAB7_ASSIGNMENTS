public class StudentRecord {
    private String degree;
    public StudentRecord(String degree)
    {
        this.degree=degree;
    }
    public void setDegree ( String deg)
    {
        degree = deg;
    }
    public String getDegree ()
    {
        return degree;
    }

}
class employeeRecord
{
    private int emp_id;
    private double salary;
    public employeeRecord (int emp_id,double salary)
    {
        this.emp_id=emp_id;
        this.salary=salary;
    }
    public void setEmp_id ( int id)
    {
        emp_id = id;
    }
    public int getEmp_id ()
    {
        return emp_id ;
    }
    public void setSalary ( double sal)
    {
        salary = sal;
    }
    public double getSalary ()
    {
        return salary;
    }
}
class Manager {
    private String title;
    private double dues;
    private employeeRecord e;
    private StudentRecord s;
    public Manager(String t,double d,employeeRecord e,StudentRecord s)
    {
        title = t;
        dues = d;
        this.e= e;
        this.s = s; }
    public void display()
    {
        System.out.println("Title is :"+ title);
        System.out.println("Dues are : "+ dues);
        System.out.println("Emplyoyee record is as under:" );
        System.out.println("EmployeeId is : " + e. getEmp_id());
        System.out.println("EmployeeId is : "  + e. getSalary());
        System.out.println("Student record is as under: " );
        System.out.println("Degree is :  " + s.getDegree());
    }
}


