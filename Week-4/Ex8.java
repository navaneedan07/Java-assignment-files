class EcommerceStore {

    static int productQuantity = 100;

    private static class Adidas {
        String productName;
        int price;

        void setProductDetails(String productName, int price) {
            this.productName = productName;
            this.price = price;
        }

        void display() {
            System.out.println("Product name : " + productName + "\nPrice : $" + price + "\nProduct Quantity : "+ productQuantity + "\n");
        }
    }

    public static class Nike {
        String productName;
        int price;

        void setProductDetails(String productName, int price) {
            this.productName = productName;
            this.price = price;
        }

        void display() {
            System.out.println("Product name : " + productName + "\nPrice : $" + price + "\nProduct Quantity : "+ productQuantity + "\n");
        }
    }

    static void setAdidas() {
        Adidas p2 = new Adidas();
        p2.setProductDetails("Shoe", 1499);
        System.out.println("Brand : Adidas");
        p2.display();
    }
}

class EcommerceStoreTest {
    public static void main() {

        EcommerceStore.Nike p1 = new EcommerceStore.Nike();
        System.out.println("Brand : Nike");
        p1.setProductDetails("T-Shirt", 499);
        p1.display();

        // EcommerceStore.Adidas p2 = new EcommerceStore.Adidas(); // Error : cannot access private from outside
        EcommerceStore.setAdidas();
    }
}