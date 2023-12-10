package generation.PolymorphismandInheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Test Employee
        Employee employee = new Employee();
        employee.age = 30;
        employee.yearsWorked = 5;
        employee.salary = 50000;
        employee.daysWorked = 180;
        employee.vacationDaysTaken = 10;

        System.out.println("Time to retirement: " + employee.timeToRetirement());
        System.out.println("Vacation time left: " + employee.vacationTimeLeft());
        System.out.println("Bonus: " + employee.calculateBonus());

        // Test SalesRep
        SalesRep salesRep = new SalesRep();
        salesRep.age = 35;
        salesRep.yearsWorked = 3;
        salesRep.salary = 60000;
        salesRep.daysWorked = 200;
        salesRep.vacationDaysTaken = 15;
        salesRep.salesMade = 100000;

        System.out.println("Time to retirement for SalesRep: " + salesRep.timeToRetirement());
        System.out.println("Vacation time left for SalesRep: " + salesRep.vacationTimeLeft());
        System.out.println("Commission for SalesRep: " + salesRep.calculateCommission());

        // Test SalesManager
        SalesManager salesManager = new SalesManager();
        salesManager.age = 40;
        salesManager.yearsWorked = 8;
        salesManager.salary = 80000;
        salesManager.daysWorked = 250;
        salesManager.vacationDaysTaken = 20;

        List<SalesRep> salesTeam = new ArrayList<>();
        salesTeam.add(salesRep);
        salesManager.setTeam(salesTeam); // Use a setter method to set the team

        System.out.println("Time to retirement for SalesManager: " + salesManager.timeToRetirement());
        System.out.println("Vacation time left for SalesManager: " + salesManager.vacationTimeLeft());
        System.out.println("Commission for SalesManager: " + salesManager.calculateCommission());
    }
}

