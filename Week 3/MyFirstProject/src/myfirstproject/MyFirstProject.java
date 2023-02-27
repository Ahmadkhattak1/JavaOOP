/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstproject;
import java.util.Scanner;

public class MyFirstProject 
{
    

    public static void main(String[] args) 
    {
        System.out.println("Hello World");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your Age : ");
        int age = input.nextInt();
        System.out.print("Enter your GPA : ");
        float gpa = input.nextFloat();
        
        
        System.out.println("Your Age : "+ age);
        System.out.println("Your GPA : "+ gpa); 
    }
    
}
