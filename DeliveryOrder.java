class DeliveryOrder extends FoodOrder{
    private String address;

    public DeliveryOrder(int orderId,double amount,String address){
        super(orderId, amount);
        this.address=address;

    }

    @Override
    public double calculateBill(){
        return amount +100;
    }

    @Override
    public void processOrder(){
        System.out.println("Delivering order to " + address);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "DeliveryOrder [ID:" + orderId + ", Amount:" + amount + ", Address:" + address + "]";
    }
}
