package stackqueue;

public class ProductStack {
    // Instance variables
     ProductNode top;

    // Constructor
    public ProductStack(){
        this.top=null;
    }

    // push -- push an item to the top
    public void push (Product p){
        ProductNode temp= new ProductNode(p);
        temp.next=top;
        top=temp;
    }

    // pop -- remove top element
    public Product pop(){
        if (top!=null){ // if stack is not empty
            ProductNode temp= top;
            top= top.next;
            return temp.product;
        }
        //if stack is empty
        return null;
    }
    // peek -- examine the top element, but don't pop it
    public Product peek() {
        if (top != null) {
            return top.product;
        }
            return null;
        }

    // isEmpty -- determine if stack is empty
    public boolean isEmpty(){
        return top==null;
    }
}
