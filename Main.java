public class Main{
    public static void main(String[] args){

        FoodOrder o1=new DineInOrder(1,3000,5);
        FoodOrder o2=new TakeAwayOrder(2,800,"Box");
        FoodOrder o3=new DeliveryOrder(3,2500,"Johar Town");

        FoodOrder[] orders={o1,o2,o3};

        for(FoodOrder o : orders){
            System.out.println(o);
        }
        System.out.println();

        for(FoodOrder o : orders){
            if(o instanceof DineInOrder){
                ((DineInOrder) o).setTableNumber(10);
            }
        }

        for(FoodOrder o : orders){
            if(o instanceof DeliveryOrder && o.amount>1000){
                o.applyDiscount(250);
            }
        }

        System.out.println("After Modification :");
        for(FoodOrder o : orders){
            System.out.println(o);
            System.out.println("Final Bill : " + o.calculateBill());
            o.processOrder();
            o.displayType();
            System.out.println();
        }
    }
}