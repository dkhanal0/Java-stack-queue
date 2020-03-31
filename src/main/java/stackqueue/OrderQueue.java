package stackqueue;

public class OrderQueue {

    // Instance variables
    OrderNode front;
    OrderNode back;

    // Constructor
    public OrderQueue() {
        this.front = null;
        this.back = null;
    }

    // isEmpty -- check if queue has any elements
    public boolean isEmpty() {
        return front == null && back == null;
    }

    // enqueue -- add item to the back of the queue
    public void enqueue(Order o) {
        // Create the new node
        OrderNode temp = new OrderNode(o);
        // Check if queue is empty
        if (back == null) {
            // If so, add first element
            back = temp;
            front = temp;
            // Otherwise, link to current back node
        } else {
            // Update back
            back.next = temp;
            back = temp;
        }

    }
    // dequeue -- remove the node at front and return an Order reference
    public Order dequeue() {
        if (front!=null) {
            OrderNode temp = front;
            front = front.next;
            // Check if queue is empty
            // Otherwise, store the order at the front temporarily and update front and back referneces, as needed
            if (front == null) {
                back = null;
            }
            // Finally, return the former first order
            return temp.order;
        }else {
            // If  so, return null //(this means if Queue is empty)
            return null;
        }
    }
        // peek -- return a reference to the first item, but don't dequeue it
    public Order peek(){
        if (front!=null){
           return front.order;
        }
        return null;
    }
}

