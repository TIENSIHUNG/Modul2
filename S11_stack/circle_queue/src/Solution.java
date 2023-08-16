public class Solution {
    public static void enQueue(Queue queue,int data){
        Node a = new Node();
        a.data = data;
        if (queue.front==null){
            queue.front=queue.rear=a;
        }else {
            queue.rear.link=a;
            queue.rear = a;
        }
        queue.rear.link = queue.front;
    }

    public static int deQueue(Queue queue){
        Node b = queue.front;
        if (queue.front==null){
            return -1;
        }else {
            queue.front = queue.front.link;
            queue.rear.link = queue.front;
        }
        return b.data;
    }
    public static void displayQueue(Queue queue) {
        Node c = queue.front;
        while (c.link != queue.front) {
            System.out.println(c.data);
            c = c.link;
        }
        System.out.println(c.data);
    }

    public static void main(String[] args) {
        Queue x = new Queue();
        enQueue(x,1);
        enQueue(x,2);
        enQueue(x,2);
        enQueue(x,2);
        enQueue(x,2);

        deQueue(x);

        deQueue(x);
        displayQueue(x);
    }
}
