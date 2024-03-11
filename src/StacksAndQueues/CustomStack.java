package StacksAndQueues;

public class CustomStack <E>{
    protected Object[] data;
    private static final int DEFAULT_SIZE = 10;

    private int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new Object[size];
    }

    public boolean push(E item) throws StackException{
        if(isFull()){
            throw new StackException("stack is already full");
        }
        data[++ptr] = item;
        return true;
    }


    public E pop() throws StackException{
        if(isEmpty()){
            throw new StackException("the stack is empty");
        }
        return (E)data[ptr--];

    }

    public E peek(){
        return (E)data[ptr];
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
    public boolean isFull(){
        return ptr == data.length-1;
    }
}
