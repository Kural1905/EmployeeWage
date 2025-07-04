package com.bridgelabz.employeewage;

public class EmployeeWageUC4 {
    // Constants
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int EMP_RATE_PER_HOUR = 20;
    static final int NUM_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        // Variables
        int empHrs = 0, empWage = 0, totalEmpWage = 0;

        for (int day = 1; day <= NUM_OF_WORKING_DAYS; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }

            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Day " + day + " Wage: " + empWage);
        }

        System.out.println("Total Employee Wage for " + NUM_OF_WORKING_DAYS + " Days: ₹" + totalEmpWage);
    }
}

