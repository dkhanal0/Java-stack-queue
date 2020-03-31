package stackqueue;

public class ProductNode {
    // For this assignment, this lass needs only instance variables and a constructor

    //Instance Variables
    Product product;
    ProductNode next;

    //constructor
    public ProductNode(Product product){
        this.product=product;
        this.next=null;
    }
}
