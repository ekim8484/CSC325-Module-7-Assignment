/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human
{

    private double gpa;
    private int credits;
    protected boolean pass = true;

    // Student constructor with name, age, and credits as parameters
    public Student(String name, short age, int credits)
    {
        super(name, age);
        this.credits = credits;
    }

    // Getter for Student's GPA
    public double getGpa() {
        return gpa;
    }

    // Setter for Student's GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Getter for whether Student is passing or not
    public boolean isPassing()
    {
        return pass;
    }

    // Setter for whether Student is passing or not
    public void setPass(boolean pass)
    {
        this.pass = pass;
    }

    // Getter for Student's credits
    public int getCredits() {
        return credits;
    }

    // Setter for Student's credits
    public void setCredits(int credits) {
        this.credits = credits;
    }

    // Abstract methods that must be implemented from parent class
    @Override
    public String getAddress()
    {
        return address;
    }

    @Override
    public void setAddress(String address)
    {
        this.address = address;
    }
}
