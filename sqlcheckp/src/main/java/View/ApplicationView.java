package View;

import java.util.Scanner;
import java.util.ArrayList;

import Model.Customer;
import Model.Sale;
import Models.Applicant;
import Models.Mentor;

public class ApplicationView {

    static Scanner scanner = new Scanner(System.in);

    public static void printMainMenu() {

        System.out.println("(1) Advanced search");
        System.out.println("(0) Exit");
    }
    
    public static String getInput(String message) {

        System.out.println(message);
        String input = scanner.next();
        return input;
    }

    public static Integer getIntInput(String message) {

        Boolean correctInput = false;
        Integer intInput = null;

        while (!correctInput) {
            System.out.println(message);
            String input = scanner.next();
            try {
                intInput = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Wrong input! Enter a number");
                continue;
            }
            correctInput = true;
        }
        return intInput;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printAdvancedSearchResults(ArrayList<Customer> customers, ArrayList<Sale> sales) {

        System.out.println("Customers results :\n");
        for (Customer customer : customers){
            System.out.print(customer);
        }

        System.out.println("Sales results :\n");
        for (Sale sale : sales){
            System.out.print(sale);
        }

    }

    public static void closeScanner() {
        
        scanner.close();
    }
}