// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;
import java.util.List;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class ProductList {
    List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product product : productList) {
            total += product.price;
        }
        return total;
    }

    public double getTotalPriceWithGST() {
        double total = getTotalPrice();
        double totalWithGST = total + (total * 0.18); // 
        return totalWithGST;
    }
}

public class Main {
    public static void main(String[] args) {
        ProductList productList = new ProductList();

       
        productList.addProduct(new Product("Pen", 10.0));
        productList.addProduct(new Product("Pencil", 5.0));
        productList.addProduct(new Product("Notes", 2.0));
        productList.addProduct(new Product("Mobile", 500.0));
        productList.addProduct(new Product("Laptop", 1000.0));
 

        double totalPrice = productList.getTotalPrice();
        System.out.println("Total Price: " + totalPrice);

        double totalPriceWithGST = productList.getTotalPriceWithGST();
        System.out.println("Total Price with 18% GST: " + totalPriceWithGST);
    }
}
