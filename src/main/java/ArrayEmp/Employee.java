package ArrayEmp;
import java.util.Scanner;

public class Employee {
    String name;
    int salary;

    void GetData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name");
        name = (sc.nextLine());

        System.out.println("Enter Employee Salary");
        salary = Integer.parseInt(sc.nextLine());
    }

    void PutData() {

        System.out.println(name + salary);
    }

    public static void main(String[] args) {

        Employee Emp[] = new Employee[5];
        int i;

        for (i = 0; i < 5; i++)
            Emp[i] = new Employee();

        for (i = 0; i < 5; i++) {
            System.out.println("Enter details of" + (i + 1) + "Employee ");
            Emp[i].GetData();
        }
        System.out.println("Employee Details");
        for (i = 0; i < 5; i++)
            Emp[i].PutData();
    }
}