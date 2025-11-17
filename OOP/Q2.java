

import java.util.*;
class Employee {
    private int id;
    private String name;
    private double salary;
    private int rating;

    public Employee(int id, String name, double salary, int rating) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getRating() {
        return rating;
    }
}

// Interface
interface Taxable {
    double applyTax(double amount);
}


abstract class BonusCalculator {
    abstract double calculateBonus(Employee e);
}


class FinalBonusCalculator extends BonusCalculator implements Taxable {

    @Override
    double calculateBonus(Employee e) {
        double bonusPercent;
        switch (e.getRating()) {
            case 5: bonusPercent = 0.20;
			 break;
            case 4: bonusPercent = 0.15;
			 break;
            case 3: bonusPercent = 0.10; 
			break;
            default: bonusPercent = 0.05;
        }

        double bonus = e.getSalary() * bonusPercent;
        double tax = applyTax(bonus);
        double netBonus = bonus - tax;

        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
        System.out.println("Rating: " + e.getRating());
        System.out.println("Bonus before tax: " + bonus);
        System.out.println("Tax on bonus (10%): " + tax);
        System.out.println("Net Bonus: " + netBonus);

        return netBonus;
    }

    @Override
    public double applyTax(double amount) {
        return amount * 0.10;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter Performance Rating (1-5): ");
        int rating = sc.nextInt();

        Employee emp = new Employee(id, name, salary, rating);
        FinalBonusCalculator calculator = new FinalBonusCalculator();
        calculator.calculateBonus(emp);

        sc.close();
    }
}
