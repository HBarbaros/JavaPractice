package day07_Operators;

public class SalaryCalculator {

    public static void main(String[] args) {

        // salaryBeforeTax, stateTax, federalTax, totalTax, salaryAfterTax

        int hourlyRate = 50;
        int weeklyHours = 45;
        int stateTaxRate = 6; // double 0.6
        int federalTaxRate = 26; // double 0.26

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        int stateTax = salaryBeforeTax * stateTaxRate / 100; // double
        int federalTax = salaryBeforeTax * federalTaxRate / 100; // double
        int totalTax = stateTax + federalTax;
        int salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: €" + salaryBeforeTax);
        System.out.println("Federal tax is: €" + federalTax);
        System.out.println("State tax is: €" + stateTax);
        System.out.println("Total tax is: €" + totalTax);
        System.out.println("Net income is: €" + salaryAfterTax);










    }


}
