abstract class FoodOrder {
    protected int orderId;
    protected double amount;

    public FoodOrder(int orderId, double amount){
        this.orderId=orderId;
        this.amount=amount;
    }

    public abstract double calculateBill();
    public abstract void processOrder();

    public void showInfo(){
        System.out.println("Order ID: " + orderId + ", Amount: " + amount);
    }

    public void applyDiscount(double discount){
        amount=amount-discount;
    }

    public final void displayType(){
        System.out.println("This is a Food Order");
    }
}
