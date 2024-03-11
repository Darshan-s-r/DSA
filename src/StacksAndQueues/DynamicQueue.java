package StacksAndQueues;

public class DynamicQueue<E> extends CircularQueue<E>{
    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean enqueue(E item)throws Exception{
        if(this.isFull()){
            Object[] temp = new Object[this.data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i)% data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        return super.enqueue(item);
    }
}
