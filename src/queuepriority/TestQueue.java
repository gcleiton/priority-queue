package queuepriority;

class QueueTest {
    
    public static void main(String[] args) {
        
        PriorityQueue<String> queue = new PriorityQueue<>();
                
        queue.add("Joao");
        queue.add("Maria", 7);

        //queue.remove();

        queue.add("Enzo", 2);

        queue.show();
        
    }
    
}