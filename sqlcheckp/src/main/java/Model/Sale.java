package Model;

public class Sale {

    private Integer id;
    private Integer customerId;
    private String productName;
    private Integer netValue;
    private Integer taxRate;

    public Sale(Integer id, Integer customerId, String productName, Integer netValue, Integer taxRate) {
        this.id = id;
        this.customerId = customerId;
        this.productName = productName;
        this.netValue = netValue;
        this.taxRate = taxRate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getNetValue() {
        return netValue;
    }

    public void setNetValue(Integer netValue) {
        this.netValue = netValue;
    }

    public Integer getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Integer taxRate) {
        this.taxRate = taxRate;
    }
}
