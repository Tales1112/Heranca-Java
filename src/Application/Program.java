package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.Employee;
import entities.OutSourceEmployee;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees:");
		int n = sc.nextInt();

		List<Employee> employee = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Employee" + "#" + (i + 1) + "data:");
			System.out.println("Outsourced (y/n)");
			String n1 = sc.next();
			if (n1.charAt(0) == 'y') {
				System.out.print("Name:");
				String name = sc.next();
				System.out.println("Hours:");
				int hour = sc.nextInt();
				System.out.println("Value per Hour:");
				double ValuePerHour = sc.nextDouble();
				System.out.println("Additional Charge:");
				double charge = sc.nextDouble();
				employee.add(new OutSourceEmployee(name, hour, ValuePerHour, charge));

			} else {
				System.out.print("Name:");
				String name = sc.next();
				System.out.println("Hours:");
				int hour = sc.nextInt();
				System.out.println("Value per Hour:");
				double ValuePerHour = sc.nextDouble();
				employee.add(new Employee(name, hour, ValuePerHour));
			}

		}
		System.out.println("Payment:");
		for (Employee c : employee) {
			System.out.println(c.getName() + "-" + c.payment());
		}
	}
}
