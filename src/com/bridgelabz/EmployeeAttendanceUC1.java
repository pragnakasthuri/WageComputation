package com.bridgelabz;

public class EmployeeAttendanceUC1 {
    public static void main(String[] args) {
        int Is_Full_Time = 1;
        double empAttendanceCheck = Math.floor(Math.random() * 10) % 2;
        if (empAttendanceCheck == Is_Full_Time)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }
}

