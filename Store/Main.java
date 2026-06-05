import java.util.Scanner;

class Customer {
    private int customerId;
    private String customerName;
    private long customerPhNum;

    Customer(int customerId, String customerName, long customerPhNum) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerPhNum = customerPhNum;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getCustomerPhNum() {
        return customerPhNum;
    }
}

class Product {
    private int productId;
    private String productName;
    private int productPrize;

    Product(int productId, String productName, int productPrize) {
        this.productId = productId;
        this.productName = productName;
        this.productPrize = productPrize;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrize() {
        return productPrize;
    }

    public void discount(int discountPer) {
        int disAmount = (int) (this.productPrize * (discountPer / 100.0));
        this.productPrize = this.productPrize - disAmount;
    }
}

class Order {
    private int orderId;
    public Customer c1;
    public Product p1;

    Order(int orderId, Customer c1, Product p1) {
        this.orderId = orderId;
        this.c1 = c1;
        this.p1 = p1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer c1 = new Customer(10, "Hari", 123112415124L);
        Product p1 = new Product(1001, "Pen", 50);
        Order o1 = new Order(1, c1, p1);
    }
}
