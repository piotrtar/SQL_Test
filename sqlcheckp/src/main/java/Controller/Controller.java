package Controller;

import Dao.CustomerDao;
import Dao.SaleDao;
import Model.Customer;
import Model.Sale;
import View.ApplicationView;


import java.util.ArrayList;
import java.sql.*;

public class Controller {

    CustomerDao customerdao;
    SaleDao saledao;
    ArrayList<Sale> sales;
    ArrayList<Customer> customers;
    String choice = "";

    public Controller() {

        this.customerdao = new CustomerDao();
        this.saledao = new SaleDao();
    }

    public void startController() {

        while(!choice.equals("0")) {

            ApplicationView.printMainMenu();
            choice = ApplicationView.getInput("Choose option: ");
            try {

             if (choice.equals("1")) {
                 String searchPhrase = ApplicationView.getInput("Enter search phrase: ");
                 customers = customerdao.getAdvancedSearchResults(searchPhrase);
                 sales = saledao.getAdvancedSearchResults(searchPhrase);
                 ApplicationView.printAdvancedSearchResults(customers, sales);

             }}
             catch (SQLException e)  {
                e.printStackTrace();
            }
    }
}
