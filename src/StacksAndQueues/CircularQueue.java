package StacksAndQueues;

public class CircularQueue<E> {
    protected Object[] data;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;
    private static final int DEFAULT_SIZE = 10;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        data = new Object[size];
    }
    public boolean enqueue(E item) throws Exception{
        if(isFull()){
            throw new Exception("queue is full");
        }
        data[end++] = item;
        end = end%data.length;
        size++;
        return true;
    }
    public E dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        E removedItem = (E)data[front++];
        front = front % data.length;
        size--;
        return removedItem;
    }
    public E front() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is Empty");
        }
        return (E)data[front];
    }

    public void display(){
       if(isEmpty()){
           System.out.println("empty");
           return;
       }
       int i = front;
       do{
           System.out.print(data[i] + " ");
           i++;
           i = i% data.length;
       }while(i!=end);
        System.out.print("END");
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == data.length;
    }


}
