package com.PackageAndPrivate.Customer;

import com.PackageAndPrivate.Staff.StaffUser;

public class Customer {
    private String name;
    private int birthday;
    private String gender;
    private int phoneNumber;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void pay(StaffUser user, int price) {
        if (user.getStaffSalary() >= price) {
            user.raise(-price);
            System.out.println("Purchase Succeeded");
        } else {
            System.out.println("Purchase Failed");
        }
    }

    public void shopping() {

    }
}
