package com.PackageAndPrivate.Staff;

public class StaffUser {
    String staffName;
    int staffAge;
    private int staffSalary;

    public int getStaffSalary() {
        return staffSalary;
    }

//    public void setStaffSalary(int staffSalary) {
//        this.staffSalary = staffSalary;
//    }

    public void raise(int raiseSalary) {
        if (raiseSalary + this.staffSalary > 10_000) {
            System.out.println("Salary is over $10,000 after the raise, please reconsider.");
        } else {
            this.staffSalary += raiseSalary;
        }
    }
}
