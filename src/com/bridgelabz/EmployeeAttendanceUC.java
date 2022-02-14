package com.bridgelabz;

public class EmployeeAttendanceUC {
    public static void main(String[] args) {
        int Is_Full_Time = 1;
        double EmpAttendance = Math.floor(Math.random() * 10) % 2;
        if (EmpAttendance == 1)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }
}

