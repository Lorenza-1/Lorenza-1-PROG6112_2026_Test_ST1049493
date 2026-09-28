/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.number1electronicsreport;

/**
 *
 * @author emeris
 */

public class ConsoleSales extends Consoles {
    public ConsoleSales(String consoleType, String storename, int totalSales){
        super(consoleType, storeName, totalSales);
    }
    
    public void printReport(){
        System.out.println();
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("*".repeat(30));
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: R " + getTotalSales());
    }
}
