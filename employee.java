import java.util.Scanner;

class Employee {

    private int eid;
    private String ename;
    private double salary;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class E {

    Scanner s = new Scanner(System.in);
    Employee employee[] = new Employee[2];

    public void setEmployeeDetails() {
        for (int i = 0; i < employee.length; i++) {
            Employee empl = new Employee();

            System.out.println("Enter employeeid");
            empl.setEid(s.nextInt());

            System.out.println("Enter employee name");
            empl.setEname(s.next());

            System.out.println("Enter employee salary");
            empl.setSalary(s.nextDouble());

            employee[i] = empl;
        }
    }

    public void getEmployeeDetails() {
        for (int i = 0; i < employee.length; i++) {
            Employee empl = (Employee) employee[i];
            System.out.println("Employee id : " + empl.getEid());
            System.out.println("Employee name : " + empl.getEname());
            System.out.println("Employee Salary : " + empl.getSalary());
        }
    }

    public static void main(String args[]) {
        EmployeeDetails obj = new EmployeeDetails();
        obj.setEmployeeDetails();
        obj.getEmployeeDetails();
    }
}