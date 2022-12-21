package employeeManagementSystem;

import java.util.Scanner;

class EmployDetail
{
    String name;
    String last_name;
    String email;
    String position;
    String employ_id;
    String employ_salary;
    String employ_contact;
	private Scanner scanner;
    public void getInfo()
    {
        System.out.print("Enter Employee's name -: ");
        Scanner scanner2 = new Scanner(System.in);
		scanner = scanner2;
		name=scanner.nextLine();
        System.out.print("Enter Employee's Last name -: ");
        last_name=scanner2.nextLine();
        System.out.print("Enter Employee's ID -: ");
        employ_id=scanner2.nextLine();
        System.out.print("Enter Employee's Email ID -: ");
        email=scanner2.nextLine();
        System.out.print("Enter Employee's Position -: ");
        position=scanner2.nextLine();
        System.out.print("Enter Employee contact Info -: ");
        employ_contact=scanner2.nextLine();
        System.out.print("Enter Employee's Salary -: ");
        employ_salary=scanner2.nextLine();
    }
}

