package StacksAndQueues;

public class DynamicStack<E> extends CustomStack<E>{
    public DynamicStack(){
        super();
    }
    @Override
    public boolean push(E item) throws StackException {
        if(this.isFull()){
            Object[] temp = new Object[data.length * 2];

            for (int i = 0; i < this.data.length; i++) {
                temp[i] = this.data[i];
            }

            this.data = temp;
        }

        return super.push(item);
    }
}
