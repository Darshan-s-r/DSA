package Oops.Oops6.generics;


public class WildCard <TYPE  extends Number> {

    private int DEFAULT_SIZE = 10;
    private Object[] data;

    private int size = 0;


    public void add(TYPE num) {
        if (isFull()) {
            reSize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        if (size == data.length) {
            return true;
        } else return false;
    }

    private void reSize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public TYPE remove(int index) {
        TYPE removiedItem = (TYPE)(data[index]);
        for (int i = index; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return removiedItem;
    }

    public TYPE removeLast() {
        TYPE removiedItem = (TYPE)(data[--size]);
        return removiedItem;
    }

    public TYPE get(int index) {
        return (TYPE)data[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }


    public WildCard() {
        data = new Object[DEFAULT_SIZE];
    }

    public static void main(String[] args) {
        WildCard<Float> list = new WildCard<>();
        char ch = 'a';
        for (int i = 0; i < 14; i++) {
            list.add(i* 0.01f);
        }
//
//        list.add("darshan");
//        list.add("kiran");
//        list.add("jimmy");
        list.remove(0);

        list.print();

    }


}
