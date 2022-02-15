package com.bridgelabz;

public class EmployeeWageSwitchUC4 {
    public static final int Is_Part_Time = 1;
    public static final int Is_Full_Time = 2;
    public static final int Wage_Per_Hour = 20;

    public static void main(String[] args) {
        int empHrs = 0, empDailyWage = 0;
        int empAttendanceCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empAttendanceCheck) {
            case Is_Full_Time:
                empHrs = 8;
                break;
            case Is_Part_Time:
                empHrs = 4;
                break;
            default:
                empHrs = 0;
        }
        empDailyWage = empHrs * Wage_Per_Hour;
        System.out.println("Employee Daily Wage : " + empDailyWage);
    }
}
