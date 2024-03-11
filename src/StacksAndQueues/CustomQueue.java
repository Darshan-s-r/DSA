package StacksAndQueues;

public class CustomQueue <E>{
    private Object[] data;
    private int end = 0;
    private static final int DEFAULT_SIZE = 10;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new Object[size];
    }
    public boolean enqueue(E item) throws Exception{
        if(isFull()){
            throw new Exception("queue is full");
        }
        data[end++] = item;
        return true;
    }

    public E dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        E removedItem = (E)data[0];
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removedItem;
    }

    public E front() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is Empty");
        }
        return (E)data[0];
    }
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("END");
    }
    public boolean isEmpty(){
        return end == 0;
    }

    public boolean isFull(){
        return end == data.length-1;
    }

}
