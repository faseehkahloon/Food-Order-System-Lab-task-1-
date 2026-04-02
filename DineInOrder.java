class DineInOrder extends FoodOrder {
    private int tableNumber;

    public DineInOrder(int orderId,double amount,int tableNumber){
        super(orderId, amount);
        this.tableNumber=tableNumber;
    }

    @Override
    public double calculateBill() {
        return amount+(amount*0.10);
    }

    @Override
    public void processOrder(){
        System.out.println("Processing Dine in order at table:" + tableNumber);
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    @Override
    public String toString(){
        return "DineInOrder [ID:" + orderId + ", Amount:" + amount + ", Table:" + tableNumber + "]";
    }
}
