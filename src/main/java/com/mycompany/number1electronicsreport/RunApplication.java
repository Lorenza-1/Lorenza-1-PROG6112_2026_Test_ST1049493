/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.number1electronicsreport;
import java.util.Scanner;
/**
 *
 * @author emeris
 */
public class RunApplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //User sellect
        System.out.println("Select the console device type: ");
        System.out.println("1. PlayStation");
        System.out.println("2. Xbox");
        System.out.println("3. Switch");
        System.out.println("Enter your choice: "); 
        int choice = input.nextInt();
        input.nextLine(); 
        
        String consoleType; 
        if (choice == 1) {
            consoleType = "PlayStation";
        } else if (choice == 2) {
            consoleType = "Xbox";
        } else if (choice == 3) {
            consoleType = "Switch";
        } else {
            consoleType = "Unknown";
        }

        System.out.print("Enter the store name: ");
        String storeName = input.nextLine();

        System.out.print("Enter the total amount of sales: ");
        int totalSales = input.nextInt();

        ConsoleSales sales = new ConsoleSales(consoleType, storeName, totalSales);
        sales.printReport();
    }
}
