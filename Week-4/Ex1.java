class Constructor {
    
    int x;
    void display() {
        System.out.println("x = "+x);
    }
    public static void main(String[] args) {
        Constructor obj = new Constructor();
        obj.x = 10;
        obj.display();
    }
}
