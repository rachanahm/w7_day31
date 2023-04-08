import java.util.Scanner;

class Student {

    private int roll_no;
    private String sname, dept;

    public int getRollNo() {
        return roll_no;
    }

    public void setRollNo(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

 class StudentDetails {

    Scanner s = new Scanner(System.in);
    Object students[] = new Object[2];

    public void setStudentDetails() {
        for (int i = 0; i < students.length; i++) {
            Student student = new Student();

            System.out.println("Enter student roll no");
            student.setRollNo(s.nextInt());

            System.out.println("Enter Student name");
            student.setSname(s.next());

            System.out.println("Enter Department");
            student.setDept(s.next());

            students[i] = student;
        }
    }

    public void getStudentDetails() {
        for (int i = 0; i < students.length; i++) {
            Student student = (Student) students[i];
            System.out.println("Student id: " + student.getRollNo());
            System.out.println("Student name: " + student.getSname());
            System.out.println("Student email: " + student.getRollNo());
        }
    }

    public static void main(String args[]) {
        StudentDetails obj = new StudentDetails();
        obj.setStudentDetails();
        obj.getStudentDetails();
    }
}