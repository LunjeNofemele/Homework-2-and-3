/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1_homework;

import java.util.Scanner;

/**
 *Name: Lunje Nofemele
 *Student number: ST10420097
 *Due Date : 1 August 2024
 */
public class Lab1_homework {

    
    public static void main(String[] args) {
        // TODO code application logic hereString name;
    String name;
        int age;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter a person's name:");
            name = input.nextLine();
            
            System.out.println("Please enter a person's Age:");
            age = input.nextInt();
            
            if (age < 1) {
                System.out.println(name + "is an infant");
            }else if (age >= 1 && age <= 3) {
                System.out.println(name + "is a toddler");
            }else if (age >= 4 && age <= 5) {
                System.out.println(name + "is a preschooler");
            }else if (age >= 6 && age <= 12) {
                System.out.println(name + " is a grade schooler");
            }else if (age >= 13 && age <= 18) {
                System.out.println(name + " is a teenager");
            }else if (age >= 19 && age <= 21) {
                System.out.println(name + " is a young adult");
            }else {
                System.out.println(name + " is an adult");
            }
        }
    }
}  

    
