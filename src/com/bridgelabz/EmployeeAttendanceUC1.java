package com.bridgelabz;

public class EmployeeAttendanceUC1 {
    public static void main(String[] args) {
        int Is_Full_Time = 1;
        double EmpAttendanceCheck = Math.floor(Math.random() * 10) % 2;
        if (EmpAttendanceCheck == Is_Full_Time)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }
}

