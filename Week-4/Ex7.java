class EventRegistration {

    String name;
    long phoneNumber;

    static int entryFee;
    static int cashPrize;

    static {
        entryFee = 500;
        cashPrize = 1000;        
    }

    void setDetails(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    void getDetails() {
        System.out.println("Name : "+name + "\nPhone number : "+phoneNumber+"\nEntry fees : "+entryFee);
    }

    static void giveCashPrize() {
        // System.out.println("Name : "+name+"\nCash prize : $"+cashPrize+"\n"); // Cannot access instance variable
        // setDetails("Naveen",181222818L); // Cannot call instance method
        System.out.println("Cash prize : "+cashPrize);
    }

    public static void main(String[] args) {
        EventRegistration e1 = new EventRegistration();
        e1.setDetails("Naveen", 8122912031L);
        e1.getDetails();
        giveCashPrize();
    }
}
