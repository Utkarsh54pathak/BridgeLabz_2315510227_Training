public class Product_Inventory {
        static int totalProducts = 0;
        private String productName;
        private double price;

        public Product_Inventory(String productName, double price) {
            this.productName = productName;
            this.price = price;
            totalProducts++;
        }

        public void displayProductDetails() {
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
        }

        public static void displayTotalProducts() {
            System.out.println("Total Products: " + totalProducts);
        }
}
