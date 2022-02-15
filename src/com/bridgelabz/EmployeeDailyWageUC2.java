package com.bridgelabz;

public class EmployeeDailyWageUC2 {
    public static void main(String[] args) {
        int Is_Full_Time = 1;
        int Wage_Per_Hour = 20;
        int empHrs = 0, empDailyWage = 0;
        double empAttendanceCheck = Math.floor(Math.random() * 10) % 2;
        if(empAttendanceCheck == Is_Full_Time)
            empHrs = 8;
        empDailyWage = empHrs * Wage_Per_Hour;
        System.out.println("Employee Daily Wage : " +empDailyWage);
    }
}

