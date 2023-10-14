package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student
{
    // Freshman constructor with name, age, and credits as parameters
    public Freshman(String name, short age, int credits)
    {
        super(name, age, credits);
    }

    // toString method that displays the name, age, and credits of the Freshman
    public String toString()
    {
        String freshman;
        freshman = "Name: " + getName() + "\nAge: " + getAge() + "\nCredits: " + getCredits();
        return freshman;
    }
}
