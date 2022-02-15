package com.bridgelabz;

public class EmployeeDailyWageUC2 {
    public static void main(String[] args) {
        int Is_Full_Time = 1;
        int Wage_Per_Hour = 20;
        int Emp_hrs = 0, Emp_Daily_Wage = 0;
        double EmpAttendanceCheck = Math.floor(Math.random() * 10) % 2;
        if(EmpAttendanceCheck == Is_Full_Time)
            Emp_hrs = 8;
        Emp_Daily_Wage = Emp_hrs * Wage_Per_Hour;
        System.out.println("Employee Daily Wage : " +Emp_Daily_Wage);
    }
}

