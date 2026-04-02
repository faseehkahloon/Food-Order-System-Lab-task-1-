class TakeAwayOrder extends FoodOrder {
    private String packingType;

    public TakeAwayOrder(int orderId, double amount, String packingType){
        super(orderId, amount);
        this.packingType=packingType;
    }

    @Override
    public double calculateBill(){
        return amount + 50;
    }

    @Override
    public void processOrder(){
        System.out.println("Processing Takeaway Order with " + packingType);
    }

    public String getPackingType() {
        return packingType;
    }

    public void setPackingType(String packingType) {
        this.packingType = packingType;
    }

    @Override
    public String toString(){
        return "TakeAwayOrder [ID:" + orderId + ", Amount:" + amount + ", Packaging Type:" + packingType + "]";
    }
}
