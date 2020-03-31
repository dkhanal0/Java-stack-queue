package stackqueue;

public class OrderNode {

    // Instance variables
    Order order;
    OrderNode next;

    // Constructor
    public OrderNode(Order order){
        this.order=order;
        this.next=null;
    }

}
