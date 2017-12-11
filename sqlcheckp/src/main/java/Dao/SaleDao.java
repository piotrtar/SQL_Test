package Dao;

import Model.Customer;
import Model.Sale;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SaleDao {

    public SaleDao() {
    }

    public ArrayList<Sale> getAdvancedSearchResults(String searchPhrase) throws SQLException {

        ArrayList<Sale> results = new ArrayList<Sale>();

        String query = "SELECT * FROM customers WHERE (id || customer_id || product_name" +
                " || net_value || tax_rate)" +
                " LIKE '" + "%" + searchPhrase + "%" + "'";

        Connection conn = ConnectionProvider.getConnection();
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(query);

        while(result.next()) {
            Sale sale = createSale(result);
            results.add(sale);
        }

        statement.close();
        conn.close();

        return results;
    }

    public Sale createSale(ResultSet rs) {
        Sale sale = null;
        try {

            int id = rs.getInt("id");
            Integer customerId = rs.getInt("customer_id");
            String productName = rs.getString("product_name");
            Integer netValue = rs.getInt("net_value");
            Integer taxRate = rs.getInt("tax_rate");

            sale = new Sale(id, customerId, productName, netValue, taxRate);
            return sale;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return sale;
    }

}
