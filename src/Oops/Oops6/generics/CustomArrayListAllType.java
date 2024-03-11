package Oops.Oops6.generics;

public class CustomArrayListAllType <TYPE> {

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


    public CustomArrayListAllType() {
        data = new Object[DEFAULT_SIZE];
    }

    public static void main(String[] args) {
        CustomArrayListAllType<String> list = new CustomArrayListAllType<>();
        char ch = 'a';
//        for (int i = 0; i < 14; i++) {
//            list.add(i);
//        }

        list.add("darshan");
        list.add("kiran");
        list.add("jimmy");
        list.remove(0);

        list.print();

    }


}
