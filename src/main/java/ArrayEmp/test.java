package ArrayEmp;
import java.util.Scanner;

public class test {

    int id,salary;
    String name;
    void GetData(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Id");
        id = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Employee Salary");
        salary = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Employee Name");
        name = (sc.nextLine());
    }
void PutData(){
        System.out.println(name + id + salary);
}

    public static void main(String[] args) {
        test ts[] = new test[5];
        int i;

        for(i=0;i<5;i++)
            ts[i] = new test();

        for (i=0;i<5;i++)
        {
            System.out.println("Enter Employee " + (i + 1)+ "Detail");
            ts[i].GetData();
        }
            System.out.println("Employee Details");
        for(i=0;i<5;i++)
        ts[i].PutData();
    }
}
