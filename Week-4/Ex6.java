class Ecommerce {
    
    static int numberOfProducts = 0;
    String productName;
    static int quantity;
    int price;

    static void setQuantity(int quantity) {
        quantity = 10;
    }

    void setProductDetails(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    void display() {
        System.out.println("Product name : "+productName+"\nPrice : $"+price+"\n");
    }

    public static void main(String[] args) {

        Ecommerce.setQuantity(100); // Static level data
        Ecommerce nike = new Ecommerce();
        nike.setProductDetails("Shoe",999); // Object level data
        Ecommerce adidas = new Ecommerce();
        adidas.setProductDetails("T-Shirt", 399);

        System.out.println("Product brand : Nike");
        nike.display();

        System.out.println("Product brand : Adidas");
        adidas.display();
    }
}
