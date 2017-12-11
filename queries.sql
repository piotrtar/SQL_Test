SELECT customers.name FROM customers
WHERE gender LIKE "Female";

SELECT SUM(sales.net_value + sales.net_value*sales.tax_rate) FROM sales;

SELECT * FROM customers 
WHERE customers.birthyear > 1998;

SELECT * FROM customers 
ORDER BY customers.surname;

SELECT * FROM sales 
WHERE sales.product_name LIKE '%a%';

SELECT * FROM sales 
WHERE sales.net_value > 500;

SELECT COUNT(customers.id) FROM customers 
GROUP BY customers.id;

SELECT COUNT(sales.id) FROM sales 
GROUP BY sales.id;

SELECT SUM(sales.net_value + sales.net_value*sales.tax_rate) FROM sales 
WHERE sales.customer_id = 7;

SELECT customers.name, SUM(sales.net_value + sales.net_value*sales.tax_rate) 
FROM sales INNER JOIN customers ON sales.customers_id = customers.id;
