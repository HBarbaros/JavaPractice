package day31_Constructors;

public class SalaryCalculator {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHour;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHour) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHour = weeklyHour;
    }

    public double salary(){
       return weeklyHour * hourlyRate *52;
    }

    public double stateTax(){
        return salary() * stateTaxRate /100;
    }

    public double federalTax(){
        return salary() * federalTaxRate /100;
    }

    public double salaryAfterTax(){
        return salary() - federalTax() - stateTax();
    }

    public String toString() {
        return "Salary Calculator {" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salary= €" + salary() +
                ", state tax= €" + stateTax() +
                ", federal tax= €" + federalTax() +
                ", salary after tax €=" + salaryAfterTax() +
                '}';
    }
}


/*
1. SalaryCalculator Task:
1.1 Create a class named Salary calculator:
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours
            Add a constructor to set all the fields
        Actions:
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
            stateTax(): calculates the totalStateTax
            federalTax(): calculates the total federal tax
            salaryAfterTax(): calculates the salary after tax
            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */