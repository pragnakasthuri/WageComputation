package com.bridgelabz;

public class PartTimeEmpWageUC3 {
    public static void main(String[] args) {
    int Is_Part_Time = 1;
    int Is_Full_Time = 2;
    int Wage_Per_Hour = 20;
    int empHrs = 0, empDailyWage = 0;
    double empAttendanceCheck = Math.floor(Math.random() * 10) % 3;
    if(empAttendanceCheck == Is_Full_Time) empHrs = 8;
    else if(empAttendanceCheck == Is_Part_Time)
        empHrs = 4;
    empDailyWage = empHrs * Wage_Per_Hour;
    System.out.println("Employee Daily Wage : " + empDailyWage);
 }
}
