public class ShoppingCartSystem {
        static double discount = 0.0;

        static void updateDiscount(double newDiscount) {
            discount = newDiscount;
        }

        static class Product {
            final int productID;
            String productName;
            double price;
            int quantity;

            private static int idCounter = 1;

            Product(String productName, double price, int quantity) {
                this.productID = idCounter++;
                this.productName = productName;
                this.price = price;
                this.quantity = quantity;
            }

            double getTotalPrice() {
                return price * quantity * (1 - discount / 100);
            }

            void printDetails() {
                System.out.println("Product ID: " + productID);
                System.out.println("Name: " + productName);
                System.out.println("Price: " + price);
                System.out.println("Quantity: " + quantity);
                System.out.println("Discount: " + discount + "%");
                System.out.println("Total Price: " + getTotalPrice());
            }
        }

        static void processProduct(Object obj) {
            if (obj instanceof Product) {
                Product p = (Product) obj;
                p.printDetails();
            } else {
                System.out.println("Object is not a Product.");
            }
        }
}
