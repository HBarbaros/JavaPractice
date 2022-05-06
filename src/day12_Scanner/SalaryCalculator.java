package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your hourly rate");
        int hourlyRate = scan.nextInt();

        System.out.println("Enter your weekly hours");
        int weeklyHours = scan.nextInt();

        System.out.println("Enter state tax");
        double stateTaxRate = scan.nextDouble();

        System.out.println("Enter federal tax");
        double federalTaxRate = scan.nextDouble();

        int salaryBeforeTax = hourlyRate * weeklyHours * 52; // salary is equal to one week salary * 52
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTaxRate + federalTaxRate;
        double netIncome = salaryBeforeTax - totalTax;

        System.out.println("Salary is = €" + salaryBeforeTax);
        System.out.println("State tax is = €" + stateTax);
        System.out.println("Federal tax is = €" + federalTax);
        System.out.println("Total tax is = €" + totalTax);
        System.out.println("Net income is = €" + netIncome);

        scan.close();


    }
}

/* int salaryBeforeTax = hourlyRate * weeklyHours * 52; // salary is equal to one week salary * 52
    double stateTax = salaryBeforeTax * stateTaxRate / 100;
    double federalTax = salaryBeforeTax * federalTaxRate / 100;
    double totalTax = stateTaxRate + federalTaxRate;
    double salaryAfterTax = salaryBeforeTax - totalTax;

    */

/*
3. SalaryCalculator:
3.1 Ask the user to enter his/her hourlyRate
3.2 Ask the user how many hours he/she works in a week
3.3 Ask the user to enter state tax (in percentage)
3.4 Ask the user to enter federal tax (in percentage)
3.5 Calculate the:
3.4.1 salary
3.4.2 stateTax
3.4.3 federalTax
3.4.4 totalTax
3.4.5 netIncome
 */