package Dao;


import Model.Customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CustomerDao {


    public CustomerDao() {
    }

    public ArrayList<Customer> getAdvancedSearchResults(String searchPhrase) throws SQLException {

        ArrayList<Customer> results = new ArrayList<Customer>();

        String query = "SELECT * FROM customers WHERE (id || name || surname" +
                " || birthyear || gender)" +
                " LIKE '" + "%" + searchPhrase + "%" + "'";

        Connection conn = ConnectionProvider.getConnection();
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(query);

        while(result.next()) {
            Customer customer = createCustomer(result);
            results.add(customer);
        }

        statement.close();
        conn.close();

        return results;
    }

    public Customer createCustomer(ResultSet rs) {
        Customer customer = null;
        try {

            int id = rs.getInt("id");
            String name = rs.getString("name");
            String surname = rs.getString("surname");
            Integer birthyear = rs.getInt("birthyear");
            String email = rs.getString("gender");

            customer = new Customer(id, name, surname, birthyear, email);
            return customer;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customer;
    }

}
