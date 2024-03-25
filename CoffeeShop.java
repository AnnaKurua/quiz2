package quizzes.q2.ana_kurua_2.visibility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CoffeeShop {

    public static void main(String[] args) {
        int pricePerCoffee = 250;
        int numCoffeeSold = 100;
        int totalCostOfBeans = 15000;
        int totalExpenses = 0;


        try {
            File file = new File("expenses.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" - ");
                if (parts.length == 2) {
                    String expenseName = parts[0].trim();
                    String expenseValue = parts[1].trim();
                    int expenseAmount;
                    if (expenseValue.endsWith("lari")) {
                        expenseAmount = Integer.parseInt(expenseValue.split(" ")[0].trim()) * 100;
                    } else if (expenseValue.endsWith("tetri")) {
                        expenseAmount = Integer.parseInt(expenseValue.split(" ")[0].trim());
                    } else {
                        continue; // Skip invalid entries
                    }
                    totalExpenses += expenseAmount;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalCostOfBeans, totalExpenses);
        System.out.println("Profit: " + profit + " Laris");
    }

    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalCostOfBeans, int otherExpenses) {

        double totalRevenue = pricePerCoffee * numCoffeeSold;


        double totalCost = totalCostOfBeans + otherExpenses;


        double profitInTetris = totalRevenue - totalCost;


        double profitInLaris = profitInTetris / 100;

        return profitInLaris;
    }
}
