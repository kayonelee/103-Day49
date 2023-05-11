import java.text.DecimalFormat; //formatting to two decimal places
public class Product {
    private double productCost;
    private int productQuantity;
    private String productName;

//CREATE CONSTRUCTOR-that can accept all 3 attributes as the parameters.
    public Product(double productCost, int productQuantity, String productName) {
        this.productCost = productCost;
        this.productQuantity = productQuantity;
        this.productName = productName;
    }

//METHOD 1: TOTAL COST-ADD DECIMAL FORMAT TWO DECIMAL PLACE-prints the total cost when multiple products are purchased.
    public String totalCost() {
        double cost = this.productCost * this.productQuantity;
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(cost);
    }

//METHOD 2: PRINT PRODUCT-prints how much one unit of the product costs and how many units were purchased.
    public void printProduct() {
        System.out.println();
        System.out.println(this.productName + " costs $" + this.productCost + " and " + this.productQuantity + " units were purchased ");
    }

// Unable to do a second main. Eric ok'd putting at bottom.
// MAIN CLASS-Create a class with a main method where you instantiate a Product object with a product that comes to mind and
// then call the printProduct() and totalCost() methods in the class.

    public static void main(String[] args) {
        Product product = new Product(2.49, 4, "Single Rose");
        product.printProduct();
        System.out.println("Total Cost: $" + product.totalCost());
    }
}

