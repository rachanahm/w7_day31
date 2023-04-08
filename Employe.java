import java.util.Scanner;

class Employee1 {

    private int eid;
    private String ename;
    private double hra, da;

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

    public double getHRA() {
        return hra;
    }

    public double getDA() {
        return da;
    }

    public void setHRAandDA(double hra, double da) {
        this.hra = hra;
        this.da = da;
    }
}

class Accountant extends Employee1 {
    private String dept;
    private double salary;

    Scanner s = new Scanner(System.in);

    public void setDetails() {
        System.out.println("Enter Employee id");
        setEid(s.nextInt());

        System.out.println("Enter Employee name");
        setEname(s.next());

        System.out.println("Enter Employee department");
        dept = s.next();

        System.out.println("Enter Employee salary");
        salary = s.nextInt();

        System.out.println("Enter HRA");
        int hra = s.nextInt();
        System.out.println("Enter DA");
        int da = s.nextInt();
        setHRAandDA(hra, da);
    }

    public void getDetails() {
        System.out.println("Enter Employee id " + getEid());
        System.out.println("Enter Employee name " + getEname());
        System.out.println("Enter Employee department " + dept);
        System.out.println("Enter Employee salry " + salary);
    }

    double grossSalary() {
        double grossSalary = salary + getHRA() + getDA();
        return grossSalary;
    }
}

class Manager extends Employee1 {
    private String type;
    private double salary;

    Scanner s = new Scanner(System.in);

    public void setDetails() {
        System.out.println("Enter Employee id");
        setEid(s.nextInt());

        System.out.println("Enter Employee name");
        setEname(s.next());
        System.out.println("Enter Manager type");
        type = s.next();
        System.out.println("Enter Employee Salary");
        salary = s.nextInt();

        System.out.println("Enter HRA");
        int hra = s.nextInt();
        System.out.println("Enter DA");
        int da = s.nextInt();
        setHRAandDA(hra, da);
    }

    public void getDetails() {
        System.out.println("Enter Employee id " + getEid());
        System.out.println("Enter Employee name " + getEname());
        System.out.println("Enter Employee type " + type);
        System.out.println("Enter Employee salry " + salary);
    }

    double grossSalary() {
        double grossSalary = salary + getHRA() + getDA();
        return grossSalary;
    }
}

public class EmployeeDetails1 {
    public static void main(String args[]) {
        Manager man = new Manager();
        Accountant ac = new Accountant();

        ac.setDetails();
        double gross = ac.grossSalary();
        System.out.println("gross salary is " + gross);

        man.setDetails();
        double gros = man.grossSalary();
        System.out.println("gross salary is " + gros);
    }
}