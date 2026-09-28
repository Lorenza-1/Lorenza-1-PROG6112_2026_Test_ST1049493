/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number1electronicsreport;

/**
 *
 * @author emeris
 */
public class Number1ElectronicsReport {

    public static void main(String[] args)  {                                 
        String[] city = {"Cape Town ", "Port Elizabeth ", "Pretoria "};   // single array
        String[] console = {"PS5", "XBOX", "SWITCH"};        // single array
        int[][] sales = {                                   // 2D array   
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200},
        };
        int[] cityTotals = new int[city.length];   // one total per city

        System.out.println("-".repeat(60));
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-".repeat(60));

        System.out.printf("%-10s", "");
        for (int c = 0; c < console.length; c++) {
            System.out.printf("%-15s", console[c]);
        }
        System.out.println();

        // Print table and accumulate each month's total
        for (int r = 0; r < sales.length; r++) {
            System.out.printf("%-10s", city[r]);
            for (int c = 0; c < sales[r].length; c++) {
                System.out.printf("%-15d", sales[r][c]);
                cityTotals[r] += sales[r][c];
            }
            System.out.println();
        }

        System.out.println("-".repeat(60));
        System.out.println("CONSOLE SALES TOTAL FOR EACH CITY");
        System.out.println("-".repeat(60));

        // Print totals
        for (int r = 0; r < city.length; r++) {
            System.out.printf("%-10s%-8d", city[r], cityTotals[r]);
            
            System.out.println();
        }
        System.out.println("-".repeat(60));
    }
}