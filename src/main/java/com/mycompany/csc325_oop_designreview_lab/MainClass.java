/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass
{
	public static void main(String[] args)
	{
		// Creating new students
		Student std1 = new Freshman("James", (short) 20, 12); // name, age, credits
		Student std2 = new Senior("John", (short) 30, 90);

		// Setting GPA
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input GPA");
		double gpa = scanner.nextDouble();
		std1.setGpa(gpa);
		System.out.println(std1.getName() + "'s new gpa is " + std1.getGpa());

		// toString test/example
		System.out.println(std1.toString());
		System.out.println(std2.toString());

		// Testing to see whether the student is passing or not
		if(std2.pass)
		{
			System.out.println(std2.getName() +" is passing");
		}
		else
		{
			System.out.println(std2.getName() +" is not passing");
		}
	}

}

